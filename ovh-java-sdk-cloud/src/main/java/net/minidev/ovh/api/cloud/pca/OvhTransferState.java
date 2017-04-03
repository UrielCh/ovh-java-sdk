package net.minidev.ovh.api.cloud.pca;

import java.util.Date;

/**
 * State of the request to transfer a PCA offer to Object Storage
 */
public class OvhTransferState {
	/**
	 * Agreements pending for approval
	 *
	 * canBeNull
	 */
	public Long[] agreements;

	/**
	 * Transfer state
	 *
	 * canBeNull
	 */
	public OvhTransferStateEnum state;

	/**
	 * Transfer request date
	 *
	 * canBeNull
	 */
	public Date transferDate;

	/**
	 * Cloud project id
	 *
	 * canBeNull
	 */
	public String projectId;
}
