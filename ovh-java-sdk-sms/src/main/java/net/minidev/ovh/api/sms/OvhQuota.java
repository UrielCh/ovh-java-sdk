package net.minidev.ovh.api.sms;

/**
 * A structure describing all information about quota informations
 */
public class OvhQuota {
	/**
	 * canBeNull
	 */
	public Double quotaLeft;

	/**
	 * canBeNull
	 */
	public OvhQuotaStatusUserEnum quotaStatus;
}
