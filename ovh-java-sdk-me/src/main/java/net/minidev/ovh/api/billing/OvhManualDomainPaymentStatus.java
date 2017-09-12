package net.minidev.ovh.api.billing;

/**
 * Status of your manual domain payment migration
 */
public class OvhManualDomainPaymentStatus {
	/**
	 * Total number of domains that needs to be migrated to manual renew mode
	 *
	 * canBeNull
	 */
	public Long domainsToMigrate;

	/**
	 * Total number of domains successfully migrated to manual renew mode
	 *
	 * canBeNull
	 */
	public Long migratedDomains;

	/**
	 * canBeNull
	 */
	public OvhBillingTaskStatusEnum status;
}
