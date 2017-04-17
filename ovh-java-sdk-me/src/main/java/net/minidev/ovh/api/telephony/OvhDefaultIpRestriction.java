package net.minidev.ovh.api.telephony;

/**
 * Default IP restriction of a VoIP line
 */
public class OvhDefaultIpRestriction {
	/**
	 * The IPv4 subnet you want to allow
	 *
	 * canBeNull && readOnly
	 */
	public String subnet;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * The protocol you want to restrict (sip/mgcp)
	 *
	 * canBeNull && readOnly
	 */
	public OvhProtocolEnum type;
}
