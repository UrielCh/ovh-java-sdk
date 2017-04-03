package net.minidev.ovh.api.msservices;

/**
 * function enumeration for Active Directory task
 */
public enum OvhTaskFunctionEnum {
	activateSharepoint("activateSharepoint"),
	addADAccount("addADAccount"),
	addADOU("addADOU"),
	addADUPNSuffix("addADUPNSuffix"),
	changeADPassword("changeADPassword"),
	delADOU("delADOU"),
	deleteADAccount("deleteADAccount"),
	deleteADUPNSuffix("deleteADUPNSuffix"),
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
