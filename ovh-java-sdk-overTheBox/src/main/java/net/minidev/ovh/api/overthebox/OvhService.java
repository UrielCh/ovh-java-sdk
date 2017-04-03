package net.minidev.ovh.api.overthebox;

/**
 * Service
 */
public class OvhService {
	/**
	 * Release channel of the service
	 *
	 * canBeNull && readOnly
	 */
	public String releaseChannel;

	/**
	 * Parameters needed to fetch metrics
	 *
	 * canBeNull && readOnly
	 */
	public OvhGraphEndpoint graphEndpoint;

	/**
	 * Editable field for customer
	 *
	 * canBeNull && readOnly
	 */
	public String customerDescription;

	/**
	 * The name of the service
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * The status of the service
	 *
	 * canBeNull && readOnly
	 */
	public OvhServiceStatusEnum status;
}
