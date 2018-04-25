package com.phelps.goodssell.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import java.math.BigDecimal;
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
@TableName("goods_info")
public class GoodsInfo extends Model<GoodsInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键，自增长
     */
		@JsonFormat(shape = JsonFormat.Shape.STRING)
		private Long id;
    /**
     * 商品编码
     */
	@TableField("goods_code")
		private String goodsCode;
    /**
     * 商品名称
     */
	@TableField("goods_name")
		private String goodsName;
    /**
     * 商品实际价格
     */
	@TableField("goods_price")
		private BigDecimal goodsPrice;
    /**
     * 商品图片
     */
	@TableField("goods_url")
		private String goodsUrl;
    /**
     * 单个兑换所需积分
     */
	@TableField("cost_score")
		private Integer costScore;
    /**
     * 商品库存量
     */
	@TableField("goods_nums")
		private Integer goodsNums;
    /**
     * 兑换活动开始时间
     */
	@TableField("start_time")
		private Date startTime;
    /**
     * 兑换活动结束时间
     */
	@TableField("end_time")
		private Date endTime;
    /**
     * 创建时间
     */
	@TableField("create_time")
		private Date createTime;
    /**
     * 修改人
     */
	@TableField("update_person_id")
		private Integer updatePersonId;
    /**
     * 兑换商品所属门店编码
     */
	@TableField("shop_code")
		private String shopCode;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGoodsCode() {
		return goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsUrl() {
		return goodsUrl;
	}

	public void setGoodsUrl(String goodsUrl) {
		this.goodsUrl = goodsUrl;
	}

	public Integer getCostScore() {
		return costScore;
	}

	public void setCostScore(Integer costScore) {
		this.costScore = costScore;
	}

	public Integer getGoodsNums() {
		return goodsNums;
	}

	public void setGoodsNums(Integer goodsNums) {
		this.goodsNums = goodsNums;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getUpdatePersonId() {
		return updatePersonId;
	}

	public void setUpdatePersonId(Integer updatePersonId) {
		this.updatePersonId = updatePersonId;
	}

	public String getShopCode() {
		return shopCode;
	}

	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
