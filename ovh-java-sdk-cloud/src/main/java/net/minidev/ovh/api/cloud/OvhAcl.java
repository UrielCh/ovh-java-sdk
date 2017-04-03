package net.minidev.ovh.api.cloud;

/**
 * Cloud ACL
 */
public class OvhAcl {
	/**
	 * OVH customer unique identifier
	 *
	 * canBeNull && readOnly
	 */
	public String accountId;

	/**
	 * ACL type
	 *
	 * canBeNull && readOnly
	 */
	public OvhAclTypeEnum type;
}
