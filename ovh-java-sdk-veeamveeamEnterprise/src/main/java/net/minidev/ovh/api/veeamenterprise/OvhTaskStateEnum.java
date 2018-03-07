package net.minidev.ovh.api.veeamenterprise;

/**
 * All possible states for a Veeam Enterprise Task
 */
public enum OvhTaskStateEnum {
	canceled("canceled"),
	doing("doing"),
	done("done"),
	error("error"),
	toCreate("toCreate"),
	todo("todo"),
	unfixed("unfixed"),
	waiting("waiting"),
	waitingForChilds("waitingForChilds");

	final String value;

	OvhTaskStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
