package net.minidev.ovh.api.hosting.web.runtime;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Runtime backend type enum
 */
public enum OvhTypeEnum {
	@JsonProperty("nodejs-10")
	nodejs_10("nodejs-10"),
	@JsonProperty("nodejs-11")
	nodejs_11("nodejs-11"),
	@JsonProperty("nodejs-8")
	nodejs_8("nodejs-8"),
	@JsonProperty("nodejs-9")
	nodejs_9("nodejs-9"),
	@JsonProperty("phpfpm-5.6")
	phpfpm_5_6("phpfpm-5.6"),
	@JsonProperty("phpfpm-7.0")
	phpfpm_7_0("phpfpm-7.0"),
	@JsonProperty("phpfpm-7.1")
	phpfpm_7_1("phpfpm-7.1"),
	@JsonProperty("phpfpm-7.2")
	phpfpm_7_2("phpfpm-7.2"),
	@JsonProperty("phpfpm-7.3")
	phpfpm_7_3("phpfpm-7.3"),
	@JsonProperty("python-2")
	python_2("python-2"),
	@JsonProperty("python-3")
	python_3("python-3"),
	@JsonProperty("ruby-2.4")
	ruby_2_4("ruby-2.4"),
	@JsonProperty("ruby-2.5")
	ruby_2_5("ruby-2.5"),
	@JsonProperty("ruby-2.6")
	ruby_2_6("ruby-2.6");

	final String value;

	OvhTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
