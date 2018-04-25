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
@TableName("goods_convert_info")
public class GoodsConvertInfo extends Model<GoodsConvertInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键，自增长
     */
		@JsonFormat(shape = JsonFormat.Shape.STRING)
		private Long id;
    /**
     * 兑换商品id
     */
	@TableField("goods_id")
		@JsonFormat(shape = JsonFormat.Shape.STRING)
		private Long goodsId;
    /**
     * 会员id
     */
	@TableField("user_id")
		@JsonFormat(shape = JsonFormat.Shape.STRING)
		private Long userId;
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
     * 会员名字
     */
	@TableField("user_name")
		private String userName;
    /**
     * 会员卡号
     */
	@TableField("user_card_code")
		private String userCardCode;
    /**
     * 兑换数量
     */
		private Integer num;
    /**
     * 兑换花费的积分
     */
	@TableField("cost_score")
		private Integer costScore;
    /**
     * 创建时间
     */
	@TableField("create_time")
		private Date createTime;
    /**
     * 兑换的门店编码
     */
	@TableField("shop_code")
		private String shopCode;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCardCode() {
		return userCardCode;
	}

	public void setUserCardCode(String userCardCode) {
		this.userCardCode = userCardCode;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getCostScore() {
		return costScore;
	}

	public void setCostScore(Integer costScore) {
		this.costScore = costScore;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
