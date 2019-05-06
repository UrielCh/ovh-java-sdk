package net.minidev.ovh.api.nichandle;

/**
 * Internal customer billing capacities for customer control panel
 */
public class OvhBillingCapacities {
	/**
	 * Indicates the mandatory nature of having a valid payment method
	 *
	 * canBeNull
	 */
	public OvhRequiredPaymentMethodEnum requiredPaymentMethod;

	/**
	 * Indicates customer's ability to use postal mailing for invoices
	 *
	 * canBeNull
	 */
	public Boolean canUsePostalMailForInvoices;

	/**
	 * Indicates if the debt system has been enabled on the customer account
	 *
	 * canBeNull
	 */
	public Boolean canUseDebtSystem;
}
