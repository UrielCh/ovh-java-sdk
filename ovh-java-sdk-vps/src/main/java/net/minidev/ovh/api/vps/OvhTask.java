package net.minidev.ovh.api.vps;

/**
 * Operation on a VPS Virtual Machine
 */
public class OvhTask {
	/**
	 * canBeNull && readOnly
	 */
	public Long progress;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTaskStateEnum state;

	/**
	 * canBeNull && readOnly
	 */
	public OvhTaskTypeEnum type;
}
