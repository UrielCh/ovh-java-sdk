package net.minidev.ovh.api.ip;

/**
 * Possible values for game rule protocol
 */
public enum OvhGameMitigationRuleProtocolEnum {
	arkSurvivalEvolved("arkSurvivalEvolved"),
	arma("arma"),
	gtaMultiTheftAutoSanAndreas("gtaMultiTheftAutoSanAndreas"),
	gtaSanAndreasMultiplayerMod("gtaSanAndreasMultiplayerMod"),
	hl2Source("hl2Source"),
	minecraftPocketEdition("minecraftPocketEdition"),
	minecraftQuery("minecraftQuery"),
	mumble("mumble"),
	other("other"),
	rust("rust"),
	teamspeak2("teamspeak2"),
	teamspeak3("teamspeak3"),
	trackmaniaShootmania("trackmaniaShootmania");

	final String value;

	OvhGameMitigationRuleProtocolEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
