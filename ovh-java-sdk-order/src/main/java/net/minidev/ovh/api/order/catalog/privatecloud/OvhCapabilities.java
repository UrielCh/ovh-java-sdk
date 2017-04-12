package net.minidev.ovh.api.order.catalog.privatecloud;

/**
 * Describes capabilities of a Private Cloud type of service
 */
public class OvhCapabilities {
	/**
	 * Define if NSX is part of this type of service
	 *
	 * canBeNull && readOnly
	 */
	public Boolean nsx;

	/**
	 * Define if VROPS is part of this type of service
	 *
	 * canBeNull && readOnly
	 */
	public Boolean vrops;

	/**
	 * Define if HIPAA is part of this type of service
	 *
	 * canBeNull && readOnly
	 */
	public Boolean hipaa;

	/**
	 * Define if HDS is part of this type of service
	 *
	 * canBeNull && readOnly
	 */
	public Boolean hds;

	/**
	 * Define if PCI-DSS is part of this type of service
	 *
	 * canBeNull && readOnly
	 */
	public Boolean pcidss;
}
