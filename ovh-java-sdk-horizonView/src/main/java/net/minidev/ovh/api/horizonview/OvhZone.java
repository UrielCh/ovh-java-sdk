package net.minidev.ovh.api.horizonview;

/**
 * All zones a Cloud Desktop Infrastructure can be in
 */
public enum OvhZone {
	Beauharnois("Beauharnois"),
	Roubaix("Roubaix"),
	Strasbourg("Strasbourg");

	final String value;

	OvhZone(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
