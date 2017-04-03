package net.minidev.ovh.api.ip;

import java.util.Date;

/**
 * Mitigation attack on your ip
 */
public class OvhMitigationAttack {
	/**
	 * End of the attack
	 *
	 * canBeNull && readOnly
	 */
	public Date endDate;

	/**
	 * Your ip
	 *
	 * canBeNull && readOnly
	 */
	public String ipAttack;

	/**
	 * Internal id of your attack
	 *
	 * canBeNull && readOnly
	 */
	public Long idAttack;

	/**
	 * Start of the attack
	 *
	 * canBeNull && readOnly
	 */
	public Date startDate;
}
