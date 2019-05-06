package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Exchange organization public folder
 */
public class OvhPublicFolder {
	/**
	 * Time for which public folder was accessed for the last time
	 *
	 * canBeNull && readOnly
	 */
	public Date lastAccessTime;

	/**
	 * Time for which public folder was modified for the last time
	 *
	 * canBeNull && readOnly
	 */
	public Date lastModificationTime;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Type for public folder
	 *
	 * canBeNull && readOnly
	 */
	public OvhPublicFolderTypeEnum type;

	/**
	 * task pending id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;

	/**
	 * Number of items in public folder
	 *
	 * canBeNull && readOnly
	 */
	public Long itemCount;

	/**
	 * If true, this public folder has subfolders
	 *
	 * canBeNull && readOnly
	 */
	public Boolean hasSubFolders;

	/**
	 * Path for public folder
	 *
	 * canBeNull && readOnly
	 */
	public String path;

	/**
	 * Access right for the guest users
	 *
	 * canBeNull && readOnly
	 */
	public OvhPublicFolderRightTypeEnum anonymousPermission;

	/**
	 * Quota for public folder in MB
	 *
	 * canBeNull && readOnly
	 */
	public Long quota;

	/**
	 * Time for which public folder was modified for the last time by the user
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUserModificationTime;

	/**
	 * Default access right
	 *
	 * canBeNull && readOnly
	 */
	public OvhPublicFolderRightTypeEnum defaultPermission;

	/**
	 * Sum of all items in public folder in MB
	 *
	 * canBeNull && readOnly
	 */
	public Long totalItemSize;

	/**
	 * Time for which public folder was accessed for the last time by the user
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUserAccessTime;

	/**
	 * canBeNull && readOnly
	 */
	public OvhObjectStateEnum state;
}
