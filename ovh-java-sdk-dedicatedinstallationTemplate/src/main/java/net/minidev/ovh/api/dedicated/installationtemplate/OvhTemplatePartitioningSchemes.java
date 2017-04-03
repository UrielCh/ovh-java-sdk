package net.minidev.ovh.api.dedicated.installationtemplate;

/**
 * Partitioning schemes available on this template
 */
public class OvhTemplatePartitioningSchemes {
	/**
	 * name of this partitioning scheme
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * on a reinstall, if a partitioning scheme is not specified, the one with the higher priority will be used by default, among all the compatible partitioning schemes (given the underlying hardware specifications)
	 *
	 * canBeNull && readOnly
	 */
	public Long priority;
}
