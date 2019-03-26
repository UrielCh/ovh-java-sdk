package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing informations about installation custom
 */
public class OvhInstallCustom {
	/**
	 * Specify if we should attempt to reset hw raid on install.
	 *
	 * canBeNull
	 */
	public Boolean resetHwRaid;

	/**
	 * The name of ssh key to install
	 *
	 * canBeNull
	 */
	public String sshKeyName;

	/**
	 * true if you want to install only on the first disk
	 *
	 * canBeNull
	 */
	public Boolean noRaid;

	/**
	 * the url to your custom install script
	 *
	 * canBeNull
	 */
	public String postInstallationScriptLink;

	/**
	 * true if you want to install windows with your spla license
	 *
	 * canBeNull
	 */
	public Boolean useSpla;

	/**
	 * Number of devices to use for system's software RAID
	 *
	 * canBeNull
	 */
	public Long softRaidDevices;

	/**
	 * the return of your script if everythings ok. Advice: your script should return a unique validation string in case of succes. A good example is "loh1Xee7eo OK OK OK UGh8Ang1Gu
	 *
	 * canBeNull
	 */
	public String postInstallationScriptReturn;

	/**
	 * Personnal hostname to use in server reinstallation
	 *
	 * canBeNull
	 */
	public String customHostname;

	/**
	 * true if you want to install windows with sql feature
	 *
	 * canBeNull
	 */
	public Boolean installSqlServer;

	/**
	 * install language for ovh install choice
	 *
	 * canBeNull
	 */
	public String language;

	/**
	 * true if you want to install with distrib kernel
	 *
	 * canBeNull
	 */
	public Boolean useDistribKernel;

	/**
	 * Disk group id to process install on (only available for some templates)
	 *
	 * canBeNull
	 */
	public Long diskGroupId;
}
