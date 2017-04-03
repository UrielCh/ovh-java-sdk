package net.minidev.ovh.api.nichandle;

import java.util.Date;

/**
 * Auto renewal information
 */
public class OvhNicAutorenewInfos {
	/**
	 * give the last renew
	 *
	 * canBeNull && readOnly
	 */
	public Date lastRenew;

	/**
	 * Renewal active or not
	 *
	 * canBeNull && readOnly
	 */
	public Boolean active;

	/**
	 * give the renewal day
	 *
	 * canBeNull && readOnly
	 */
	public Long renewDay;
}
