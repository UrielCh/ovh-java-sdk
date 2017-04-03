package net.minidev.ovh.api.license;

/**
 * Allowed WorkLight versions per matching serviceTypes
 */
public class OvhWorkLightOrderConfiguration {
	/**
	 * canBeNull
	 */
	public OvhLicenseTypeEnum serviceType;

	/**
	 * canBeNull
	 */
	public OvhOrderableWorkLightCompatibilityInfos[] orderableVersions;
}
