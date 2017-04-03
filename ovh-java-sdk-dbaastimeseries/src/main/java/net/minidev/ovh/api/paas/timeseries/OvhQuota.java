package net.minidev.ovh.api.paas.timeseries;

import net.minidev.ovh.api.tsaas.OvhQuotaTypeEnum;

/**
 * Quota
 */
public class OvhQuota {
	/**
	 * Current value
	 *
	 * canBeNull && readOnly
	 */
	public Long current;

	/**
	 * Max allowed
	 *
	 * canBeNull && readOnly
	 */
	public Long max;

	/**
	 * Type (ie: mads, ddp, ...)
	 *
	 * canBeNull && readOnly
	 */
	public OvhQuotaTypeEnum type;
}
