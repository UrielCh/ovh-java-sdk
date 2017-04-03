package net.minidev.ovh.api.pack.xdsl;

/**
 * Describe the capabilities of this pack
 */
public class OvhPackCapabilities {
	/**
	 * Whether or not this pack can move address
	 *
	 * canBeNull
	 */
	public Boolean canMoveAddress;

	/**
	 * Whether or not this pack is from an old offer
	 *
	 * canBeNull
	 */
	public Boolean isLegacyOffer;
}
