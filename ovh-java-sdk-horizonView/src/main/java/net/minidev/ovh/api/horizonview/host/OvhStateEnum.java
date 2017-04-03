package net.minidev.ovh.api.horizonview.host;

/**
 * All states a Private Cloud Host can be in
 */
public enum OvhStateEnum {
	adding("adding"),
	delivered("delivered"),
	error("error"),
	removing("removing"),
	unknown("unknown");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
