package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import net.minidev.ovh.api.dedicated.installationtemplate.OvhHardwareRaid;
import net.minidev.ovh.api.dedicated.installationtemplate.OvhTemplatePartitioningSchemes;
import net.minidev.ovh.api.dedicated.installationtemplate.OvhTemplatePartitions;
import net.minidev.ovh.api.dedicated.installationtemplate.OvhTemplates;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/dedicated/installationTemplate
 * version:1.0
 */
public class ApiOvhDedicatedinstallationTemplate extends ApiOvhBase {
	public ApiOvhDedicatedinstallationTemplate(ApiOvhCore core) {
		super(core);
	}

	/**
	 * OVH operating system installation templates
	 *
	 * REST: GET /dedicated/installationTemplate
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/dedicated/installationTemplate";
		String resp = execN("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/installationTemplate/{templateName}
	 * @param templateName [required] This template name
	 */
	public OvhTemplates templateName_GET(String templateName) throws IOException {
		String qPath = "/dedicated/installationTemplate/{templateName}";
		qPath = qPath.replace("{templateName}", templateName);
		String resp = execN("GET", qPath);
		return convertTo(resp, OvhTemplates.class);
	}

	/**
	 * Partitioning schemes available on this template
	 *
	 * REST: GET /dedicated/installationTemplate/{templateName}/partitionScheme
	 * @param templateName [required] This template name
	 */
	public ArrayList<String> templateName_partitionScheme_GET(String templateName) throws IOException {
		String qPath = "/dedicated/installationTemplate/{templateName}/partitionScheme";
		qPath = qPath.replace("{templateName}", templateName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/installationTemplate/{templateName}/partitionScheme/{schemeName}
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 */
	public OvhTemplatePartitioningSchemes templateName_partitionScheme_schemeName_GET(String templateName, String schemeName) throws IOException {
		String qPath = "/dedicated/installationTemplate/{templateName}/partitionScheme/{schemeName}";
		qPath = qPath.replace("{templateName}", templateName);
		qPath = qPath.replace("{schemeName}", schemeName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTemplatePartitioningSchemes.class);
	}

	/**
	 * Partitions defined in this partitioning scheme
	 *
	 * REST: GET /dedicated/installationTemplate/{templateName}/partitionScheme/{schemeName}/partition
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 */
	public ArrayList<String> templateName_partitionScheme_schemeName_partition_GET(String templateName, String schemeName) throws IOException {
		String qPath = "/dedicated/installationTemplate/{templateName}/partitionScheme/{schemeName}/partition";
		qPath = qPath.replace("{templateName}", templateName);
		qPath = qPath.replace("{schemeName}", schemeName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/installationTemplate/{templateName}/partitionScheme/{schemeName}/partition/{mountpoint}
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 * @param mountpoint [required] partition mount point
	 */
	public OvhTemplatePartitions templateName_partitionScheme_schemeName_partition_mountpoint_GET(String templateName, String schemeName, String mountpoint) throws IOException {
		String qPath = "/dedicated/installationTemplate/{templateName}/partitionScheme/{schemeName}/partition/{mountpoint}";
		qPath = qPath.replace("{templateName}", templateName);
		qPath = qPath.replace("{schemeName}", schemeName);
		qPath = qPath.replace("{mountpoint}", mountpoint);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTemplatePartitions.class);
	}

	/**
	 * Hardware RAIDs defined in this partitioning scheme
	 *
	 * REST: GET /dedicated/installationTemplate/{templateName}/partitionScheme/{schemeName}/hardwareRaid
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 */
	public ArrayList<String> templateName_partitionScheme_schemeName_hardwareRaid_GET(String templateName, String schemeName) throws IOException {
		String qPath = "/dedicated/installationTemplate/{templateName}/partitionScheme/{schemeName}/hardwareRaid";
		qPath = qPath.replace("{templateName}", templateName);
		qPath = qPath.replace("{schemeName}", schemeName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/installationTemplate/{templateName}/partitionScheme/{schemeName}/hardwareRaid/{name}
	 * @param templateName [required] This template name
	 * @param schemeName [required] name of this partitioning scheme
	 * @param name [required] Hardware RAID name
	 */
	public OvhHardwareRaid templateName_partitionScheme_schemeName_hardwareRaid_name_GET(String templateName, String schemeName, String name) throws IOException {
		String qPath = "/dedicated/installationTemplate/{templateName}/partitionScheme/{schemeName}/hardwareRaid/{name}";
		qPath = qPath.replace("{templateName}", templateName);
		qPath = qPath.replace("{schemeName}", schemeName);
		qPath = qPath.replace("{name}", name);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhHardwareRaid.class);
	}
}
