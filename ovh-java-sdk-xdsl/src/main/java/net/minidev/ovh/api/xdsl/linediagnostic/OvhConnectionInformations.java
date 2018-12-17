package net.minidev.ovh.api.xdsl.linediagnostic;

/**
 * Informations directly get on DSLAM or Modem
 */
public class OvhConnectionInformations {
	/**
	 * Downstream margin
	 *
	 * canBeNull
	 */
	public Double downstreamMargin;

	/**
	 * Upstream synchronization
	 *
	 * canBeNull
	 */
	public Double upstreamSync;

	/**
	 * Upstream margin
	 *
	 * canBeNull
	 */
	public Double upstreamMargin;

	/**
	 * Upstream attenuation
	 *
	 * canBeNull
	 */
	public Double upstreamAttenuation;

	/**
	 * Modem interface name
	 *
	 * canBeNull
	 */
	public String ifName;

	/**
	 * Profile on the DSLAM
	 *
	 * canBeNull
	 */
	public String profile;

	/**
	 * Amount of CRC error detected
	 *
	 * canBeNull
	 */
	public Long crcError;

	/**
	 * Downstream synchronization
	 *
	 * canBeNull
	 */
	public Double downstreamSync;

	/**
	 * Downstream attenuation
	 *
	 * canBeNull
	 */
	public Double downstreamAttenuation;
}
