package net.minidev.ovh.api.xdsl.linediagnostic;

import java.util.Date;

/**
 * Diagnostic data and informations
 */
public class OvhDiagnosticData {
	/**
	 * Informations about line
	 *
	 * canBeNull
	 */
	public OvhLineDetails lineDetails;

	/**
	 * Previous customer answers
	 *
	 * canBeNull
	 */
	public OvhAnswers answers;

	/**
	 * End of diagnostic date. Will be null until problem totally identified
	 *
	 * canBeNull
	 */
	public Date diagnosticDoneDate;

	/**
	 * Current or last robot action
	 *
	 * canBeNull
	 */
	public OvhRobotActionsEnum robotAction;

	/**
	 * Error message
	 *
	 * canBeNull
	 */
	public String error;

	/**
	 * Diagnostic creation date
	 *
	 * canBeNull
	 */
	public Date creationDate;

	/**
	 * Diagnostic timeout in minutes. Any action restart timeout
	 *
	 * canBeNull
	 */
	public Long timeout;

	/**
	 * List of questions that must be answered by customer
	 *
	 * canBeNull
	 */
	public OvhQuestion[] toAnswer;

	/**
	 * List of actions that must be done by customer
	 *
	 * canBeNull
	 */
	public OvhCustomerActionToDo[] actionsToDo;

	/**
	 * List of actions already done by customer
	 *
	 * canBeNull
	 */
	public OvhCustomerActionsEnum[] actionsDone;

	/**
	 * Last diagnostic update date
	 *
	 * canBeNull
	 */
	public Date lastUpdate;

	/**
	 * Diagnostic comment. Can be update during any diagnostic step
	 *
	 * canBeNull
	 */
	public String comment;

	/**
	 * SELT test result
	 *
	 * canBeNull
	 */
	public OvhSeltResult seltTest;
}
