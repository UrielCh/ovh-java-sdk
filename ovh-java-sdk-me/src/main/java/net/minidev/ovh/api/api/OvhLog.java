package net.minidev.ovh.api.api;

import java.util.Date;
import net.minidev.ovh.api.http.OvhMethodEnum;

/**
 * API Log
 */
public class OvhLog {
	/**
	 * Date of the request
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * HTTP URI of the request
	 *
	 * canBeNull && readOnly
	 */
	public String path;

	/**
	 * API Route called
	 *
	 * canBeNull && readOnly
	 */
	public String route;

	/**
	 * HTTP Method of the request
	 *
	 * canBeNull && readOnly
	 */
	public OvhMethodEnum method;

	/**
	 * Source IP of the request
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * canBeNull && readOnly
	 */
	public Long logId;

	/**
	 * Account which did the Request
	 *
	 * canBeNull && readOnly
	 */
	public String account;
}
