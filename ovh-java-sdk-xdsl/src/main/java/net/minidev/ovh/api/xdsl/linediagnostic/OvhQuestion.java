package net.minidev.ovh.api.xdsl.linediagnostic;

/**
 * Question to customer
 */
public class OvhQuestion {
	/**
	 * list of possible values
	 *
	 * canBeNull
	 */
	public OvhPossibleValue[] possibleValues;

	/**
	 * question description
	 *
	 * canBeNull
	 */
	public String defaultValue;

	/**
	 * question name
	 *
	 * canBeNull
	 */
	public OvhQuestionsEnum name;

	/**
	 * question description
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * answer type
	 *
	 * canBeNull
	 */
	public String type;

	/**
	 * is a required question
	 *
	 * canBeNull
	 */
	public Boolean required;

	/**
	 * available values for enum
	 *
	 * canBeNull
	 */
	public String[] enumValues;
}
