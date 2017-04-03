package net.minidev.ovh.api.telephony;

/**
 * Custom statuses of your callcenter agents
 */
public class OvhOvhPabxCustomStatus {
	/**
	 * The color (in hexadecimal) of the status that will be displayed on agent banner web application
	 *
	 * canBeNull && readOnly
	 */
	public String color;

	/**
	 * The name of the status (Pause, Mission, etc...)
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * A short description of the status
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;
}
