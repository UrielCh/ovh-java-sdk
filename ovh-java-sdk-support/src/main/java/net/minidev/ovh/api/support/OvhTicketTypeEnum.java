package net.minidev.ovh.api.support;

/**
 * Ticket type (criticalIntervention requires VIP support level)
 */
public enum OvhTicketTypeEnum {
	criticalIntervention("criticalIntervention"),
	genericRequest("genericRequest");

	final String value;

	OvhTicketTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
