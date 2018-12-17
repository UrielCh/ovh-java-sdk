package net.minidev.ovh.api.servicelist;

import java.util.Date;
import net.minidev.ovh.api.complextype.OvhSafeKeyValue;
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
	 * Route to use in API
	 *
	 * canBeNull && readOnly
	 */
	public OvhRoute route;

	/**
	 * Quantity
	 *
	 * canBeNull && readOnly
	 */
	public Long quantity;

	/**
	 * Resource service description
	 *
	 * canBeNull && readOnly
	 */
	public OvhResource resource;

	/**
	 * Engagement date
	 *
	 * canBeNull && readOnly
	 */
	public Date engagementDate;

	/**
	 * Resource details
	 *
	 * canBeNull && readOnly
	 */
	public OvhSafeKeyValue<String>[] details;

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
