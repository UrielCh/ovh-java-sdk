package net.minidev.ovh.api.hpcspot;

import java.util.Date;
import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Detail of a HPC Spot consumtion
 */
public class OvhConsumption {
	/**
	 * ID of the linked job on HPC Spot interface
	 *
	 * canBeNull && readOnly
	 */
	public Long hpcspotItemId;

	/**
	 * Reference of the item. This reference is linked with the type of the item
	 *
	 * canBeNull && readOnly
	 */
	public OvhConsumptionReferenceEnum reference;

	/**
	 * Date of the completion of the item consumption
	 *
	 * canBeNull && readOnly
	 */
	public Date hpcspotItemEndDate;

	/**
	 * Quantity consumed (minutes, core minutes, licences, token)
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Long> quantity;

	/**
	 * ID of the Order that billed this item. If null, this item has not been billed
	 *
	 * canBeNull && readOnly
	 */
	public Long orderId;

	/**
	 * Description of the ressource
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * URL for the description of the consumption on the HPC Spot interface
	 *
	 * canBeNull && readOnly
	 */
	public String hpcspotUrl;

	/**
	 * ID of the detail
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Type of consumption
	 *
	 * canBeNull && readOnly
	 */
	public OvhConsumptionTypeEnum type;
}
