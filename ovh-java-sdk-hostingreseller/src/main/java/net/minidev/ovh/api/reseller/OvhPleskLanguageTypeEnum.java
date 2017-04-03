package net.minidev.ovh.api.reseller;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Possible values for language type
 */
public enum OvhPleskLanguageTypeEnum {
	ar("ar"),
	@JsonProperty("zh-CN")
	zh_CN("zh-CN"),
	@JsonProperty("zh-TW")
	zh_TW("zh-TW"),
	@JsonProperty("cs-CZ")
	cs_CZ("cs-CZ"),
	@JsonProperty("da-DK")
	da_DK("da-DK"),
	@JsonProperty("nl-NL")
	nl_NL("nl-NL"),
	@JsonProperty("en-US")
	en_US("en-US"),
	@JsonProperty("fi-FI")
	fi_FI("fi-FI"),
	@JsonProperty("fr-FR")
	fr_FR("fr-FR"),
	@JsonProperty("de-DE")
	de_DE("de-DE"),
	@JsonProperty("el-GR")
	el_GR("el-GR"),
	@JsonProperty("he-IL")
	he_IL("he-IL"),
	@JsonProperty("hu-HU")
	hu_HU("hu-HU"),
	@JsonProperty("id-ID")
	id_ID("id-ID"),
	@JsonProperty("it-IT")
	it_IT("it-IT"),
	@JsonProperty("ja-JP")
	ja_JP("ja-JP"),
	@JsonProperty("ko-KR")
	ko_KR("ko-KR"),
	@JsonProperty("ms-MY")
	ms_MY("ms-MY"),
	@JsonProperty("nb-NO")
	nb_NO("nb-NO"),
	@JsonProperty("pl-PL")
	pl_PL("pl-PL"),
	@JsonProperty("pt-BR")
	pt_BR("pt-BR"),
	@JsonProperty("pt-PT")
	pt_PT("pt-PT"),
	@JsonProperty("ro-RO")
	ro_RO("ro-RO"),
	@JsonProperty("ru-RU")
	ru_RU("ru-RU"),
	@JsonProperty("es-ES")
	es_ES("es-ES"),
	@JsonProperty("sv-SE")
	sv_SE("sv-SE"),
	@JsonProperty("tl-PH")
	tl_PH("tl-PH"),
	@JsonProperty("th-TH")
	th_TH("th-TH"),
	@JsonProperty("tr-TR")
	tr_TR("tr-TR"),
	@JsonProperty("uk-UA")
	uk_UA("uk-UA"),
	@JsonProperty("vi-VN")
	vi_VN("vi-VN");

	final String value;

	OvhPleskLanguageTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
