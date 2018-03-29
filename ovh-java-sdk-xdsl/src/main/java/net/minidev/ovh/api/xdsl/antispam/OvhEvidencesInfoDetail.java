package net.minidev.ovh.api.xdsl.antispam;

import java.util.Date;

/**
 * detail on evidences stored on PCS
 */
public class OvhEvidencesInfoDetail {
	/**
	 * File date on the PCS
	 *
	 * canBeNull
	 */
	public Date date;

	/**
	 * File name on the PCS
	 *
	 * canBeNull
	 */
	public String filename;

	/**
	 * Temporary URL to access file
	 *
	 * canBeNull
	 */
	public String url;
}
