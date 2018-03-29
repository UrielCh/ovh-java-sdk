package net.minidev.ovh.api.xdsl.antispam;

/**
 * List of evidences
 */
public class OvhEvidencesInfo {
	/**
	 * Table with evidences stored on PCS
	 *
	 * canBeNull
	 */
	public OvhEvidencesInfoDetail[] result;

	/**
	 * AsyncTask detailed error
	 *
	 * canBeNull
	 */
	public String error;

	/**
	 * AsyncTask status
	 *
	 * canBeNull
	 */
	public OvhEvidencesInfoStatusEnum status;
}
