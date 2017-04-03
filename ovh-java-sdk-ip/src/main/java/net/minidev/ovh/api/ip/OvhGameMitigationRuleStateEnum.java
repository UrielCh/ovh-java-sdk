package net.minidev.ovh.api.ip;

/**
 * Possible values for game mitigation rule state
 */
public enum OvhGameMitigationRuleStateEnum {
	createRulePending("createRulePending"),
	deleteRulePending("deleteRulePending"),
	ok("ok");

	final String value;

	OvhGameMitigationRuleStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
