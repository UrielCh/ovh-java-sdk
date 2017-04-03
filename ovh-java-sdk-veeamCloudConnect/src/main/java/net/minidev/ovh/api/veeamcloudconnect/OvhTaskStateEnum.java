package net.minidev.ovh.api.veeamcloudconnect;

/**
 * All states a Cloud Tenant Task can be in
 */
public enum OvhTaskStateEnum {
	doing("doing"),
	done("done"),
	error("error"),
	problem("problem"),
	todo("todo");

	final String value;

	OvhTaskStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
