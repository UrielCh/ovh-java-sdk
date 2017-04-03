package net.minidev.ovh.api.msservices;

/**
 * Account access rights to the service
 */
public enum OvhSharepointAccountAccessRightsEnum {
	administrator("administrator"),
	user("user");

	final String value;

	OvhSharepointAccountAccessRightsEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
