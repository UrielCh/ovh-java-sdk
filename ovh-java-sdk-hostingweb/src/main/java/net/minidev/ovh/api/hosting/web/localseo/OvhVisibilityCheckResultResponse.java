package net.minidev.ovh.api.hosting.web.localseo;

import java.util.Date;

/**
 * Struct describing a visibility check result
 */
public class OvhVisibilityCheckResultResponse {
	/**
	 * Country of the location
	 *
	 * canBeNull
	 */
	public String country;

	/**
	 * The location's street number (sync status)
	 *
	 * canBeNull
	 */
	public OvhFieldStatusEnum streetNoStatus;

	/**
	 * City of the location
	 *
	 * canBeNull
	 */
	public String city;

	/**
	 * A valid url for the location's website (sync status)
	 *
	 * canBeNull
	 */
	public OvhFieldStatusEnum websiteStatus;

	/**
	 * A localized combination of street and streetNo (sync status)
	 *
	 * canBeNull
	 */
	public OvhFieldStatusEnum streetAndNoStatus;

	/**
	 * The directory where this listing appears
	 *
	 * canBeNull
	 */
	public String directoryType;

	/**
	 * The date and time the listing was created in database
	 *
	 * canBeNull
	 */
	public Date dateCreated;

	/**
	 * Province of the location
	 *
	 * canBeNull
	 */
	public String province;

	/**
	 * The location's street address
	 *
	 * canBeNull
	 */
	public String street;

	/**
	 * A localized combination of street and streetNo
	 *
	 * canBeNull
	 */
	public String streetAndNo;

	/**
	 * Zipcode of the location (sync status)
	 *
	 * canBeNull
	 */
	public OvhFieldStatusEnum zipStatus;

	/**
	 * The location's contact phone number (sync status)
	 *
	 * canBeNull
	 */
	public OvhFieldStatusEnum phoneStatus;

	/**
	 * A contact email for the location
	 *
	 * canBeNull
	 */
	public String email;

	/**
	 * Zipcode of the location
	 *
	 * canBeNull
	 */
	public String zip;

	/**
	 * A valid url for the location's website
	 *
	 * canBeNull
	 */
	public String website;

	/**
	 * The street type for Spain
	 *
	 * canBeNull
	 */
	public String streetType;

	/**
	 * The location's street number
	 *
	 * canBeNull
	 */
	public String streetNo;

	/**
	 * The location's street address (sync status)
	 *
	 * canBeNull
	 */
	public OvhFieldStatusEnum streetStatus;

	/**
	 * The listing id in the directory database
	 *
	 * canBeNull
	 */
	public String listingId;

	/**
	 * A contact email for the location (sync status)
	 *
	 * canBeNull
	 */
	public OvhFieldStatusEnum emailStatus;

	/**
	 * The street type for Spain (sync status)
	 *
	 * canBeNull
	 */
	public OvhFieldStatusEnum streetTypeStatus;

	/**
	 * The location's contact phone number
	 *
	 * canBeNull
	 */
	public String phone;

	/**
	 * Province of the location (sync status)
	 *
	 * canBeNull
	 */
	public OvhFieldStatusEnum provinceStatus;

	/**
	 * City of the location (sync status)
	 *
	 * canBeNull
	 */
	public OvhFieldStatusEnum cityStatus;

	/**
	 * The location's name used for this listing
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * The location's name used for this listing (sync status)
	 *
	 * canBeNull
	 */
	public OvhFieldStatusEnum nameStatus;

	/**
	 * The listing url on the directory website
	 *
	 * canBeNull
	 */
	public String listingUrl;

	/**
	 * Country of the location (sync status)
	 *
	 * canBeNull
	 */
	public OvhFieldStatusEnum countryStatus;

	/**
	 * The status of the current listing
	 *
	 * canBeNull
	 */
	public OvhFlowStatusEnum flowStatus;

	/**
	 * The sync status of the listing
	 *
	 * canBeNull
	 */
	public OvhListingStatusEnum syncStatus;
}
