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
@TableName("sms_record_info")
public class SmsRecordInfo extends Model<SmsRecordInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键，自增长
     */
		@JsonFormat(shape = JsonFormat.Shape.STRING)
		private Long id;
    /**
     * 推送模板id
     */
	@TableField("ast_id")
		@JsonFormat(shape = JsonFormat.Shape.STRING)
		private Long astId;
    /**
     * 发送内容
     */
	@TableField("sri_content")
		private String sriContent;
    /**
     * 会员id
     */
	@TableField("user_id")
		@JsonFormat(shape = JsonFormat.Shape.STRING)
		private Long userId;
    /**
     * 接收账号，可以是邮箱也可以是手机号
     */
	@TableField("sri_account")
		private String sriAccount;
    /**
     * 发送状态 0：成功 1：失败(可能异常导致)
     */
	@TableField("sri_state")
		private Integer sriState;
    /**
     * 失败原因
     */
	@TableField("sri_mark")
		private String sriMark;
    /**
     * 创建时间
     */
	@TableField("create_time")
		private Date createTime;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAstId() {
		return astId;
	}

	public void setAstId(Long astId) {
		this.astId = astId;
	}

	public String getSriContent() {
		return sriContent;
	}

	public void setSriContent(String sriContent) {
		this.sriContent = sriContent;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getSriAccount() {
		return sriAccount;
	}

	public void setSriAccount(String sriAccount) {
		this.sriAccount = sriAccount;
	}

	public Integer getSriState() {
		return sriState;
	}

	public void setSriState(Integer sriState) {
		this.sriState = sriState;
	}

	public String getSriMark() {
		return sriMark;
	}

	public void setSriMark(String sriMark) {
		this.sriMark = sriMark;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
