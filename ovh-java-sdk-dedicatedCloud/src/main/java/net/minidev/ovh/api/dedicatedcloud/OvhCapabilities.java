package net.minidev.ovh.api.dedicatedcloud;

import net.minidev.ovh.api.dedicatedcloud.capabilities.OvhFeatureStatusEnum;

/**
 * The features available in your Private Cloud
 */
public class OvhCapabilities {
	/**
	 * userAccessPolicy property edition status in PUT /dedicatedCloud/{serviceName}
	 *
	 * canBeNull && readOnly
	 */
	public OvhFeatureStatusEnum userAccessPolicyStatus;

	/**
	 * Nexus 1000v feature order status in this Private Cloud ?
	 *
	 * canBeNull && readOnly
	 */
	public OvhFeatureStatusEnum nexus1000vStatus;

	/**
	 * Backup feature order status for this Private Cloud
	 *
	 * canBeNull && readOnly
	 */
	public OvhFeatureStatusEnum backupStatus;

	/**
	 * if true user can be added in this Private Cloud (with POST /dedicatedCloud/{serviceName}/user
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canAddUser;

	/**
	 * Hypervisor upgrade order status in this Private Cloud (upgrade with POST /dedicatedCloud/{serviceName}/upgradeHypervisor)
	 *
	 * canBeNull && readOnly
	 */
	public Boolean upgradable;

	/**
	 * canAddRessource right order status in this Private Cloud
	 *
	 * canBeNull && readOnly
	 */
	public OvhFeatureStatusEnum addRessourceRightStatus;

	/**
	 * fullAdminRO user right order status in this Private Cloud
	 *
	 * canBeNull && readOnly
	 */
	public OvhFeatureStatusEnum fullAdminRoUserStatus;
}
