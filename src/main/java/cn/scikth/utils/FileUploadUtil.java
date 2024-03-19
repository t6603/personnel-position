package cn.scikth.utils;


import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.CannedAccessControlList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.UUID;

@Component
public class FileUploadUtil {
    @Autowired
    private OssProperties ossProperties;

    public String upload(InputStream inputStream,String originalFilename) {
        //读取配置信息
        String endpoint = ossProperties.getEndpoint();
        String keyId = ossProperties.getKeyId();
        String keySecret = ossProperties.getKeySecret();
        String bucketName = ossProperties.getBucketName();
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, keyId, keySecret);
        //构建objectName：文件路径 avatar/2020/04/15/default.jpg
        //String folder = LocalDate.now().toString();
        String fileName = UUID.randomUUID().toString();//生成文件的新名字
        String fileExtension = originalFilename.substring(originalFilename.lastIndexOf("."));
        String key = "img/"  + fileName + fileExtension;
        // 上传文件流。
        ossClient.putObject(bucketName, key, inputStream);
        // 设置文件的访问权限为公共读。
        ossClient.setObjectAcl(bucketName, key, CannedAccessControlList.PublicRead);
        // 关闭OSSClient。
        ossClient.shutdown();
        //返回url
        //https://guli-file-191125.oss-cn-beijing.aliyuncs.com/avatar/default.jpg
        String url = "https://" + bucketName + "." + endpoint + "/" + key;

        //Date expiration = new Date(new Date().getTime() + 60 * 1000); //过期时间
        //URL url = ossClient.generatePresignedUrl(bucketName, key, expiration);
        return url.toString();
    }

    public void removeFile(String url) {
        //读取配置信息
        String endpoint = ossProperties.getEndpoint();
        String keyId = ossProperties.getKeyId();
        String keySecret = ossProperties.getKeySecret();
        String bucketName = ossProperties.getBucketName();
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, keyId, keySecret);
        // 删除文件。
        //https://guli-file-191125.oss-cn-beijing.aliyuncs.com/
        String host = "https://" + bucketName + "." + endpoint + "/";
        String objectName = url.substring(host.length());
        ossClient.deleteObject(bucketName, objectName);
        // 关闭OSSClient。
        ossClient.shutdown();
    }
}
