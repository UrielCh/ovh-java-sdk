package net.minidev.ovh.api.license;

/**
 * Allowed SQL Server versions and their compliant options per matching serviceTypes
 */
public class OvhSqlServerOrderConfiguration {
	/**
	 * canBeNull
	 */
	public OvhLicenseTypeEnum serviceType;

	/**
	 * canBeNull
	 */
	public OvhOrderableSqlServerCompatibilityInfos[] orderableVersions;
}
