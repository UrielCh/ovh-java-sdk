package net.minidev.ovh.api.auth;

/**
 * All states a Credential can be in
 */
public enum OvhCredentialStateEnum {
	expired("expired"),
	pendingValidation("pendingValidation"),
	refused("refused"),
	validated("validated");

	final String value;

	OvhCredentialStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
