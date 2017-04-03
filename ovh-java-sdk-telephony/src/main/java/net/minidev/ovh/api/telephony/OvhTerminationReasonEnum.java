package net.minidev.ovh.api.telephony;

/**
 * Termination reason
 */
public enum OvhTerminationReasonEnum {
	addresseMove("addresseMove"),
	billingDifficulties("billingDifficulties"),
	cessationOfActivity("cessationOfActivity"),
	missingOptions("missingOptions"),
	moveToCompetitor("moveToCompetitor"),
	other("other"),
	plugAndPhoneDifficulties("plugAndPhoneDifficulties"),
	technicalDifficulties("technicalDifficulties");

	final String value;

	OvhTerminationReasonEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
