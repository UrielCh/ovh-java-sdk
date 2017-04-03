package net.minidev.ovh.api.services;

import java.util.Date;
import net.minidev.ovh.api.service.OvhStateEnum;

/**
 * Details about a non-expiring Service
 */
public class OvhNonExpiringService {
	/**
	 * canBeNull && readOnly
	 */
	public String contactBilling;

	/**
	 * canBeNull && readOnly
	 */
	public String contactAdmin;

	/**
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * canBeNull && readOnly
	 */
	public String contactTech;

	/**
	 * canBeNull && readOnly
	 */
	public Date creation;

	/**
	 * canBeNull && readOnly
	 */
	public OvhStateEnum status;
}
