package net.minidev.ovh.api.dedicated.installationtemplate;

import java.util.Date;
import net.minidev.ovh.api.dedicated.OvhTemplateOsFileSystemEnum;
import net.minidev.ovh.api.dedicated.OvhTemplateOsLanguageEnum;
import net.minidev.ovh.api.dedicated.OvhTemplateOsProperties;
import net.minidev.ovh.api.dedicated.OvhTemplateOsTypeEnum;
import net.minidev.ovh.api.dedicated.OvhTemplateOsUsageEnum;
import net.minidev.ovh.api.dedicated.server.OvhBitFormatEnum;
import net.minidev.ovh.api.dedicated.server.OvhSupportsUEFIEnum;

/**
 * Available installation templates
 */
public class OvhTemplates {
	/**
	 * this template  bit format
	 *
	 * canBeNull && readOnly
	 */
	public OvhBitFormatEnum bitFormat;

	/**
	 * Customizable template properties
	 *
	 * canBeNull && readOnly
	 */
	public OvhTemplateOsProperties customization;

	/**
	 * This distribution supports the GUID Partition Table (GPT), providing up to 128 partitions that can have more than 2 TB
	 *
	 * canBeNull && readOnly
	 */
	public Boolean supportsGptLabel;

	/**
	 * list of all language available for this template
	 *
	 * canBeNull && readOnly
	 */
	public OvhTemplateOsLanguageEnum[] availableLanguages;

	/**
	 * is this distribution deprecated
	 *
	 * canBeNull && readOnly
	 */
	public Boolean deprecated;

	/**
	 * information about this template
	 *
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * This distribution supports the microsoft SQL server
	 *
	 * canBeNull && readOnly
	 */
	public Boolean supportsSqlServer;

	/**
	 * This distribution supports UEFI setup
	 *
	 * canBeNull && readOnly
	 */
	public OvhSupportsUEFIEnum supportsUEFI;

	/**
	 * the distribution this template is based on
	 *
	 * canBeNull && readOnly
	 */
	public String distribution;

	/**
	 * list of all filesystems  available for this template
	 *
	 * canBeNull && readOnly
	 */
	public OvhTemplateOsFileSystemEnum[] filesystems;

	/**
	 * This distribution supports Logical Volumes (Linux LVM)
	 *
	 * canBeNull && readOnly
	 */
	public Boolean lvmReady;

	/**
	 * This distribution supports hardware raid configuration through the OVH API
	 *
	 * canBeNull && readOnly
	 */
	public Boolean hardRaidConfiguration;

	/**
	 * This distribution supports RTM software
	 *
	 * canBeNull && readOnly
	 */
	public Boolean supportsRTM;

	/**
	 * the default language of this template
	 *
	 * canBeNull && readOnly
	 */
	public OvhTemplateOsLanguageEnum defaultLanguage;

	/**
	 * This template name
	 *
	 * canBeNull && readOnly
	 */
	public String templateName;

	/**
	 * This distribution supports installation using the distribution's native kernel instead of the recommended OVH kernel
	 *
	 * canBeNull && readOnly
	 */
	public Boolean supportsDistributionKernel;

	/**
	 * Date of last modification of the base image
	 *
	 * canBeNull && readOnly
	 */
	public Date lastModification;

	/**
	 * category of this template (informative only)
	 *
	 * canBeNull && readOnly
	 */
	public OvhTemplateOsUsageEnum category;

	/**
	 * this template family type
	 *
	 * canBeNull && readOnly
	 */
	public OvhTemplateOsTypeEnum family;

	/**
	 * This distribution is new, and although tested and functional, may still display odd behaviour
	 *
	 * canBeNull && readOnly
	 */
	public Boolean beta;
}
