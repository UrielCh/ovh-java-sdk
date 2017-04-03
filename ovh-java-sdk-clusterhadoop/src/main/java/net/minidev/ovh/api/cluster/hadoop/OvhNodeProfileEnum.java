package net.minidev.ovh.api.cluster.hadoop;

/**
 * All profiles a Hadoop Cluster Node can be
 */
public enum OvhNodeProfileEnum {
	ApplicationServer("ApplicationServer"),
	BasicNode("BasicNode"),
	ClouderaManager("ClouderaManager"),
	MasterServer("MasterServer"),
	SecondaryServer("SecondaryServer");

	final String value;

	OvhNodeProfileEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
