package net.minidev.ovh.api.sslgateway;

/**
 * Possible task action
 */
public enum OvhTaskActionEnum {
	addDomain("addDomain"),
	addServer("addServer"),
	createService("createService"),
	deleteDomain("deleteDomain"),
	deleteServer("deleteServer"),
	deleteService("deleteService"),
	internalTask("internalTask"),
	updateServer("updateServer"),
	updateService("updateService");

	final String value;

	OvhTaskActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
