package net.minidev.ovh.api.cluster.hadoop;

/**
 * All roles a Hadoop Cluster Node can be
 */
public enum OvhRoleTypeEnum {
	cloudera_manager("cloudera_manager"),
	data_node("data_node"),
	elasticsearch_server("elasticsearch_server"),
	hbase_master("hbase_master"),
	hbase_region_server("hbase_region_server"),
	hive_server2("hive_server2"),
	hue("hue"),
	impala_daemon("impala_daemon"),
	impala_server("impala_server"),
	map_reduce_history_server("map_reduce_history_server"),
	name_node("name_node"),
	oozie_server("oozie_server"),
	open_tsdb("open_tsdb"),
	secondary_name_node("secondary_name_node"),
	solr_server("solr_server"),
	spark_master("spark_master"),
	spark_worker("spark_worker"),
	sqoop_server("sqoop_server"),
	yarn_node_manager("yarn_node_manager"),
	yarn_resource_manager("yarn_resource_manager"),
	zoo_keeper("zoo_keeper");

	final String value;

	OvhRoleTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
