package net.minidev.ovh.api.nichandle.accessrestriction;

/**
 * Accept or deny IP access
 */
public enum OvhIpRestrictionRuleEnum {
	accept("accept"),
	deny("deny");

	final String value;

	OvhIpRestrictionRuleEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
