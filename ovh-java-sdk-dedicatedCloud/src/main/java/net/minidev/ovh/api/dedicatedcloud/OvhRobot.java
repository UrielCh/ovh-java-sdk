package net.minidev.ovh.api.dedicatedcloud;

/**
 * The robots used in Private Cloud
 */
public class OvhRobot {
	/**
	 * The name of this robot
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * The criticity of this robot
	 *
	 * canBeNull && readOnly
	 */
	public String criticity;

	/**
	 * Description of this robot
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * The type of this robot
	 *
	 * canBeNull && readOnly
	 */
	public String type;

	/**
	 * Is this robot enabled
	 *
	 * canBeNull && readOnly
	 */
	public Boolean enabled;
}
