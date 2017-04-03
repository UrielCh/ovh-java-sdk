package net.minidev.ovh.api.dedicated.server;

/**
 * distincts probes type
 */
public enum OvhRtmChartTypeEnum {
	cpu("cpu"),
	loadavg1("loadavg1"),
	loadavg15("loadavg15"),
	loadavg5("loadavg5"),
	memory("memory"),
	processCount("processCount"),
	processRunning("processRunning"),
	swap("swap");

	final String value;

	OvhRtmChartTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
