package net.minidev.ovh.api.cluster.hadoop;

/**
 * All states a Hadoop Cluster Cloud Task can be in
 */
public enum OvhOperationStateEnum {
	cancelled("cancelled"),
	doing("doing"),
	done("done"),
	error("error"),
	todo("todo");

	final String value;

	OvhOperationStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
