package net.minidev.ovh.api.telephony.portability;

/**
 * Special number category
 */
public enum OvhSpecialNumberCategoryEnum {
	access("access"),
	adults("adults"),
	announced("announced"),
	be_adults("be_adults"),
	be_content("be_content"),
	be_games("be_games"),
	be_general("be_general"),
	be_relaxing("be_relaxing"),
	conferencing("conferencing"),
	contentsAuto("contentsAuto"),
	contentsManual("contentsManual"),
	directory("directory"),
	games("games"),
	linking("linking"),
	m2m("m2m"),
	relationship("relationship");

	final String value;

	OvhSpecialNumberCategoryEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
