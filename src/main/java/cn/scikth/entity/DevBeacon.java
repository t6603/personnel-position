package cn.scikth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 信标表
 * </p>
 *
 * @author t
 * @since 2024-03-19
 */
@TableName("pp_dev_beacon")
public class DevBeacon implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 信标编码
     */
    private String beaconCode;

    /**
     * 信标型号
     */
    private String beaconModel;

    /**
     * 所属位置编号
     */
    private Long locationId;

    /**
     * 所属楼层
     */
    private Integer floorNumber;

    /**
     * 纬度
     */
    private BigDecimal latitude;

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * major值
     */
    private Long major;

    /**
     * minor值
     */
    private Long minor;

    /**
     * 状态 0:在线 1:停用
     */
    private Integer status;

    /**
     * 停用时间
     */
    private LocalDateTime deactivationTime;

    /**
     * 备注
     */
    private String remark;

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
    public String getBeaconCode() {
        return beaconCode;
    }

    public void setBeaconCode(String beaconCode) {
        this.beaconCode = beaconCode;
    }
    public String getBeaconModel() {
        return beaconModel;
    }

    public void setBeaconModel(String beaconModel) {
        this.beaconModel = beaconModel;
    }
    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }
    public Integer getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
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
    public Long getMajor() {
        return major;
    }

    public void setMajor(Long major) {
        this.major = major;
    }
    public Long getMinor() {
        return minor;
    }

    public void setMinor(Long minor) {
        this.minor = minor;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public LocalDateTime getDeactivationTime() {
        return deactivationTime;
    }

    public void setDeactivationTime(LocalDateTime deactivationTime) {
        this.deactivationTime = deactivationTime;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        return "DevBeacon{" +
            "id=" + id +
            ", beaconCode=" + beaconCode +
            ", beaconModel=" + beaconModel +
            ", locationId=" + locationId +
            ", floorNumber=" + floorNumber +
            ", latitude=" + latitude +
            ", longitude=" + longitude +
            ", major=" + major +
            ", minor=" + minor +
            ", status=" + status +
            ", deactivationTime=" + deactivationTime +
            ", remark=" + remark +
            ", creator=" + creator +
            ", createDate=" + createDate +
            ", updater=" + updater +
            ", updateDate=" + updateDate +
        "}";
    }
}
