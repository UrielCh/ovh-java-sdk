package net.minidev.ovh.api.email.exchange;

/**
 * Exchange server
 */
public class OvhServer {
	/**
	 * If true your dns ptrV6 record is valid
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isPtrV6Valid;

	/**
	 * ipV4
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * Indicates if Multi Factor Authentication is activated on Outlook Web Access interface
	 *
	 * canBeNull && readOnly
	 */
	public Boolean owaMfa;

	/**
	 * Exchange commercial version
	 *
	 * canBeNull && readOnly
	 */
	public OvhExchangeCommercialVersionEnum commercialVersion;

	/**
	 * ExchangeServer version
	 *
	 * canBeNull && readOnly
	 */
	public Long version;

	/**
	 * Task pending id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;

	/**
	 * Total disk size in MB
	 *
	 * canBeNull && readOnly
	 */
	public Long diskSize;

	/**
	 * Current disk usage in MB
	 *
	 * canBeNull && readOnly
	 */
	public Long currentDiskUsage;

	/**
	 * ipV6
	 *
	 * canBeNull && readOnly
	 */
	public String ipV6;

	/**
	 * If true server is 2010 individual offer
	 *
	 * canBeNull && readOnly
	 */
	public Boolean individual2010;

	/**
	 * If true your dns ptr record is valid
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isPtrValid;

	/**
	 * If true your dns A record is valid
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isAValid;

	/**
	 * Server state
	 *
	 * canBeNull && readOnly
	 */
	public OvhServerStateEnum state;

	/**
	 * If true your dns AAAA record is valid
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isAaaaValid;
}
