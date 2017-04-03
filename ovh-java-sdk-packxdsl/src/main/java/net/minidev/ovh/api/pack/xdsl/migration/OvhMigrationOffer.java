package net.minidev.ovh.api.pack.xdsl.migration;

import net.minidev.ovh.api.order.OvhContract;
import net.minidev.ovh.api.order.OvhPrice;

/**
 * Migration offer
 */
public class OvhMigrationOffer {
	/**
	 * Name of the offer
	 *
	 * canBeNull
	 */
	public String offerName;

	/**
	 * Mac address of the modem to be returned
	 *
	 * canBeNull
	 */
	public String modemMacToReturn;

	/**
	 * Description of the offer
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * List of contracts for this offer
	 *
	 * canBeNull
	 */
	public OvhContract[] contracts;

	/**
	 * Number of months of engagement
	 *
	 * canBeNull
	 */
	public Long engageMonths;

	/**
	 * List of sub services to delete
	 *
	 * canBeNull
	 */
	public OvhSubServiceToDelete[] subServicesToDelete;

	/**
	 * URL of the offer
	 *
	 * canBeNull
	 */
	public String url;

	/**
	 * Price to make the migration
	 *
	 * canBeNull
	 */
	public OvhPrice due;

	/**
	 * Price of the offer
	 *
	 * canBeNull
	 */
	public OvhPrice price;

	/**
	 * DEPRECATED - List of contracts
	 *
	 * canBeNull
	 */
	public String[] contractList;

	/**
	 * Tells if the customer will have to change its modem
	 *
	 * canBeNull
	 */
	public Boolean needNewModem;

	/**
	 * Available options for the migration
	 *
	 * canBeNull
	 */
	public OvhOfferAvailableOption[] options;

	/**
	 * Price of the current offer
	 *
	 * canBeNull
	 */
	public OvhPrice currentOfferPrice;

	/**
	 * Tells if the offer needs a modem
	 *
	 * canBeNull
	 */
	public Boolean needModem;
}
