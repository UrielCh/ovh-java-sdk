package net.minidev.ovh.api.domain.zone;

/**
 * Zone Start Of Authority
 */
public class OvhSoa {
	/**
	 * Primary authoritative server
	 *
	 * canBeNull && readOnly
	 */
	public String server;

	/**
	 * Non-Existent Domain TTL, if the name server returns a negative response, the remote server should wait the number of seconds set in the nxDomainTtl field before trying again
	 *
	 * canBeNull && readOnly
	 */
	public Long nxDomainTtl;

	/**
	 * The serial number is used to indicate which copy of the zone file is the most current. When editing zone files, you must increment the serial number
	 *
	 * canBeNull && readOnly
	 */
	public Long serial;

	/**
	 * When a zone transfer fails, a countdown clock begins. When the number of seconds set in the expire field elapses, the nameserver stops answering for that zone file
	 *
	 * canBeNull && readOnly
	 */
	public Long expire;

	/**
	 * The refresh value determines the interval in seconds between successful zone transfers of the entire zone file from a nameserver to another.
	 *
	 * canBeNull && readOnly
	 */
	public Long refresh;

	/**
	 * Time To Live in seconds
	 *
	 * canBeNull && readOnly
	 */
	public Long ttl;

	/**
	 * Email address of the DNS Administrator
	 *
	 * canBeNull && readOnly
	 */
	public String email;
}
