package net.minidev.ovh.api.hosting.web;

import java.util.Date;
import net.minidev.ovh.api.hosting.web.localseo.location.OvhCountryEnum;
import net.minidev.ovh.api.hosting.web.localseo.location.OvhOfferEnum;
import net.minidev.ovh.api.hosting.web.localseo.location.OvhStatusEnum;

/**
 * Local SEO locations
 */
public class OvhLocalSeoLocation {
	/**
	 * Local SEO offer for this location
	 *
	 * canBeNull && readOnly
	 */
	public OvhOfferEnum offer;

	/**
	 * Account id
	 *
	 * canBeNull && readOnly
	 */
	public Long accountId;

	/**
	 * Country of the location
	 *
	 * canBeNull && readOnly
	 */
	public OvhCountryEnum country;

	/**
	 * Address of the location
	 *
	 * canBeNull && readOnly
	 */
	public String address;

	/**
	 * Date of the last location's update
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * Name of the location
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Location id
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Date of the installation of the location
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Running task associated to the location
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * Current status of the location
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
