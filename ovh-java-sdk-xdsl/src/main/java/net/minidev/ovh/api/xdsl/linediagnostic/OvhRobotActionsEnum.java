package net.minidev.ovh.api.xdsl.linediagnostic;

/**
 * Diagnostic robot possible actions
 */
public enum OvhRobotActionsEnum {
	alignmentLockTest("alignmentLockTest"),
	alignmentResetTest("alignmentResetTest"),
	alignmentTestResult("alignmentTestResult"),
	checkCustomerTicket("checkCustomerTicket"),
	checkIfResolvedAfterConnectionTests("checkIfResolvedAfterConnectionTests"),
	checkIfResolvedAfterInstallationCheck("checkIfResolvedAfterInstallationCheck"),
	checkIfResolvedAfterTests("checkIfResolvedAfterTests"),
	checkIfSeveralConnections("checkIfSeveralConnections"),
	checkInstallation("checkInstallation"),
	checkProblem("checkProblem"),
	checkSynchronizationWithoutOtherModems("checkSynchronizationWithoutOtherModems"),
	customerPrelocChecks("customerPrelocChecks"),
	installationCheck("installationCheck"),
	lockUnlock("lockUnlock"),
	needToRequestMonitoring("needToRequestMonitoring"),
	needToRequestOperatorIntervention("needToRequestOperatorIntervention"),
	needToRequestOvhIntervention("needToRequestOvhIntervention"),
	requestMonitoring("requestMonitoring"),
	requestOperatorIntervention("requestOperatorIntervention"),
	requestOvhIntervention("requestOvhIntervention"),
	seltTest("seltTest");

	final String value;

	OvhRobotActionsEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
