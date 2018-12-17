package net.minidev.ovh.api.msservices;

/**
 * function enumeration for Active Directory task
 */
public enum OvhTaskFunctionEnum {
	activateADSync("activateADSync"),
	activateSharepoint("activateSharepoint"),
	addADAccount("addADAccount"),
	addADOU("addADOU"),
	addADSyncAccount("addADSyncAccount"),
	addADUPNSuffix("addADUPNSuffix"),
	changeADPassword("changeADPassword"),
	changeADSyncPassword("changeADSyncPassword"),
	deactivateADSync("deactivateADSync"),
	delADOU("delADOU"),
	deleteADAccount("deleteADAccount"),
	deleteADSyncAccount("deleteADSyncAccount"),
	deleteADUPNSuffix("deleteADUPNSuffix"),
	disableADAccountMfa("disableADAccountMfa"),
	disableADAccountMfaTemporary("disableADAccountMfaTemporary"),
	enableADAccountMfa("enableADAccountMfa"),
	enableADSyncAccount("enableADSyncAccount"),
	generateADSyncClientUrl("generateADSyncClientUrl"),
	resetADAccountMfa("resetADAccountMfa"),
	setADAccount("setADAccount"),
	setPasswordPolicy("setPasswordPolicy");

	final String value;

	OvhTaskFunctionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
