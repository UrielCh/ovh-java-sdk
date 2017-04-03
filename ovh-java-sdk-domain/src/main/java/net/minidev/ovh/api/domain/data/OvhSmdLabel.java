package net.minidev.ovh.api.domain.data;

/**
 * Representation of a protected label
 */
public class OvhSmdLabel {
	/**
	 * Trademark associated to the protected label
	 *
	 * canBeNull && readOnly
	 */
	public String trademark;

	/**
	 * Label that is protected
	 *
	 * canBeNull && readOnly
	 */
	public String label;
}
