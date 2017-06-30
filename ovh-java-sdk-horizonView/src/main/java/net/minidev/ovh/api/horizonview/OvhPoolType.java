package net.minidev.ovh.api.horizonview;

/**
 * Pool type the customer can deploy
 */
public enum OvhPoolType {
	privatePool("privatePool"),
	publicPool("publicPool");

	final String value;

	OvhPoolType(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
