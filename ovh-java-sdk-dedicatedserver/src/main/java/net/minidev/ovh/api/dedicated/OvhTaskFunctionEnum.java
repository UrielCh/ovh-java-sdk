package net.minidev.ovh.api.dedicated;

/**
 * different task operation
 */
public enum OvhTaskFunctionEnum {
	addVirtualMac("addVirtualMac"),
	addWindowSplaFromExistingSerial("addWindowSplaFromExistingSerial"),
	applyBackupFtpAcls("applyBackupFtpAcls"),
	applyBackupFtpQuota("applyBackupFtpQuota"),
	bypassAntiDDosGame("bypassAntiDDosGame"),
	changePasswordBackupFTP("changePasswordBackupFTP"),
	changeRipeOrg("changeRipeOrg"),
	checkAndReleaseIp("checkAndReleaseIp"),
	createBackupFTP("createBackupFTP"),
	createOrUpdateRipeOrg("createOrUpdateRipeOrg"),
	createPrivateNetwork("createPrivateNetwork"),
	disableFirewall("disableFirewall"),
	enableFirewall("enableFirewall"),
	genericMoveFloatingIp("genericMoveFloatingIp"),
	hardReboot("hardReboot"),
	migrateBackupFTP("migrateBackupFTP"),
	moveFloatingIp("moveFloatingIp"),
	moveVirtualMac("moveVirtualMac"),
	rebootPower8To("rebootPower8To"),
	reinstallServer("reinstallServer"),
	releaseIp("releaseIp"),
	removeBackupFTP("removeBackupFTP"),
	removeVirtualMac("removeVirtualMac"),
	requestAccessIPMI("requestAccessIPMI"),
	resetIPMI("resetIPMI"),
	resetIPMISession("resetIPMISession"),
	testIPMIhttp("testIPMIhttp"),
	testIPMIpassword("testIPMIpassword"),
	testIPMIping("testIPMIping"),
	virtualMacAdd("virtualMacAdd"),
	virtualMacDelete("virtualMacDelete");

	final String value;

	OvhTaskFunctionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
