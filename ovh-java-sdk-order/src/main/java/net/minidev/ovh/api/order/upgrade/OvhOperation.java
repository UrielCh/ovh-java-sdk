package net.minidev.ovh.api.order.upgrade;

/**
 * Describes an operation
 */
public class OvhOperation {
	/**
	 * Product concerned by the operation
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperationProduct product;

	/**
	 * Identifier of the operation
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Type of the operation
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperationTypeEnum type;

	/**
	 * Status of the operation
	 *
	 * canBeNull && readOnly
	 */
	public OvhOperationStatusEnum status;
}
