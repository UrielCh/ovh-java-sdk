package net.minidev.ovh.api.kube;

/**
 * Public Cloud project linked to a Kube cluster
 */
public class OvhPublicCloudProject {
	/**
	 * Public Cloud region associated with your cluster
	 *
	 * canBeNull && readOnly
	 */
	public String region;

	/**
	 * Public Cloud project ID
	 *
	 * canBeNull && readOnly
	 */
	public String projectId;
}
