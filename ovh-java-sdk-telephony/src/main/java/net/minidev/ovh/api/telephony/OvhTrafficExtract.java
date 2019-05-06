package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Traffic extracts (SIP) of your line
 */
public class OvhTrafficExtract {
	/**
	 * The start date of the traffic extract
	 *
	 * canBeNull && readOnly
	 */
	public Date dateStart;

	/**
	 * The PCAP file size of the traffic extract
	 *
	 * canBeNull && readOnly
	 */
	public Long fileSize;

	/**
	 * The PCAP URL of the traffic extract
	 *
	 * canBeNull && readOnly
	 */
	public String fileUrl;

	/**
	 * The start date of the traffic extract
	 *
	 * canBeNull && readOnly
	 */
	public Date dateEnd;

	/**
	 * The id of the traffic extract
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * The status of the extract
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskStatusEnum status;
}
