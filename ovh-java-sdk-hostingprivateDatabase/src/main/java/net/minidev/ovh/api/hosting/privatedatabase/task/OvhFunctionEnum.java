package net.minidev.ovh.api.hosting.privatedatabase.task;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Task's function
 */
public enum OvhFunctionEnum {
	boot("boot"),
	changeFtpPassword("changeFtpPassword"),
	changeRam("changeRam"),
	changeRootPassword("changeRootPassword"),
	changeVersion("changeVersion"),
	@JsonProperty("configuration/update")
	configuration_update("configuration/update"),
	create("create"),
	@JsonProperty("database/create")
	database_create("database/create"),
	@JsonProperty("database/delete")
	database_delete("database/delete"),
	@JsonProperty("database/dump")
	database_dump("database/dump"),
	@JsonProperty("database/dump/delete")
	database_dump_delete("database/dump/delete"),
	@JsonProperty("database/import")
	database_import("database/import"),
	@JsonProperty("database/restore")
	database_restore("database/restore"),
	@JsonProperty("database/wizard")
	database_wizard("database/wizard"),
	delete("delete"),
	@JsonProperty("grant/create")
	grant_create("grant/create"),
	@JsonProperty("grant/delete")
	grant_delete("grant/delete"),
	@JsonProperty("grant/update")
	grant_update("grant/update"),
	halt("halt"),
	install("install"),
	refresh("refresh"),
	reopen("reopen"),
	restart("restart"),
	restore("restore"),
	start("start"),
	stop("stop"),
	suspend("suspend"),
	@JsonProperty("user/changePassword")
	user_changePassword("user/changePassword"),
	@JsonProperty("user/create")
	user_create("user/create"),
	@JsonProperty("user/delete")
	user_delete("user/delete"),
	@JsonProperty("whitelist/create")
	whitelist_create("whitelist/create"),
	@JsonProperty("whitelist/delete")
	whitelist_delete("whitelist/delete"),
	@JsonProperty("whitelist/update")
	whitelist_update("whitelist/update");

	final String value;

	OvhFunctionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
