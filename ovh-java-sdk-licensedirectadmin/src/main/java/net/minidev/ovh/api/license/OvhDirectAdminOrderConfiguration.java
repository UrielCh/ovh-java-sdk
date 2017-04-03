package net.minidev.ovh.api.license;

/**
 * The serviceTypes allowed to Order a DirectAdmin version
 */
public class OvhDirectAdminOrderConfiguration {
	/**
	 * canBeNull
	 */
	public OvhLicenseTypeEnum serviceType;

	/**
	 * canBeNull
	 */
	public OvhOrderableDirectAdminCompatibilityInfos[] orderableVersions;
}
