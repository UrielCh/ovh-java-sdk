package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for PermissionDashboardPermissionTypeEnum
 */
public enum OvhPermissionDashboardPermissionTypeEnum {
	READ_ONLY("READ_ONLY"),
	READ_WRITE("READ_WRITE");

	final String value;

	OvhPermissionDashboardPermissionTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
