package net.minidev.ovh.api.kube;

/**
 * Enum values for worker nodes reset policy
 */
public enum OvhResetWorkerNodesPolicy {
	reinstall("reinstall"),
	delete("delete");

	final String value;

	OvhResetWorkerNodesPolicy(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
