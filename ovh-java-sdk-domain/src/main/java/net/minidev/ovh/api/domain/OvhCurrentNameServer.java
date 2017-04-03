package net.minidev.ovh.api.domain;

/**
 * CurrentNameServer
 */
public class OvhCurrentNameServer {
	/**
	 * toDelete flag of the name server
	 *
	 * canBeNull && readOnly
	 */
	public Boolean toDelete;

	/**
	 * Ip of the name server
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * Host of the name server
	 *
	 * canBeNull && readOnly
	 */
	public String host;

	/**
	 * Id of the name server
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * isUsed flag of the name server
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isUsed;
}
