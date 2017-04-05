package net.minidev.ovh.api.partner;

/**
 * Possible options for outsourcing and maintenance expertises
 */
public class OvhExpertisesChoicesOutsourcingAndMaintenance {
	/**
	 * Outsourcing
	 *
	 * canBeNull && readOnly
	 */
	public Boolean outsourcing;

	/**
	 * Computer support
	 *
	 * canBeNull && readOnly
	 */
	public Boolean cmputerSupport;

	/**
	 * Maintenance of network equipment / servers
	 *
	 * canBeNull && readOnly
	 */
	public Boolean maintenanceOfNetworkEquipment;
}
