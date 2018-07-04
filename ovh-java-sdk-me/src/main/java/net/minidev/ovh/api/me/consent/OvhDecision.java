package net.minidev.ovh.api.me.consent;

import java.util.Date;

/**
 * Customer consent decision
 */
public class OvhDecision {
	/**
	 * Consent decision value
	 *
	 * canBeNull && readOnly
	 */
	public Boolean value;

	/**
	 * Consent decision datetime
	 *
	 * canBeNull && readOnly
	 */
	public Date timestamp;
}
