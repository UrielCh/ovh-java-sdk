package net.minidev.ovh.api.cloud.billingview;

/**
 * MonthlyResources
 */
public class OvhMonthlyResources {
	/**
	 * Details about monthly instances
	 *
	 * canBeNull && readOnly
	 */
	public OvhMonthlyInstance[] instance;

	/**
	 * Details about monthly instances options
	 *
	 * canBeNull && readOnly
	 */
	public OvhMonthlyInstanceOption[] instanceOption;
}
