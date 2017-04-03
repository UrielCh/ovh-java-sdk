package net.minidev.ovh.api.veeamcloudconnect;

/**
 * All orderable Veeam Cloud Connect offers
 */
public enum OvhOffer {
	advanced("advanced"),
	demo("demo"),
	starter("starter");

	final String value;

	OvhOffer(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
