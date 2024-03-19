package cn.scikth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 电子围栏表
 * </p>
 *
 * @author t
 * @since 2024-03-19
 */
@TableName("pp_sys_fence")
public class SysFence implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 围栏名称
     */
    private String fenceName;

    /**
     * 围栏类型编号
     */
    private Long fenceTypeId;

    /**
     * 围栏纬度
     */
    private BigDecimal latitude;

    /**
     * 围栏经度
     */
    private BigDecimal longitude;

    /**
     * 围栏半径
     */
    private BigDecimal fenceRadius;

    /**
     * 围栏面积
     */
    private BigDecimal fenceArea;

    /**
     * 围栏形状 0:圆形 1:矩形 2:多边形
     */
    private Long shape;

    /**
     * 权限级别（根据定位卡权限）
     */
    private Integer purviewLevel;

    /**
     * 触发报警 0:越界 1:滞留 2:呼救
     */
    private Long notifyId;

    /**
     * 生效时间（单位秒）
     */
    private LocalDateTime effectTime;

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
    public String getFenceName() {
        return fenceName;
    }

    public void setFenceName(String fenceName) {
        this.fenceName = fenceName;
    }
    public Long getFenceTypeId() {
        return fenceTypeId;
    }

    public void setFenceTypeId(Long fenceTypeId) {
        this.fenceTypeId = fenceTypeId;
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
    public BigDecimal getFenceRadius() {
        return fenceRadius;
    }

    public void setFenceRadius(BigDecimal fenceRadius) {
        this.fenceRadius = fenceRadius;
    }
    public BigDecimal getFenceArea() {
        return fenceArea;
    }

    public void setFenceArea(BigDecimal fenceArea) {
        this.fenceArea = fenceArea;
    }
    public Long getShape() {
        return shape;
    }

    public void setShape(Long shape) {
        this.shape = shape;
    }
    public Integer getPurviewLevel() {
        return purviewLevel;
    }

    public void setPurviewLevel(Integer purviewLevel) {
        this.purviewLevel = purviewLevel;
    }
    public Long getNotifyId() {
        return notifyId;
    }

    public void setNotifyId(Long notifyId) {
        this.notifyId = notifyId;
    }
    public LocalDateTime getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(LocalDateTime effectTime) {
        this.effectTime = effectTime;
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
        return "SysFence{" +
            "id=" + id +
            ", fenceName=" + fenceName +
            ", fenceTypeId=" + fenceTypeId +
            ", latitude=" + latitude +
            ", longitude=" + longitude +
            ", fenceRadius=" + fenceRadius +
            ", fenceArea=" + fenceArea +
            ", shape=" + shape +
            ", purviewLevel=" + purviewLevel +
            ", notifyId=" + notifyId +
            ", effectTime=" + effectTime +
            ", remark=" + remark +
            ", creator=" + creator +
            ", createDate=" + createDate +
            ", updater=" + updater +
            ", updateDate=" + updateDate +
        "}";
    }
}
