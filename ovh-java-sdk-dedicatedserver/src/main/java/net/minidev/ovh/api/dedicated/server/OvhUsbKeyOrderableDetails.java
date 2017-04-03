package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing informations about orderable USB keys
 */
public class OvhUsbKeyOrderableDetails {
	/**
	 * Which option is required to order an USB key
	 *
	 * canBeNull
	 */
	public OvhOptionRequiredEnum optionRequired;

	/**
	 * Number of USB keys that can be ordered for this server
	 *
	 * canBeNull
	 */
	public Long number;

	/**
	 * Is USB keys orderable for this server
	 *
	 * canBeNull
	 */
	public Boolean orderable;

	/**
	 * Orderable USB keys capacity in gigabytes
	 *
	 * canBeNull
	 */
	public OvhUsbKeyCapacityEnum[] capacity;
}
