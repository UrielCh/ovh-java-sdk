package net.minidev.ovh.api.hosting.web.cron;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cron's language
 */
public enum OvhLanguageEnum {
	node10("node10"),
	node11("node11"),
	node8("node8"),
	node9("node9"),
	other("other"),
	php4("php4"),
	@JsonProperty("php5.2")
	php5_2("php5.2"),
	@JsonProperty("php5.3")
	php5_3("php5.3"),
	@JsonProperty("php5.4")
	php5_4("php5.4"),
	@JsonProperty("php5.5")
	php5_5("php5.5"),
	@JsonProperty("php5.6")
	php5_6("php5.6"),
	@JsonProperty("php7.0")
	php7_0("php7.0"),
	@JsonProperty("php7.1")
	php7_1("php7.1"),
	@JsonProperty("php7.2")
	php7_2("php7.2"),
	@JsonProperty("php7.3")
	php7_3("php7.3"),
	python2("python2"),
	python3("python3"),
	@JsonProperty("ruby2.4")
	ruby2_4("ruby2.4"),
	@JsonProperty("ruby2.5")
	ruby2_5("ruby2.5"),
	@JsonProperty("ruby2.6")
	ruby2_6("ruby2.6");

	final String value;

	OvhLanguageEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
