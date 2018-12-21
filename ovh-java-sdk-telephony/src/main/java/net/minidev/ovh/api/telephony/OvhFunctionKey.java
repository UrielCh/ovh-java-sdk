package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Plug & Phone function key
 */
public class OvhFunctionKey {
	/**
	 * The default function used by the key
	 *
	 * canBeNull && readOnly
	 */
	@JsonProperty("default")
	public String _default;

	/**
	 * The function parameter
	 *
	 * canBeNull && readOnly
	 */
	public String parameter;

	/**
	 * The function active on the key
	 *
	 * canBeNull && readOnly
	 */
	public String function;

	/**
	 * The number of the function key
	 *
	 * canBeNull && readOnly
	 */
	public Long keyNum;

	/**
	 * The key label
	 *
	 * canBeNull && readOnly
	 */
	public String label;

	/**
	 * The key type
	 *
	 * canBeNull && readOnly
	 */
	public String type;
}
