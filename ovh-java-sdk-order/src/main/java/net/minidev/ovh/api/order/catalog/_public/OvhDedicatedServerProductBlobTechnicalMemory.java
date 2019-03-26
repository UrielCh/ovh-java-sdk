package net.minidev.ovh.api.order.catalog._public;

/**
 * Describes a Memory technical Blob for a Dedicated Server
 */
public class OvhDedicatedServerProductBlobTechnicalMemory {
	/**
	 * Size of the RAM in Gb
	 *
	 * canBeNull && readOnly
	 */
	public Long size;

	/**
	 * ECC
	 *
	 * canBeNull && readOnly
	 */
	public Boolean ecc;

	/**
	 * RAM Type (DDRx...)
	 *
	 * canBeNull && readOnly
	 */
	public String ramType;

	/**
	 * RAM Frequency
	 *
	 * canBeNull && readOnly
	 */
	public Long frequency;
}
