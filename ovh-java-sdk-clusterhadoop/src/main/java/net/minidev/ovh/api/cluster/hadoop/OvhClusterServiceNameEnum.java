package net.minidev.ovh.api.cluster.hadoop;

/**
 * All services names in a Hadoop Cluster
 */
public enum OvhClusterServiceNameEnum {
	HBase("HBase"),
	HDFS("HDFS"),
	HUE("HUE"),
	Hive("Hive"),
	Oozie("Oozie"),
	Solr("Solr"),
	Spark("Spark"),
	Sqoop("Sqoop"),
	YARN("YARN"),
	ZooKeeper("ZooKeeper");

	final String value;

	OvhClusterServiceNameEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
