package net.minidev.ovh.api.domain;

import net.minidev.ovh.api.dnssec.OvhKeyAlgorithmEnum;
import net.minidev.ovh.api.dnssec.OvhKeyFlagEnum;
import net.minidev.ovh.api.dnssec.OvhKeyStatusEnum;

/**
 * Domain's DNSSEC Key
 */
public class OvhDnssecKey {
	/**
	 * Flag of the DNSSEC key
	 *
	 * canBeNull && readOnly
	 */
	public OvhKeyFlagEnum flags;

	/**
	 * Tag of the DNSSEC key
	 *
	 * canBeNull && readOnly
	 */
	public Long tag;

	/**
	 * Id of the DNSSEC key
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Public key
	 *
	 * canBeNull && readOnly
	 */
	public String publicKey;

	/**
	 * Algorithm number of the DNSSEC key
	 *
	 * canBeNull && readOnly
	 */
	public OvhKeyAlgorithmEnum algorithm;

	/**
	 * Key status of the DNSSEC key
	 *
	 * canBeNull && readOnly
	 */
	public OvhKeyStatusEnum status;
}
