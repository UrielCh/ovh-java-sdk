package net.minidev.ovh.api.billing;

import java.util.Date;
import net.minidev.ovh.api.billing.fidelityaccount.OvhOperationEnum;

/**
 * Details about a fidelity account
 */
public class OvhFidelityMovement {
	/**
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * canBeNull && readOnly
	 */
	public Long amount;

	/**
	 * canBeNull && readOnly
	 */
	public Long balance;

	/**
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public OvhOperationEnum operation;

	/**
	 * canBeNull && readOnly
	 */
	public Long movementId;

	/**
	 * canBeNull && readOnly
	 */
	public Long order;

	/**
	 * canBeNull && readOnly
	 */
	public Long previousBalance;
}
