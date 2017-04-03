package net.minidev.ovh.api.imapcopy;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/**
 * Task of ImapCopy
 */
public class OvhTask {
	/**
	 * Last update of task
	 *
	 * canBeNull
	 */
	public Date lastUpdate;

	/**
	 * Creation date of task
	 *
	 * canBeNull
	 */
	public Date todoDate;

	/**
	 * Finished date of task
	 *
	 * canBeNull
	 */
	public Date finishDate;

	/**
	 * Id of task
	 *
	 * canBeNull
	 */
	public Long id;

	/**
	 * Return message of task
	 *
	 * canBeNull
	 */
	@JsonProperty("return")
	public String _return;

	/**
	 * Status of task
	 *
	 * canBeNull
	 */
	public String status;
}
