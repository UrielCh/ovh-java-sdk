package net.minidev.ovh.api.license;

/**
 * Allowed windows versions and their compliant options per matching serviceTypes
 */
public class OvhWindowsOrderConfiguration {
	/**
	 * canBeNull
	 */
	public OvhLicenseTypeEnum serviceType;

	/**
	 * canBeNull
	 */
	public OvhOrderableWindowsCompatibilityInfos[] orderableVersions;
}
