package net.minidev.ovh.api.dedicated.nasha;

import net.minidev.ovh.api.dedicated.storage.OvhAclTypeEnum;

/**
 * Define Acl for partition
 */
public class OvhAccess {
	/**
	 * the id of the access
	 *
	 * canBeNull && readOnly
	 */
	public Long accessId;

	/**
	 * the ip in root on storage
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * ACL type
	 *
	 * canBeNull && readOnly
	 */
	public OvhAclTypeEnum type;
}
