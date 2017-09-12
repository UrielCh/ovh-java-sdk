package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing informations about server expansion cards
 */
public class OvhHardwareSpecificationsExpansionCard {
	/**
	 * expansion card description
	 *
	 * canBeNull
	 */
	public String description;

	/**
	 * expansion card type
	 *
	 * canBeNull
	 */
	public OvhHardwareSpecificationsExpansionCardTypeEnum type;
}
