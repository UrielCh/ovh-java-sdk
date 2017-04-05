package net.minidev.ovh.api.partner;

/**
 * Possible choices for partnerKnowledges
 */
public class OvhPartnerKnowledges {
	/**
	 * Forum
	 *
	 * canBeNull && readOnly
	 */
	public Boolean forum;

	/**
	 * OVH website
	 *
	 * canBeNull && readOnly
	 */
	public Boolean website;

	/**
	 * Other (specify)
	 *
	 * canBeNull && readOnly
	 */
	public String other;

	/**
	 * Search engine
	 *
	 * canBeNull && readOnly
	 */
	public Boolean searchEngine;

	/**
	 * Media
	 *
	 * canBeNull && readOnly
	 */
	public Boolean media;

	/**
	 * Social Networks
	 *
	 * canBeNull && readOnly
	 */
	public Boolean socialNetwork;

	/**
	 * Events
	 *
	 * canBeNull && readOnly
	 */
	public Boolean events;
}
