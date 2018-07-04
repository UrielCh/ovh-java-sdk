package net.minidev.ovh.api.dedicatedcloud.right;

/**
 * All types of objects handled in objectRights
 */
public enum OvhUserObjectRightTypeEnum {
	cluster("cluster"),
	datastore("datastore"),
	dvportgroup("dvportgroup"),
	folder("folder"),
	pool("pool"),
	vm("vm");

	final String value;

	OvhUserObjectRightTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
