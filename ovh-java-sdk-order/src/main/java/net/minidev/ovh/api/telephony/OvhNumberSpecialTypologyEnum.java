package net.minidev.ovh.api.telephony;

/**
 * Number special typology
 */
public enum OvhNumberSpecialTypologyEnum {
	be_adults("be_adults"),
	be_content("be_content"),
	be_games("be_games"),
	be_general("be_general"),
	be_relaxing("be_relaxing"),
	fr_access("fr_access"),
	fr_announced("fr_announced"),
	fr_conferencing("fr_conferencing"),
	fr_contentsAuto("fr_contentsAuto"),
	fr_contentsManual("fr_contentsManual"),
	fr_games("fr_games"),
	fr_linking("fr_linking"),
	fr_m2m("fr_m2m"),
	fr_relationship("fr_relationship");

	final String value;

	OvhNumberSpecialTypologyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
