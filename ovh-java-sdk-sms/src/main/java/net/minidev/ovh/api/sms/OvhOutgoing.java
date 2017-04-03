package net.minidev.ovh.api.sms;

import java.util.Date;

/**
 * Sms history of sms outgoing sent
 */
public class OvhOutgoing {
	/**
	 * canBeNull && readOnly
	 */
	public String receiver;

	/**
	 * Tariff code applied on the sms
	 *
	 * canBeNull && readOnly
	 */
	public String tariffCode;

	/**
	 * canBeNull && readOnly
	 */
	public Long deliveryReceipt;

	/**
	 * canBeNull && readOnly
	 */
	public Long messageLength;

	/**
	 * canBeNull && readOnly
	 */
	public Long numberOfSms;

	/**
	 * canBeNull && readOnly
	 */
	public String message;

	/**
	 * canBeNull && readOnly
	 */
	public Date creationDatetime;

	/**
	 * canBeNull && readOnly
	 */
	public Long ptt;

	/**
	 * canBeNull && readOnly
	 */
	public Double credits;

	/**
	 * canBeNull && readOnly
	 */
	public String sender;

	/**
	 * canBeNull && readOnly
	 */
	public Long differedDelivery;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * canBeNull && readOnly
	 */
	public String tag;
}
