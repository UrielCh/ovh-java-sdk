package net.minidev.ovh.api.billing;

/**
 * List of bank account states
 */
public enum OvhBankAccountStateEnum {
	blockedForIncidents("blockedForIncidents"),
	pendingValidation("pendingValidation"),
	valid("valid");

	final String value;

	OvhBankAccountStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
