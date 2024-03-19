package cn.scikth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 异常日志表
 * </p>
 *
 * @author t
 * @since 2024-03-19
 */
@TableName("pp_log_error")
public class LogError implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 客户端IP地址
     */
    private String clientIp;

    /**
     * 异常URI
     */
    private String errorUri;

    /**
     * 异常方式
     */
    private String errorMethod;

    /**
     * 异常参数
     */
    private String errorParams;

    /**
     * 异常信息
     */
    private String errorMessage;

    /**
     * 异常语句
     */
    private String queryString;

    /**
     * 创建者
     */
    private Long creator;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }
    public String getErrorUri() {
        return errorUri;
    }

    public void setErrorUri(String errorUri) {
        this.errorUri = errorUri;
    }
    public String getErrorMethod() {
        return errorMethod;
    }

    public void setErrorMethod(String errorMethod) {
        this.errorMethod = errorMethod;
    }
    public String getErrorParams() {
        return errorParams;
    }

    public void setErrorParams(String errorParams) {
        this.errorParams = errorParams;
    }
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }
    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "LogError{" +
            "id=" + id +
            ", clientIp=" + clientIp +
            ", errorUri=" + errorUri +
            ", errorMethod=" + errorMethod +
            ", errorParams=" + errorParams +
            ", errorMessage=" + errorMessage +
            ", queryString=" + queryString +
            ", creator=" + creator +
            ", createDate=" + createDate +
        "}";
    }
}
