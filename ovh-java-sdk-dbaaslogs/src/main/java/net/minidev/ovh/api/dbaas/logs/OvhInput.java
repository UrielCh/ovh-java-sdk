package net.minidev.ovh.api.dbaas.logs;

import java.util.Date;

/**
 * Input
 */
public class OvhInput {
	/**
	 * Input ID
	 *
	 * canBeNull && readOnly
	 */
	public String inputId;

	/**
	 * Indicate if input need to be restarted
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isRestartRequired;

	/**
	 * Associated Graylog stream
	 *
	 * canBeNull && readOnly
	 */
	public String streamId;

	/**
	 * Port
	 *
	 * canBeNull && readOnly
	 */
	public String exposedPort;

	/**
	 * Input description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Input IP address
	 *
	 * canBeNull && readOnly
	 */
	public String publicAddress;

	/**
	 * Input title
	 *
	 * canBeNull && readOnly
	 */
	public String title;

	/**
	 * Input creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * Hostname
	 *
	 * canBeNull && readOnly
	 */
	public String hostname;

	/**
	 * Input SSL certificate
	 *
	 * canBeNull && readOnly
	 */
	public String sslCertificate;

	/**
	 * Associated DBaaS Logs option
	 *
	 * canBeNull && readOnly
	 */
	public String optionId;

	/**
	 * Force only one instance
	 *
	 * canBeNull && readOnly
	 */
	public Boolean singleInstanceEnabled;

	/**
	 * Input last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;

	/**
	 * init: configuration required, pending: ready to start, running: available
	 *
	 * canBeNull && readOnly
	 */
	public OvhInputStatusEnum status;

	/**
	 * Input engine UUID
	 *
	 * canBeNull && readOnly
	 */
	public String engineId;
}
