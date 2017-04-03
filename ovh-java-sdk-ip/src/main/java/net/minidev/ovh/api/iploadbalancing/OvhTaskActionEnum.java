package net.minidev.ovh.api.iploadbalancing;

/**
 * Possible task action
 */
public enum OvhTaskActionEnum {
	deployIplb("deployIplb"),
	install("install"),
	orderFreeCertificate("orderFreeCertificate"),
	orderSsl("orderSsl"),
	releaseIplb("releaseIplb"),
	releaseIplbZone("releaseIplbZone"),
	switchToIplbNextGenerationApi("switchToIplbNextGenerationApi");

	final String value;

	OvhTaskActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
