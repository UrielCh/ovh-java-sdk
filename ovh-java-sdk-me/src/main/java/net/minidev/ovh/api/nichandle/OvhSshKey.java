package net.minidev.ovh.api.nichandle;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Customer public SSH key, can be used for rescue netboot or server access after reinstallation
 */
public class OvhSshKey {
	/**
	 * True when this public SSH key is used for rescue mode and reinstallations
	 *
	 * canBeNull && readOnly
	 */
	@JsonProperty("default")
	public Boolean _default;

	/**
	 * Name of this public SSH key
	 *
	 * canBeNull && readOnly
	 */
	public String keyName;

	/**
	 * ASCII encoded public SSH key
	 *
	 * canBeNull && readOnly
	 */
	public String key;
}
