package net.minidev.ovh.api.msservices;

/**
 * Sharepoint service offer name
 */
public enum OvhSharepointServiceOfferEnum {
	hosted("hosted"),
	provider("provider");

	final String value;

	OvhSharepointServiceOfferEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
