package net.minidev.ovh.api.telephony;

import net.minidev.ovh.api.telephony.portability.OvhSpecialNumberCategoryEnum;

/**
 * French value added services subject to the RSVA reform (Référentiel des numéros SVA)
 */
public class OvhRsva {
	/**
	 * canBeNull && readOnly
	 */
	public OvhSpecialNumberCategoryEnum typology;

	/**
	 * canBeNull && readOnly
	 */
	public String serviceName;
}
