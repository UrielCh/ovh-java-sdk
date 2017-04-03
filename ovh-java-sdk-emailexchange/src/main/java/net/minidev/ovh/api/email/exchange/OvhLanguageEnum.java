package net.minidev.ovh.api.email.exchange;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Outlook language
 */
public enum OvhLanguageEnum {
	ar("ar"),
	bg("bg"),
	cz("cz"),
	da("da"),
	de("de"),
	el("el"),
	en("en"),
	es("es"),
	et("et"),
	fi("fi"),
	fr("fr"),
	he("he"),
	hi("hi"),
	hr("hr"),
	hu("hu"),
	id("id"),
	in("in"),
	it("it"),
	ja("ja"),
	ko("ko"),
	kz("kz"),
	lt("lt"),
	lv("lv"),
	ms("ms"),
	nb("nb"),
	nl("nl"),
	pl("pl"),
	pt("pt"),
	@JsonProperty("pt-BR")
	pt_BR("pt-BR"),
	ro("ro"),
	rs("rs"),
	ru("ru"),
	sk("sk"),
	sl("sl"),
	sv("sv"),
	th("th"),
	tr("tr"),
	uk("uk"),
	vi("vi"),
	@JsonProperty("zh-CN")
	zh_CN("zh-CN");

	final String value;

	OvhLanguageEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
