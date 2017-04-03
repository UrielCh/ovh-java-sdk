package net.minidev.ovh.api.telephony;

/**
 * List of possible step name
 */
public enum OvhPortabilityStepNameEnum {
	acknowledgmentReceivedFromOperator("acknowledgmentReceivedFromOperator"),
	belgiumPortabilityRequestCreated("belgiumPortabilityRequestCreated"),
	belgiumPortabilityRequestExecutionAcked("belgiumPortabilityRequestExecutionAcked"),
	belgiumPortabilityRequestExecutionAsked("belgiumPortabilityRequestExecutionAsked"),
	belgiumPortabilityRequestExecutionCompleted("belgiumPortabilityRequestExecutionCompleted"),
	belgiumPortabilityRequestValidated("belgiumPortabilityRequestValidated"),
	belgiumPortabilityRequestWaitingUntilExec("belgiumPortabilityRequestWaitingUntilExec"),
	customerFormReceived("customerFormReceived"),
	customerFormSent("customerFormSent"),
	customerFormValidated("customerFormValidated"),
	finalReportReceivedFromOperator("finalReportReceivedFromOperator"),
	intermediateReportReceivedFromOperator("intermediateReportReceivedFromOperator"),
	numberActivation("numberActivation"),
	requestSentToOperator("requestSentToOperator"),
	sDASequenceReceivedFromOperator("sDASequenceReceivedFromOperator");

	final String value;

	OvhPortabilityStepNameEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
