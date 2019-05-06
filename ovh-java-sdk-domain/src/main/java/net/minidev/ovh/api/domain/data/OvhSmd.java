package net.minidev.ovh.api.domain.data;

import java.util.Date;

/**
 * Representation of a SMD Resource file
 */
public class OvhSmd {
	/**
	 * TMCH Internal identifier
	 *
	 * canBeNull && readOnly
	 */
	public String smdId;

	/**
	 * List of the labels that are protected with that SMD file
	 *
	 * canBeNull && readOnly
	 */
	public OvhSmdLabel[] protectedLabels;

	/**
	 * Date when information about SMD file aren't valid anymore
	 *
	 * canBeNull && readOnly
	 */
	public Date notAfter;

	/**
	 * SMD file content
	 *
	 * canBeNull && readOnly
	 */
	public String data;

	/**
	 * SMD file ID
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Date before when information about SMD file aren't valid yet
	 *
	 * canBeNull && readOnly
	 */
	public Date notBefore;
}
