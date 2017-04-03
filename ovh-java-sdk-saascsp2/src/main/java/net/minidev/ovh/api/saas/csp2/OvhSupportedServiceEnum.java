package net.minidev.ovh.api.saas.csp2;

/**
 * Supported services of Office365
 */
public enum OvhSupportedServiceEnum {
	Email("Email"),
	Intune("Intune"),
	OfficeCommunicationsOnline("OfficeCommunicationsOnline");

	final String value;

	OvhSupportedServiceEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
