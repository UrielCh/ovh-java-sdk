package net.minidev.ovh.api.dbaas.logs;

/**
 * Alert condition
 */
public class OvhStreamAlertCondition {
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
	 * Threshold
	 *
	 * canBeNull && readOnly
	 */
	public Long threshold;

	/**
	 * Alert condition type
	 *
	 * canBeNull && readOnly
	 */
	public OvhStreamAlertConditionConditionTypeEnum conditionType;

	/**
	 * Stream alert condition UUID
	 *
	 * canBeNull && readOnly
	 */
	public String alertId;

	/**
	 * Time lapse in minutes
	 *
	 * canBeNull && readOnly
	 */
	public Long time;

	/**
	 * Condition label
	 *
	 * canBeNull && readOnly
	 */
	public String title;

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
