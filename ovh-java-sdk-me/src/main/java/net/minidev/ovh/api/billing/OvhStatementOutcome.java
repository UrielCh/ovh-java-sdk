package net.minidev.ovh.api.billing;

import java.util.Date;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Details about a statement outcome
 */
public class OvhStatementOutcome {
	/**
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * canBeNull && readOnly
	 */
	public String country;

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
	public String statementOutcomeId;

	/**
	 * canBeNull && readOnly
	 */
	public String url;
}
