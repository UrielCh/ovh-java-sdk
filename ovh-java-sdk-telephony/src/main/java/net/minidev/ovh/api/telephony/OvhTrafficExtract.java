package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Traffic extracts (SIP) of your line
 */
public class OvhTrafficExtract {
	/**
	 * The PCAP file size of the traffic extract
	 *
	 * canBeNull && readOnly
	 */
	public Long fileSize;

	/**
	 * The start date of the traffic extract
	 *
	 * canBeNull && readOnly
	 */
	public Date dateStart;

	/**
	 * The PCAP URL of the traffic extract
	 *
	 * canBeNull && readOnly
	 */
	public String fileUrl;

	/**
	 * The id of the traffic extract
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * The start date of the traffic extract
	 *
	 * canBeNull && readOnly
	 */
	public Date dateEnd;

	/**
	 * The status of the extract
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskStatusEnum status;
}
