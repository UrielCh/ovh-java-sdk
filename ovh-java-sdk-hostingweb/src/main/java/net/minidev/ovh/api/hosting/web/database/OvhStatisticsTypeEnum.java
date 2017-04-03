package net.minidev.ovh.api.hosting.web.database;

/**
 * Types of statistics available for the database
 */
public enum OvhStatisticsTypeEnum {
	statement("statement"),
	statementMeanTime("statementMeanTime");

	final String value;

	OvhStatisticsTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
