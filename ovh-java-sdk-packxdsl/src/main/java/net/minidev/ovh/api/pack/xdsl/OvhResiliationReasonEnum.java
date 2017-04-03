package net.minidev.ovh.api.pack.xdsl;

/**
 * Reason of a resiliation
 */
public enum OvhResiliationReasonEnum {
	addressMove("addressMove"),
	billingProblems("billingProblems"),
	cessationOfActivity("cessationOfActivity"),
	changeOfTerms("changeOfTerms"),
	ftth("ftth"),
	goToCompetitor("goToCompetitor"),
	other("other"),
	technicalProblems("technicalProblems");

	final String value;

	OvhResiliationReasonEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
