package com.phelps.goodssell.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * <p>
 * 
 * </p>
 *
 * @author nickel
 * @since 2018-04-25
 */
@TableName("admin_score_rule")
public class AdminScoreRule extends Model<AdminScoreRule> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键，自增长
     */
		@JsonFormat(shape = JsonFormat.Shape.STRING)
		private Long id;
    /**
     * 会员等级id
     */
	@TableField("user_rank_id")
		@JsonFormat(shape = JsonFormat.Shape.STRING)
		private Long userRankId;
    /**
     * 积分规则百分比，会员所得积分=会员等级所对应的规则百分比*消费金额
     */
	@TableField("rule_rate")
		private Integer ruleRate;
    /**
     * 创建时间
     */
	@TableField("create_time")
		private Date createTime;
    /**
     * 状态 0，可用 1.禁用。默认为0
     */
		private Integer flag;
    /**
     * 修改时间
     */
	@TableField("update_time")
		private Date updateTime;
    /**
     * 修改人
     */
	@TableField("update_person_id")
		@JsonFormat(shape = JsonFormat.Shape.STRING)
		private Long updatePersonId;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserRankId() {
		return userRankId;
	}

	public void setUserRankId(Long userRankId) {
		this.userRankId = userRankId;
	}

	public Integer getRuleRate() {
		return ruleRate;
	}

	public void setRuleRate(Integer ruleRate) {
		this.ruleRate = ruleRate;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Long getUpdatePersonId() {
		return updatePersonId;
	}

	public void setUpdatePersonId(Long updatePersonId) {
		this.updatePersonId = updatePersonId;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
