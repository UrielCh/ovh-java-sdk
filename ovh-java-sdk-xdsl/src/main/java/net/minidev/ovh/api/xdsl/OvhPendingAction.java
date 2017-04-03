package net.minidev.ovh.api.xdsl;

import java.util.Date;

/**
 * Scheduled action before the next renewal of the service
 */
public class OvhPendingAction {
	/**
	 * canBeNull && readOnly
	 */
	public String action;

	/**
	 * canBeNull && readOnly
	 */
	public Date dateTodo;
}
