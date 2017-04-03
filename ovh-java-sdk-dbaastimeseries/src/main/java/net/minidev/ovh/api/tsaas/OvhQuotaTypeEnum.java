package net.minidev.ovh.api.tsaas;

/**
 * Project quotas
 */
public enum OvhQuotaTypeEnum {
	ddp("ddp"),
	mads("mads");

	final String value;

	OvhQuotaTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
