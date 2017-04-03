package net.minidev.ovh.api.telephony;

/**
 * Dialplan extension
 */
public class OvhOvhPabxDialplanExtension {
	/**
	 * The type of the screenlist
	 *
	 * canBeNull && readOnly
	 */
	public OvhOvhPabxDialplanExtensionConditionScreenListTypeEnum screenListType;

	/**
	 * The position of the extension in the dialplan (the extensions are executed following this order)
	 *
	 * canBeNull && readOnly
	 */
	public Long position;

	/**
	 * Additionnal conditions are used from this chosen scheduler category
	 *
	 * canBeNull && readOnly
	 */
	public OvhSchedulerCategoryEnum schedulerCategory;

	/**
	 * canBeNull && readOnly
	 */
	public Long extensionId;

	/**
	 * True if the extension is enabled
	 *
	 * canBeNull && readOnly
	 */
	public Boolean enabled;
}
