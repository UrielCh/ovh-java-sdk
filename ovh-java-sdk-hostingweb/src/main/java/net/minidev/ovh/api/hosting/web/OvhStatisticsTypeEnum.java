package net.minidev.ovh.api.hosting.web;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Types of statistics available for the web hosting
 */
public enum OvhStatisticsTypeEnum {
	@JsonProperty("in.ftpCommands")
	in_ftpCommands("in.ftpCommands"),
	@JsonProperty("in.httpHits")
	in_httpHits("in.httpHits"),
	@JsonProperty("in.httpMeanResponseTime")
	in_httpMeanResponseTime("in.httpMeanResponseTime"),
	@JsonProperty("out.tcpConn")
	out_tcpConn("out.tcpConn"),
	@JsonProperty("sys.cpuUsage")
	sys_cpuUsage("sys.cpuUsage"),
	@JsonProperty("sys.workerSpawnOverload")
	sys_workerSpawnOverload("sys.workerSpawnOverload");

	final String value;

	OvhStatisticsTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
