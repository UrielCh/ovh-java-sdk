package net.minidev.ovh.api.registry;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A container image
 */
public class OvhInputImage {
	/**
	 * image is public
	 *
	 * canBeNull && readOnly
	 */
	@JsonProperty("public")
	public Boolean _public;
}
