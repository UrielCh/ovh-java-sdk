package net.minidev.ovh.api.hosting.privatedatabase;

import java.util.Date;
import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Private database
 */
public class OvhService {
	/**
	 * Private database ftp port
	 *
	 * canBeNull && readOnly
	 */
	public Long portFtp;

	/**
	 * Private database server name
	 *
	 * canBeNull && readOnly
	 */
	public String server;

	/**
	 * Date of the last data synchronization
	 *
	 * canBeNull && readOnly
	 */
	public Date lastCheck;

	/**
	 * Private database capabilities
	 *
	 * canBeNull && readOnly
	 */
	public OvhCapability[] capabilities;

	/**
	 * Set the name displayed in customer panel for your private database (max 50 chars)
	 *
	 * canBeNull && readOnly
	 */
	public String displayName;

	/**
	 * Private database ftp hostname
	 *
	 * canBeNull && readOnly
	 */
	public String hostnameFtp;

	/**
	 * Private database ip
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * Parameters required to query metrics from OpenTSDB
	 *
	 * canBeNull && readOnly
	 */
	public OvhGraphEndpoint graphEndpoint;

	/**
	 * Number of cpu on your private database
	 *
	 * canBeNull && readOnly
	 */
	public Long cpu;

	/**
	 * Datacenter where this private database is located
	 *
	 * canBeNull && readOnly
	 */
	public OvhDatacenterEnum datacenter;

	/**
	 * Return the TLS certificate authority used by the private database
	 *
	 * canBeNull && readOnly
	 */
	public String tlsCa;

	/**
	 * Service name
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * Private database type
	 *
	 * canBeNull && readOnly
	 */
	public OvhTypeEnum type;

	/**
	 * Private database version
	 *
	 * canBeNull && readOnly
	 */
	public OvhAvailableVersionEnum version;

	/**
	 * Private database version number
	 *
	 * canBeNull && readOnly
	 */
	public Double versionNumber;

	/**
	 * URL for the graphical user interface
	 *
	 * canBeNull && readOnly
	 */
	public String guiURL;

	/**
	 * Type of the private database offer
	 *
	 * canBeNull && readOnly
	 */
	public OvhOfferEnum offer;

	/**
	 * Private database hostname
	 *
	 * canBeNull && readOnly
	 */
	public String hostname;

	/**
	 * Private database service port
	 *
	 * canBeNull && readOnly
	 */
	public Long port;

	/**
	 * Total space used on your private database
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> quotaUsed;

	/**
	 * Infrastructure where service was stored
	 *
	 * canBeNull && readOnly
	 */
	public String infrastructure;

	/**
	 * Space allowed on your private database
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> quotaSize;

	/**
	 * Private database state
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * Amount of ram on your private database
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> ram;
}
