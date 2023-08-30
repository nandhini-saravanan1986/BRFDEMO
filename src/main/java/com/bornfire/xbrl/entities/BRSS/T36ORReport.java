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
@Table(name="T36_OR_IT_ASSERT_TABLE")
public class T36ORReport {
	private String	A1_PRODUCT;
	private BigDecimal	A1_NETWORK_DEVICES;
	private BigDecimal	A1_NETWORK_DEVICES_WITH_INTERNET;
	private BigDecimal	A1_NON_NETWORK_DEVICES;
	private BigDecimal	A1_NON_NETWORK_DEVICES_WITH_INTERNET;
	private String	A2_PRODUCT;
	private String	A2_NETWORK_DEVICES;
	private String	A2_NETWORK_DEVICES_WITH_INTERNET;
	private String	A2_NON_NETWORK_DEVICES;
	private String	A2_NON_NETWORK_DEVICES_WITH_INTERNET;
	private String	A3_PRODUCT;
	private BigDecimal	A3_NETWORK_DEVICES;
	private BigDecimal	A3_NETWORK_DEVICES_WITH_INTERNET;
	private BigDecimal	A3_NON_NETWORK_DEVICES;
	private BigDecimal	A3_NON_NETWORK_DEVICES_WITH_INTERNET;
	private String	A4_PRODUCT;
	private BigDecimal	A4_NETWORK_DEVICES;
	private BigDecimal	A4_NETWORK_DEVICES_WITH_INTERNET;
	private BigDecimal	A4_NON_NETWORK_DEVICES;
	private BigDecimal	A4_NON_NETWORK_DEVICES_WITH_INTERNET;
	private String	A5_PRODUCT;
	private BigDecimal	A5_NETWORK_DEVICES;
	private BigDecimal	A5_NETWORK_DEVICES_WITH_INTERNET;
	private BigDecimal	A5_NON_NETWORK_DEVICES;
	private BigDecimal	A5_NON_NETWORK_DEVICES_WITH_INTERNET;
	private String	A6_PRODUCT;
	private BigDecimal	A6_NETWORK_DEVICES;
	private BigDecimal	A6_NETWORK_DEVICES_WITH_INTERNET;
	private BigDecimal	A6_NON_NETWORK_DEVICES;
	private BigDecimal	A6_NON_NETWORK_DEVICES_WITH_INTERNET;
	private String	A7_PRODUCT;
	private BigDecimal	A7_NETWORK_DEVICES;
	private BigDecimal	A7_NETWORK_DEVICES_WITH_INTERNET;
	private BigDecimal	A7_NON_NETWORK_DEVICES;
	private BigDecimal	A7_NON_NETWORK_DEVICES_WITH_INTERNET;
	private String	A8_PRODUCT;
	private String	A8_NETWORK_DEVICES;
	private String	A8_NETWORK_DEVICES_WITH_INTERNET;
	private String	A8_NON_NETWORK_DEVICES;
	private String	A8_NON_NETWORK_DEVICES_WITH_INTERNET;
	private String	A9_PRODUCT;
	private BigDecimal	A9_NETWORK_DEVICES;
	private BigDecimal	A9_NETWORK_DEVICES_WITH_INTERNET;
	private BigDecimal	A9_NON_NETWORK_DEVICES;
	private BigDecimal	A9_NON_NETWORK_DEVICES_WITH_INTERNET;
	private String	A10_PRODUCT;
	private BigDecimal	A10_NETWORK_DEVICES;
	private BigDecimal	A10_NETWORK_DEVICES_WITH_INTERNET;
	private BigDecimal	A10_NON_NETWORK_DEVICES;
	private BigDecimal	A10_NON_NETWORK_DEVICES_WITH_INTERNET;
	private String	A11_PRODUCT;
	private BigDecimal	A11_NETWORK_DEVICES;
	private BigDecimal	A11_NETWORK_DEVICES_WITH_INTERNET;
	private BigDecimal	A11_NON_NETWORK_DEVICES;
	private BigDecimal	A11_NON_NETWORK_DEVICES_WITH_INTERNET;
	private String	A12_PRODUCT;
	private BigDecimal	A12_NETWORK_DEVICES;
	private BigDecimal	A12_NETWORK_DEVICES_WITH_INTERNET;
	private BigDecimal	A12_NON_NETWORK_DEVICES;
	private BigDecimal	A12_NON_NETWORK_DEVICES_WITH_INTERNET;
	private String	A13_PRODUCT;
	private BigDecimal	A13_NETWORK_DEVICES;
	private BigDecimal	A13_NETWORK_DEVICES_WITH_INTERNET;
	private BigDecimal	A13_NON_NETWORK_DEVICES;
	private BigDecimal	A13_NON_NETWORK_DEVICES_WITH_INTERNET;
	private String	A14_PRODUCT;
	private BigDecimal	A14_NETWORK_DEVICES;
	private BigDecimal	A14_NETWORK_DEVICES_WITH_INTERNET;
	private BigDecimal	A14_NON_NETWORK_DEVICES;
	private BigDecimal	A14_NON_NETWORK_DEVICES_WITH_INTERNET;
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
	private String	ENTITY_FLG;
	private String	DEL_FLG;
	private String	MODIFY_FLG;
	private String	ENTRY_USER;
	private String	MODIFY_USER;
	private String	VERIFY_USER;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	ENTRY_TIME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	MODIFY_TIME;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date	VERIFY_TIME;
	private String	QTR_FLG;
	public String getA1_PRODUCT() {
		return A1_PRODUCT;
	}
	public void setA1_PRODUCT(String a1_PRODUCT) {
		A1_PRODUCT = a1_PRODUCT;
	}
	public BigDecimal getA1_NETWORK_DEVICES() {
		return A1_NETWORK_DEVICES;
	}
	public void setA1_NETWORK_DEVICES(BigDecimal a1_NETWORK_DEVICES) {
		A1_NETWORK_DEVICES = a1_NETWORK_DEVICES;
	}
	public BigDecimal getA1_NETWORK_DEVICES_WITH_INTERNET() {
		return A1_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA1_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a1_NETWORK_DEVICES_WITH_INTERNET) {
		A1_NETWORK_DEVICES_WITH_INTERNET = a1_NETWORK_DEVICES_WITH_INTERNET;
	}
	public BigDecimal getA1_NON_NETWORK_DEVICES() {
		return A1_NON_NETWORK_DEVICES;
	}
	public void setA1_NON_NETWORK_DEVICES(BigDecimal a1_NON_NETWORK_DEVICES) {
		A1_NON_NETWORK_DEVICES = a1_NON_NETWORK_DEVICES;
	}
	public BigDecimal getA1_NON_NETWORK_DEVICES_WITH_INTERNET() {
		return A1_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA1_NON_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a1_NON_NETWORK_DEVICES_WITH_INTERNET) {
		A1_NON_NETWORK_DEVICES_WITH_INTERNET = a1_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public String getA2_PRODUCT() {
		return A2_PRODUCT;
	}
	public void setA2_PRODUCT(String a2_PRODUCT) {
		A2_PRODUCT = a2_PRODUCT;
	}
	public String getA2_NETWORK_DEVICES() {
		return A2_NETWORK_DEVICES;
	}
	public void setA2_NETWORK_DEVICES(String a2_NETWORK_DEVICES) {
		A2_NETWORK_DEVICES = a2_NETWORK_DEVICES;
	}
	public String getA2_NETWORK_DEVICES_WITH_INTERNET() {
		return A2_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA2_NETWORK_DEVICES_WITH_INTERNET(String a2_NETWORK_DEVICES_WITH_INTERNET) {
		A2_NETWORK_DEVICES_WITH_INTERNET = a2_NETWORK_DEVICES_WITH_INTERNET;
	}
	public String getA2_NON_NETWORK_DEVICES() {
		return A2_NON_NETWORK_DEVICES;
	}
	public void setA2_NON_NETWORK_DEVICES(String a2_NON_NETWORK_DEVICES) {
		A2_NON_NETWORK_DEVICES = a2_NON_NETWORK_DEVICES;
	}
	public String getA2_NON_NETWORK_DEVICES_WITH_INTERNET() {
		return A2_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA2_NON_NETWORK_DEVICES_WITH_INTERNET(String a2_NON_NETWORK_DEVICES_WITH_INTERNET) {
		A2_NON_NETWORK_DEVICES_WITH_INTERNET = a2_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public String getA3_PRODUCT() {
		return A3_PRODUCT;
	}
	public void setA3_PRODUCT(String a3_PRODUCT) {
		A3_PRODUCT = a3_PRODUCT;
	}
	public BigDecimal getA3_NETWORK_DEVICES() {
		return A3_NETWORK_DEVICES;
	}
	public void setA3_NETWORK_DEVICES(BigDecimal a3_NETWORK_DEVICES) {
		A3_NETWORK_DEVICES = a3_NETWORK_DEVICES;
	}
	public BigDecimal getA3_NETWORK_DEVICES_WITH_INTERNET() {
		return A3_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA3_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a3_NETWORK_DEVICES_WITH_INTERNET) {
		A3_NETWORK_DEVICES_WITH_INTERNET = a3_NETWORK_DEVICES_WITH_INTERNET;
	}
	public BigDecimal getA3_NON_NETWORK_DEVICES() {
		return A3_NON_NETWORK_DEVICES;
	}
	public void setA3_NON_NETWORK_DEVICES(BigDecimal a3_NON_NETWORK_DEVICES) {
		A3_NON_NETWORK_DEVICES = a3_NON_NETWORK_DEVICES;
	}
	public BigDecimal getA3_NON_NETWORK_DEVICES_WITH_INTERNET() {
		return A3_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA3_NON_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a3_NON_NETWORK_DEVICES_WITH_INTERNET) {
		A3_NON_NETWORK_DEVICES_WITH_INTERNET = a3_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public String getA4_PRODUCT() {
		return A4_PRODUCT;
	}
	public void setA4_PRODUCT(String a4_PRODUCT) {
		A4_PRODUCT = a4_PRODUCT;
	}
	public BigDecimal getA4_NETWORK_DEVICES() {
		return A4_NETWORK_DEVICES;
	}
	public void setA4_NETWORK_DEVICES(BigDecimal a4_NETWORK_DEVICES) {
		A4_NETWORK_DEVICES = a4_NETWORK_DEVICES;
	}
	public BigDecimal getA4_NETWORK_DEVICES_WITH_INTERNET() {
		return A4_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA4_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a4_NETWORK_DEVICES_WITH_INTERNET) {
		A4_NETWORK_DEVICES_WITH_INTERNET = a4_NETWORK_DEVICES_WITH_INTERNET;
	}
	public BigDecimal getA4_NON_NETWORK_DEVICES() {
		return A4_NON_NETWORK_DEVICES;
	}
	public void setA4_NON_NETWORK_DEVICES(BigDecimal a4_NON_NETWORK_DEVICES) {
		A4_NON_NETWORK_DEVICES = a4_NON_NETWORK_DEVICES;
	}
	public BigDecimal getA4_NON_NETWORK_DEVICES_WITH_INTERNET() {
		return A4_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA4_NON_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a4_NON_NETWORK_DEVICES_WITH_INTERNET) {
		A4_NON_NETWORK_DEVICES_WITH_INTERNET = a4_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public String getA5_PRODUCT() {
		return A5_PRODUCT;
	}
	public void setA5_PRODUCT(String a5_PRODUCT) {
		A5_PRODUCT = a5_PRODUCT;
	}
	public BigDecimal getA5_NETWORK_DEVICES() {
		return A5_NETWORK_DEVICES;
	}
	public void setA5_NETWORK_DEVICES(BigDecimal a5_NETWORK_DEVICES) {
		A5_NETWORK_DEVICES = a5_NETWORK_DEVICES;
	}
	public BigDecimal getA5_NETWORK_DEVICES_WITH_INTERNET() {
		return A5_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA5_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a5_NETWORK_DEVICES_WITH_INTERNET) {
		A5_NETWORK_DEVICES_WITH_INTERNET = a5_NETWORK_DEVICES_WITH_INTERNET;
	}
	public BigDecimal getA5_NON_NETWORK_DEVICES() {
		return A5_NON_NETWORK_DEVICES;
	}
	public void setA5_NON_NETWORK_DEVICES(BigDecimal a5_NON_NETWORK_DEVICES) {
		A5_NON_NETWORK_DEVICES = a5_NON_NETWORK_DEVICES;
	}
	public BigDecimal getA5_NON_NETWORK_DEVICES_WITH_INTERNET() {
		return A5_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA5_NON_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a5_NON_NETWORK_DEVICES_WITH_INTERNET) {
		A5_NON_NETWORK_DEVICES_WITH_INTERNET = a5_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public String getA6_PRODUCT() {
		return A6_PRODUCT;
	}
	public void setA6_PRODUCT(String a6_PRODUCT) {
		A6_PRODUCT = a6_PRODUCT;
	}
	public BigDecimal getA6_NETWORK_DEVICES() {
		return A6_NETWORK_DEVICES;
	}
	public void setA6_NETWORK_DEVICES(BigDecimal a6_NETWORK_DEVICES) {
		A6_NETWORK_DEVICES = a6_NETWORK_DEVICES;
	}
	public BigDecimal getA6_NETWORK_DEVICES_WITH_INTERNET() {
		return A6_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA6_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a6_NETWORK_DEVICES_WITH_INTERNET) {
		A6_NETWORK_DEVICES_WITH_INTERNET = a6_NETWORK_DEVICES_WITH_INTERNET;
	}
	public BigDecimal getA6_NON_NETWORK_DEVICES() {
		return A6_NON_NETWORK_DEVICES;
	}
	public void setA6_NON_NETWORK_DEVICES(BigDecimal a6_NON_NETWORK_DEVICES) {
		A6_NON_NETWORK_DEVICES = a6_NON_NETWORK_DEVICES;
	}
	public BigDecimal getA6_NON_NETWORK_DEVICES_WITH_INTERNET() {
		return A6_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA6_NON_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a6_NON_NETWORK_DEVICES_WITH_INTERNET) {
		A6_NON_NETWORK_DEVICES_WITH_INTERNET = a6_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public String getA7_PRODUCT() {
		return A7_PRODUCT;
	}
	public void setA7_PRODUCT(String a7_PRODUCT) {
		A7_PRODUCT = a7_PRODUCT;
	}
	public BigDecimal getA7_NETWORK_DEVICES() {
		return A7_NETWORK_DEVICES;
	}
	public void setA7_NETWORK_DEVICES(BigDecimal a7_NETWORK_DEVICES) {
		A7_NETWORK_DEVICES = a7_NETWORK_DEVICES;
	}
	public BigDecimal getA7_NETWORK_DEVICES_WITH_INTERNET() {
		return A7_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA7_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a7_NETWORK_DEVICES_WITH_INTERNET) {
		A7_NETWORK_DEVICES_WITH_INTERNET = a7_NETWORK_DEVICES_WITH_INTERNET;
	}
	public BigDecimal getA7_NON_NETWORK_DEVICES() {
		return A7_NON_NETWORK_DEVICES;
	}
	public void setA7_NON_NETWORK_DEVICES(BigDecimal a7_NON_NETWORK_DEVICES) {
		A7_NON_NETWORK_DEVICES = a7_NON_NETWORK_DEVICES;
	}
	public BigDecimal getA7_NON_NETWORK_DEVICES_WITH_INTERNET() {
		return A7_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA7_NON_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a7_NON_NETWORK_DEVICES_WITH_INTERNET) {
		A7_NON_NETWORK_DEVICES_WITH_INTERNET = a7_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public String getA8_PRODUCT() {
		return A8_PRODUCT;
	}
	public void setA8_PRODUCT(String a8_PRODUCT) {
		A8_PRODUCT = a8_PRODUCT;
	}
	public String getA8_NETWORK_DEVICES() {
		return A8_NETWORK_DEVICES;
	}
	public void setA8_NETWORK_DEVICES(String a8_NETWORK_DEVICES) {
		A8_NETWORK_DEVICES = a8_NETWORK_DEVICES;
	}
	public String getA8_NETWORK_DEVICES_WITH_INTERNET() {
		return A8_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA8_NETWORK_DEVICES_WITH_INTERNET(String a8_NETWORK_DEVICES_WITH_INTERNET) {
		A8_NETWORK_DEVICES_WITH_INTERNET = a8_NETWORK_DEVICES_WITH_INTERNET;
	}
	public String getA8_NON_NETWORK_DEVICES() {
		return A8_NON_NETWORK_DEVICES;
	}
	public void setA8_NON_NETWORK_DEVICES(String a8_NON_NETWORK_DEVICES) {
		A8_NON_NETWORK_DEVICES = a8_NON_NETWORK_DEVICES;
	}
	public String getA8_NON_NETWORK_DEVICES_WITH_INTERNET() {
		return A8_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA8_NON_NETWORK_DEVICES_WITH_INTERNET(String a8_NON_NETWORK_DEVICES_WITH_INTERNET) {
		A8_NON_NETWORK_DEVICES_WITH_INTERNET = a8_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public String getA9_PRODUCT() {
		return A9_PRODUCT;
	}
	public void setA9_PRODUCT(String a9_PRODUCT) {
		A9_PRODUCT = a9_PRODUCT;
	}
	public BigDecimal getA9_NETWORK_DEVICES() {
		return A9_NETWORK_DEVICES;
	}
	public void setA9_NETWORK_DEVICES(BigDecimal a9_NETWORK_DEVICES) {
		A9_NETWORK_DEVICES = a9_NETWORK_DEVICES;
	}
	public BigDecimal getA9_NETWORK_DEVICES_WITH_INTERNET() {
		return A9_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA9_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a9_NETWORK_DEVICES_WITH_INTERNET) {
		A9_NETWORK_DEVICES_WITH_INTERNET = a9_NETWORK_DEVICES_WITH_INTERNET;
	}
	public BigDecimal getA9_NON_NETWORK_DEVICES() {
		return A9_NON_NETWORK_DEVICES;
	}
	public void setA9_NON_NETWORK_DEVICES(BigDecimal a9_NON_NETWORK_DEVICES) {
		A9_NON_NETWORK_DEVICES = a9_NON_NETWORK_DEVICES;
	}
	public BigDecimal getA9_NON_NETWORK_DEVICES_WITH_INTERNET() {
		return A9_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA9_NON_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a9_NON_NETWORK_DEVICES_WITH_INTERNET) {
		A9_NON_NETWORK_DEVICES_WITH_INTERNET = a9_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public String getA10_PRODUCT() {
		return A10_PRODUCT;
	}
	public void setA10_PRODUCT(String a10_PRODUCT) {
		A10_PRODUCT = a10_PRODUCT;
	}
	public BigDecimal getA10_NETWORK_DEVICES() {
		return A10_NETWORK_DEVICES;
	}
	public void setA10_NETWORK_DEVICES(BigDecimal a10_NETWORK_DEVICES) {
		A10_NETWORK_DEVICES = a10_NETWORK_DEVICES;
	}
	public BigDecimal getA10_NETWORK_DEVICES_WITH_INTERNET() {
		return A10_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA10_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a10_NETWORK_DEVICES_WITH_INTERNET) {
		A10_NETWORK_DEVICES_WITH_INTERNET = a10_NETWORK_DEVICES_WITH_INTERNET;
	}
	public BigDecimal getA10_NON_NETWORK_DEVICES() {
		return A10_NON_NETWORK_DEVICES;
	}
	public void setA10_NON_NETWORK_DEVICES(BigDecimal a10_NON_NETWORK_DEVICES) {
		A10_NON_NETWORK_DEVICES = a10_NON_NETWORK_DEVICES;
	}
	public BigDecimal getA10_NON_NETWORK_DEVICES_WITH_INTERNET() {
		return A10_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA10_NON_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a10_NON_NETWORK_DEVICES_WITH_INTERNET) {
		A10_NON_NETWORK_DEVICES_WITH_INTERNET = a10_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public String getA11_PRODUCT() {
		return A11_PRODUCT;
	}
	public void setA11_PRODUCT(String a11_PRODUCT) {
		A11_PRODUCT = a11_PRODUCT;
	}
	public BigDecimal getA11_NETWORK_DEVICES() {
		return A11_NETWORK_DEVICES;
	}
	public void setA11_NETWORK_DEVICES(BigDecimal a11_NETWORK_DEVICES) {
		A11_NETWORK_DEVICES = a11_NETWORK_DEVICES;
	}
	public BigDecimal getA11_NETWORK_DEVICES_WITH_INTERNET() {
		return A11_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA11_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a11_NETWORK_DEVICES_WITH_INTERNET) {
		A11_NETWORK_DEVICES_WITH_INTERNET = a11_NETWORK_DEVICES_WITH_INTERNET;
	}
	public BigDecimal getA11_NON_NETWORK_DEVICES() {
		return A11_NON_NETWORK_DEVICES;
	}
	public void setA11_NON_NETWORK_DEVICES(BigDecimal a11_NON_NETWORK_DEVICES) {
		A11_NON_NETWORK_DEVICES = a11_NON_NETWORK_DEVICES;
	}
	public BigDecimal getA11_NON_NETWORK_DEVICES_WITH_INTERNET() {
		return A11_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA11_NON_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a11_NON_NETWORK_DEVICES_WITH_INTERNET) {
		A11_NON_NETWORK_DEVICES_WITH_INTERNET = a11_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public String getA12_PRODUCT() {
		return A12_PRODUCT;
	}
	public void setA12_PRODUCT(String a12_PRODUCT) {
		A12_PRODUCT = a12_PRODUCT;
	}
	public BigDecimal getA12_NETWORK_DEVICES() {
		return A12_NETWORK_DEVICES;
	}
	public void setA12_NETWORK_DEVICES(BigDecimal a12_NETWORK_DEVICES) {
		A12_NETWORK_DEVICES = a12_NETWORK_DEVICES;
	}
	public BigDecimal getA12_NETWORK_DEVICES_WITH_INTERNET() {
		return A12_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA12_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a12_NETWORK_DEVICES_WITH_INTERNET) {
		A12_NETWORK_DEVICES_WITH_INTERNET = a12_NETWORK_DEVICES_WITH_INTERNET;
	}
	public BigDecimal getA12_NON_NETWORK_DEVICES() {
		return A12_NON_NETWORK_DEVICES;
	}
	public void setA12_NON_NETWORK_DEVICES(BigDecimal a12_NON_NETWORK_DEVICES) {
		A12_NON_NETWORK_DEVICES = a12_NON_NETWORK_DEVICES;
	}
	public BigDecimal getA12_NON_NETWORK_DEVICES_WITH_INTERNET() {
		return A12_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA12_NON_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a12_NON_NETWORK_DEVICES_WITH_INTERNET) {
		A12_NON_NETWORK_DEVICES_WITH_INTERNET = a12_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public String getA13_PRODUCT() {
		return A13_PRODUCT;
	}
	public void setA13_PRODUCT(String a13_PRODUCT) {
		A13_PRODUCT = a13_PRODUCT;
	}
	public BigDecimal getA13_NETWORK_DEVICES() {
		return A13_NETWORK_DEVICES;
	}
	public void setA13_NETWORK_DEVICES(BigDecimal a13_NETWORK_DEVICES) {
		A13_NETWORK_DEVICES = a13_NETWORK_DEVICES;
	}
	public BigDecimal getA13_NETWORK_DEVICES_WITH_INTERNET() {
		return A13_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA13_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a13_NETWORK_DEVICES_WITH_INTERNET) {
		A13_NETWORK_DEVICES_WITH_INTERNET = a13_NETWORK_DEVICES_WITH_INTERNET;
	}
	public BigDecimal getA13_NON_NETWORK_DEVICES() {
		return A13_NON_NETWORK_DEVICES;
	}
	public void setA13_NON_NETWORK_DEVICES(BigDecimal a13_NON_NETWORK_DEVICES) {
		A13_NON_NETWORK_DEVICES = a13_NON_NETWORK_DEVICES;
	}
	public BigDecimal getA13_NON_NETWORK_DEVICES_WITH_INTERNET() {
		return A13_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA13_NON_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a13_NON_NETWORK_DEVICES_WITH_INTERNET) {
		A13_NON_NETWORK_DEVICES_WITH_INTERNET = a13_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public String getA14_PRODUCT() {
		return A14_PRODUCT;
	}
	public void setA14_PRODUCT(String a14_PRODUCT) {
		A14_PRODUCT = a14_PRODUCT;
	}
	public BigDecimal getA14_NETWORK_DEVICES() {
		return A14_NETWORK_DEVICES;
	}
	public void setA14_NETWORK_DEVICES(BigDecimal a14_NETWORK_DEVICES) {
		A14_NETWORK_DEVICES = a14_NETWORK_DEVICES;
	}
	public BigDecimal getA14_NETWORK_DEVICES_WITH_INTERNET() {
		return A14_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA14_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a14_NETWORK_DEVICES_WITH_INTERNET) {
		A14_NETWORK_DEVICES_WITH_INTERNET = a14_NETWORK_DEVICES_WITH_INTERNET;
	}
	public BigDecimal getA14_NON_NETWORK_DEVICES() {
		return A14_NON_NETWORK_DEVICES;
	}
	public void setA14_NON_NETWORK_DEVICES(BigDecimal a14_NON_NETWORK_DEVICES) {
		A14_NON_NETWORK_DEVICES = a14_NON_NETWORK_DEVICES;
	}
	public BigDecimal getA14_NON_NETWORK_DEVICES_WITH_INTERNET() {
		return A14_NON_NETWORK_DEVICES_WITH_INTERNET;
	}
	public void setA14_NON_NETWORK_DEVICES_WITH_INTERNET(BigDecimal a14_NON_NETWORK_DEVICES_WITH_INTERNET) {
		A14_NON_NETWORK_DEVICES_WITH_INTERNET = a14_NON_NETWORK_DEVICES_WITH_INTERNET;
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
	public String getENTITY_FLG() {
		return ENTITY_FLG;
	}
	public void setENTITY_FLG(String eNTITY_FLG) {
		ENTITY_FLG = eNTITY_FLG;
	}
	public String getDEL_FLG() {
		return DEL_FLG;
	}
	public void setDEL_FLG(String dEL_FLG) {
		DEL_FLG = dEL_FLG;
	}
	public String getMODIFY_FLG() {
		return MODIFY_FLG;
	}
	public void setMODIFY_FLG(String mODIFY_FLG) {
		MODIFY_FLG = mODIFY_FLG;
	}
	public String getENTRY_USER() {
		return ENTRY_USER;
	}
	public void setENTRY_USER(String eNTRY_USER) {
		ENTRY_USER = eNTRY_USER;
	}
	public String getMODIFY_USER() {
		return MODIFY_USER;
	}
	public void setMODIFY_USER(String mODIFY_USER) {
		MODIFY_USER = mODIFY_USER;
	}
	public String getVERIFY_USER() {
		return VERIFY_USER;
	}
	public void setVERIFY_USER(String vERIFY_USER) {
		VERIFY_USER = vERIFY_USER;
	}
	public Date getENTRY_TIME() {
		return ENTRY_TIME;
	}
	public void setENTRY_TIME(Date eNTRY_TIME) {
		ENTRY_TIME = eNTRY_TIME;
	}
	public Date getMODIFY_TIME() {
		return MODIFY_TIME;
	}
	public void setMODIFY_TIME(Date mODIFY_TIME) {
		MODIFY_TIME = mODIFY_TIME;
	}
	public Date getVERIFY_TIME() {
		return VERIFY_TIME;
	}
	public void setVERIFY_TIME(Date vERIFY_TIME) {
		VERIFY_TIME = vERIFY_TIME;
	}
	public String getQTR_FLG() {
		return QTR_FLG;
	}
	public void setQTR_FLG(String qTR_FLG) {
		QTR_FLG = qTR_FLG;
	}
	public T36ORReport(String a1_PRODUCT, BigDecimal a1_NETWORK_DEVICES, BigDecimal a1_NETWORK_DEVICES_WITH_INTERNET,
			BigDecimal a1_NON_NETWORK_DEVICES, BigDecimal a1_NON_NETWORK_DEVICES_WITH_INTERNET, String a2_PRODUCT,
			String a2_NETWORK_DEVICES, String a2_NETWORK_DEVICES_WITH_INTERNET, String a2_NON_NETWORK_DEVICES,
			String a2_NON_NETWORK_DEVICES_WITH_INTERNET, String a3_PRODUCT, BigDecimal a3_NETWORK_DEVICES,
			BigDecimal a3_NETWORK_DEVICES_WITH_INTERNET, BigDecimal a3_NON_NETWORK_DEVICES,
			BigDecimal a3_NON_NETWORK_DEVICES_WITH_INTERNET, String a4_PRODUCT, BigDecimal a4_NETWORK_DEVICES,
			BigDecimal a4_NETWORK_DEVICES_WITH_INTERNET, BigDecimal a4_NON_NETWORK_DEVICES,
			BigDecimal a4_NON_NETWORK_DEVICES_WITH_INTERNET, String a5_PRODUCT, BigDecimal a5_NETWORK_DEVICES,
			BigDecimal a5_NETWORK_DEVICES_WITH_INTERNET, BigDecimal a5_NON_NETWORK_DEVICES,
			BigDecimal a5_NON_NETWORK_DEVICES_WITH_INTERNET, String a6_PRODUCT, BigDecimal a6_NETWORK_DEVICES,
			BigDecimal a6_NETWORK_DEVICES_WITH_INTERNET, BigDecimal a6_NON_NETWORK_DEVICES,
			BigDecimal a6_NON_NETWORK_DEVICES_WITH_INTERNET, String a7_PRODUCT, BigDecimal a7_NETWORK_DEVICES,
			BigDecimal a7_NETWORK_DEVICES_WITH_INTERNET, BigDecimal a7_NON_NETWORK_DEVICES,
			BigDecimal a7_NON_NETWORK_DEVICES_WITH_INTERNET, String a8_PRODUCT, String a8_NETWORK_DEVICES,
			String a8_NETWORK_DEVICES_WITH_INTERNET, String a8_NON_NETWORK_DEVICES,
			String a8_NON_NETWORK_DEVICES_WITH_INTERNET, String a9_PRODUCT, BigDecimal a9_NETWORK_DEVICES,
			BigDecimal a9_NETWORK_DEVICES_WITH_INTERNET, BigDecimal a9_NON_NETWORK_DEVICES,
			BigDecimal a9_NON_NETWORK_DEVICES_WITH_INTERNET, String a10_PRODUCT, BigDecimal a10_NETWORK_DEVICES,
			BigDecimal a10_NETWORK_DEVICES_WITH_INTERNET, BigDecimal a10_NON_NETWORK_DEVICES,
			BigDecimal a10_NON_NETWORK_DEVICES_WITH_INTERNET, String a11_PRODUCT, BigDecimal a11_NETWORK_DEVICES,
			BigDecimal a11_NETWORK_DEVICES_WITH_INTERNET, BigDecimal a11_NON_NETWORK_DEVICES,
			BigDecimal a11_NON_NETWORK_DEVICES_WITH_INTERNET, String a12_PRODUCT, BigDecimal a12_NETWORK_DEVICES,
			BigDecimal a12_NETWORK_DEVICES_WITH_INTERNET, BigDecimal a12_NON_NETWORK_DEVICES,
			BigDecimal a12_NON_NETWORK_DEVICES_WITH_INTERNET, String a13_PRODUCT, BigDecimal a13_NETWORK_DEVICES,
			BigDecimal a13_NETWORK_DEVICES_WITH_INTERNET, BigDecimal a13_NON_NETWORK_DEVICES,
			BigDecimal a13_NON_NETWORK_DEVICES_WITH_INTERNET, String a14_PRODUCT, BigDecimal a14_NETWORK_DEVICES,
			BigDecimal a14_NETWORK_DEVICES_WITH_INTERNET, BigDecimal a14_NON_NETWORK_DEVICES,
			BigDecimal a14_NON_NETWORK_DEVICES_WITH_INTERNET, String rEPORT_CODE, String rEPORT_NAME, Date rEPORT_DATE,
			Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO, String rEP_FREQ,
			String nIL_REPORT_FLG, String aRCH_FLG, String eNTITY_FLG, String dEL_FLG, String mODIFY_FLG,
			String eNTRY_USER, String mODIFY_USER, String vERIFY_USER, Date eNTRY_TIME, Date mODIFY_TIME,
			Date vERIFY_TIME, String qTR_FLG) {
		super();
		A1_PRODUCT = a1_PRODUCT;
		A1_NETWORK_DEVICES = a1_NETWORK_DEVICES;
		A1_NETWORK_DEVICES_WITH_INTERNET = a1_NETWORK_DEVICES_WITH_INTERNET;
		A1_NON_NETWORK_DEVICES = a1_NON_NETWORK_DEVICES;
		A1_NON_NETWORK_DEVICES_WITH_INTERNET = a1_NON_NETWORK_DEVICES_WITH_INTERNET;
		A2_PRODUCT = a2_PRODUCT;
		A2_NETWORK_DEVICES = a2_NETWORK_DEVICES;
		A2_NETWORK_DEVICES_WITH_INTERNET = a2_NETWORK_DEVICES_WITH_INTERNET;
		A2_NON_NETWORK_DEVICES = a2_NON_NETWORK_DEVICES;
		A2_NON_NETWORK_DEVICES_WITH_INTERNET = a2_NON_NETWORK_DEVICES_WITH_INTERNET;
		A3_PRODUCT = a3_PRODUCT;
		A3_NETWORK_DEVICES = a3_NETWORK_DEVICES;
		A3_NETWORK_DEVICES_WITH_INTERNET = a3_NETWORK_DEVICES_WITH_INTERNET;
		A3_NON_NETWORK_DEVICES = a3_NON_NETWORK_DEVICES;
		A3_NON_NETWORK_DEVICES_WITH_INTERNET = a3_NON_NETWORK_DEVICES_WITH_INTERNET;
		A4_PRODUCT = a4_PRODUCT;
		A4_NETWORK_DEVICES = a4_NETWORK_DEVICES;
		A4_NETWORK_DEVICES_WITH_INTERNET = a4_NETWORK_DEVICES_WITH_INTERNET;
		A4_NON_NETWORK_DEVICES = a4_NON_NETWORK_DEVICES;
		A4_NON_NETWORK_DEVICES_WITH_INTERNET = a4_NON_NETWORK_DEVICES_WITH_INTERNET;
		A5_PRODUCT = a5_PRODUCT;
		A5_NETWORK_DEVICES = a5_NETWORK_DEVICES;
		A5_NETWORK_DEVICES_WITH_INTERNET = a5_NETWORK_DEVICES_WITH_INTERNET;
		A5_NON_NETWORK_DEVICES = a5_NON_NETWORK_DEVICES;
		A5_NON_NETWORK_DEVICES_WITH_INTERNET = a5_NON_NETWORK_DEVICES_WITH_INTERNET;
		A6_PRODUCT = a6_PRODUCT;
		A6_NETWORK_DEVICES = a6_NETWORK_DEVICES;
		A6_NETWORK_DEVICES_WITH_INTERNET = a6_NETWORK_DEVICES_WITH_INTERNET;
		A6_NON_NETWORK_DEVICES = a6_NON_NETWORK_DEVICES;
		A6_NON_NETWORK_DEVICES_WITH_INTERNET = a6_NON_NETWORK_DEVICES_WITH_INTERNET;
		A7_PRODUCT = a7_PRODUCT;
		A7_NETWORK_DEVICES = a7_NETWORK_DEVICES;
		A7_NETWORK_DEVICES_WITH_INTERNET = a7_NETWORK_DEVICES_WITH_INTERNET;
		A7_NON_NETWORK_DEVICES = a7_NON_NETWORK_DEVICES;
		A7_NON_NETWORK_DEVICES_WITH_INTERNET = a7_NON_NETWORK_DEVICES_WITH_INTERNET;
		A8_PRODUCT = a8_PRODUCT;
		A8_NETWORK_DEVICES = a8_NETWORK_DEVICES;
		A8_NETWORK_DEVICES_WITH_INTERNET = a8_NETWORK_DEVICES_WITH_INTERNET;
		A8_NON_NETWORK_DEVICES = a8_NON_NETWORK_DEVICES;
		A8_NON_NETWORK_DEVICES_WITH_INTERNET = a8_NON_NETWORK_DEVICES_WITH_INTERNET;
		A9_PRODUCT = a9_PRODUCT;
		A9_NETWORK_DEVICES = a9_NETWORK_DEVICES;
		A9_NETWORK_DEVICES_WITH_INTERNET = a9_NETWORK_DEVICES_WITH_INTERNET;
		A9_NON_NETWORK_DEVICES = a9_NON_NETWORK_DEVICES;
		A9_NON_NETWORK_DEVICES_WITH_INTERNET = a9_NON_NETWORK_DEVICES_WITH_INTERNET;
		A10_PRODUCT = a10_PRODUCT;
		A10_NETWORK_DEVICES = a10_NETWORK_DEVICES;
		A10_NETWORK_DEVICES_WITH_INTERNET = a10_NETWORK_DEVICES_WITH_INTERNET;
		A10_NON_NETWORK_DEVICES = a10_NON_NETWORK_DEVICES;
		A10_NON_NETWORK_DEVICES_WITH_INTERNET = a10_NON_NETWORK_DEVICES_WITH_INTERNET;
		A11_PRODUCT = a11_PRODUCT;
		A11_NETWORK_DEVICES = a11_NETWORK_DEVICES;
		A11_NETWORK_DEVICES_WITH_INTERNET = a11_NETWORK_DEVICES_WITH_INTERNET;
		A11_NON_NETWORK_DEVICES = a11_NON_NETWORK_DEVICES;
		A11_NON_NETWORK_DEVICES_WITH_INTERNET = a11_NON_NETWORK_DEVICES_WITH_INTERNET;
		A12_PRODUCT = a12_PRODUCT;
		A12_NETWORK_DEVICES = a12_NETWORK_DEVICES;
		A12_NETWORK_DEVICES_WITH_INTERNET = a12_NETWORK_DEVICES_WITH_INTERNET;
		A12_NON_NETWORK_DEVICES = a12_NON_NETWORK_DEVICES;
		A12_NON_NETWORK_DEVICES_WITH_INTERNET = a12_NON_NETWORK_DEVICES_WITH_INTERNET;
		A13_PRODUCT = a13_PRODUCT;
		A13_NETWORK_DEVICES = a13_NETWORK_DEVICES;
		A13_NETWORK_DEVICES_WITH_INTERNET = a13_NETWORK_DEVICES_WITH_INTERNET;
		A13_NON_NETWORK_DEVICES = a13_NON_NETWORK_DEVICES;
		A13_NON_NETWORK_DEVICES_WITH_INTERNET = a13_NON_NETWORK_DEVICES_WITH_INTERNET;
		A14_PRODUCT = a14_PRODUCT;
		A14_NETWORK_DEVICES = a14_NETWORK_DEVICES;
		A14_NETWORK_DEVICES_WITH_INTERNET = a14_NETWORK_DEVICES_WITH_INTERNET;
		A14_NON_NETWORK_DEVICES = a14_NON_NETWORK_DEVICES;
		A14_NON_NETWORK_DEVICES_WITH_INTERNET = a14_NON_NETWORK_DEVICES_WITH_INTERNET;
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
		ENTITY_FLG = eNTITY_FLG;
		DEL_FLG = dEL_FLG;
		MODIFY_FLG = mODIFY_FLG;
		ENTRY_USER = eNTRY_USER;
		MODIFY_USER = mODIFY_USER;
		VERIFY_USER = vERIFY_USER;
		ENTRY_TIME = eNTRY_TIME;
		MODIFY_TIME = mODIFY_TIME;
		VERIFY_TIME = vERIFY_TIME;
		QTR_FLG = qTR_FLG;
	}
	public T36ORReport() {
		super();
		// TODO Auto-generated constructor stub
	}
    

}