package net.minidev.ovh.api.dedicatedcloud;

import net.minidev.ovh.api.dedicatedcloud.optionaccessnetwork.OvhStateEnum;

/**
 * Private Cloud federation option access network
 */
public class OvhFederationAccessNetwork {
	/**
	 * Active Directory NetBIOS name
	 *
	 * canBeNull && readOnly
	 */
	public String domainAlias;

	/**
	 * Id of the Active Directory
	 *
	 * canBeNull && readOnly
	 */
	public Long activeDirectoryId;

	/**
	 * Active Directory LDAP port
	 *
	 * canBeNull && readOnly
	 */
	public Long ldapTcpPort;

	/**
	 * SSL thumbprint of the remote service
	 *
	 * canBeNull && readOnly
	 */
	public String sslThumbprint;

	/**
	 * Active Directory domain name
	 *
	 * canBeNull && readOnly
	 */
	public String domainName;

	/**
	 * IP address of the remote service
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * Active Directory base DN for groups
	 *
	 * canBeNull && readOnly
	 */
	public String baseDnForGroups;

	/**
	 * Description of your option access network
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Active Directory base DN for users
	 *
	 * canBeNull && readOnly
	 */
	public String baseDnForUsers;

	/**
	 * State of the option
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * Active Directory username
	 *
	 * canBeNull && readOnly
	 */
	public String username;
}
