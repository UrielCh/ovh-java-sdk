package net.minidev.ovh.api.cloud.imageregion;

/**
 * ImageCategoryEnum
 */
public enum OvhImageCategoryEnum {
	official("official"),
	customer("customer"),
	shared("shared");

	final String value;

	OvhImageCategoryEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
