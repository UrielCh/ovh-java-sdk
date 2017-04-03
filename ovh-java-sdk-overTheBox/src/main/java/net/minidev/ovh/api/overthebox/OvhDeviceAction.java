package net.minidev.ovh.api.overthebox;

/**
 * Device action
 */
public class OvhDeviceAction {
	/**
	 * The name of the action
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * The id of the action
	 *
	 * canBeNull && readOnly
	 */
	public String actionId;

	/**
	 * The status of the action
	 *
	 * canBeNull && readOnly
	 */
	public OvhActionStatusEnum status;
}
