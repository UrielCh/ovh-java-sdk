package net.minidev.ovh.api.dbaas.logs;

import java.util.Date;

/**
 * Stream archive
 */
public class OvhArchive {
	/**
	 * Create date
	 *
	 * canBeNull && readOnly
	 */
	public Date createdAt;

	/**
	 * Filename
	 *
	 * canBeNull && readOnly
	 */
	public String filename;

	/**
	 * File size in bytes
	 *
	 * canBeNull && readOnly
	 */
	public Long size;

	/**
	 * Retrieval delay
	 *
	 * canBeNull && readOnly
	 */
	public Long retrievalDelay;

	/**
	 * sha256 checksum
	 *
	 * canBeNull && readOnly
	 */
	public String sha256;

	/**
	 * Retrieval state
	 *
	 * canBeNull && readOnly
	 */
	public OvhArchiveRetrievalStateEnum retrievalState;

	/**
	 * Archive UUID
	 *
	 * canBeNull && readOnly
	 */
	public String archiveId;

	/**
	 * MD5 checksum
	 *
	 * canBeNull && readOnly
	 */
	public String md5;
}
