package net.minidev.ovh.api.domain.zone;

import net.minidev.ovh.api.dnssec.OvhDnssecStatusEnum;

/**
 * Manage Dnssec for this zone
 */
public class OvhDnssec {
	/**
	 * canBeNull && readOnly
	 */
	public OvhDnssecStatusEnum status;
}
