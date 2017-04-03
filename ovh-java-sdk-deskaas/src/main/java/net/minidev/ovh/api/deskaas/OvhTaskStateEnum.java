package net.minidev.ovh.api.deskaas;

/**
 * All states a Desktop As A Service Task can be in
 */
public enum OvhTaskStateEnum {
	canceled("canceled"),
	doing("doing"),
	done("done"),
	error("error"),
	fixing("fixing"),
	toCancel("toCancel"),
	toCreate("toCreate"),
	todo("todo"),
	unknown("unknown"),
	waitingForChilds("waitingForChilds"),
	waitingTodo("waitingTodo");

	final String value;

	OvhTaskStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
