package net.minidev.ovh.api.license;

/**
 * Possible values for license type
 */
public enum OvhLicenseTypeEnum {
	dedicated("dedicated"),
	dedicatedCloud("dedicatedCloud"),
	dedicatedFailover("dedicatedFailover"),
	failover("failover"),
	vm("vm"),
	vps("vps"),
	vps_ceph("vps_ceph"),
	vps_classic("vps_classic"),
	vps_cloud("vps_cloud"),
	vps_cloud_2016("vps_cloud_2016"),
	vps_ssd("vps_ssd");

	final String value;

	OvhLicenseTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
