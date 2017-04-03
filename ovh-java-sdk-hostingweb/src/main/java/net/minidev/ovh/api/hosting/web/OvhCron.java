package net.minidev.ovh.api.hosting.web;

import net.minidev.ovh.api.hosting.web.cron.OvhLanguageEnum;
import net.minidev.ovh.api.hosting.web.cron.OvhStatusEnum;

/**
 * Hosting crons
 */
public class OvhCron {
	/**
	 * Description field for you
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * Cron language
	 *
	 * canBeNull && readOnly
	 */
	public OvhLanguageEnum language;

	/**
	 * Cron's id
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Email used to receive error log ( stderr )
	 *
	 * canBeNull && readOnly
	 */
	public String email;

	/**
	 * Command to execute
	 *
	 * canBeNull && readOnly
	 */
	public String command;

	/**
	 * Frequency ( crontab format ) defined for the script ( minutes are ignored )
	 *
	 * canBeNull && readOnly
	 */
	public String frequency;

	/**
	 * Cron status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatusEnum status;
}
