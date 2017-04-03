package net.minidev.ovh.api.license;

/**
 * A short description of what does the Task on your license
 */
public enum OvhActionType {
	addWindowFromExistingSerial("addWindowFromExistingSerial"),
	changeIp("changeIp"),
	changeOs("changeOs"),
	installLicense("installLicense"),
	optionUpgrade("optionUpgrade"),
	releaseOption("releaseOption"),
	versionUpgrade("versionUpgrade");

	final String value;

	OvhActionType(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
