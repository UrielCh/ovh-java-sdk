package net.minidev.ovh.api.xdsl.linediagnostic;

/**
 * Diagnostic robot possible actions
 */
public enum OvhRobotActionsEnum {
	alignmentLockTest("alignmentLockTest"),
	alignmentResetTest("alignmentResetTest"),
	alignmentTestResult("alignmentTestResult"),
	checkIfResolvedAfterConnectionTests("checkIfResolvedAfterConnectionTests"),
	checkIfResolvedAfterInstallationCheck("checkIfResolvedAfterInstallationCheck"),
	checkIfResolvedAfterTests("checkIfResolvedAfterTests"),
	checkIfSeveralConnections("checkIfSeveralConnections"),
	checkInstallation("checkInstallation"),
	checkProblem("checkProblem"),
	checkSynchronizationWithoutOtherModems("checkSynchronizationWithoutOtherModems"),
	customerPrelocChecks("customerPrelocChecks"),
	lockUnlock("lockUnlock"),
	needToRequestOperatorIntervention("needToRequestOperatorIntervention"),
	needToRequestOvhIntervention("needToRequestOvhIntervention"),
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
