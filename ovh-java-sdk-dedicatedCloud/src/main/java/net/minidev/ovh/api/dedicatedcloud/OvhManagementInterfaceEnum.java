package net.minidev.ovh.api.dedicatedcloud;

/**
 * The management interface of this Dedicated Cloud
 */
public enum OvhManagementInterfaceEnum {
	azure("azure"),
	openstack("openstack"),
	systemcenter("systemcenter"),
	vcloud("vcloud"),
	vcsa("vcsa"),
	vsphere("vsphere");

	final String value;

	OvhManagementInterfaceEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
