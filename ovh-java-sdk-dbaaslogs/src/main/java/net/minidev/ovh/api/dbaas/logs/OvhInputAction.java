package net.minidev.ovh.api.dbaas.logs;

/**
 * Action on input
 */
public class OvhInputAction {
	/**
	 * Indicates if action is allowed
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isAllowed;

	/**
	 * Action type
	 *
	 * canBeNull && readOnly
	 */
	public OvhInputActionTypeEnum type;
}
