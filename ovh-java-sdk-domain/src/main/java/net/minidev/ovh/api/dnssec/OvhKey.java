package net.minidev.ovh.api.dnssec;

/**
 * Key type
 */
public class OvhKey {
	/**
	 * Flag of the dnssec key
	 *
	 * canBeNull
	 */
	public OvhKeyFlagEnum flags;

	/**
	 * Public key
	 *
	 * canBeNull
	 */
	public String publicKey;

	/**
	 * Key tag
	 *
	 * canBeNull
	 */
	public Long tag;

	/**
	 * Algorithm
	 *
	 * canBeNull
	 */
	public OvhKeyAlgorithmEnum algorithm;
}
