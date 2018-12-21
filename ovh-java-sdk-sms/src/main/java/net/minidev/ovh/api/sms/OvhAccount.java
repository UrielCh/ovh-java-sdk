package net.minidev.ovh.api.sms;

/**
 * SMS details
 */
public class OvhAccount {
	/**
	 * canBeNull && readOnly
	 */
	public Double creditsLeft;

	/**
	 * Credit threshold after which an automatic recredit is launched
	 *
	 * canBeNull && readOnly
	 */
	public Double creditThresholdForAutomaticRecredit;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTemplates templates;

	/**
	 * canBeNull && readOnly
	 */
	public Long userQuantityWithQuota;

	/**
	 * URL called when state of a sent SMS changes
	 *
	 * canBeNull && readOnly
	 */
	public String callBack;

	/**
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * URL called when a STOP is received after a receiver replied stop to a SMS
	 *
	 * canBeNull && readOnly
	 */
	public String stopCallBack;

	/**
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public OvhPackQuantityAutomaticRecreditEnum automaticRecreditAmount;

	/**
	 * canBeNull && readOnly
	 */
	public OvhResponse smsResponse;

	/**
	 * canBeNull && readOnly
	 */
	public Double creditsHoldByQuota;

	/**
	 * canBeNull && readOnly
	 */
	public OvhStatusAccountEnum status;
}
