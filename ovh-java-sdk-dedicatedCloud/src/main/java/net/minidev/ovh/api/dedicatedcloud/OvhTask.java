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
	 * Task end date
	 *
	 * canBeNull && readOnly
	 */
	public Date endDate;

	/**
	 * Maintenance task max allowed execution date
	 *
	 * canBeNull && readOnly
	 */
	public Date maintenanceDateTo;

	/**
	 * orderId of the associated billing.Order object
	 *
	 * canBeNull && readOnly
	 */
	public Long orderId;

	/**
	 * taskId of the parent dedicatedCloud.Task object
	 *
	 * canBeNull && readOnly
	 */
	public Long parentTaskId;

	/**
	 * Task execution date
	 *
	 * canBeNull && readOnly
	 */
	public Date executionDate;

	/**
	 * datacenterId of the associated dedicatedCloud.Datacenter object
	 *
	 * canBeNull && readOnly
	 */
	public Long datacenterId;

	/**
	 * hostId of the associated dedicatedCloud.Host object
	 *
	 * canBeNull && readOnly
	 */
	public Long hostId;

	/**
	 * Current progress description
	 *
	 * canBeNull && readOnly
	 */
	public String description;

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
	 * filerId of the associated dedicatedCloud.Filer object
	 *
	 * canBeNull && readOnly
	 */
	public Long filerId;

	/**
	 * Task name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

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
