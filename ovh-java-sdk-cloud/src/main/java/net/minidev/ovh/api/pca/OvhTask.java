package net.minidev.ovh.api.pca;

import java.util.Date;
import net.minidev.ovh.api.cloud.pca.OvhFunctionTypeEnum;
import net.minidev.ovh.api.cloud.pca.OvhTaskStateEnum;

/**
 * cloud archives tasks
 */
public class OvhTask {
	/**
	 * Task function
	 *
	 * canBeNull && readOnly
	 */
	public OvhFunctionTypeEnum function;

	/**
	 * Host used for task
	 *
	 * canBeNull && readOnly
	 */
	public String ipAddress;

	/**
	 * Task date
	 *
	 * canBeNull && readOnly
	 */
	public Date todoDate;

	/**
	 * Task comments
	 *
	 * canBeNull && readOnly
	 */
	public String comment;

	/**
	 * Task ID
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Task login
	 *
	 * canBeNull && readOnly
	 */
	public String login;

	/**
	 * Task status
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskStateEnum status;
}
