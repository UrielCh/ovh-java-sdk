package net.minidev.ovh.api.xdsl;

import java.util.Date;

/**
 * Detailed line tests
 */
public class OvhLineDiagnostic {
	/**
	 * canBeNull
	 */
	public String number;

	/**
	 * canBeNull
	 */
	public Long proposedProfileId;

	/**
	 * canBeNull
	 */
	public Boolean sync;

	/**
	 * canBeNull
	 */
	public Date lineTestTime;

	/**
	 * canBeNull
	 */
	public OvhLineTestEnum lineTest;
}
