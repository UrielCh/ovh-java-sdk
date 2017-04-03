package net.minidev.ovh.api.email.pro;

/**
 * function enumeration for task
 */
public enum OvhTaskFunctionEnum {
	addAccount("addAccount"),
	addAlias("addAlias"),
	addDomain("addDomain"),
	addDomainDisclaimer("addDomainDisclaimer"),
	addExternalContact("addExternalContact"),
	addFullAccess("addFullAccess"),
	addSendAs("addSendAs"),
	addSendOnBehalfTo("addSendOnBehalfTo"),
	addServiceAuthorizedIp("addServiceAuthorizedIp"),
	changeHostname("changeHostname"),
	changePassword("changePassword"),
	configureCustomer("configureCustomer"),
	deleteAccount("deleteAccount"),
	deleteAlias("deleteAlias"),
	deleteDomain("deleteDomain"),
	deleteDomainDisclaimer("deleteDomainDisclaimer"),
	deleteExternalContact("deleteExternalContact"),
	deleteFullAccess("deleteFullAccess"),
	deleteSendAs("deleteSendAs"),
	deleteSendOnBehalfTo("deleteSendOnBehalfTo"),
	deleteService("deleteService"),
	deleteServiceAuthorizedIp("deleteServiceAuthorizedIp"),
	diagnoseAccount("diagnoseAccount"),
	expandDrive("expandDrive"),
	installServer("installServer"),
	maintenance("maintenance"),
	migrationAccount("migrationAccount"),
	migrationDisclaimer("migrationDisclaimer"),
	migrationExternalContact("migrationExternalContact"),
	migrationHistory("migrationHistory"),
	migrationService("migrationService"),
	reOpenAccount("reOpenAccount"),
	setAccount("setAccount"),
	setAlias("setAlias"),
	setDns("setDns"),
	setDomain("setDomain"),
	setDomainDisclaimer("setDomainDisclaimer"),
	setExternalContact("setExternalContact"),
	setService("setService"),
	suspendAccount("suspendAccount"),
	suspendService("suspendService"),
	unsuspendAccount("unsuspendAccount"),
	unsuspendService("unsuspendService");

	final String value;

	OvhTaskFunctionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
