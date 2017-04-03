package net.minidev.ovh.api.sms;

/**
 * A structure describing how to manage an sms Response
 */
public class OvhResponse {
	/**
	 * canBeNull
	 */
	public String trackingDefaultSmsSender;

	/**
	 * canBeNull
	 */
	public OvhResponseTypeEnum responseType;

	/**
	 * Default url callback used for a given response.
	 *
	 * canBeNull
	 */
	public String cgiUrl;

	/**
	 * canBeNull
	 */
	public OvhResponseTrackingOptions[] trackingOptions;

	/**
	 * Automatic notification sent by text in case of customer reply.
	 *
	 * canBeNull
	 */
	public String text;
}
