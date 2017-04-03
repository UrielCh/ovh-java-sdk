package net.minidev.ovh.api.dedicated;

/**
 * Filesystems available
 */
public enum OvhTemplateOsFileSystemEnum {
	btrfs("btrfs"),
	ext3("ext3"),
	ext4("ext4"),
	ntfs("ntfs"),
	reiserfs("reiserfs"),
	swap("swap"),
	ufs("ufs"),
	xfs("xfs"),
	zfs("zfs");

	final String value;

	OvhTemplateOsFileSystemEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
