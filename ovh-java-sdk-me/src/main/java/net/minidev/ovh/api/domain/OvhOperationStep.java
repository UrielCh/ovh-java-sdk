package net.minidev.ovh.api.domain;

/**
 * One step from an operation
 */
public class OvhOperationStep {
	/**
	 * Description of the step
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * Name of the step
	 *
	 * canBeNull
	 */
	public String step;

	/**
	 * Execution time of the step
	 *
	 * canBeNull
	 */
	public Long executionDuration;
}
