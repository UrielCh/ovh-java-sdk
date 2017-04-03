package net.minidev.ovh.api.dedicatedcloud.ressources;

/**
 * The Dedicated Cloud ressource types that can be upgraded
 */
public enum OvhUpgradeRessourceTypeEnum {
	account("account"),
	all("all"),
	filer("filer"),
	host("host");

	final String value;

	OvhUpgradeRessourceTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
