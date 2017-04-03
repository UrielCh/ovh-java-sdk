package net.minidev.ovh.api.cloud.pca;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Session state available for cloud archives
 */
public enum OvhSessionStateEnum {
	doing("doing"),
	doingBackup("doingBackup"),
	doingDelete("doingDelete"),
	doingRestore("doingRestore"),
	done("done"),
	error("error"),
	failedDelete("failedDelete"),
	failedRestore("failedRestore"),
	@JsonProperty("new")
	_new("new"),
	tagging("tagging"),
	toBackup("toBackup"),
	toDelete("toDelete"),
	toRestore("toRestore");

	final String value;

	OvhSessionStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
