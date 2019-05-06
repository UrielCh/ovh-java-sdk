package net.minidev.ovh.api.dedicatedcloud;

/**
 * A structure describing the current password policy for your Dedicated Cloud
 */
public class OvhPasswordPolicy {
	/**
	 * Password validity period (in days)
	 *
	 * canBeNull
	 */
	public Long validityPeriod;

	/**
	 * Whether or not an uppercase letter (A-Z) is mandatory in the password
	 *
	 * canBeNull
	 */
	public Boolean uppercaseLetterMandatory;

	/**
	 * Minimum lenght of the password
	 *
	 * canBeNull
	 */
	public Long minLength;

	/**
	 * Whether or not a letter (a-z or A-Z) is mandatory in the password
	 *
	 * canBeNull
	 */
	public Boolean letterMandatory;

	/**
	 * Whether or not a special character (\W or _) is mandatory in the password
	 *
	 * canBeNull
	 */
	public Boolean specialMandatory;

	/**
	 * Number of previous passwords to keep
	 *
	 * canBeNull
	 */
	public Long historyCheck;

	/**
	 * Whether or not a digit (0-9) is mandatory in the password
	 *
	 * canBeNull
	 */
	public Boolean digitMandatory;

	/**
	 * Whether or not a lowercase letter (a-z) is mandatory in the password
	 *
	 * canBeNull
	 */
	public Boolean lowercaseLetterMandatory;

	/**
	 * Maximum lenght of the password
	 *
	 * canBeNull
	 */
	public Long maxLength;

	/**
	 * List of denied characters in the password
	 *
	 * canBeNull
	 */
	public String[] deniedChars;
}
