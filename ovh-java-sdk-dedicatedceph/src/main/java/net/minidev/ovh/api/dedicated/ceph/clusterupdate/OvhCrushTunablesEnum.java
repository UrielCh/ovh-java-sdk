package net.minidev.ovh.api.dedicated.ceph.clusterupdate;

/**
 * Tunables of cluster
 */
public enum OvhCrushTunablesEnum {
	OPTIMAL("OPTIMAL"),
	DEFAULT("DEFAULT"),
	LEGACY("LEGACY"),
	BOBTAIL("BOBTAIL"),
	ARGONAUT("ARGONAUT"),
	FIREFLY("FIREFLY"),
	HAMMER("HAMMER"),
	JEWEL("JEWEL");

	final String value;

	OvhCrushTunablesEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
