package net.minidev.ovh.api.telephony;

/**
 * Screen list
 */
public class OvhScreenList {
	/**
	 * canBeNull && readOnly
	 */
	public OvhScreenListNatureEnum nature;

	/**
	 * canBeNull && readOnly
	 */
	public String callNumber;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * canBeNull && readOnly
	 */
	public OvhScreenListTypeEnum type;

	/**
	 * canBeNull && readOnly
	 */
	public String status;
}
