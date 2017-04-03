package net.minidev.ovh.api.telephony;

/**
 * Abbreviated number
 */
public class OvhAbbreviatedNumber {
	/**
	 * The abbreviated number which must start with "2" and must have a length of 3 or 4 digits
	 *
	 * canBeNull && readOnly
	 */
	public Long abbreviatedNumber;

	/**
	 * canBeNull && readOnly
	 */
	public String surname;

	/**
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * The destination of the abbreviated number
	 *
	 * canBeNull && readOnly
	 */
	public String destinationNumber;
}
