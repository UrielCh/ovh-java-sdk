package net.minidev.ovh.api.telephony;

/**
 * Task about getting entreprise informations
 */
public class OvhEntrepriseNumberInformationsTask {
	/**
	 * Task status
	 *
	 * canBeNull
	 */
	public OvhTaskStatusEnum status;

	/**
	 * Informations about the enterprise
	 *
	 * canBeNull
	 */
	public OvhEntrepriseNumberInformations informations;
}
