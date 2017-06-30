package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for StreamColdStorageCompressionEnum
 */
public enum OvhStreamColdStorageCompressionEnum {
	LZMA("LZMA"),
	GZIP("GZIP"),
	DEFLATED("DEFLATED"),
	ZSTD("ZSTD");

	final String value;

	OvhStreamColdStorageCompressionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
