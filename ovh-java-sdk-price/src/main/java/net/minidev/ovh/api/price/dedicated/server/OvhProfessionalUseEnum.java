package net.minidev.ovh.api.price.dedicated.server;

/**
 * Enum of ProfessionalUses
 */
public enum OvhProfessionalUseEnum {
	bhg("bhg"),
	eg("eg"),
	hg("hg"),
	mg("mg"),
	sp("sp");

	final String value;

	OvhProfessionalUseEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
