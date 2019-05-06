package net.minidev.ovh.api.dbaas.logs;

/**
 * Alert condition
 */
public class OvhStreamAlertCondition {
	/**
	 * Query filter
	 *
	 * canBeNull && readOnly
	 */
	public String queryFilter;

	/**
	 * Threshold
	 *
	 * canBeNull && readOnly
	 */
	public Long threshold;

	/**
	 * Condition label
	 *
	 * canBeNull && readOnly
	 */
	public String title;

	/**
	 * Constraint type
	 *
	 * canBeNull && readOnly
	 */
	public OvhStreamAlertConditionConstraintTypeEnum constraintType;

	/**
	 * Backlog size
	 *
	 * canBeNull && readOnly
	 */
	public Long backlog;

	/**
	 * Field name
	 *
	 * canBeNull && readOnly
	 */
	public String field;

	/**
	 * Grace period in minutes
	 *
	 * canBeNull && readOnly
	 */
	public Long grace;

	/**
	 * Alert condition type
	 *
	 * canBeNull && readOnly
	 */
	public OvhStreamAlertConditionConditionTypeEnum conditionType;

	/**
	 * Time lapse in minutes
	 *
	 * canBeNull && readOnly
	 */
	public Long time;

	/**
	 * Stream alert condition UUID
	 *
	 * canBeNull && readOnly
	 */
	public String alertId;

	/**
	 * Repeat notifications
	 *
	 * canBeNull && readOnly
	 */
	public Boolean repeatNotificationsEnabled;

	/**
	 * Field value
	 *
	 * canBeNull && readOnly
	 */
	public String value;

	/**
	 * Threshold condition
	 *
	 * canBeNull && readOnly
	 */
	public OvhStreamAlertConditionThresholdTypeEnum thresholdType;
}
