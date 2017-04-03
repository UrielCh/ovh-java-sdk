package net.minidev.ovh.api.cloud.project;

/**
 * Possible values for new project status
 */
public enum OvhNewProjectStatusEnum {
	creating("creating"),
	ok("ok"),
	validationPending("validationPending"),
	waitingAgreementsValidation("waitingAgreementsValidation");

	final String value;

	OvhNewProjectStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
