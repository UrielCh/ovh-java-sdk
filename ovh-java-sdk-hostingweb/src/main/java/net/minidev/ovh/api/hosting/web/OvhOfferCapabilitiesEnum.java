package net.minidev.ovh.api.hosting.web;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Hosting's offer
 */
public enum OvhOfferCapabilitiesEnum {
	@JsonProperty("1000gp")
	_1000gp("1000gp"),
	@JsonProperty("20gp")
	_20gp("20gp"),
	@JsonProperty("240gp")
	_240gp("240gp"),
	@JsonProperty("240pack")
	_240pack("240pack"),
	@JsonProperty("240plan")
	_240plan("240plan"),
	@JsonProperty("300gp")
	_300gp("300gp"),
	@JsonProperty("60free")
	_60free("60free"),
	@JsonProperty("60gp")
	_60gp("60gp"),
	@JsonProperty("720pack")
	_720pack("720pack"),
	@JsonProperty("720plan")
	_720plan("720plan"),
	@JsonProperty("90pack")
	_90pack("90pack"),
	@JsonProperty("90plan")
	_90plan("90plan"),
	KS("KS"),
	PERFORMANCE_1("PERFORMANCE_1"),
	PERFORMANCE_2("PERFORMANCE_2"),
	PERFORMANCE_3("PERFORMANCE_3"),
	PERFORMANCE_4("PERFORMANCE_4"),
	PERSO("PERSO"),
	PRO("PRO"),
	START("START"),
	aspfree("aspfree"),
	aspperso("aspperso"),
	business("business"),
	demo1g("demo1g"),
	depro2012("depro2012"),
	deprol2012("deprol2012"),
	deproxl2012("deproxl2012"),
	deproxxl2012("deproxxl2012"),
	destart2012("destart2012"),
	destartl2012("destartl2012"),
	destartxl2012("destartxl2012"),
	domainpack("domainpack"),
	itbusiness2012("itbusiness2012"),
	itperso2012("itperso2012"),
	itpremium2012("itpremium2012"),
	kimsufi2015("kimsufi2015"),
	mailpack("mailpack"),
	mailplan("mailplan"),
	mediapack("mediapack"),
	mediaplan("mediaplan"),
	ovhpro1To("ovhpro1To"),
	ovhpro2To("ovhpro2To"),
	ovhpro5To("ovhpro5To"),
	paas2014beta("paas2014beta"),
	perf2014x1("perf2014x1"),
	perf2014x2("perf2014x2"),
	perf2014x3("perf2014x3"),
	perf2014x4("perf2014x4"),
	perso2010("perso2010"),
	perso2014("perso2014"),
	premium("premium"),
	pro2010("pro2010"),
	pro2014("pro2014"),
	start10g("start10g"),
	start10m("start10m"),
	start1g("start1g"),
	start1ges("start1ges"),
	start1m("start1m"),
	start5g("start5g"),
	starter("starter"),
	xxlpack("xxlpack"),
	xxlplan("xxlplan");

	final String value;

	OvhOfferCapabilitiesEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
