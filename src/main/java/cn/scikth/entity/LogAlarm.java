package cn.scikth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 报警记录表
 * </p>
 *
 * @author t
 * @since 2024-03-19
 */
@TableName("pp_log_alarm")
public class LogAlarm implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 报警类型编号
     */
    private Long alarmTypeId;

    /**
     * 报警消息内容
     */
    private String alarmMessage;

    /**
     * 定位卡号
     */
    private Long cardId;

    /**
     * 来源纬度
     */
    private BigDecimal latitude;

    /**
     * 来源经度
     */
    private BigDecimal longitude;

    /**
     * 来源海拔
     */
    private BigDecimal altitude;

    /**
     * 状态 0:未处理 1:已处理
     */
    private Long status;

    /**
     * 创建者
     */
    private Long creator;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 更新者
     */
    private Long updater;

    /**
     * 更新时间
     */
    private LocalDateTime updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getAlarmTypeId() {
        return alarmTypeId;
    }

    public void setAlarmTypeId(Long alarmTypeId) {
        this.alarmTypeId = alarmTypeId;
    }
    public String getAlarmMessage() {
        return alarmMessage;
    }

    public void setAlarmMessage(String alarmMessage) {
        this.alarmMessage = alarmMessage;
    }
    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }
    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
    public BigDecimal getAltitude() {
        return altitude;
    }

    public void setAltitude(BigDecimal altitude) {
        this.altitude = altitude;
    }
    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
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
    public Long getUpdater() {
        return updater;
    }

    public void setUpdater(Long updater) {
        this.updater = updater;
    }
    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "LogAlarm{" +
            "id=" + id +
            ", alarmTypeId=" + alarmTypeId +
            ", alarmMessage=" + alarmMessage +
            ", cardId=" + cardId +
            ", latitude=" + latitude +
            ", longitude=" + longitude +
            ", altitude=" + altitude +
            ", status=" + status +
            ", creator=" + creator +
            ", createDate=" + createDate +
            ", updater=" + updater +
            ", updateDate=" + updateDate +
        "}";
    }
}
