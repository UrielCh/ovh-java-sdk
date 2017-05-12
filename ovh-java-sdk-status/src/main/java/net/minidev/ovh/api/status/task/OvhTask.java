package net.minidev.ovh.api.status.task;

import java.util.Date;
import net.minidev.ovh.api.ovhstatus.task.OvhTaskImpactEnum;
import net.minidev.ovh.api.ovhstatus.task.OvhTaskStatusEnum;
import net.minidev.ovh.api.ovhstatus.task.OvhTaskTypeEnum;
import net.minidev.ovh.api.status.reply.OvhReply;

/**
 * A task linked to one of your services
 */
public class OvhTask {
	/**
	 * The replies of the task
	 *
	 * canBeNull && readOnly
	 */
	public OvhReply[] replies;

	/**
	 * The end date of the task
	 *
	 * canBeNull && readOnly
	 */
	public Date endDate;

	/**
	 * The impact of the task
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskImpactEnum impact;

	/**
	 * The task progression from 0 to 100
	 *
	 * canBeNull && readOnly
	 */
	public Long progress;

	/**
	 * The project of task
	 *
	 * canBeNull && readOnly
	 */
	public String project;

	/**
	 * Your impacted service linked to the task
	 *
	 * canBeNull && readOnly
	 */
	public String impactedService;

	/**
	 * The category of the task
	 *
	 * canBeNull && readOnly
	 */
	public String category;

	/**
	 * The title of the task
	 *
	 * canBeNull && readOnly
	 */
	public String title;

	/**
	 * The type of the task
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskTypeEnum type;

	/**
	 * The task uuid
	 *
	 * canBeNull && readOnly
	 */
	public String uuid;

	/**
	 * The start date of the task
	 *
	 * canBeNull && readOnly
	 */
	public Date startDate;

	/**
	 * The status of the task
	 *
	 * canBeNull && readOnly
	 */
	public OvhTaskStatusEnum status;
}
