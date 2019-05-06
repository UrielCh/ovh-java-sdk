package net.minidev.ovh.api.dedicatedcloud;

/**
 * Private Cloud
 */
public class OvhDedicatedCloud {
	/**
	 * Generation of your Private Cloud
	 *
	 * canBeNull && readOnly
	 */
	public OvhGenerationEnum generation;

	/**
	 * Advanced security state
	 *
	 * canBeNull && readOnly
	 */
	public Boolean advancedSecurity;

	/**
	 * Enable SSL v3 support. Warning : this option is not recommended as it was recognized as a security breach. If this is enabled, we advise you to enable the filtered User access policy
	 *
	 * canBeNull && readOnly
	 */
	public Boolean sslV3;

	/**
	 * The timeout (in seconds) for the user sessions on the Private Cloud management interface. 0 value disable the timeout
	 *
	 * canBeNull && readOnly
	 */
	public Long userSessionTimeout;

	/**
	 * The current bandwidth of your Private Cloud
	 *
	 * canBeNull && readOnly
	 */
	public String bandwidth;

	/**
	 * canBeNull && readOnly
	 */
	public OvhUserLogoutPolicyEnum userLogoutPolicy;

	/**
	 * The management interface name
	 *
	 * canBeNull && readOnly
	 */
	public OvhManagementInterfaceEnum managementInterface;

	/**
	 * SPLA licensing state
	 *
	 * canBeNull && readOnly
	 */
	public Boolean spla;

	/**
	 * Url to the Private Cloud vScope interface
	 *
	 * canBeNull && readOnly
	 */
	public String vScopeUrl;

	/**
	 * Description of your Private Cloud
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Name of the current service pack
	 *
	 * canBeNull && readOnly
	 */
	public String servicePackName;

	/**
	 * Access policy of your Private Cloud : opened to every IPs or filtered
	 *
	 * canBeNull && readOnly
	 */
	public OvhUserAccessPolicyEnum userAccessPolicy;

	/**
	 * Service name of your Private Cloud
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * Url to the Private Cloud certified interface
	 *
	 * canBeNull && readOnly
	 */
	public String certifiedInterfaceUrl;

	/**
	 * Version of the management interface
	 *
	 * canBeNull && readOnly
	 */
	public OvhVersion version;

	/**
	 * Url to the Private Cloud web interface
	 *
	 * canBeNull && readOnly
	 */
	public String webInterfaceUrl;

	/**
	 * Billing type of your Private Cloud
	 *
	 * canBeNull && readOnly
	 */
	public OvhBillingTypeEnum billingType;

	/**
	 * The maximum amount of connected users allowed on the Private Cloud management interface
	 *
	 * canBeNull && readOnly
	 */
	public Long userLimitConcurrentSession;

	/**
	 * Datacenter where your Private Cloud is physically located
	 *
	 * canBeNull && readOnly
	 */
	public String location;

	/**
	 * Current state of your Private Cloud
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * The current version of your Private Cloud
	 *
	 * canBeNull && readOnly
	 */
	public String commercialRange;
}
