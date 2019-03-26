package net.minidev.ovh.api.dedicatedcloud.disasterrecovery;

import net.minidev.ovh.api.dedicatedcloud.OvhStateEnum;

/**
 * State of the disaster recovery option
 */
public class OvhProfile {
	/**
	 * Information about the site installed on this Private Cloud
	 *
	 * canBeNull
	 */
	public OvhLocalSiteDetails localSiteInformation;

	/**
	 * Disaster Recovery Plan Type
	 *
	 * canBeNull
	 */
	public OvhDrpTypeEnum drpType;

	/**
	 * Information about the remote paired site
	 *
	 * canBeNull
	 */
	public OvhRemoteSiteDetails remoteSiteInformation;

	/**
	 * State of the disaster recovery service
	 *
	 * canBeNull
	 */
	public OvhStateEnum state;

	/**
	 * Technical solution used
	 *
	 * canBeNull
	 */
	public String systemVersion;
}
