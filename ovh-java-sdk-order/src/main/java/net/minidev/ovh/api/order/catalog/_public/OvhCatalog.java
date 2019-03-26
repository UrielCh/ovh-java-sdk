package net.minidev.ovh.api.order.catalog._public;

import net.minidev.ovh.api.order.catalog._public.OvhLocale;
import net.minidev.ovh.api.order.catalog._public.OvhPlan;
import net.minidev.ovh.api.order.catalog._public.OvhPlanFamily;
import net.minidev.ovh.api.order.catalog._public.OvhProduct;

/**
 * Describes a Catalog inside a Subsidiary
 */
public class OvhCatalog {
	/**
	 * Identifier of the catalog
	 *
	 * canBeNull && readOnly
	 */
	public Long catalogId;

	/**
	 * List of plan families of the catalog
	 *
	 * canBeNull && readOnly
	 */
	public OvhPlanFamily[] planFamilies;

	/**
	 * List of addons of the catalog
	 *
	 * canBeNull && readOnly
	 */
	public OvhPlan[] addons;

	/**
	 * List of main plans of the catalog
	 *
	 * canBeNull && readOnly
	 */
	public OvhPlan[] plans;

	/**
	 * Subsidiary specific information
	 *
	 * canBeNull && readOnly
	 */
	public OvhLocale locale;

	/**
	 * List of products of the catalog
	 *
	 * canBeNull && readOnly
	 */
	public OvhProduct[] products;
}
