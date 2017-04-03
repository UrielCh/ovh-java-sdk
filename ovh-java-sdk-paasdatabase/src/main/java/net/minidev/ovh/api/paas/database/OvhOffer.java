package net.minidev.ovh.api.paas.database;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;
import net.minidev.ovh.api.paas.database.offer.OvhStatus;

/**
 * Offers
 */
public class OvhOffer {
	/**
	 * Offer disk informations
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Double> diskSize;

	/**
	 * Offer name
	 *
	 * canBeNull && readOnly
	 */
	public String offerName;

	/**
	 * Offer RAM informations
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Double> ramSize;

	/**
	 * Offer status
	 *
	 * canBeNull && readOnly
	 */
	public OvhStatus status;
}
