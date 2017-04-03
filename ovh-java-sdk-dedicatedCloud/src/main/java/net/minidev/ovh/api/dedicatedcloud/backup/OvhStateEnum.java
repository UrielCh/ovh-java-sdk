package net.minidev.ovh.api.dedicatedcloud.backup;

/**
 * All the state of the backup
 */
public enum OvhStateEnum {
	deleting("deleting"),
	delivered("delivered"),
	disabled("disabled"),
	disabling("disabling"),
	enabling("enabling"),
	error("error"),
	migrating("migrating"),
	pending("pending"),
	removed("removed"),
	stopping("stopping"),
	toCreate("toCreate"),
	toDelete("toDelete"),
	toDisable("toDisable"),
	toEnable("toEnable"),
	toStop("toStop"),
	unknown("unknown");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
