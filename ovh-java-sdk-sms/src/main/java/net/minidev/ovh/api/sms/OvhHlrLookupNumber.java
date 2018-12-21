package net.minidev.ovh.api.sms;

import java.util.Date;

/**
 * Home Location Register informations. Give informations about a given cellular phone.
 */
public class OvhHlrLookupNumber {
	/**
	 * Is the MSISDN valid
	 *
	 * canBeNull && readOnly
	 */
	public Boolean valid;

	/**
	 * Has the MSISDN been ported from its original network
	 *
	 * canBeNull && readOnly
	 */
	public Boolean ported;

	/**
	 * HLR creation datetime
	 *
	 * canBeNull && readOnly
	 */
	public Date datetime;

	/**
	 * Is the MSISDN currently roaming outside its natinal network
	 *
	 * canBeNull && readOnly
	 */
	public Boolean roaming;

	/**
	 * HLR id
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * MSISDN
	 *
	 * canBeNull && readOnly
	 */
	public String msisdn;

	/**
	 * The {Mobile Country Code, Mobile Network Code} unique identifier
	 *
	 * canBeNull && readOnly
	 */
	public String operatorCode;

	/**
	 * Is the MSISDN currently reachable
	 *
	 * canBeNull && readOnly
	 */
	public Boolean reachable;

	/**
	 * Status of the HLR request
	 *
	 * canBeNull && readOnly
	 */
	public OvhHlrStatuses status;
}
