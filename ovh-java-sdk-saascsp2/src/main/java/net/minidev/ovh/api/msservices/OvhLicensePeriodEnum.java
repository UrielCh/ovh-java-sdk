package net.minidev.ovh.api.msservices;

/**
 * Period of time used to determine license statistics
 */
public enum OvhLicensePeriodEnum {
	lastMonth("lastMonth"),
	lastQuarter("lastQuarter"),
	lastWeek("lastWeek"),
	lastYear("lastYear");

	final String value;

	OvhLicensePeriodEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
