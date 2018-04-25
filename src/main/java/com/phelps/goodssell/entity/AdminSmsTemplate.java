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
@TableName("admin_sms_template")
public class AdminSmsTemplate extends Model<AdminSmsTemplate> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键，自增长
     */
		@JsonFormat(shape = JsonFormat.Shape.STRING)
		private Long id;
    /**
     * 模板名称
     */
	@TableField("sms_name")
		private String smsName;
    /**
     * 模板标识
     */
	@TableField("sms_identify")
		private String smsIdentify;
    /**
     * 状态 0可用 1.禁用
     */
	@TableField("sms_state")
		private Integer smsState;
    /**
     * 模板内容
     */
	@TableField("sms_content")
		private String smsContent;
    /**
     * 模板创建时间
     */
	@TableField("create_time")
		private Date createTime;
    /**
     * 发送类型 0.短信邮件都发送 1，只发送邮件 2.只发送短信
     */
	@TableField("sms_type")
		private Integer smsType;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSmsName() {
		return smsName;
	}

	public void setSmsName(String smsName) {
		this.smsName = smsName;
	}

	public String getSmsIdentify() {
		return smsIdentify;
	}

	public void setSmsIdentify(String smsIdentify) {
		this.smsIdentify = smsIdentify;
	}

	public Integer getSmsState() {
		return smsState;
	}

	public void setSmsState(Integer smsState) {
		this.smsState = smsState;
	}

	public String getSmsContent() {
		return smsContent;
	}

	public void setSmsContent(String smsContent) {
		this.smsContent = smsContent;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getSmsType() {
		return smsType;
	}

	public void setSmsType(Integer smsType) {
		this.smsType = smsType;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
