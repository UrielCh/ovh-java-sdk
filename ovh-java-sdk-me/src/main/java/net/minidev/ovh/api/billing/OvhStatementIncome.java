package net.minidev.ovh.api.billing;

import java.util.Date;
import net.minidev.ovh.api.debt.associatedobject.OvhPaymentInfo;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Details about a statement income
 */
public class OvhStatementIncome {
	/**
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * canBeNull && readOnly
	 */
	public String pdfUrl;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPrice amount;

	/**
	 * canBeNull && readOnly
	 */
	public String password;

	/**
	 * canBeNull && readOnly
	 */
	public Long orderId;

	/**
	 * canBeNull && readOnly
	 */
	public String url;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPaymentInfo paymentInfo;

	/**
	 * canBeNull && readOnly
	 */
	public String statementIncomeId;
}
