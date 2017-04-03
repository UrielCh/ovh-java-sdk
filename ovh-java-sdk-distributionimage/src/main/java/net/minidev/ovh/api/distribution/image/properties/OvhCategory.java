package net.minidev.ovh.api.distribution.image.properties;

/**
 * category
 */
public enum OvhCategory {
	none("none"),
	bare("bare"),
	panel("panel"),
	cms("cms"),
	development("development"),
	desktop("desktop");

	final String value;

	OvhCategory(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
