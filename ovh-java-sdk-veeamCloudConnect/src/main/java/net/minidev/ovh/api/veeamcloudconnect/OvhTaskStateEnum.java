package net.minidev.ovh.api.veeamcloudconnect;

/**
 * All states a Cloud Tenant Task can be in
 */
public enum OvhTaskStateEnum {
	canceled("canceled"),
	doing("doing"),
	done("done"),
	error("error"),
	fixing("fixing"),
	problem("problem"),
	toCreate("toCreate"),
	todo("todo"),
	unknown("unknown"),
	waitingTodo("waitingTodo");

	final String value;

	OvhTaskStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
