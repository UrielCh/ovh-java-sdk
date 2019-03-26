package net.minidev.ovh.api.order.catalog._public;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a Disk for a Dedicated Server
 */
public class OvhDedicatedServerProductBlobTechnicalDisk {
	/**
	 * Number of disks
	 *
	 * canBeNull && readOnly
	 */
	public Long number;

	/**
	 * Disk specs
	 *
	 * canBeNull && readOnly
	 */
	public String specs;

	/**
	 * Disk technology
	 *
	 * canBeNull && readOnly
	 */
	public String technology;

	/**
	 * Disk interface
	 *
	 * canBeNull && readOnly
	 */
	@JsonProperty("interface")
	public String _interface;

	/**
	 * Disk capacity in Gb
	 *
	 * canBeNull && readOnly
	 */
	public Long capacity;
}
