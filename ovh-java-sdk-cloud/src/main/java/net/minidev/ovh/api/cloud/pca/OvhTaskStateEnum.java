package net.minidev.ovh.api.cloud.pca;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Task status for cloud archives
 */
public enum OvhTaskStateEnum {
	cancelled("cancelled"),
	deleted("deleted"),
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
	toRestore("toRestore"),
	todo("todo");

	final String value;

	OvhTaskStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
