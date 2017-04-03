package net.minidev.ovh.api.hosting.web;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;
import net.minidev.ovh.api.hosting.web.database.OvhCreationDatabaseCapabilities;

/**
 * Struct which describs an offer
 */
public class OvhCapabilities {
	/**
	 * Describe all email offer you can have
	 *
	 * canBeNull
	 */
	public OvhCreationEmailCapabilities emails;

	/**
	 * Describe all databases type you can have
	 *
	 * canBeNull
	 */
	public OvhCreationDatabaseCapabilities[] databases;

	/**
	 * Disk capacity available for your hosting ( null for unlimited )
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Double> disk;

	/**
	 * Tell if you have acces to module on click
	 *
	 * canBeNull
	 */
	public Boolean moduleOneClick;

	/**
	 * Tell if you have acces to crontab
	 *
	 * canBeNull
	 */
	public Boolean crontab;

	/**
	 * Number of domains you can attach to your hosting
	 *
	 * canBeNull
	 */
	public Long attachedDomains;

	/**
	 * Tell if you have acces to ssh
	 *
	 * canBeNull
	 */
	public Boolean ssh;

	/**
	 * Describe all privateDatabases type you can have
	 *
	 * canBeNull
	 */
	public OvhCreationDatabaseCapabilities[] privateDatabases;

	/**
	 * Number of ftp user you can create
	 *
	 * canBeNull
	 */
	public Long extraUsers;

	/**
	 * Number of sites recommended for your hosting ( -1 for unlimited )
	 *
	 * canBeNull
	 */
	public Long sitesRecommended;

	/**
	 * Traffic quota size for your hosting ( null for unlimited )
	 *
	 * canBeNull
	 */
	public OvhUnitAndValue<Double> traffic;
}
