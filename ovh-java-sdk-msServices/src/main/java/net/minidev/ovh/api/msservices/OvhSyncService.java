package net.minidev.ovh.api.msservices;

/**
 * Sync service
 */
public class OvhSyncService {
	/**
	 * Exchange service state
	 *
	 * canBeNull && readOnly
	 */
	public OvhServiceStateEnum state;

	/**
	 * Task pending id
	 *
	 * canBeNull && readOnly
	 */
	public Long taskPendingId;
}
