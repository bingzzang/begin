/*
 * Copyright (c) 1998-2008 FistGlobal, Inc
 * All rights reserved.
 * 
 * 본 프로그램의 저작권은 FistGlobal 및 본 소스와 관련된 제작팀에 있으며 
 * 정부가 지정한 저작권법 법률 제 7223호 및 컴퓨터프로그램보호법 법률 제 7796호에 의거하여 권리를 보호받아 
 * 프로그램의 복제, 개작, 공표 , 발행 등은 저작권자의 동의를 얻지 않고는 행할 수 없습니다.  
 * 
 * 참고 : http://www.copyright.or.kr
 * 문의 : http://www.fistglobal.co.kr 
 */
package com.fistglobal.riskcraft.market.batch.domain.instrument;

import com.fistglobal.riskcraft.market.batch.common.BaseObject;


/**
 * The Class BondData.
 */
public class BondData extends BaseObject {

	/** 일자 */
	private String dt ;
	
	/** 상품코드 */
	private String instrumentCode	;
	
	/** 발행기관 Rating 코드 */
	private String issuerRatingCd ;
	
	/** 신용등급 코드 **/
	private String creditRatingCode ;
	
	/** 차기 쿠폰 지급일 **/
	private String nextCouponPayDt ;
	
	/** 차기 지급 쿠폰 **/
	private Double nextCoupon ;
	
	/** The user id. */
	private String userId ;

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}

	public String getInstrumentCode() {
		return instrumentCode;
	}

	public void setInstrumentCode(String instrumentCode) {
		this.instrumentCode = instrumentCode;
	}

	public String getIssuerRatingCd() {
		return issuerRatingCd;
	}

	public void setIssuerRatingCd(String issuerRatingCd) {
		this.issuerRatingCd = issuerRatingCd;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCreditRatingCode() {
		return creditRatingCode;
	}

	public void setCreditRatingCode(String creditRatingCode) {
		this.creditRatingCode = creditRatingCode;
	}

	public String getNextCouponPayDt() {
		return nextCouponPayDt;
	}

	public void setNextCouponPayDt(String nextCouponPayDt) {
		this.nextCouponPayDt = nextCouponPayDt;
	}

	public Double getNextCoupon() {
		return nextCoupon;
	}

	public void setNextCoupon(Double nextCoupon) {
		this.nextCoupon = nextCoupon;
	}
}
