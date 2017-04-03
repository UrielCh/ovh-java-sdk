package net.minidev.ovh.api.support;

/**
 * Ticket request category
 */
public enum OvhTicketCategoryEnum {
	assistance("assistance"),
	billing("billing"),
	incident("incident");

	final String value;

	OvhTicketCategoryEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
