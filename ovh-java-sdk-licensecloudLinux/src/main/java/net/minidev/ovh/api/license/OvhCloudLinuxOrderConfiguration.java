package net.minidev.ovh.api.license;

/**
 * Allowed CloudLinux versions per matching serviceTypes
 */
public class OvhCloudLinuxOrderConfiguration {
	/**
	 * canBeNull
	 */
	public OvhLicenseTypeEnum serviceType;

	/**
	 * canBeNull
	 */
	public OvhOrderableCloudLinuxCompatibilityInfos[] orderableVersions;
}
