package net.minidev.ovh.api.iploadbalancing;

/**
 * Information about vRack for your Load Balancer
 */
public class OvhVrackInformation {
	/**
	 * Ongoing task related to vRack installation or uninstallation on your Load Balancer
	 *
	 * canBeNull
	 */
	public Long[] task;

	/**
	 * State of the vRack link to your Load Balancer
	 *
	 * canBeNull
	 */
	public OvhVrackStateEnum state;

	/**
	 * Name of the vRack on which the current Load Balancer is attached to, as it is named on vRack product
	 *
	 * canBeNull
	 */
	public String vrackName;
}
