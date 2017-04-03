package net.minidev.ovh.api.license;

/**
 * The serviceTypes allowed to Order a Virtuozzo version
 */
public class OvhVirtuozzoOrderConfiguration {
	/**
	 * canBeNull
	 */
	public OvhLicenseTypeEnum serviceType;

	/**
	 * canBeNull
	 */
	public OvhOrderableVirtuozzoCompatibilityInfos[] orderableVersions;
}
