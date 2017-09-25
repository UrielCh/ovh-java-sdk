package net.minidev.ovh.api.servicelist;

import java.util.Date;
import net.minidev.ovh.api.service.OvhBillingStateEnum;
import net.minidev.ovh.api.service.OvhPlan;
import net.minidev.ovh.api.service.OvhRenew;
import net.minidev.ovh.api.service.OvhResource;
import net.minidev.ovh.api.service.OvhRoute;

/**
 * Details about a Service
 */
public class OvhService {
	/**
	 * The next billing date
	 *
	 * canBeNull && readOnly
	 */
	public Date nextBillingDate;

	/**
	 * Quantity
	 *
	 * canBeNull && readOnly
	 */
	public Long quantity;

	/**
	 * Route to use in API
	 *
	 * canBeNull && readOnly
	 */
	public OvhRoute route;

	/**
	 * Engagement date
	 *
	 * canBeNull && readOnly
	 */
	public Date engagementDate;

	/**
	 * Resource service description
	 *
	 * canBeNull && readOnly
	 */
	public OvhResource resource;

	/**
	 * Billing state of your service
	 *
	 * canBeNull && readOnly
	 */
	public OvhBillingStateEnum state;

	/**
	 * Renew service description
	 *
	 * canBeNull && readOnly
	 */
	public OvhRenew renew;

	/**
	 * Creation date
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDate;

	/**
	 * Plan service description
	 *
	 * canBeNull && readOnly
	 */
	public OvhPlan plan;

	/**
	 * Expiration date
	 *
	 * canBeNull && readOnly
	 */
	public Date expirationDate;
}
