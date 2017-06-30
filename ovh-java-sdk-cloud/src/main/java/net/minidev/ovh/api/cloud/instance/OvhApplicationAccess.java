package net.minidev.ovh.api.cloud.instance;

/**
 * ApplicationAccess
 */
public class OvhApplicationAccess {
	/**
	 * List of credentials
	 *
	 * canBeNull && readOnly
	 */
	public OvhAccess[] accesses;

	/**
	 * Application status
	 *
	 * canBeNull && readOnly
	 */
	public OvhApplicationAccessStateEnum status;
}
