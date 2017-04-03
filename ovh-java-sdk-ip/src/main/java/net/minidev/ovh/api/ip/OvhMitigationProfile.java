package net.minidev.ovh.api.ip;

/**
 * Mitigation profile for your ip
 */
public class OvhMitigationProfile {
	/**
	 * canBeNull && readOnly
	 */
	public String ipMitigationProfile;

	/**
	 * Current state of your mitigation profile
	 *
	 * canBeNull && readOnly
	 */
	public OvhMitigationProfileStateEnum state;

	/**
	 * Delay to wait before remove ip from auto mitigation after an attack
	 *
	 * canBeNull && readOnly
	 */
	public OvhMitigationProfileAutoMitigationTimeOutEnum autoMitigationTimeOut;
}
