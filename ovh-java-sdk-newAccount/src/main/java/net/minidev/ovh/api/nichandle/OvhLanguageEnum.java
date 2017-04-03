package net.minidev.ovh.api.nichandle;

/**
 * Languages a nichandle can choose
 */
public enum OvhLanguageEnum {
	cs_CZ("cs_CZ"),
	de_DE("de_DE"),
	en_AU("en_AU"),
	en_CA("en_CA"),
	en_GB("en_GB"),
	en_IE("en_IE"),
	en_US("en_US"),
	es_ES("es_ES"),
	fi_FI("fi_FI"),
	fr_CA("fr_CA"),
	fr_FR("fr_FR"),
	fr_MA("fr_MA"),
	fr_SN("fr_SN"),
	fr_TN("fr_TN"),
	it_IT("it_IT"),
	lt_LT("lt_LT"),
	nl_NL("nl_NL"),
	pl_PL("pl_PL"),
	pt_PT("pt_PT");

	final String value;

	OvhLanguageEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
