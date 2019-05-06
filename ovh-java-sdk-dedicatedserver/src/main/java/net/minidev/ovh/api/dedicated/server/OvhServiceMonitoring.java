package net.minidev.ovh.api.dedicated.server;

/**
 * Service monitoring details
 */
public class OvhServiceMonitoring {
	/**
	 * The protocol to use
	 *
	 * canBeNull && readOnly
	 */
	public OvhMonitoringProtocolEnum protocol;

	/**
	 * The service port to monitor
	 *
	 * canBeNull && readOnly
	 */
	public Long port;

	/**
	 * The expected return
	 *
	 * canBeNull && readOnly
	 */
	public String challengeText;

	/**
	 * The ip to monitor
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * The test interval in seconds
	 *
	 * canBeNull && readOnly
	 */
	public OvhMonitoringIntervalEnum interval;

	/**
	 * Is this service monitoring is enabled
	 *
	 * canBeNull && readOnly
	 */
	public Boolean enabled;

	/**
	 * The URL to test
	 *
	 * canBeNull && readOnly
	 */
	public String url;

	/**
	 * This monitoring id
	 *
	 * canBeNull && readOnly
	 */
	public Long monitoringId;
}
