package net.minidev.ovh.api.vps;

/**
 * VPS Virtual Machine
 */
public class OvhVPS {
	/**
	 * Ip blocks for OVH monitoring servers
	 *
	 * canBeNull && readOnly
	 */
	public String[] monitoringIpBlocks;

	/**
	 * canBeNull && readOnly
	 */
	public String cluster;

	/**
	 * Set KVM keyboard layout on VPS Cloud. Reboot your VPS after change
	 *
	 * canBeNull && readOnly
	 */
	public OvhVpsKeymapEnum keymap;

	/**
	 * Set the name displayed in ManagerV6 for your VPS (max 50 chars)
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * Reboot your VPS 'Cloud' after change, VPS 'Classic/LowLat' will reboot automatically. Credentials for rescue mode will be sent by mail
	 *
	 * canBeNull && readOnly
	 */
	public OvhVpsNetbootEnum netbootMode;

	/**
	 * canBeNull && readOnly
	 */
	public OvhVpsOfferEnum offerType;

	/**
	 * canBeNull && readOnly
	 */
	public String zone;

	/**
	 * canBeNull && readOnly
	 */
	public Long vcore;

	/**
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * canBeNull && readOnly
	 */
	public OvhModel model;

	/**
	 * canBeNull && readOnly
	 */
	public Long memoryLimit;

	/**
	 * canBeNull && readOnly
	 */
	public OvhVpsStateEnum state;

	/**
	 * canBeNull && readOnly
	 */
	public Boolean slaMonitoring;
}
