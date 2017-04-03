package net.minidev.ovh.api.license;

/**
 * The serviceTypes allowed to Order a plesk version and associated Versions
 */
public class OvhPleskOrderConfiguration {
	/**
	 * canBeNull
	 */
	public OvhLicenseTypeEnum serviceType;

	/**
	 * canBeNull
	 */
	public OvhOrderablePleskCompatibilityInfos[] orderableVersions;
}
