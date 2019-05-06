package net.minidev.ovh.api.registry;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import net.minidev.ovh.api.registry.image.OvhStatus;

/**
 * An image stored in a namespace
 */
public class OvhImage {
	/**
	 * Date of the resource creation
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * Whether is image is public or private
	 *
	 * canBeNull && readOnly
	 */
	@JsonProperty("public")
	public Boolean _public;

	/**
	 * The image name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * The image id
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Date of the resource last update
	 *
	 * canBeNull && readOnly
	 */
	public Date updatedAt;

	/**
	 * The status of the image
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus status;
}
