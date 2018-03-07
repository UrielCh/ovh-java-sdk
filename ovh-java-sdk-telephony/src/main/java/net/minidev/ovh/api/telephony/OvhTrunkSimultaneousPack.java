package net.minidev.ovh.api.telephony;

import net.minidev.ovh.api.order.OvhPrice;

/**
 * Details for a channels pack
 */
public class OvhTrunkSimultaneousPack {
	/**
	 * The unit price of the channels pack
	 *
	 * canBeNull
	 */
	public OvhPrice unitPrice;

	/**
	 * The quantity of packs present in the combination
	 *
	 * canBeNull
	 */
	public Long quantity;

	/**
	 * The number of channels included in the pack
	 *
	 * canBeNull
	 */
	public Long channels;
}
