package net.minidev.ovh.api.hosting.web.module;

/**
 * Module's name orderable when order a new hosting
 */
public enum OvhOrderableNameEnum {
	DRUPAL("DRUPAL"),
	JOOMLA("JOOMLA"),
	PRESTASHOP("PRESTASHOP"),
	WORDPRESS("WORDPRESS");

	final String value;

	OvhOrderableNameEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
