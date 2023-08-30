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
@Table(name="T33_OR_IT_SOFTWARE_BANK_TABLE")
public class T33ORReport {
	private String	A1_PRODUCT;
	private BigDecimal	A1_DEV_IN_HOUSE;
	private BigDecimal	A1_DEV_IN_HOUSE_OUTSOURCED;
	private BigDecimal	A1_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	private BigDecimal	A1_DEV_MAINTENANCE_OUTSOURCED;
	private BigDecimal	A1_OTHERS;
	private String	A2_PRODUCT;
	private String	A3_PRODUCT;
	private BigDecimal	A3_DEV_IN_HOUSE;
	private BigDecimal	A3_DEV_IN_HOUSE_OUTSOURCED;
	private BigDecimal	A3_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	private BigDecimal	A3_DEV_MAINTENANCE_OUTSOURCED;
	private BigDecimal	A3_OTHERS;
	private String	A4_PRODUCT;
	private BigDecimal	A4_DEV_IN_HOUSE;
	private BigDecimal	A4_DEV_IN_HOUSE_OUTSOURCED;
	private BigDecimal	A4_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	private BigDecimal	A4_DEV_MAINTENANCE_OUTSOURCED;
	private BigDecimal	A4_OTHERS;
	private String	A5_PRODUCT;
	private BigDecimal	A5_DEV_IN_HOUSE;
	private BigDecimal	A5_DEV_IN_HOUSE_OUTSOURCED;
	private BigDecimal	A5_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	private BigDecimal	A5_DEV_MAINTENANCE_OUTSOURCED;
	private BigDecimal	A5_OTHERS;
	private String	A6_PRODUCT;
	private BigDecimal	A6_DEV_IN_HOUSE;
	private BigDecimal	A6_DEV_IN_HOUSE_OUTSOURCED;
	private BigDecimal	A6_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	private BigDecimal	A6_DEV_MAINTENANCE_OUTSOURCED;
	private BigDecimal	A6_OTHERS;
	private String	A7_PRODUCT;
	private BigDecimal	A7_DEV_IN_HOUSE;
	private BigDecimal	A7_DEV_IN_HOUSE_OUTSOURCED;
	private BigDecimal	A7_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	private BigDecimal	A7_DEV_MAINTENANCE_OUTSOURCED;
	private BigDecimal	A7_OTHERS;
	private String	A8_PRODUCT;
	private BigDecimal	A8_DEV_IN_HOUSE;
	private BigDecimal	A8_DEV_IN_HOUSE_OUTSOURCED;
	private BigDecimal	A8_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	private BigDecimal	A8_DEV_MAINTENANCE_OUTSOURCED;
	private BigDecimal	A8_OTHERS;
	private String	A9_PRODUCT;
	private String	A10_PRODUCT;
	private BigDecimal	A10_DEV_IN_HOUSE;
	private BigDecimal	A10_DEV_IN_HOUSE_OUTSOURCED;
	private BigDecimal	A10_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	private BigDecimal	A10_DEV_MAINTENANCE_OUTSOURCED;
	private BigDecimal	A10_OTHERS;
	private String	A11_PRODUCT;
	private BigDecimal	A11_DEV_IN_HOUSE;
	private BigDecimal	A11_DEV_IN_HOUSE_OUTSOURCED;
	private BigDecimal	A11_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	private BigDecimal	A11_DEV_MAINTENANCE_OUTSOURCED;
	private BigDecimal	A11_OTHERS;
	private String	A12_PRODUCT;
	private BigDecimal	A12_DEV_IN_HOUSE;
	private BigDecimal	A12_DEV_IN_HOUSE_OUTSOURCED;
	private BigDecimal	A12_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	private BigDecimal	A12_DEV_MAINTENANCE_OUTSOURCED;
	private BigDecimal	A12_OTHERS;
	private String	A13_PRODUCT;
	private BigDecimal	A13_DEV_IN_HOUSE;
	private BigDecimal	A13_DEV_IN_HOUSE_OUTSOURCED;
	private BigDecimal	A13_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	private BigDecimal	A13_DEV_MAINTENANCE_OUTSOURCED;
	private BigDecimal	A13_OTHERS;
	private String	A14_PRODUCT;
	private BigDecimal	A14_DEV_IN_HOUSE;
	private BigDecimal	A14_DEV_IN_HOUSE_OUTSOURCED;
	private BigDecimal	A14_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	private BigDecimal	A14_DEV_MAINTENANCE_OUTSOURCED;
	private BigDecimal	A14_OTHERS;
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
	public BigDecimal getA1_DEV_IN_HOUSE() {
		return A1_DEV_IN_HOUSE;
	}
	public void setA1_DEV_IN_HOUSE(BigDecimal a1_DEV_IN_HOUSE) {
		A1_DEV_IN_HOUSE = a1_DEV_IN_HOUSE;
	}
	public BigDecimal getA1_DEV_IN_HOUSE_OUTSOURCED() {
		return A1_DEV_IN_HOUSE_OUTSOURCED;
	}
	public void setA1_DEV_IN_HOUSE_OUTSOURCED(BigDecimal a1_DEV_IN_HOUSE_OUTSOURCED) {
		A1_DEV_IN_HOUSE_OUTSOURCED = a1_DEV_IN_HOUSE_OUTSOURCED;
	}
	public BigDecimal getA1_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE() {
		return A1_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public void setA1_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE(BigDecimal a1_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE) {
		A1_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a1_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public BigDecimal getA1_DEV_MAINTENANCE_OUTSOURCED() {
		return A1_DEV_MAINTENANCE_OUTSOURCED;
	}
	public void setA1_DEV_MAINTENANCE_OUTSOURCED(BigDecimal a1_DEV_MAINTENANCE_OUTSOURCED) {
		A1_DEV_MAINTENANCE_OUTSOURCED = a1_DEV_MAINTENANCE_OUTSOURCED;
	}
	public BigDecimal getA1_OTHERS() {
		return A1_OTHERS;
	}
	public void setA1_OTHERS(BigDecimal a1_OTHERS) {
		A1_OTHERS = a1_OTHERS;
	}
	public String getA2_PRODUCT() {
		return A2_PRODUCT;
	}
	public void setA2_PRODUCT(String a2_PRODUCT) {
		A2_PRODUCT = a2_PRODUCT;
	}
	public String getA3_PRODUCT() {
		return A3_PRODUCT;
	}
	public void setA3_PRODUCT(String a3_PRODUCT) {
		A3_PRODUCT = a3_PRODUCT;
	}
	public BigDecimal getA3_DEV_IN_HOUSE() {
		return A3_DEV_IN_HOUSE;
	}
	public void setA3_DEV_IN_HOUSE(BigDecimal a3_DEV_IN_HOUSE) {
		A3_DEV_IN_HOUSE = a3_DEV_IN_HOUSE;
	}
	public BigDecimal getA3_DEV_IN_HOUSE_OUTSOURCED() {
		return A3_DEV_IN_HOUSE_OUTSOURCED;
	}
	public void setA3_DEV_IN_HOUSE_OUTSOURCED(BigDecimal a3_DEV_IN_HOUSE_OUTSOURCED) {
		A3_DEV_IN_HOUSE_OUTSOURCED = a3_DEV_IN_HOUSE_OUTSOURCED;
	}
	public BigDecimal getA3_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE() {
		return A3_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public void setA3_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE(BigDecimal a3_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE) {
		A3_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a3_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public BigDecimal getA3_DEV_MAINTENANCE_OUTSOURCED() {
		return A3_DEV_MAINTENANCE_OUTSOURCED;
	}
	public void setA3_DEV_MAINTENANCE_OUTSOURCED(BigDecimal a3_DEV_MAINTENANCE_OUTSOURCED) {
		A3_DEV_MAINTENANCE_OUTSOURCED = a3_DEV_MAINTENANCE_OUTSOURCED;
	}
	public BigDecimal getA3_OTHERS() {
		return A3_OTHERS;
	}
	public void setA3_OTHERS(BigDecimal a3_OTHERS) {
		A3_OTHERS = a3_OTHERS;
	}
	public String getA4_PRODUCT() {
		return A4_PRODUCT;
	}
	public void setA4_PRODUCT(String a4_PRODUCT) {
		A4_PRODUCT = a4_PRODUCT;
	}
	public BigDecimal getA4_DEV_IN_HOUSE() {
		return A4_DEV_IN_HOUSE;
	}
	public void setA4_DEV_IN_HOUSE(BigDecimal a4_DEV_IN_HOUSE) {
		A4_DEV_IN_HOUSE = a4_DEV_IN_HOUSE;
	}
	public BigDecimal getA4_DEV_IN_HOUSE_OUTSOURCED() {
		return A4_DEV_IN_HOUSE_OUTSOURCED;
	}
	public void setA4_DEV_IN_HOUSE_OUTSOURCED(BigDecimal a4_DEV_IN_HOUSE_OUTSOURCED) {
		A4_DEV_IN_HOUSE_OUTSOURCED = a4_DEV_IN_HOUSE_OUTSOURCED;
	}
	public BigDecimal getA4_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE() {
		return A4_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public void setA4_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE(BigDecimal a4_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE) {
		A4_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a4_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public BigDecimal getA4_DEV_MAINTENANCE_OUTSOURCED() {
		return A4_DEV_MAINTENANCE_OUTSOURCED;
	}
	public void setA4_DEV_MAINTENANCE_OUTSOURCED(BigDecimal a4_DEV_MAINTENANCE_OUTSOURCED) {
		A4_DEV_MAINTENANCE_OUTSOURCED = a4_DEV_MAINTENANCE_OUTSOURCED;
	}
	public BigDecimal getA4_OTHERS() {
		return A4_OTHERS;
	}
	public void setA4_OTHERS(BigDecimal a4_OTHERS) {
		A4_OTHERS = a4_OTHERS;
	}
	public String getA5_PRODUCT() {
		return A5_PRODUCT;
	}
	public void setA5_PRODUCT(String a5_PRODUCT) {
		A5_PRODUCT = a5_PRODUCT;
	}
	public BigDecimal getA5_DEV_IN_HOUSE() {
		return A5_DEV_IN_HOUSE;
	}
	public void setA5_DEV_IN_HOUSE(BigDecimal a5_DEV_IN_HOUSE) {
		A5_DEV_IN_HOUSE = a5_DEV_IN_HOUSE;
	}
	public BigDecimal getA5_DEV_IN_HOUSE_OUTSOURCED() {
		return A5_DEV_IN_HOUSE_OUTSOURCED;
	}
	public void setA5_DEV_IN_HOUSE_OUTSOURCED(BigDecimal a5_DEV_IN_HOUSE_OUTSOURCED) {
		A5_DEV_IN_HOUSE_OUTSOURCED = a5_DEV_IN_HOUSE_OUTSOURCED;
	}
	public BigDecimal getA5_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE() {
		return A5_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public void setA5_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE(BigDecimal a5_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE) {
		A5_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a5_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public BigDecimal getA5_DEV_MAINTENANCE_OUTSOURCED() {
		return A5_DEV_MAINTENANCE_OUTSOURCED;
	}
	public void setA5_DEV_MAINTENANCE_OUTSOURCED(BigDecimal a5_DEV_MAINTENANCE_OUTSOURCED) {
		A5_DEV_MAINTENANCE_OUTSOURCED = a5_DEV_MAINTENANCE_OUTSOURCED;
	}
	public BigDecimal getA5_OTHERS() {
		return A5_OTHERS;
	}
	public void setA5_OTHERS(BigDecimal a5_OTHERS) {
		A5_OTHERS = a5_OTHERS;
	}
	public String getA6_PRODUCT() {
		return A6_PRODUCT;
	}
	public void setA6_PRODUCT(String a6_PRODUCT) {
		A6_PRODUCT = a6_PRODUCT;
	}
	public BigDecimal getA6_DEV_IN_HOUSE() {
		return A6_DEV_IN_HOUSE;
	}
	public void setA6_DEV_IN_HOUSE(BigDecimal a6_DEV_IN_HOUSE) {
		A6_DEV_IN_HOUSE = a6_DEV_IN_HOUSE;
	}
	public BigDecimal getA6_DEV_IN_HOUSE_OUTSOURCED() {
		return A6_DEV_IN_HOUSE_OUTSOURCED;
	}
	public void setA6_DEV_IN_HOUSE_OUTSOURCED(BigDecimal a6_DEV_IN_HOUSE_OUTSOURCED) {
		A6_DEV_IN_HOUSE_OUTSOURCED = a6_DEV_IN_HOUSE_OUTSOURCED;
	}
	public BigDecimal getA6_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE() {
		return A6_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public void setA6_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE(BigDecimal a6_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE) {
		A6_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a6_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public BigDecimal getA6_DEV_MAINTENANCE_OUTSOURCED() {
		return A6_DEV_MAINTENANCE_OUTSOURCED;
	}
	public void setA6_DEV_MAINTENANCE_OUTSOURCED(BigDecimal a6_DEV_MAINTENANCE_OUTSOURCED) {
		A6_DEV_MAINTENANCE_OUTSOURCED = a6_DEV_MAINTENANCE_OUTSOURCED;
	}
	public BigDecimal getA6_OTHERS() {
		return A6_OTHERS;
	}
	public void setA6_OTHERS(BigDecimal a6_OTHERS) {
		A6_OTHERS = a6_OTHERS;
	}
	public String getA7_PRODUCT() {
		return A7_PRODUCT;
	}
	public void setA7_PRODUCT(String a7_PRODUCT) {
		A7_PRODUCT = a7_PRODUCT;
	}
	public BigDecimal getA7_DEV_IN_HOUSE() {
		return A7_DEV_IN_HOUSE;
	}
	public void setA7_DEV_IN_HOUSE(BigDecimal a7_DEV_IN_HOUSE) {
		A7_DEV_IN_HOUSE = a7_DEV_IN_HOUSE;
	}
	public BigDecimal getA7_DEV_IN_HOUSE_OUTSOURCED() {
		return A7_DEV_IN_HOUSE_OUTSOURCED;
	}
	public void setA7_DEV_IN_HOUSE_OUTSOURCED(BigDecimal a7_DEV_IN_HOUSE_OUTSOURCED) {
		A7_DEV_IN_HOUSE_OUTSOURCED = a7_DEV_IN_HOUSE_OUTSOURCED;
	}
	public BigDecimal getA7_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE() {
		return A7_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public void setA7_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE(BigDecimal a7_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE) {
		A7_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a7_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public BigDecimal getA7_DEV_MAINTENANCE_OUTSOURCED() {
		return A7_DEV_MAINTENANCE_OUTSOURCED;
	}
	public void setA7_DEV_MAINTENANCE_OUTSOURCED(BigDecimal a7_DEV_MAINTENANCE_OUTSOURCED) {
		A7_DEV_MAINTENANCE_OUTSOURCED = a7_DEV_MAINTENANCE_OUTSOURCED;
	}
	public BigDecimal getA7_OTHERS() {
		return A7_OTHERS;
	}
	public void setA7_OTHERS(BigDecimal a7_OTHERS) {
		A7_OTHERS = a7_OTHERS;
	}
	public String getA8_PRODUCT() {
		return A8_PRODUCT;
	}
	public void setA8_PRODUCT(String a8_PRODUCT) {
		A8_PRODUCT = a8_PRODUCT;
	}
	public BigDecimal getA8_DEV_IN_HOUSE() {
		return A8_DEV_IN_HOUSE;
	}
	public void setA8_DEV_IN_HOUSE(BigDecimal a8_DEV_IN_HOUSE) {
		A8_DEV_IN_HOUSE = a8_DEV_IN_HOUSE;
	}
	public BigDecimal getA8_DEV_IN_HOUSE_OUTSOURCED() {
		return A8_DEV_IN_HOUSE_OUTSOURCED;
	}
	public void setA8_DEV_IN_HOUSE_OUTSOURCED(BigDecimal a8_DEV_IN_HOUSE_OUTSOURCED) {
		A8_DEV_IN_HOUSE_OUTSOURCED = a8_DEV_IN_HOUSE_OUTSOURCED;
	}
	public BigDecimal getA8_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE() {
		return A8_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public void setA8_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE(BigDecimal a8_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE) {
		A8_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a8_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public BigDecimal getA8_DEV_MAINTENANCE_OUTSOURCED() {
		return A8_DEV_MAINTENANCE_OUTSOURCED;
	}
	public void setA8_DEV_MAINTENANCE_OUTSOURCED(BigDecimal a8_DEV_MAINTENANCE_OUTSOURCED) {
		A8_DEV_MAINTENANCE_OUTSOURCED = a8_DEV_MAINTENANCE_OUTSOURCED;
	}
	public BigDecimal getA8_OTHERS() {
		return A8_OTHERS;
	}
	public void setA8_OTHERS(BigDecimal a8_OTHERS) {
		A8_OTHERS = a8_OTHERS;
	}
	public String getA9_PRODUCT() {
		return A9_PRODUCT;
	}
	public void setA9_PRODUCT(String a9_PRODUCT) {
		A9_PRODUCT = a9_PRODUCT;
	}
	public String getA10_PRODUCT() {
		return A10_PRODUCT;
	}
	public void setA10_PRODUCT(String a10_PRODUCT) {
		A10_PRODUCT = a10_PRODUCT;
	}
	public BigDecimal getA10_DEV_IN_HOUSE() {
		return A10_DEV_IN_HOUSE;
	}
	public void setA10_DEV_IN_HOUSE(BigDecimal a10_DEV_IN_HOUSE) {
		A10_DEV_IN_HOUSE = a10_DEV_IN_HOUSE;
	}
	public BigDecimal getA10_DEV_IN_HOUSE_OUTSOURCED() {
		return A10_DEV_IN_HOUSE_OUTSOURCED;
	}
	public void setA10_DEV_IN_HOUSE_OUTSOURCED(BigDecimal a10_DEV_IN_HOUSE_OUTSOURCED) {
		A10_DEV_IN_HOUSE_OUTSOURCED = a10_DEV_IN_HOUSE_OUTSOURCED;
	}
	public BigDecimal getA10_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE() {
		return A10_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public void setA10_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE(BigDecimal a10_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE) {
		A10_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a10_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public BigDecimal getA10_DEV_MAINTENANCE_OUTSOURCED() {
		return A10_DEV_MAINTENANCE_OUTSOURCED;
	}
	public void setA10_DEV_MAINTENANCE_OUTSOURCED(BigDecimal a10_DEV_MAINTENANCE_OUTSOURCED) {
		A10_DEV_MAINTENANCE_OUTSOURCED = a10_DEV_MAINTENANCE_OUTSOURCED;
	}
	public BigDecimal getA10_OTHERS() {
		return A10_OTHERS;
	}
	public void setA10_OTHERS(BigDecimal a10_OTHERS) {
		A10_OTHERS = a10_OTHERS;
	}
	public String getA11_PRODUCT() {
		return A11_PRODUCT;
	}
	public void setA11_PRODUCT(String a11_PRODUCT) {
		A11_PRODUCT = a11_PRODUCT;
	}
	public BigDecimal getA11_DEV_IN_HOUSE() {
		return A11_DEV_IN_HOUSE;
	}
	public void setA11_DEV_IN_HOUSE(BigDecimal a11_DEV_IN_HOUSE) {
		A11_DEV_IN_HOUSE = a11_DEV_IN_HOUSE;
	}
	public BigDecimal getA11_DEV_IN_HOUSE_OUTSOURCED() {
		return A11_DEV_IN_HOUSE_OUTSOURCED;
	}
	public void setA11_DEV_IN_HOUSE_OUTSOURCED(BigDecimal a11_DEV_IN_HOUSE_OUTSOURCED) {
		A11_DEV_IN_HOUSE_OUTSOURCED = a11_DEV_IN_HOUSE_OUTSOURCED;
	}
	public BigDecimal getA11_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE() {
		return A11_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public void setA11_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE(BigDecimal a11_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE) {
		A11_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a11_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public BigDecimal getA11_DEV_MAINTENANCE_OUTSOURCED() {
		return A11_DEV_MAINTENANCE_OUTSOURCED;
	}
	public void setA11_DEV_MAINTENANCE_OUTSOURCED(BigDecimal a11_DEV_MAINTENANCE_OUTSOURCED) {
		A11_DEV_MAINTENANCE_OUTSOURCED = a11_DEV_MAINTENANCE_OUTSOURCED;
	}
	public BigDecimal getA11_OTHERS() {
		return A11_OTHERS;
	}
	public void setA11_OTHERS(BigDecimal a11_OTHERS) {
		A11_OTHERS = a11_OTHERS;
	}
	public String getA12_PRODUCT() {
		return A12_PRODUCT;
	}
	public void setA12_PRODUCT(String a12_PRODUCT) {
		A12_PRODUCT = a12_PRODUCT;
	}
	public BigDecimal getA12_DEV_IN_HOUSE() {
		return A12_DEV_IN_HOUSE;
	}
	public void setA12_DEV_IN_HOUSE(BigDecimal a12_DEV_IN_HOUSE) {
		A12_DEV_IN_HOUSE = a12_DEV_IN_HOUSE;
	}
	public BigDecimal getA12_DEV_IN_HOUSE_OUTSOURCED() {
		return A12_DEV_IN_HOUSE_OUTSOURCED;
	}
	public void setA12_DEV_IN_HOUSE_OUTSOURCED(BigDecimal a12_DEV_IN_HOUSE_OUTSOURCED) {
		A12_DEV_IN_HOUSE_OUTSOURCED = a12_DEV_IN_HOUSE_OUTSOURCED;
	}
	public BigDecimal getA12_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE() {
		return A12_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public void setA12_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE(BigDecimal a12_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE) {
		A12_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a12_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public BigDecimal getA12_DEV_MAINTENANCE_OUTSOURCED() {
		return A12_DEV_MAINTENANCE_OUTSOURCED;
	}
	public void setA12_DEV_MAINTENANCE_OUTSOURCED(BigDecimal a12_DEV_MAINTENANCE_OUTSOURCED) {
		A12_DEV_MAINTENANCE_OUTSOURCED = a12_DEV_MAINTENANCE_OUTSOURCED;
	}
	public BigDecimal getA12_OTHERS() {
		return A12_OTHERS;
	}
	public void setA12_OTHERS(BigDecimal a12_OTHERS) {
		A12_OTHERS = a12_OTHERS;
	}
	public String getA13_PRODUCT() {
		return A13_PRODUCT;
	}
	public void setA13_PRODUCT(String a13_PRODUCT) {
		A13_PRODUCT = a13_PRODUCT;
	}
	public BigDecimal getA13_DEV_IN_HOUSE() {
		return A13_DEV_IN_HOUSE;
	}
	public void setA13_DEV_IN_HOUSE(BigDecimal a13_DEV_IN_HOUSE) {
		A13_DEV_IN_HOUSE = a13_DEV_IN_HOUSE;
	}
	public BigDecimal getA13_DEV_IN_HOUSE_OUTSOURCED() {
		return A13_DEV_IN_HOUSE_OUTSOURCED;
	}
	public void setA13_DEV_IN_HOUSE_OUTSOURCED(BigDecimal a13_DEV_IN_HOUSE_OUTSOURCED) {
		A13_DEV_IN_HOUSE_OUTSOURCED = a13_DEV_IN_HOUSE_OUTSOURCED;
	}
	public BigDecimal getA13_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE() {
		return A13_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public void setA13_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE(BigDecimal a13_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE) {
		A13_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a13_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public BigDecimal getA13_DEV_MAINTENANCE_OUTSOURCED() {
		return A13_DEV_MAINTENANCE_OUTSOURCED;
	}
	public void setA13_DEV_MAINTENANCE_OUTSOURCED(BigDecimal a13_DEV_MAINTENANCE_OUTSOURCED) {
		A13_DEV_MAINTENANCE_OUTSOURCED = a13_DEV_MAINTENANCE_OUTSOURCED;
	}
	public BigDecimal getA13_OTHERS() {
		return A13_OTHERS;
	}
	public void setA13_OTHERS(BigDecimal a13_OTHERS) {
		A13_OTHERS = a13_OTHERS;
	}
	public String getA14_PRODUCT() {
		return A14_PRODUCT;
	}
	public void setA14_PRODUCT(String a14_PRODUCT) {
		A14_PRODUCT = a14_PRODUCT;
	}
	public BigDecimal getA14_DEV_IN_HOUSE() {
		return A14_DEV_IN_HOUSE;
	}
	public void setA14_DEV_IN_HOUSE(BigDecimal a14_DEV_IN_HOUSE) {
		A14_DEV_IN_HOUSE = a14_DEV_IN_HOUSE;
	}
	public BigDecimal getA14_DEV_IN_HOUSE_OUTSOURCED() {
		return A14_DEV_IN_HOUSE_OUTSOURCED;
	}
	public void setA14_DEV_IN_HOUSE_OUTSOURCED(BigDecimal a14_DEV_IN_HOUSE_OUTSOURCED) {
		A14_DEV_IN_HOUSE_OUTSOURCED = a14_DEV_IN_HOUSE_OUTSOURCED;
	}
	public BigDecimal getA14_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE() {
		return A14_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public void setA14_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE(BigDecimal a14_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE) {
		A14_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a14_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
	}
	public BigDecimal getA14_DEV_MAINTENANCE_OUTSOURCED() {
		return A14_DEV_MAINTENANCE_OUTSOURCED;
	}
	public void setA14_DEV_MAINTENANCE_OUTSOURCED(BigDecimal a14_DEV_MAINTENANCE_OUTSOURCED) {
		A14_DEV_MAINTENANCE_OUTSOURCED = a14_DEV_MAINTENANCE_OUTSOURCED;
	}
	public BigDecimal getA14_OTHERS() {
		return A14_OTHERS;
	}
	public void setA14_OTHERS(BigDecimal a14_OTHERS) {
		A14_OTHERS = a14_OTHERS;
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
	public T33ORReport(String a1_PRODUCT, BigDecimal a1_DEV_IN_HOUSE, BigDecimal a1_DEV_IN_HOUSE_OUTSOURCED,
			BigDecimal a1_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE, BigDecimal a1_DEV_MAINTENANCE_OUTSOURCED,
			BigDecimal a1_OTHERS, String a2_PRODUCT, String a3_PRODUCT, BigDecimal a3_DEV_IN_HOUSE,
			BigDecimal a3_DEV_IN_HOUSE_OUTSOURCED, BigDecimal a3_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE,
			BigDecimal a3_DEV_MAINTENANCE_OUTSOURCED, BigDecimal a3_OTHERS, String a4_PRODUCT,
			BigDecimal a4_DEV_IN_HOUSE, BigDecimal a4_DEV_IN_HOUSE_OUTSOURCED,
			BigDecimal a4_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE, BigDecimal a4_DEV_MAINTENANCE_OUTSOURCED,
			BigDecimal a4_OTHERS, String a5_PRODUCT, BigDecimal a5_DEV_IN_HOUSE, BigDecimal a5_DEV_IN_HOUSE_OUTSOURCED,
			BigDecimal a5_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE, BigDecimal a5_DEV_MAINTENANCE_OUTSOURCED,
			BigDecimal a5_OTHERS, String a6_PRODUCT, BigDecimal a6_DEV_IN_HOUSE, BigDecimal a6_DEV_IN_HOUSE_OUTSOURCED,
			BigDecimal a6_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE, BigDecimal a6_DEV_MAINTENANCE_OUTSOURCED,
			BigDecimal a6_OTHERS, String a7_PRODUCT, BigDecimal a7_DEV_IN_HOUSE, BigDecimal a7_DEV_IN_HOUSE_OUTSOURCED,
			BigDecimal a7_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE, BigDecimal a7_DEV_MAINTENANCE_OUTSOURCED,
			BigDecimal a7_OTHERS, String a8_PRODUCT, BigDecimal a8_DEV_IN_HOUSE, BigDecimal a8_DEV_IN_HOUSE_OUTSOURCED,
			BigDecimal a8_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE, BigDecimal a8_DEV_MAINTENANCE_OUTSOURCED,
			BigDecimal a8_OTHERS, String a9_PRODUCT, String a10_PRODUCT, BigDecimal a10_DEV_IN_HOUSE,
			BigDecimal a10_DEV_IN_HOUSE_OUTSOURCED, BigDecimal a10_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE,
			BigDecimal a10_DEV_MAINTENANCE_OUTSOURCED, BigDecimal a10_OTHERS, String a11_PRODUCT,
			BigDecimal a11_DEV_IN_HOUSE, BigDecimal a11_DEV_IN_HOUSE_OUTSOURCED,
			BigDecimal a11_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE, BigDecimal a11_DEV_MAINTENANCE_OUTSOURCED,
			BigDecimal a11_OTHERS, String a12_PRODUCT, BigDecimal a12_DEV_IN_HOUSE,
			BigDecimal a12_DEV_IN_HOUSE_OUTSOURCED, BigDecimal a12_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE,
			BigDecimal a12_DEV_MAINTENANCE_OUTSOURCED, BigDecimal a12_OTHERS, String a13_PRODUCT,
			BigDecimal a13_DEV_IN_HOUSE, BigDecimal a13_DEV_IN_HOUSE_OUTSOURCED,
			BigDecimal a13_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE, BigDecimal a13_DEV_MAINTENANCE_OUTSOURCED,
			BigDecimal a13_OTHERS, String a14_PRODUCT, BigDecimal a14_DEV_IN_HOUSE,
			BigDecimal a14_DEV_IN_HOUSE_OUTSOURCED, BigDecimal a14_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE,
			BigDecimal a14_DEV_MAINTENANCE_OUTSOURCED, BigDecimal a14_OTHERS, String rEPORT_CODE, String rEPORT_NAME,
			Date rEPORT_DATE, Date rEPORT_DUE_DATE, Date rEP_SUBMIT_DATE, Date rEP_PERIOD_FROM, Date rEP_PERIOD_TO,
			String rEP_FREQ, String nIL_REPORT_FLG, String aRCH_FLG, String eNTITY_FLG, String dEL_FLG,
			String mODIFY_FLG, String eNTRY_USER, String mODIFY_USER, String vERIFY_USER, Date eNTRY_TIME,
			Date mODIFY_TIME, Date vERIFY_TIME, String qTR_FLG) {
		super();
		A1_PRODUCT = a1_PRODUCT;
		A1_DEV_IN_HOUSE = a1_DEV_IN_HOUSE;
		A1_DEV_IN_HOUSE_OUTSOURCED = a1_DEV_IN_HOUSE_OUTSOURCED;
		A1_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a1_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
		A1_DEV_MAINTENANCE_OUTSOURCED = a1_DEV_MAINTENANCE_OUTSOURCED;
		A1_OTHERS = a1_OTHERS;
		A2_PRODUCT = a2_PRODUCT;
		A3_PRODUCT = a3_PRODUCT;
		A3_DEV_IN_HOUSE = a3_DEV_IN_HOUSE;
		A3_DEV_IN_HOUSE_OUTSOURCED = a3_DEV_IN_HOUSE_OUTSOURCED;
		A3_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a3_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
		A3_DEV_MAINTENANCE_OUTSOURCED = a3_DEV_MAINTENANCE_OUTSOURCED;
		A3_OTHERS = a3_OTHERS;
		A4_PRODUCT = a4_PRODUCT;
		A4_DEV_IN_HOUSE = a4_DEV_IN_HOUSE;
		A4_DEV_IN_HOUSE_OUTSOURCED = a4_DEV_IN_HOUSE_OUTSOURCED;
		A4_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a4_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
		A4_DEV_MAINTENANCE_OUTSOURCED = a4_DEV_MAINTENANCE_OUTSOURCED;
		A4_OTHERS = a4_OTHERS;
		A5_PRODUCT = a5_PRODUCT;
		A5_DEV_IN_HOUSE = a5_DEV_IN_HOUSE;
		A5_DEV_IN_HOUSE_OUTSOURCED = a5_DEV_IN_HOUSE_OUTSOURCED;
		A5_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a5_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
		A5_DEV_MAINTENANCE_OUTSOURCED = a5_DEV_MAINTENANCE_OUTSOURCED;
		A5_OTHERS = a5_OTHERS;
		A6_PRODUCT = a6_PRODUCT;
		A6_DEV_IN_HOUSE = a6_DEV_IN_HOUSE;
		A6_DEV_IN_HOUSE_OUTSOURCED = a6_DEV_IN_HOUSE_OUTSOURCED;
		A6_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a6_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
		A6_DEV_MAINTENANCE_OUTSOURCED = a6_DEV_MAINTENANCE_OUTSOURCED;
		A6_OTHERS = a6_OTHERS;
		A7_PRODUCT = a7_PRODUCT;
		A7_DEV_IN_HOUSE = a7_DEV_IN_HOUSE;
		A7_DEV_IN_HOUSE_OUTSOURCED = a7_DEV_IN_HOUSE_OUTSOURCED;
		A7_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a7_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
		A7_DEV_MAINTENANCE_OUTSOURCED = a7_DEV_MAINTENANCE_OUTSOURCED;
		A7_OTHERS = a7_OTHERS;
		A8_PRODUCT = a8_PRODUCT;
		A8_DEV_IN_HOUSE = a8_DEV_IN_HOUSE;
		A8_DEV_IN_HOUSE_OUTSOURCED = a8_DEV_IN_HOUSE_OUTSOURCED;
		A8_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a8_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
		A8_DEV_MAINTENANCE_OUTSOURCED = a8_DEV_MAINTENANCE_OUTSOURCED;
		A8_OTHERS = a8_OTHERS;
		A9_PRODUCT = a9_PRODUCT;
		A10_PRODUCT = a10_PRODUCT;
		A10_DEV_IN_HOUSE = a10_DEV_IN_HOUSE;
		A10_DEV_IN_HOUSE_OUTSOURCED = a10_DEV_IN_HOUSE_OUTSOURCED;
		A10_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a10_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
		A10_DEV_MAINTENANCE_OUTSOURCED = a10_DEV_MAINTENANCE_OUTSOURCED;
		A10_OTHERS = a10_OTHERS;
		A11_PRODUCT = a11_PRODUCT;
		A11_DEV_IN_HOUSE = a11_DEV_IN_HOUSE;
		A11_DEV_IN_HOUSE_OUTSOURCED = a11_DEV_IN_HOUSE_OUTSOURCED;
		A11_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a11_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
		A11_DEV_MAINTENANCE_OUTSOURCED = a11_DEV_MAINTENANCE_OUTSOURCED;
		A11_OTHERS = a11_OTHERS;
		A12_PRODUCT = a12_PRODUCT;
		A12_DEV_IN_HOUSE = a12_DEV_IN_HOUSE;
		A12_DEV_IN_HOUSE_OUTSOURCED = a12_DEV_IN_HOUSE_OUTSOURCED;
		A12_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a12_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
		A12_DEV_MAINTENANCE_OUTSOURCED = a12_DEV_MAINTENANCE_OUTSOURCED;
		A12_OTHERS = a12_OTHERS;
		A13_PRODUCT = a13_PRODUCT;
		A13_DEV_IN_HOUSE = a13_DEV_IN_HOUSE;
		A13_DEV_IN_HOUSE_OUTSOURCED = a13_DEV_IN_HOUSE_OUTSOURCED;
		A13_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a13_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
		A13_DEV_MAINTENANCE_OUTSOURCED = a13_DEV_MAINTENANCE_OUTSOURCED;
		A13_OTHERS = a13_OTHERS;
		A14_PRODUCT = a14_PRODUCT;
		A14_DEV_IN_HOUSE = a14_DEV_IN_HOUSE;
		A14_DEV_IN_HOUSE_OUTSOURCED = a14_DEV_IN_HOUSE_OUTSOURCED;
		A14_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE = a14_DEV_OUT_SOURCED_MAINTENANCE_IN_HOUSE;
		A14_DEV_MAINTENANCE_OUTSOURCED = a14_DEV_MAINTENANCE_OUTSOURCED;
		A14_OTHERS = a14_OTHERS;
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
	public T33ORReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
   

}
