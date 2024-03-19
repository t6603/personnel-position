package cn.scikth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 访客表
 * </p>
 *
 * @author t
 * @since 2024-03-19
 */
@TableName("pp_per_visitor")
public class PerVisitor implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 姓名
     */
    private String realName;

    /**
     * 性别 0:男 1:女
     */
    private Integer gender;

    /**
     * 联系电话
     */
    private String phoneNumber;

    /**
     * 联系邮箱
     */
    private String email;

    /**
     * 所属单位
     */
    private String fromUnit;

    /**
     * 角色编号
     */
    private Long roleId;

    /**
     * 定位卡号
     */
    private Long cardId;

    /**
     * 预约来访时间
     */
    private LocalDateTime fromVisitDate;

    /**
     * 预约离开时间
     */
    private LocalDateTime toVisitDate;

    /**
     * 状态 0:正在进行 1:预约中 2:已离开
     */
    private Long status;

    /**
     * 接待人
     */
    private Long receperId;

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
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getFromUnit() {
        return fromUnit;
    }

    public void setFromUnit(String fromUnit) {
        this.fromUnit = fromUnit;
    }
    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }
    public LocalDateTime getFromVisitDate() {
        return fromVisitDate;
    }

    public void setFromVisitDate(LocalDateTime fromVisitDate) {
        this.fromVisitDate = fromVisitDate;
    }
    public LocalDateTime getToVisitDate() {
        return toVisitDate;
    }

    public void setToVisitDate(LocalDateTime toVisitDate) {
        this.toVisitDate = toVisitDate;
    }
    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
    public Long getReceperId() {
        return receperId;
    }

    public void setReceperId(Long receperId) {
        this.receperId = receperId;
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
        return "PerVisitor{" +
            "id=" + id +
            ", realName=" + realName +
            ", gender=" + gender +
            ", phoneNumber=" + phoneNumber +
            ", email=" + email +
            ", fromUnit=" + fromUnit +
            ", roleId=" + roleId +
            ", cardId=" + cardId +
            ", fromVisitDate=" + fromVisitDate +
            ", toVisitDate=" + toVisitDate +
            ", status=" + status +
            ", receperId=" + receperId +
            ", remark=" + remark +
            ", creator=" + creator +
            ", createDate=" + createDate +
            ", updater=" + updater +
            ", updateDate=" + updateDate +
        "}";
    }
}
