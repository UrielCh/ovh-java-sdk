package net.minidev.ovh.api.dedicated.housing;

/**
 * A structure describing informations for APC orderable for this housing bay
 */
public class OvhApcOrderable {
	/**
	 * Is an APC is orderable for this housing bay
	 *
	 * canBeNull
	 */
	public Boolean orderable;

	/**
	 * Is this APC free
	 *
	 * canBeNull
	 */
	public Boolean free;
}
