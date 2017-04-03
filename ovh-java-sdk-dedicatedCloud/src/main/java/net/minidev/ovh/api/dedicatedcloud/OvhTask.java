package net.minidev.ovh.api.dedicatedcloud;

import java.util.Date;

/**
 * Operation on a Private Cloud component
 */
public class OvhTask {
	/**
	 * Maintenance task min allowed execution date
	 *
	 * canBeNull && readOnly
	 */
	public Date maintenanceDateFrom;

	/**
	 * vlanId of the parent dedicatedCloud.Vlan object
	 *
	 * canBeNull && readOnly
	 */
	public Long vlanId;

	/**
	 * orderId of the associated billing.Order object
	 *
	 * canBeNull && readOnly
	 */
	public Long orderId;

	/**
	 * Maintenance task max allowed execution date
	 *
	 * canBeNull && readOnly
	 */
	public Date maintenanceDateTo;

	/**
	 * Task end date
	 *
	 * canBeNull && readOnly
	 */
	public Date endDate;

	/**
	 * taskId of the parent dedicatedCloud.Task object
	 *
	 * canBeNull && readOnly
	 */
	public Long parentTaskId;

	/**
	 * datacenterId of the associated dedicatedCloud.Datacenter object
	 *
	 * canBeNull && readOnly
	 */
	public Long datacenterId;

	/**
	 * Task execution date
	 *
	 * canBeNull && readOnly
	 */
	public Date executionDate;

	/**
	 * Current progress description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * hostId of the associated dedicatedCloud.Host object
	 *
	 * canBeNull && readOnly
	 */
	public Long hostId;

	/**
	 * Task type
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * userId of the associated dedicatedCloud.User object
	 *
	 * canBeNull && readOnly
	 */
	public Long userId;

	/**
	 * network of the associated dedicatedCloud.Ip object
	 *
	 * canBeNull && readOnly
	 */
	public String network;

	/**
	 * networkAccessId of the associated dedicatedCloud.AllowedNetwork object
	 *
	 * canBeNull && readOnly
	 */
	public Long networkAccessId;

	/**
	 * Task last modification date
	 *
	 * canBeNull && readOnly
	 */
	public Date lastModificationDate;

	/**
	 * Origin of the task
	 *
	 * canBeNull && readOnly
	 */
	public String createdFrom;

	/**
	 * Creator of the task
	 *
	 * canBeNull && readOnly
	 */
	public String createdBy;

	/**
	 * Task name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * filerId of the associated dedicatedCloud.Filer object
	 *
	 * canBeNull && readOnly
	 */
	public Long filerId;

	/**
	 * Current progress
	 *
	 * canBeNull && readOnly
	 */
	public Long progress;

	/**
	 * Current Task state
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskStateEnum state;

	/**
	 * Task id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;
}
