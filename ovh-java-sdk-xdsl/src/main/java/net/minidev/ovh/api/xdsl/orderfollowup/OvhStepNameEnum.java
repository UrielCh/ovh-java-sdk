package net.minidev.ovh.api.xdsl.orderfollowup;

/**
 * The status of an order step
 */
public enum OvhStepNameEnum {
	accessIsOperational("accessIsOperational"),
	checkInfrastructure("checkInfrastructure"),
	configureAccessOnOVH("configureAccessOnOVH"),
	orderPayed("orderPayed"),
	orderReceived("orderReceived"),
	orderTreatment("orderTreatment"),
	sendModem("sendModem"),
	sendOrderToProvider("sendOrderToProvider"),
	setupCustomerPremisesEquipment("setupCustomerPremisesEquipment"),
	waitingForProviderInstallReport("waitingForProviderInstallReport"),
	waitingForWithdrawalPeriodToBeOver("waitingForWithdrawalPeriodToBeOver");

	final String value;

	OvhStepNameEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
