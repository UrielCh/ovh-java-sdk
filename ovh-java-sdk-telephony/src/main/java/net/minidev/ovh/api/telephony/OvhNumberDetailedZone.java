package net.minidev.ovh.api.telephony;

/**
 * A geographic zone from a country
 */
public class OvhNumberDetailedZone {
	/**
	 * The zip code of the zone
	 *
	 * canBeNull
	 */
	public String zipCode;

	/**
	 * The number's range of this zone
	 *
	 * canBeNull
	 */
	public String number;

	/**
	 * The criteria that matched the searched value
	 *
	 * canBeNull
	 */
	public OvhNumberDetailedZoneMatchingCriteriaEnum matchingCriteria;

	/**
	 * The country of the zone
	 *
	 * canBeNull
	 */
	public OvhNumberCountryEnum country;

	/**
	 * The city of the zone
	 *
	 * canBeNull
	 */
	public String city;

	/**
	 * The country code of the number's range
	 *
	 * canBeNull
	 */
	public Number prefix;

	/**
	 * The searched value
	 *
	 * canBeNull
	 */
	public String askedCity;

	/**
	 * The type of number's range of this zone
	 *
	 * canBeNull
	 */
	public OvhNumberDetailedZoneTypeEnum type;

	/**
	 * The number's range of this zone, in international format
	 *
	 * canBeNull
	 */
	public String internationalNumber;

	/**
	 * The list of ZNE of this zone
	 *
	 * canBeNull
	 */
	public String[] zneList;
}
