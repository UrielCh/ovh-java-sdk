package net.minidev.ovh.api.hosting.web.module;

/**
 * The type of the dependency. A dependency can be a standard database (like MySQL or PostgreSQL) or a key-value store (like Redis or Memcached) for example
 */
public enum OvhDependencyTypeEnum {
	mysql("mysql");

	final String value;

	OvhDependencyTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
