package net.minidev.ovh.api.sms;

/**
 * All existing types for a given template
 */
public enum OvhTypeTemplateEnum {
	alerting("alerting"),
	authentification("authentification"),
	transactional("transactional");

	final String value;

	OvhTypeTemplateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
