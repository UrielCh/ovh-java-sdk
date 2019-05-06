package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for PermissionIndexPermissionTypeEnum
 */
public enum OvhPermissionIndexPermissionTypeEnum {
	READ_ONLY("READ_ONLY"),
	READ_WRITE("READ_WRITE");

	final String value;

	OvhPermissionIndexPermissionTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
