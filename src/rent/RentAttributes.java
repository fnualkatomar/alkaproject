package rent;

import java.math.BigDecimal;

public class RentAttributes {
	
	private String tenantName;
	private BigDecimal monthyRent;
	private BigDecimal amountPaid;
	private BigDecimal mainMeterBillAmount;
	private Integer mainMeterUnits;
	private Integer currentReading;
	private Integer previousReading;
	private Integer chargeableReading;
	private BigDecimal perUnitCost;
	
	public RentAttributes() {
		
	}
	public RentAttributes(String tenantName, BigDecimal monthyRent, BigDecimal amountPaid,
			BigDecimal mainMeterBillAmount, Integer mainMeterUnits, Integer currentReading, Integer previousReading) {
		super();
		this.tenantName = tenantName;
		this.monthyRent = monthyRent;
		this.amountPaid = amountPaid;
		this.mainMeterBillAmount = mainMeterBillAmount;
		this.mainMeterUnits = mainMeterUnits;
		this.currentReading = currentReading;
		this.previousReading = previousReading;
		this.chargeableReading = currentReading - previousReading;
		this.perUnitCost = mainMeterBillAmount.divide(new BigDecimal(mainMeterUnits));
	}
	/**
	 * @return the tenantName
	 */
	public String getTenantName() {
		return tenantName;
	}
	/**
	 * @param tenantName the tenantName to set
	 */
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}
	/**
	 * @return the monthyRent
	 */
	public BigDecimal getMonthyRent() {
		return monthyRent;
	}
	/**
	 * @param monthyRent the monthyRent to set
	 */
	public void setMonthyRent(BigDecimal monthyRent) {
		this.monthyRent = monthyRent;
	}
	/**
	 * @return the amountPaid
	 */
	public BigDecimal getAmountPaid() {
		return amountPaid;
	}
	/**
	 * @param amountPaid the amountPaid to set
	 */
	public void setAmountPaid(BigDecimal amountPaid) {
		this.amountPaid = amountPaid;
	}
	/**
	 * @return the mainMeterBillAmount
	 */
	public BigDecimal getMainMeterBillAmount() {
		return mainMeterBillAmount;
	}
	/**
	 * @param mainMeterBillAmount the mainMeterBillAmount to set
	 */
	public void setMainMeterBillAmount(BigDecimal mainMeterBillAmount) {
		this.mainMeterBillAmount = mainMeterBillAmount;
	}
	/**
	 * @return the mainMeterUnits
	 */
	public Integer getMainMeterUnits() {
		return mainMeterUnits;
	}
	/**
	 * @param mainMeterUnits the mainMeterUnits to set
	 */
	public void setMainMeterUnits(Integer mainMeterUnits) {
		this.mainMeterUnits = mainMeterUnits;
	}
	/**
	 * @return the currentReading
	 */
	public Integer getCurrentReading() {
		return currentReading;
	}
	/**
	 * @param currentReading the currentReading to set
	 */
	public void setCurrentReading(Integer currentReading) {
		this.currentReading = currentReading;
	}
	/**
	 * @return the previousReading
	 */
	public Integer getPreviousReading() {
		return previousReading;
	}
	/**
	 * @param previousReading the previousReading to set
	 */
	public void setPreviousReading(Integer previousReading) {
		this.previousReading = previousReading;
	}
	/**
	 * @return the chargeableReading
	 */
	public Integer getChargeableReading() {
		return chargeableReading;
	}
	/**
	 * @param chargeableReading the chargeableReading to set
	 */
	public void setChargeableReading(Integer chargeableReading) {
		this.chargeableReading = chargeableReading;
	}
	/**
	 * @return the perUnitCost
	 */
	public BigDecimal getPerUnitCost() {
		return perUnitCost;
	}
	/**
	 * @param perUnitCost the perUnitCost to set
	 */
	public void setPerUnitCost(BigDecimal perUnitCost) {
		this.perUnitCost = perUnitCost;
	}

	
	
}
