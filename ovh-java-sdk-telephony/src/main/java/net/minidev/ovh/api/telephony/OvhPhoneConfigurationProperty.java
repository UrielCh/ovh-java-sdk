package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.minidev.ovh.api.complextype.OvhRange;

/**
 * Phone configuration property
 */
public class OvhPhoneConfigurationProperty {
	/**
	 * Default property value
	 *
	 * canBeNull
	 */
	@JsonProperty("default")
	public String _default;

	/**
	 * Max string chars
	 *
	 * canBeNull
	 */
	public Long maxlength;

	/**
	 * Provisioning level
	 *
	 * canBeNull
	 */
	public OvhPhoneConfigurationLevelEnum level;

	/**
	 * The property name
	 *
	 * canBeNull
	 */
	public String name;

	/**
	 * Property description
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * Provisioning type
	 *
	 * canBeNull
	 */
	public OvhPhoneConfigurationTypeEnum type;

	/**
	 * Range property value
	 *
	 * canBeNull
	 */
	public OvhRange<Long> rangeValue;

	/**
	 * Current property value
	 *
	 * canBeNull
	 */
	public String value;

	/**
	 * Property value possibilities
	 *
	 * canBeNull
	 */
	@JsonProperty("enum")
	public String[] _enum;

	/**
	 * The property group
	 *
	 * canBeNull
	 */
	public String group;
}
