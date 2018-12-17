package net.minidev.ovh.api.license;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All language pack numbers available for Plesk products
 */
public enum OvhOrderablePleskLanguagePackEnum {
	@JsonProperty("1")
	_1("1"),
	@JsonProperty("1-extra-language-for-plesk12")
	_1_extra_language_for_plesk12("1-extra-language-for-plesk12"),
	@JsonProperty("2")
	_2("2"),
	@JsonProperty("2-extra-languages-for-plesk12")
	_2_extra_languages_for_plesk12("2-extra-languages-for-plesk12"),
	@JsonProperty("3")
	_3("3"),
	@JsonProperty("3-extra-languages-for-plesk12")
	_3_extra_languages_for_plesk12("3-extra-languages-for-plesk12"),
	@JsonProperty("4")
	_4("4"),
	@JsonProperty("4-extra-languages-for-plesk12")
	_4_extra_languages_for_plesk12("4-extra-languages-for-plesk12"),
	@JsonProperty("5")
	_5("5"),
	@JsonProperty("5-extra-languages-for-plesk12")
	_5_extra_languages_for_plesk12("5-extra-languages-for-plesk12"),
	unlimited("unlimited"),
	@JsonProperty("unlimited-extra-languages-for-plesk12")
	unlimited_extra_languages_for_plesk12("unlimited-extra-languages-for-plesk12");

	final String value;

	OvhOrderablePleskLanguagePackEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
