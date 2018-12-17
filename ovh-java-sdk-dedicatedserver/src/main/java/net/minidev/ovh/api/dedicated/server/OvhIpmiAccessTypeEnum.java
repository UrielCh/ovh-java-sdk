package net.minidev.ovh.api.dedicated.server;

/**
 * Distinct way to acces a KVM IPMI session
 */
public enum OvhIpmiAccessTypeEnum {
	kvmipHtml5URL("kvmipHtml5URL"),
	kvmipJnlp("kvmipJnlp"),
	serialOverLanSshKey("serialOverLanSshKey"),
	serialOverLanURL("serialOverLanURL");

	final String value;

	OvhIpmiAccessTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
