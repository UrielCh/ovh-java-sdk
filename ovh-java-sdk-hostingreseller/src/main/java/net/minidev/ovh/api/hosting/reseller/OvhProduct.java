package net.minidev.ovh.api.hosting.reseller;

/**
 * Reseller
 */
public class OvhProduct {
	/**
	 * Additional information about the plesk
	 *
	 * canBeNull && readOnly
	 */
	public OvhMetaType meta;

	/**
	 * Ip address of the Plesk instance
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * Current action done on the instance
	 *
	 * canBeNull && readOnly
	 */
	public String action;

	/**
	 * Progression of an action on the instance if any
	 *
	 * canBeNull && readOnly
	 */
	public Double progress;

	/**
	 * Reseller flavor
	 *
	 * canBeNull && readOnly
	 */
	public OvhResellerTypeEnum type;

	/**
	 * Details about the plesk type
	 *
	 * canBeNull && readOnly
	 */
	public OvhProductType typeDetail;

	/**
	 * Plesk server address
	 *
	 * canBeNull && readOnly
	 */
	public String url;

	/**
	 * Status of the instance
	 *
	 * canBeNull && readOnly
	 */
	public String status;
}
