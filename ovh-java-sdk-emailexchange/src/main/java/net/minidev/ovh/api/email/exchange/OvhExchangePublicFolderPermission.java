package net.minidev.ovh.api.email.exchange;

import java.util.Date;

/**
 * Exchange organization public folder permission
 */
public class OvhExchangePublicFolderPermission {
	/**
	 * Account id
	 *
	 * canBeNull && readOnly
	 */
	public Long allowedAccountId;

	/**
	 * canBeNull && readOnly
	 */
	public OvhObjectStateEnum state;

	/**
	 * Access right set for the account
	 *
	 * canBeNull && readOnly
	 */
	public OvhPublicFolderRightTypeEnum accessRights;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * task pending id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;
}
