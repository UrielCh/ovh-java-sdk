package net.minidev.ovh.api.telephony;

/**
 * Line tones
 */
public class OvhTones {
	/**
	 * Tone played when callee is ending call
	 *
	 * canBeNull && readOnly
	 */
	public OvhTonesEnum endCall;

	/**
	 * Tone played when caller is put on hold
	 *
	 * canBeNull && readOnly
	 */
	public OvhTonesOnHoldEnum onHold;

	/**
	 * Ringback tone
	 *
	 * canBeNull && readOnly
	 */
	public OvhTonesEnum ringback;

	/**
	 * Tone played when caller is waiting in queue
	 *
	 * canBeNull && readOnly
	 */
	public OvhTonesEnum callWaiting;
}
