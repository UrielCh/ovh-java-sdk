package net.minidev.ovh.api.domain;

/**
 * Document file format
 */
public enum OvhDocumentFormatsEnum {
	gif("gif"),
	jpeg("jpeg"),
	jpg("jpg"),
	pdf("pdf"),
	png("png");

	final String value;

	OvhDocumentFormatsEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
