package net.minidev.ovh.api.dedicatedcloud;

/**
 * A structure describing filers of a the virtual machine
 */
public class OvhVmFiler {
	/**
	 * canBeNull
	 */
	public Double committed;

	/**
	 * canBeNull
	 */
	public OvhVmFilerDisk[] disks;

	/**
	 * canBeNull
	 */
	public String name;
}
