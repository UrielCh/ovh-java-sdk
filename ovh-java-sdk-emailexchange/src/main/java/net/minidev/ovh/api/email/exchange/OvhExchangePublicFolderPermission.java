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
	 * Access right set for the account
	 *
	 * canBeNull && readOnly
	 */
	public OvhPublicFolderRightTypeEnum accessRights;

	/**
	 * canBeNull && readOnly
	 */
	public OvhObjectStateEnum state;

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
