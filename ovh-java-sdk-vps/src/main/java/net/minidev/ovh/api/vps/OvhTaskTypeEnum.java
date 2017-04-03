package net.minidev.ovh.api.vps;

/**
 * All type a VPS task can be
 */
public enum OvhTaskTypeEnum {
	addVeeamBackupJob("addVeeamBackupJob"),
	changeRootPassword("changeRootPassword"),
	createSnapshot("createSnapshot"),
	deleteSnapshot("deleteSnapshot"),
	deliverVm("deliverVm"),
	getConsoleUrl("getConsoleUrl"),
	internalTask("internalTask"),
	openConsoleAccess("openConsoleAccess"),
	provisioningAdditionalIp("provisioningAdditionalIp"),
	reOpenVm("reOpenVm"),
	rebootVm("rebootVm"),
	reinstallVm("reinstallVm"),
	removeVeeamBackup("removeVeeamBackup"),
	restoreFullVeeamBackup("restoreFullVeeamBackup"),
	restoreVeeamBackup("restoreVeeamBackup"),
	restoreVm("restoreVm"),
	revertSnapshot("revertSnapshot"),
	setMonitoring("setMonitoring"),
	setNetboot("setNetboot"),
	startVm("startVm"),
	stopVm("stopVm"),
	upgradeVm("upgradeVm");

	final String value;

	OvhTaskTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
