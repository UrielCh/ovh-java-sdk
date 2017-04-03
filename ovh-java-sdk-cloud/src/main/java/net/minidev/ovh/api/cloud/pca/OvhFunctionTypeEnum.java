package net.minidev.ovh.api.cloud.pca;

/**
 * Task types for cloud archives
 */
public enum OvhFunctionTypeEnum {
	createUser("createUser"),
	delete("delete"),
	restore("restore"),
	setPassword("setPassword"),
	setSessionName("setSessionName"),
	setSshKey("setSshKey");

	final String value;

	OvhFunctionTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
