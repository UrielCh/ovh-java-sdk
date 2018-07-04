package net.minidev.ovh.api.service;

/**
 * All future uses you can provide for a service termination
 */
public enum OvhTerminationFutureUseEnum {
	NOT_REPLACING_SERVICE("NOT_REPLACING_SERVICE"),
	OTHER("OTHER"),
	SUBSCRIBE_AN_OTHER_SERVICE("SUBSCRIBE_AN_OTHER_SERVICE"),
	SUBSCRIBE_OTHER_KIND_OF_SERVICE_WITH_COMPETITOR("SUBSCRIBE_OTHER_KIND_OF_SERVICE_WITH_COMPETITOR"),
	SUBSCRIBE_SIMILAR_SERVICE_WITH_COMPETITOR("SUBSCRIBE_SIMILAR_SERVICE_WITH_COMPETITOR");

	final String value;

	OvhTerminationFutureUseEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
