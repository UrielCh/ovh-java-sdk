package net.minidev.ovh.api.license;

/**
 * The serviceTypes allowed to Order a CPanel version
 */
public class OvhCpanelOrderConfiguration {
	/**
	 * canBeNull
	 */
	public OvhLicenseTypeEnum serviceType;

	/**
	 * canBeNull
	 */
	public OvhOrderableCpanelCompatibilityInfos[] orderableVersions;
}
