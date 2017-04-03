package net.minidev.ovh.api.nichandle.changecontact;

/**
 * Allowed types of contact who can be changed by change contact task
 */
public enum OvhContactTypeEnum {
	contactAdmin("contactAdmin"),
	contactBilling("contactBilling"),
	contactTech("contactTech");

	final String value;

	OvhContactTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
