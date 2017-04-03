package net.minidev.ovh.api.dedicated.storage;

/**
 * Distincts task
 */
public enum OvhTaskFunctionEnum {
	backupRecursiveDestroy("backupRecursiveDestroy"),
	clusterLeclercAclUpdate("clusterLeclercAclUpdate"),
	clusterLeclercChangeServiceIp("clusterLeclercChangeServiceIp"),
	clusterLeclercCustomSnapCreate("clusterLeclercCustomSnapCreate"),
	clusterLeclercCustomSnapDelete("clusterLeclercCustomSnapDelete"),
	clusterLeclercDeleteSnapshotDirectory("clusterLeclercDeleteSnapshotDirectory"),
	clusterLeclercDestroyNasContainer("clusterLeclercDestroyNasContainer"),
	clusterLeclercPartitionAdd("clusterLeclercPartitionAdd"),
	clusterLeclercPartitionDelete("clusterLeclercPartitionDelete"),
	clusterLeclercPartitionUpdate("clusterLeclercPartitionUpdate"),
	clusterLeclercQuotaUpdate("clusterLeclercQuotaUpdate"),
	clusterLeclercSetupNasContainer("clusterLeclercSetupNasContainer"),
	clusterLeclercSnapshotUpdate("clusterLeclercSnapshotUpdate"),
	clusterLeclercZfsOptions("clusterLeclercZfsOptions"),
	nasAclUpdate("nasAclUpdate"),
	nasDeleteSnapshotDirectory("nasDeleteSnapshotDirectory"),
	nasPartitionAdd("nasPartitionAdd"),
	nasPartitionDelete("nasPartitionDelete"),
	nasPartitionUpdate("nasPartitionUpdate"),
	nasQuotaUpdate("nasQuotaUpdate"),
	remoteBackupRecursiveDestroy("remoteBackupRecursiveDestroy");

	final String value;

	OvhTaskFunctionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
