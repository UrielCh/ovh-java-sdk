package net.minidev.ovh.api.vps.automatedbackup;

import java.util.Date;
import net.minidev.ovh.api.vps.automatedbackup.attached.OvhInfos;

/**
 * A backup attached to your VPS
 */
public class OvhAttached {
	/**
	 * canBeNull
	 */
	public Date restorePoint;

	/**
	 * canBeNull
	 */
	public OvhInfos access;
}
