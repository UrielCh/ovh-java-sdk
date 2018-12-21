package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Events triggered by the line
 */
public class OvhEvent {
	/**
	 * Duration of the call
	 *
	 * canBeNull && readOnly
	 */
	public Long duration;

	/**
	 * Datetime call establishment
	 *
	 * canBeNull && readOnly
	 */
	public Date dateTime;

	/**
	 * Protocol (mgcp or sip)
	 *
	 * canBeNull && readOnly
	 */
	public OvhRealtimeEventProtocol protocol;

	/**
	 * Calling referer, could be the msisdn or the label name
	 *
	 * canBeNull && readOnly
	 */
	public String callingIdentifier;

	/**
	 * Type of event
	 *
	 * canBeNull && readOnly
	 */
	public OvhRealtimeEventType eventType;

	/**
	 * Uniq identifier of the call
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Called referer, could be the msisdn or the label name
	 *
	 * canBeNull && readOnly
	 */
	public String calledIdentifier;

	/**
	 * Incoming or outgoing call
	 *
	 * canBeNull && readOnly
	 */
	public OvhRealtimeEventDirection direction;
}
