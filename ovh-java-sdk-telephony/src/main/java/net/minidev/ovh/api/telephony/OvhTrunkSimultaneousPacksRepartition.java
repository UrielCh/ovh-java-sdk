package net.minidev.ovh.api.telephony;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Repartition of simultaneous channels packs for a trunk
 */
public class OvhTrunkSimultaneousPacksRepartition {
	/**
	 * The optimized quantity of channels to order
	 *
	 * canBeNull
	 */
	public Long optimizedChannelsQuantity;

	/**
	 * The repartition of the packs
	 *
	 * canBeNull
	 */
	public OvhTrunkSimultaneousPack[] packsRepartition;

	/**
	 * The total price of the channels packs combination
	 *
	 * canBeNull
	 */
	public OvhPrice totalPrice;
}
