package net.minidev.ovh.api.iploadbalancing.routehttp;

import net.minidev.ovh.api.iploadbalancing.OvhRouteHttpAction;
import net.minidev.ovh.api.iploadbalancing.OvhRouteRule;
import net.minidev.ovh.api.iploadbalancing.OvhRouteStatusEnum;

/**
 * HTTP Route
 */
public class OvhRouteHttp {
	/**
	 * Id of your route
	 *
	 * canBeNull && readOnly
	 */
	public Long routeId;

	/**
	 * Human readable name for your route, this field is for you
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Route priority ([0..255]). 0 if null. Highest priority routes are evaluated first. Only the first matching route will trigger an action
	 *
	 * canBeNull && readOnly
	 */
	public Long weight;

	/**
	 * Action triggered when all rules match
	 *
	 * canBeNull && readOnly
	 */
	public OvhRouteHttpAction action;

	/**
	 * List of rules to match to trigger action
	 *
	 * canBeNull && readOnly
	 */
	public OvhRouteRule[] rules;

	/**
	 * Route traffic for this frontend
	 *
	 * canBeNull && readOnly
	 */
	public Long frontendId;

	/**
	 * Route status. Routes in "ok" state are ready to operate
	 *
	 * canBeNull && readOnly
	 */
	public OvhRouteStatusEnum status;
}
