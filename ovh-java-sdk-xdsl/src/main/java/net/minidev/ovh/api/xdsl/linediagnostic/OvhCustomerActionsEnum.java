package net.minidev.ovh.api.xdsl.linediagnostic;

/**
 * Customer possible actions
 */
public enum OvhCustomerActionsEnum {
	bePreparedToCheckModemSynchronization("bePreparedToCheckModemSynchronization"),
	changeProfile("changeProfile"),
	checkConnectionCable("checkConnectionCable"),
	checkConnectionLoginAndParameters("checkConnectionLoginAndParameters"),
	checkFilter("checkFilter"),
	connectModemToOtherPlugs("connectModemToOtherPlugs"),
	neutralTest("neutralTest"),
	rebootModem("rebootModem"),
	resetModem("resetModem"),
	unplugEveryModems("unplugEveryModems"),
	unplugModem("unplugModem");

	final String value;

	OvhCustomerActionsEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
