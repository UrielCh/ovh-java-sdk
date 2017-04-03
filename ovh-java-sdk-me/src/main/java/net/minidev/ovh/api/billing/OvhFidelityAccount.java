package net.minidev.ovh.api.billing;

import java.util.Date;

/**
 * Balance of the fidelity account
 */
public class OvhFidelityAccount {
	/**
	 * canBeNull && readOnly
	 */
	public Long balance;

	/**
	 * canBeNull && readOnly
	 */
	public Long alertThreshold;

	/**
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * canBeNull && readOnly
	 */
	public Boolean canBeCredited;

	/**
	 * canBeNull && readOnly
	 */
	public Date openDate;
}
