package net.minidev.ovh.api.geolocation;

import net.minidev.ovh.api.coretypes.OvhContinentEnum;
import net.minidev.ovh.api.coretypes.OvhCountryEnum;

/**
 * Representation of country and continent from visitor IP
 */
public class OvhContinentCountryLocation {
	/**
	 * Continent
	 *
	 * canBeNull && readOnly
	 */
	public OvhContinentEnum continent;

	/**
	 * Country iso code
	 *
	 * canBeNull && readOnly
	 */
	public OvhCountryEnum countryCode;
}
