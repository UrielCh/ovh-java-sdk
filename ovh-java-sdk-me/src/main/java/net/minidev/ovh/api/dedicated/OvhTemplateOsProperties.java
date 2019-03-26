package net.minidev.ovh.api.dedicated;

/**
 * A structure describing properties customizables about this dedicated installation template
 */
public class OvhTemplateOsProperties {
	/**
	 * Name of the ssh key that should be installed. Password login will be disabled
	 *
	 * canBeNull
	 */
	public String sshKeyName;

	/**
	 * Indicate the URL where your postinstall customisation script is located
	 *
	 * canBeNull
	 */
	public String postInstallationScriptLink;

	/**
	 * indicate the string returned by your postinstall customisation script on successful execution. Advice: your script should return a unique validation string in case of succes. A good example is "loh1Xee7eo OK OK OK UGh8Ang1Gu
	 *
	 * canBeNull
	 */
	public String postInstallationScriptReturn;

	/**
	 * Set up the server using the provided hostname instead of the default hostname
	 *
	 * canBeNull
	 */
	public String customHostname;

	/**
	 * canBeNull
	 */
	public Long rating;

	/**
	 * Template change log details
	 *
	 * canBeNull
	 */
	public String changeLog;

	/**
	 * Use the distribution's native kernel instead of the recommended OVH Kernel
	 *
	 * canBeNull
	 */
	public Boolean useDistributionKernel;
}
