package net.minidev.ovh.api.debt;

import java.util.Date;
import net.minidev.ovh.api.debt.entry.OvhOperationEnum;
import net.minidev.ovh.api.debt.entry.OvhStatusEnum;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Operation that happend on a debt
 */
public class OvhOperation {
	/**
	 * Date the operation took place on
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * Amount of the operation
	 *
	 * canBeNull && readOnly
	 */
	public OvhPrice amount;

	/**
	 * canBeNull && readOnly
	 */
	public Long operationId;

	/**
	 * Type of movement this operation represents
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperationEnum type;

	/**
	 * Status of the operation
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
