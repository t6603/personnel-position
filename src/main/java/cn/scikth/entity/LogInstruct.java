package cn.scikth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 指令日志表
 * </p>
 *
 * @author t
 * @since 2024-03-19
 */
@TableName("pp_log_instruct")
public class LogInstruct implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 指令文本
     */
    private String instructText;

    /**
     * 指令类型编号
     */
    private Long instructTypeId;

    /**
     * 下达定位卡号
     */
    private Long cardId;

    /**
     * 状态 0:未处理 1:已处理
     */
    private Long status;

    /**
     * 执行结果
     */
    private String result;

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
    public String getInstructText() {
        return instructText;
    }

    public void setInstructText(String instructText) {
        this.instructText = instructText;
    }
    public Long getInstructTypeId() {
        return instructTypeId;
    }

    public void setInstructTypeId(Long instructTypeId) {
        this.instructTypeId = instructTypeId;
    }
    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }
    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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
        return "LogInstruct{" +
            "id=" + id +
            ", instructText=" + instructText +
            ", instructTypeId=" + instructTypeId +
            ", cardId=" + cardId +
            ", status=" + status +
            ", result=" + result +
            ", creator=" + creator +
            ", createDate=" + createDate +
            ", updater=" + updater +
            ", updateDate=" + updateDate +
        "}";
    }
}
