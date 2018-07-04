package net.minidev.ovh.api.service.renew;

/**
 * List possible renews for service
 */
public class OvhRenewDescription {
	/**
	 * ISO8601 formatted renewal duration
	 *
	 * canBeNull && readOnly
	 */
	public String renewPeriod;

	/**
	 * List possible strategies
	 *
	 * canBeNull && readOnly
	 */
	public OvhRenewStrategy[] strategies;
}
