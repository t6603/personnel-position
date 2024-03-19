package cn.scikth.utils.sms;

import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/***
 * 短信发送工具类
 */
@Component
public class SmsUtils {

    @Autowired
    private SmsProperties smsProperties;

    /***
     * 发送短信的方法
     * @param
     * @return
     */
    public boolean sendMessage(String phone, String code) throws ClientException {
        //构造一个acs的clinet
        DefaultProfile profile = DefaultProfile.getProfile(smsProperties.getRegionId(),
                smsProperties.getKeyId(), smsProperties.getKeySecret());
        IAcsClient client = new DefaultAcsClient(profile);
        //构造请求的request
        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain("dysmsapi.aliyuncs.com");
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");
        request.putQueryParameter("RegionId", smsProperties.getRegionId());
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", smsProperties.getSignName());
        request.putQueryParameter("TemplateCode", smsProperties.getTemplateCode());
        Map<String, String> map = new HashMap<String, String>();
        map.put("code", code);
        request.putQueryParameter("TemplateParam", JSONObject.toJSONString(map));

        //发送请求，接收响应
        CommonResponse response = client.getCommonResponse(request);
        System.out.println(response.getData());
        String status = (String) JSONObject.parseObject(response.getData()).get("Code");
        if ("isv.BUSINESS_LIMIT_CONTROL".equals(status)) {
            //发送短信过于频繁
            //throw new KgcException(ResultCodeEnum.SMS_SEND_ERROR_BUSINESS_LIMIT_CONTROL);
            return false;
        }
        if (!"OK".equals(status)) {
            //throw new KgcException(ResultCodeEnum.SMS_SEND_ERROR);
            return false;
        }
        return true;
    }
}
