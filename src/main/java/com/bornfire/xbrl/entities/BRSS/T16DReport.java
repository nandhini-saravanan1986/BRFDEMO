package com.bornfire.xbrl.entities.BRSS;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name ="T16D_IND_CASH_EXEMPT_TRANSACTION_SIZE_TABLE")
public class T16DReport {

	private String	CUST_COUNT_PRODUCT;
	private BigDecimal	CUST_COUNT_500_600K;
	private BigDecimal	CUST_COUNT_600_750K;
	private BigDecimal	CUST_COUNT_750_1000K;
	private BigDecimal	CUST_COUNT_MORE_1000K;
	private String	CASH_TRANSACTION_PRODUCT;
	private BigDecimal	CASH_TRANSACTION_500_600K;
	private BigDecimal	CASH_TRANSACTION_600_750K;
	private BigDecimal	CASH_TRANSACTION_750_1000K;
	private BigDecimal	CASH_TRANSACTION_MORE_1000K;
	private String	CASH_DEPOSIT_PRODUCT;
	private BigDecimal	CASH_DEPOSIT_500_600K;
	private BigDecimal	CASH_DEPOSIT_600_750K;
	private BigDecimal	CASH_DEPOSIT_750_1000K;
	private BigDecimal	CASH_DEPOSIT_MORE_1000K;
	private String	CASH_WITHDRAW_PRODUCT;
	private BigDecimal	CASH_WITHDRAW_500_600K;
	private BigDecimal	CASH_WITHDRAW_600_750K;
	private BigDecimal	CASH_WITHDRAW_750_1000K;
	private BigDecimal	CASH_WITHDRAW_MORE_1000K;
	private String	REPORT_CODE;
	private String	REPORT_NAME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Id
	private Date	REPORT_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	REPORT_DUE_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	REP_SUBMIT_DATE;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	REP_PERIOD_FROM;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	REP_PERIOD_TO;
	private String	REP_FREQ;
	private String	NIL_REPORT_FLG;
	private String	ARCH_FLG;
	public String getCUST_COUNT_PRODUCT() {
		return CUST_COUNT_PRODUCT;
	}
	public void setCUST_COUNT_PRODUCT(String cUST_COUNT_PRODUCT) {
		CUST_COUNT_PRODUCT = cUST_COUNT_PRODUCT;
	}
	public BigDecimal getCUST_COUNT_500_600K() {
		return CUST_COUNT_500_600K;
	}
	public void setCUST_COUNT_500_600K(BigDecimal cUST_COUNT_500_600K) {
		CUST_COUNT_500_600K = cUST_COUNT_500_600K;
	}
	public BigDecimal getCUST_COUNT_600_750K() {
		return CUST_COUNT_600_750K;
	}
	public void setCUST_COUNT_600_750K(BigDecimal cUST_COUNT_600_750K) {
		CUST_COUNT_600_750K = cUST_COUNT_600_750K;
	}
	public BigDecimal getCUST_COUNT_750_1000K() {
		return CUST_COUNT_750_1000K;
	}
	public void setCUST_COUNT_750_1000K(BigDecimal cUST_COUNT_750_1000K) {
		CUST_COUNT_750_1000K = cUST_COUNT_750_1000K;
	}
	public BigDecimal getCUST_COUNT_MORE_1000K() {
		return CUST_COUNT_MORE_1000K;
	}
	public void setCUST_COUNT_MORE_1000K(BigDecimal cUST_COUNT_MORE_1000K) {
		CUST_COUNT_MORE_1000K = cUST_COUNT_MORE_1000K;
	}
	public String getCASH_TRANSACTION_PRODUCT() {
		return CASH_TRANSACTION_PRODUCT;
	}
	public void setCASH_TRANSACTION_PRODUCT(String cASH_TRANSACTION_PRODUCT) {
		CASH_TRANSACTION_PRODUCT = cASH_TRANSACTION_PRODUCT;
	}
	public BigDecimal getCASH_TRANSACTION_500_600K() {
		return CASH_TRANSACTION_500_600K;
	}
	public void setCASH_TRANSACTION_500_600K(BigDecimal cASH_TRANSACTION_500_600K) {
		CASH_TRANSACTION_500_600K = cASH_TRANSACTION_500_600K;
	}
	public BigDecimal getCASH_TRANSACTION_600_750K() {
		return CASH_TRANSACTION_600_750K;
	}
	public void setCASH_TRANSACTION_600_750K(BigDecimal cASH_TRANSACTION_600_750K) {
		CASH_TRANSACTION_600_750K = cASH_TRANSACTION_600_750K;
	}
	public BigDecimal getCASH_TRANSACTION_750_1000K() {
		return CASH_TRANSACTION_750_1000K;
	}
	public void setCASH_TRANSACTION_750_1000K(BigDecimal cASH_TRANSACTION_750_1000K) {
		CASH_TRANSACTION_750_1000K = cASH_TRANSACTION_750_1000K;
	}
	public BigDecimal getCASH_TRANSACTION_MORE_1000K() {
		return CASH_TRANSACTION_MORE_1000K;
	}
	public void setCASH_TRANSACTION_MORE_1000K(BigDecimal cASH_TRANSACTION_MORE_1000K) {
		CASH_TRANSACTION_MORE_1000K = cASH_TRANSACTION_MORE_1000K;
	}
	public String getCASH_DEPOSIT_PRODUCT() {
		return CASH_DEPOSIT_PRODUCT;
	}
	public void setCASH_DEPOSIT_PRODUCT(String cASH_DEPOSIT_PRODUCT) {
		CASH_DEPOSIT_PRODUCT = cASH_DEPOSIT_PRODUCT;
	}
	public BigDecimal getCASH_DEPOSIT_500_600K() {
		return CASH_DEPOSIT_500_600K;
	}
	public void setCASH_DEPOSIT_500_600K(BigDecimal cASH_DEPOSIT_500_600K) {
		CASH_DEPOSIT_500_600K = cASH_DEPOSIT_500_600K;
	}
	public BigDecimal getCASH_DEPOSIT_600_750K() {
		return CASH_DEPOSIT_600_750K;
	}
	public void setCASH_DEPOSIT_600_750K(BigDecimal cASH_DEPOSIT_600_750K) {
		CASH_DEPOSIT_600_750K = cASH_DEPOSIT_600_750K;
	}
	public BigDecimal getCASH_DEPOSIT_750_1000K() {
		return CASH_DEPOSIT_750_1000K;
	}
	public void setCASH_DEPOSIT_750_1000K(BigDecimal cASH_DEPOSIT_750_1000K) {
		CASH_DEPOSIT_750_1000K = cASH_DEPOSIT_750_1000K;
	}
	public BigDecimal getCASH_DEPOSIT_MORE_1000K() {
		return CASH_DEPOSIT_MORE_1000K;
	}
	public void setCASH_DEPOSIT_MORE_1000K(BigDecimal cASH_DEPOSIT_MORE_1000K) {
		CASH_DEPOSIT_MORE_1000K = cASH_DEPOSIT_MORE_1000K;
	}
	public String getCASH_WITHDRAW_PRODUCT() {
		return CASH_WITHDRAW_PRODUCT;
	}
	public void setCASH_WITHDRAW_PRODUCT(String cASH_WITHDRAW_PRODUCT) {
		CASH_WITHDRAW_PRODUCT = cASH_WITHDRAW_PRODUCT;
	}
	public BigDecimal getCASH_WITHDRAW_500_600K() {
		return CASH_WITHDRAW_500_600K;
	}
	public void setCASH_WITHDRAW_500_600K(BigDecimal cASH_WITHDRAW_500_600K) {
		CASH_WITHDRAW_500_600K = cASH_WITHDRAW_500_600K;
	}
	public BigDecimal getCASH_WITHDRAW_600_750K() {
		return CASH_WITHDRAW_600_750K;
	}
	public void setCASH_WITHDRAW_600_750K(BigDecimal cASH_WITHDRAW_600_750K) {
		CASH_WITHDRAW_600_750K = cASH_WITHDRAW_600_750K;
	}
	public BigDecimal getCASH_WITHDRAW_750_1000K() {
		return CASH_WITHDRAW_750_1000K;
	}
	public void setCASH_WITHDRAW_750_1000K(BigDecimal cASH_WITHDRAW_750_1000K) {
		CASH_WITHDRAW_750_1000K = cASH_WITHDRAW_750_1000K;
	}
	public BigDecimal getCASH_WITHDRAW_MORE_1000K() {
		return CASH_WITHDRAW_MORE_1000K;
	}
	public void setCASH_WITHDRAW_MORE_1000K(BigDecimal cASH_WITHDRAW_MORE_1000K) {
		CASH_WITHDRAW_MORE_1000K = cASH_WITHDRAW_MORE_1000K;
	}
	public String getREPORT_CODE() {
		return REPORT_CODE;
	}
	public void setREPORT_CODE(String rEPORT_CODE) {
		REPORT_CODE = rEPORT_CODE;
	}
	public String getREPORT_NAME() {
		return REPORT_NAME;
	}
	public void setREPORT_NAME(String rEPORT_NAME) {
		REPORT_NAME = rEPORT_NAME;
	}
	public Date getREPORT_DATE() {
		return REPORT_DATE;
	}
	public void setREPORT_DATE(Date rEPORT_DATE) {
		REPORT_DATE = rEPORT_DATE;
	}
	public Date getREPORT_DUE_DATE() {
		return REPORT_DUE_DATE;
	}
	public void setREPORT_DUE_DATE(Date rEPORT_DUE_DATE) {
		REPORT_DUE_DATE = rEPORT_DUE_DATE;
	}
	public Date getREP_SUBMIT_DATE() {
		return REP_SUBMIT_DATE;
	}
	public void setREP_SUBMIT_DATE(Date rEP_SUBMIT_DATE) {
		REP_SUBMIT_DATE = rEP_SUBMIT_DATE;
	}
	public Date getREP_PERIOD_FROM() {
		return REP_PERIOD_FROM;
	}
	public void setREP_PERIOD_FROM(Date rEP_PERIOD_FROM) {
		REP_PERIOD_FROM = rEP_PERIOD_FROM;
	}
	public Date getREP_PERIOD_TO() {
		return REP_PERIOD_TO;
	}
	public void setREP_PERIOD_TO(Date rEP_PERIOD_TO) {
		REP_PERIOD_TO = rEP_PERIOD_TO;
	}
	public String getREP_FREQ() {
		return REP_FREQ;
	}
	public void setREP_FREQ(String rEP_FREQ) {
		REP_FREQ = rEP_FREQ;
	}
	public String getNIL_REPORT_FLG() {
		return NIL_REPORT_FLG;
	}
	public void setNIL_REPORT_FLG(String nIL_REPORT_FLG) {
		NIL_REPORT_FLG = nIL_REPORT_FLG;
	}
	public String getARCH_FLG() {
		return ARCH_FLG;
	}
	public void setARCH_FLG(String aRCH_FLG) {
		ARCH_FLG = aRCH_FLG;
	}
	public T16DReport(String cUST_COUNT_PRODUCT, BigDecimal cUST_COUNT_500_600K, BigDecimal cUST_COUNT_600_750K,
			BigDecimal cUST_COUNT_750_1000K, BigDecimal cUST_COUNT_MORE_1000K, String cASH_TRANSACTION_PRODUCT,
			BigDecimal cASH_TRANSACTION_500_600K, BigDecimal cASH_TRANSACTION_600_750K,
			BigDecimal cASH_TRANSACTION_750_1000K, BigDecimal cASH_TRANSACTION_MORE_1000K, String cASH_DEPOSIT_PRODUCT,
			BigDecimal cASH_DEPOSIT_500_600K, BigDecimal cASH_DEPOSIT_600_750K, BigDecimal cASH_DEPOSIT_750_1000K,
			BigDecimal cASH_DEPOSIT_MORE_1000K, String cASH_WITHDRAW_PRODUCT, BigDecimal cASH_WITHDRAW_500_600K,
			BigDecimal cASH_WITHDRAW_600_750K, BigDecimal cASH_WITHDRAW_750_1000K, BigDecimal cASH_WITHDRAW_MORE_1000K,
			String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE,
			Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG) {
		super();
		CUST_COUNT_PRODUCT = cUST_COUNT_PRODUCT;
		CUST_COUNT_500_600K = cUST_COUNT_500_600K;
		CUST_COUNT_600_750K = cUST_COUNT_600_750K;
		CUST_COUNT_750_1000K = cUST_COUNT_750_1000K;
		CUST_COUNT_MORE_1000K = cUST_COUNT_MORE_1000K;
		CASH_TRANSACTION_PRODUCT = cASH_TRANSACTION_PRODUCT;
		CASH_TRANSACTION_500_600K = cASH_TRANSACTION_500_600K;
		CASH_TRANSACTION_600_750K = cASH_TRANSACTION_600_750K;
		CASH_TRANSACTION_750_1000K = cASH_TRANSACTION_750_1000K;
		CASH_TRANSACTION_MORE_1000K = cASH_TRANSACTION_MORE_1000K;
		CASH_DEPOSIT_PRODUCT = cASH_DEPOSIT_PRODUCT;
		CASH_DEPOSIT_500_600K = cASH_DEPOSIT_500_600K;
		CASH_DEPOSIT_600_750K = cASH_DEPOSIT_600_750K;
		CASH_DEPOSIT_750_1000K = cASH_DEPOSIT_750_1000K;
		CASH_DEPOSIT_MORE_1000K = cASH_DEPOSIT_MORE_1000K;
		CASH_WITHDRAW_PRODUCT = cASH_WITHDRAW_PRODUCT;
		CASH_WITHDRAW_500_600K = cASH_WITHDRAW_500_600K;
		CASH_WITHDRAW_600_750K = cASH_WITHDRAW_600_750K;
		CASH_WITHDRAW_750_1000K = cASH_WITHDRAW_750_1000K;
		CASH_WITHDRAW_MORE_1000K = cASH_WITHDRAW_MORE_1000K;
		REPORT_CODE = rEPORT_CODE;
		REPORT_NAME = rEPORT_NAME;
		REPORT_DATE = rEPORT_DATE;
		REPORT_DUE_DATE = rEPORT_DUE_DATE;
		REP_SUBMIT_DATE = rEP_SUBMIT_DATE;
		REP_PERIOD_FROM = rEP_PERIOD_FROM;
		REP_PERIOD_TO = rEP_PERIOD_TO;
		REP_FREQ = rEP_FREQ;
		NIL_REPORT_FLG = nIL_REPORT_FLG;
		ARCH_FLG = aRCH_FLG;
	}
	public T16DReport() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}