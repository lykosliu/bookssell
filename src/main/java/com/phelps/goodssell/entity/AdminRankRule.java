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
@TableName("admin_rank_rule")
public class AdminRankRule extends Model<AdminRankRule> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键，自增长
     */
		@JsonFormat(shape = JsonFormat.Shape.STRING)
		private Long id;
    /**
     * 会员等级code，vip01
     */
	@TableField("user_rank_code")
		private String userRankCode;
    /**
     * 会员等级name  
     */
	@TableField("user_rank_name")
		private String userRankName;
    /**
     * 会员等级达标分数
     */
	@TableField("standard_score")
		private Integer standardScore;
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
     * 修改人账号
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

	public String getUserRankCode() {
		return userRankCode;
	}

	public void setUserRankCode(String userRankCode) {
		this.userRankCode = userRankCode;
	}

	public String getUserRankName() {
		return userRankName;
	}

	public void setUserRankName(String userRankName) {
		this.userRankName = userRankName;
	}

	public Integer getStandardScore() {
		return standardScore;
	}

	public void setStandardScore(Integer standardScore) {
		this.standardScore = standardScore;
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
