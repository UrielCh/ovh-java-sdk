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
	 * Key tag
	 *
	 * canBeNull
	 */
	public Long tag;

	/**
	 * Public key
	 *
	 * canBeNull
	 */
	public String publicKey;

	/**
	 * Algorithm
	 *
	 * canBeNull
	 */
	public OvhKeyAlgorithmEnum algorithm;
}
