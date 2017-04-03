package net.minidev.ovh.api.vrack;

/**
 * interface between legacy vrack (vrackXXXX) and vrack (pn-XXXX)
 */
public class OvhLegacyVrack {
	/**
	 * your legacy vrack service
	 *
	 * canBeNull && readOnly
	 */
	public String legacyVrack;

	/**
	 * vlan to set on legacy vrack equipments
	 *
	 * canBeNull && readOnly
	 */
	public Long vlanId;
}
