package net.minidev.ovh.api.dedicated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * all language available
 */
public enum OvhTemplateOsLanguageEnum {
	ar("ar"),
	bg("bg"),
	cs("cs"),
	da("da"),
	de("de"),
	el("el"),
	en("en"),
	es("es"),
	et("et"),
	fi("fi"),
	fr("fr"),
	he("he"),
	hr("hr"),
	hu("hu"),
	it("it"),
	ja("ja"),
	ko("ko"),
	lt("lt"),
	lv("lv"),
	nb("nb"),
	nl("nl"),
	no("no"),
	pl("pl"),
	pt("pt"),
	ro("ro"),
	ru("ru"),
	sk("sk"),
	sl("sl"),
	sr("sr"),
	sv("sv"),
	th("th"),
	tr("tr"),
	tu("tu"),
	uk("uk"),
	@JsonProperty("zh-Hans-CN")
	zh_Hans_CN("zh-Hans-CN"),
	@JsonProperty("zh-Hans-HK")
	zh_Hans_HK("zh-Hans-HK");

	final String value;

	OvhTemplateOsLanguageEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
