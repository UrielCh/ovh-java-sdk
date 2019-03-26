package net.minidev.ovh.api.cluster.hadoop;

/**
 * Physical or Virtual Node
 */
public class OvhNode {
	/**
	 * Hostname of the node
	 *
	 * canBeNull && readOnly
	 */
	public String hostname;

	/**
	 * Name of the billing profile attached to the node
	 *
	 * canBeNull && readOnly
	 */
	public OvhBillingNameEnum billingProfileName;

	/**
	 * IP of the Node
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * Profile of the Node
	 *
	 * canBeNull && readOnly
	 */
	public OvhNodeProfileEnum softwareProfile;

	/**
	 * Wether or not the Node is removable
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isRemovable;

	/**
	 * State of the Node
	 *
	 * canBeNull && readOnly
	 */
	public OvhNodeStateEnum state;
}
