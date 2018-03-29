package net.minidev.ovh.api.xdsl;

import java.util.Date;
import net.minidev.ovh.api.xdsl.antispam.OvhAntiSpamStatusEnum;

/**
 * Spams detected from xdsl access
 */
public class OvhAntiSpam {
	/**
	 * Detection date
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * Last spam detection date
	 *
	 * canBeNull && readOnly
	 */
	public Date lastSpamDetected;

	/**
	 * IP which spam
	 *
	 * canBeNull && readOnly
	 */
	public String ip;

	/**
	 * AntiSpam status
	 *
	 * canBeNull && readOnly
	 */
	public OvhAntiSpamStatusEnum status;
}
