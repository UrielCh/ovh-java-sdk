package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Call diagnostic analyze structure on metric performance values
 */
public class OvhCallDiagnosticCallQuality {
	/**
	 * Call identifier of the sip signal leg
	 *
	 * canBeNull
	 */
	public String callId;

	/**
	 * The port source
	 *
	 * canBeNull
	 */
	public Long portSrc;

	/**
	 * Destination port
	 *
	 * canBeNull
	 */
	public Long portDst;

	/**
	 * The ip address destination
	 *
	 * canBeNull
	 */
	public String ipDst;

	/**
	 * The ip address source
	 *
	 * canBeNull
	 */
	public String ipSrc;

	/**
	 * The number of packet sent in the given direction flow
	 *
	 * canBeNull
	 */
	public Long packets;

	/**
	 * Mean Opinion Score expressed in one number, from 1 to 5, 1 being the worst and 5 the best.
	 *
	 * canBeNull
	 */
	public Long mos;

	/**
	 * The max delay between two packet in the given direction flow
	 *
	 * canBeNull
	 */
	public Double maxDelay;

	/**
	 * Codec used in this direction flow
	 *
	 * canBeNull
	 */
	public OvhCallDiagnosticCodecEnum codec;

	/**
	 * Variation in the delay of received packets. Smaller is better and less is more
	 *
	 * canBeNull
	 */
	public Double maxJitter;

	/**
	 * Number of packet RTP lost in the direction flow
	 *
	 * canBeNull
	 */
	public Long rtpLost;

	/**
	 * Identifier of the metric performance value
	 *
	 * canBeNull
	 */
	public Long flowId;

	/**
	 * The creation timestamp of the given direction flow
	 *
	 * canBeNull
	 */
	public Date timestamp;
}
