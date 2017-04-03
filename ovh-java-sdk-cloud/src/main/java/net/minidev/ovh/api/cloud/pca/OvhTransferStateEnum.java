package net.minidev.ovh.api.cloud.pca;

/**
 * Transfer states
 */
public enum OvhTransferStateEnum {
	deleted("deleted"),
	transferred("transferred"),
	untransferred("untransferred"),
	waitingAgreementsValidation("waitingAgreementsValidation");

	final String value;

	OvhTransferStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
