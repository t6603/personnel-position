package cn.scikth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 位置记录表
 * </p>
 *
 * @author t
 * @since 2024-03-19
 */
@TableName("pp_log_location")
public class LogLocation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 定位编码
     */
    private String locationCode;

    /**
     * 定位卡号
     */
    private Long cardId;

    /**
     * 所属人员编号
     */
    private Long personalId;

    /**
     * 纬度
     */
    private BigDecimal latitude;

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 海拔
     */
    private BigDecimal altitude;

    /**
     * 定位类型编号
     */
    private Long positionTypeId;

    /**
     * ICCID
     */
    private Long iccId;

    /**
     * 电量
     */
    private Integer powerNumber;

    /**
     * 信号强度
     */
    private Integer signalStrength;

    /**
     * 状态 0:静止 1:移动
     */
    private Long status;

    /**
     * 是否充电 0:未充电 1:充电
     */
    private Integer isCharge;

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
    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }
    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }
    public Long getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Long personalId) {
        this.personalId = personalId;
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
    public Long getPositionTypeId() {
        return positionTypeId;
    }

    public void setPositionTypeId(Long positionTypeId) {
        this.positionTypeId = positionTypeId;
    }
    public Long getIccId() {
        return iccId;
    }

    public void setIccId(Long iccId) {
        this.iccId = iccId;
    }
    public Integer getPowerNumber() {
        return powerNumber;
    }

    public void setPowerNumber(Integer powerNumber) {
        this.powerNumber = powerNumber;
    }
    public Integer getSignalStrength() {
        return signalStrength;
    }

    public void setSignalStrength(Integer signalStrength) {
        this.signalStrength = signalStrength;
    }
    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
    public Integer getIsCharge() {
        return isCharge;
    }

    public void setIsCharge(Integer isCharge) {
        this.isCharge = isCharge;
    }
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "LogLocation{" +
            "id=" + id +
            ", locationCode=" + locationCode +
            ", cardId=" + cardId +
            ", personalId=" + personalId +
            ", latitude=" + latitude +
            ", longitude=" + longitude +
            ", altitude=" + altitude +
            ", positionTypeId=" + positionTypeId +
            ", iccId=" + iccId +
            ", powerNumber=" + powerNumber +
            ", signalStrength=" + signalStrength +
            ", status=" + status +
            ", isCharge=" + isCharge +
            ", createDate=" + createDate +
        "}";
    }
}
