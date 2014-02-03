package com.redv.okcoin.domain;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TradeParam extends AbstractObject {

	private static final long serialVersionUID = 2013122101L;

	@JsonProperty
	private BigDecimal tradeAmount;

	@JsonProperty
	private BigDecimal tradeCnyPrice;

	@JsonProperty
	private String tradePwd;

	@JsonProperty
	private int symbol;

	public TradeParam(BigDecimal tradeAmount, BigDecimal tradeCnyPrice,
			String tradePwd, int symbol) {
		this.tradeAmount = tradeAmount;
		this.tradeCnyPrice = tradeCnyPrice;
		this.tradePwd = tradePwd;
		this.symbol = symbol;
	}

	/**
	 * @return the tradeAmount
	 */
	public BigDecimal getTradeAmount() {
		return tradeAmount;
	}

	/**
	 * @param tradeAmount the tradeAmount to set
	 */
	public void setTradeAmount(BigDecimal tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	/**
	 * @return the tradeCnyPrice
	 */
	public BigDecimal getTradeCnyPrice() {
		return tradeCnyPrice;
	}

	/**
	 * @param tradeCnyPrice the tradeCnyPrice to set
	 */
	public void setTradeCnyPrice(BigDecimal tradeCnyPrice) {
		this.tradeCnyPrice = tradeCnyPrice;
	}

	/**
	 * @return the tradePwd
	 */
	public String getTradePwd() {
		return tradePwd;
	}

	/**
	 * @param tradePwd the tradePwd to set
	 */
	public void setTradePwd(String tradePwd) {
		this.tradePwd = tradePwd;
	}

	/**
	 * @return the symbol
	 */
	public int getSymbol() {
		return symbol;
	}

	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(int symbol) {
		this.symbol = symbol;
	}

	public String toJson() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}

}