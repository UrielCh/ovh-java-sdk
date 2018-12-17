package net.minidev.ovh.api.license;

/**
 * All versions available for Plesk products
 */
public class OvhOrderablePleskCompatibilityInfos {
	/**
	 * canBeNull
	 */
	public Boolean canHavePowerPack;

	/**
	 * canBeNull
	 */
	public OvhPleskApplicationSetEnum[] compliantApplicationSets;

	/**
	 * canBeNull
	 */
	public Boolean canHaveResellerManagement;

	/**
	 * canBeNull
	 */
	public OvhOrderablePleskLanguagePackEnum[] compliantLanguagePack;

	/**
	 * canBeNull
	 */
	public OvhOrderableAntivirusEnum[] compliantAntivirus;

	/**
	 * canBeNull
	 */
	public Boolean canHaveWordpressToolkit;

	/**
	 * canBeNull
	 */
	public OvhOrderablePleskDomainNumberEnum[] compliantDomains;

	/**
	 * canBeNull
	 */
	public OvhPotentialProblemPleskEnum[] potentialProblems;

	/**
	 * canBeNull
	 */
	public OvhPleskVersionEnum version;
}
