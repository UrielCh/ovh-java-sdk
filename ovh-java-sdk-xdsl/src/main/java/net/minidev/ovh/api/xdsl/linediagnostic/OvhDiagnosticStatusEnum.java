package net.minidev.ovh.api.xdsl.linediagnostic;

/**
 * Diagnostic status possible values
 */
public enum OvhDiagnosticStatusEnum {
	cancelled("cancelled"),
	connectionProblem("connectionProblem"),
	haveToConnectModemOnTheRightPlug("haveToConnectModemOnTheRightPlug"),
	init("init"),
	interventionRequested("interventionRequested"),
	noBandwidthFault("noBandwidthFault"),
	noProblemAnymore("noProblemAnymore"),
	noSyncFaultDiagnosticRequired("noSyncFaultDiagnosticRequired"),
	problem("problem"),
	resolvedAfterTests("resolvedAfterTests"),
	sleeping("sleeping"),
	validationRefused("validationRefused"),
	waitingHuman("waitingHuman"),
	waitingRobot("waitingRobot"),
	waitingValidation("waitingValidation");

	final String value;

	OvhDiagnosticStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
