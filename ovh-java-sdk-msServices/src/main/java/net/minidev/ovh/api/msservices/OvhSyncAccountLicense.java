package net.minidev.ovh.api.msservices;

/**
 * Sync account license
 */
public class OvhSyncAccountLicense {
	/**
	 * the kind of license under which sync account is contracted
	 *
	 * canBeNull
	 */
	public OvhSyncLicenseEnum license;

	/**
	 * number of license instances
	 *
	 * canBeNull
	 */
	public Long licenseQuantity;
}
