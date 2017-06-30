package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for ClusterClusterTypeEnum
 */
public enum OvhClusterClusterTypeEnum {
	TRIAL("TRIAL"),
	PRO("PRO"),
	DEDICATED("DEDICATED");

	final String value;

	OvhClusterClusterTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
