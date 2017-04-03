package net.minidev.ovh.api.vps;

import java.util.Date;

/**
 * Information about the snapshot of a VPS Virtual Machine
 */
public class OvhSnapshot {
	/**
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public Date creationDate;
}
