package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.complextype.OvhChartReturn;
import net.minidev.ovh.api.dedicated.OvhAvailabilities;
import net.minidev.ovh.api.dedicated.OvhAvailabilitiesRaw;
import net.minidev.ovh.api.dedicated.OvhOsAvailabilitiesEnum;
import net.minidev.ovh.api.dedicated.OvhTaskFunctionEnum;
import net.minidev.ovh.api.dedicated.OvhTaskStatusEnum;
import net.minidev.ovh.api.dedicated.networkinterfacecontroller.OvhNetworkInterfaceController;
import net.minidev.ovh.api.dedicated.networkinterfacecontroller.OvhNetworkInterfaceControllerLinkTypeEnum;
import net.minidev.ovh.api.dedicated.server.OvhAccess;
import net.minidev.ovh.api.dedicated.server.OvhAlertLanguageEnum;
import net.minidev.ovh.api.dedicated.server.OvhBackupCloud;
import net.minidev.ovh.api.dedicated.server.OvhBackupFtp;
import net.minidev.ovh.api.dedicated.server.OvhBackupFtpAcl;
import net.minidev.ovh.api.dedicated.server.OvhBackupStorageOrderable;
import net.minidev.ovh.api.dedicated.server.OvhBandwidthOrderable;
import net.minidev.ovh.api.dedicated.server.OvhBandwidthvRackOrderable;
import net.minidev.ovh.api.dedicated.server.OvhBootOptionEnum;
import net.minidev.ovh.api.dedicated.server.OvhBootTypeEnum;
import net.minidev.ovh.api.dedicated.server.OvhCacheTTLEnum;
import net.minidev.ovh.api.dedicated.server.OvhDedicated;
import net.minidev.ovh.api.dedicated.server.OvhEmailAlert;
import net.minidev.ovh.api.dedicated.server.OvhFirewall;
import net.minidev.ovh.api.dedicated.server.OvhHardwareRaidProfile;
import net.minidev.ovh.api.dedicated.server.OvhHardwareRaidSize;
import net.minidev.ovh.api.dedicated.server.OvhHardwareSpecifications;
import net.minidev.ovh.api.dedicated.server.OvhInstallCustom;
import net.minidev.ovh.api.dedicated.server.OvhInstallTemplate;
import net.minidev.ovh.api.dedicated.server.OvhInstallationProgressStatus;
import net.minidev.ovh.api.dedicated.server.OvhIntervention;
import net.minidev.ovh.api.dedicated.server.OvhIpCountryEnum;
import net.minidev.ovh.api.dedicated.server.OvhIpOrderable;
import net.minidev.ovh.api.dedicated.server.OvhIpmi;
import net.minidev.ovh.api.dedicated.server.OvhIpmiAccessTypeEnum;
import net.minidev.ovh.api.dedicated.server.OvhIpmiAccessValue;
import net.minidev.ovh.api.dedicated.server.OvhIpmiTestResult;
import net.minidev.ovh.api.dedicated.server.OvhIpmiTestTypeEnum;
import net.minidev.ovh.api.dedicated.server.OvhKvm;
import net.minidev.ovh.api.dedicated.server.OvhMonitoringIntervalEnum;
import net.minidev.ovh.api.dedicated.server.OvhMonitoringProtocolEnum;
import net.minidev.ovh.api.dedicated.server.OvhMrtgPeriodEnum;
import net.minidev.ovh.api.dedicated.server.OvhMrtgTimestampValue;
import net.minidev.ovh.api.dedicated.server.OvhMrtgTypeEnum;
import net.minidev.ovh.api.dedicated.server.OvhNetboot;
import net.minidev.ovh.api.dedicated.server.OvhNetbootOption;
import net.minidev.ovh.api.dedicated.server.OvhNetworkSpecifications;
import net.minidev.ovh.api.dedicated.server.OvhOption;
import net.minidev.ovh.api.dedicated.server.OvhOptionEnum;
import net.minidev.ovh.api.dedicated.server.OvhOrderableSysFeatureEnum;
import net.minidev.ovh.api.dedicated.server.OvhRtm;
import net.minidev.ovh.api.dedicated.server.OvhRtmChartPeriodEnum;
import net.minidev.ovh.api.dedicated.server.OvhRtmChartTypeEnum;
import net.minidev.ovh.api.dedicated.server.OvhRtmCommandSize;
import net.minidev.ovh.api.dedicated.server.OvhRtmConnection;
import net.minidev.ovh.api.dedicated.server.OvhRtmCpu;
import net.minidev.ovh.api.dedicated.server.OvhRtmDisk;
import net.minidev.ovh.api.dedicated.server.OvhRtmDiskSmart;
import net.minidev.ovh.api.dedicated.server.OvhRtmLoad;
import net.minidev.ovh.api.dedicated.server.OvhRtmMemory;
import net.minidev.ovh.api.dedicated.server.OvhRtmMotherboardHw;
import net.minidev.ovh.api.dedicated.server.OvhRtmOs;
import net.minidev.ovh.api.dedicated.server.OvhRtmPartition;
import net.minidev.ovh.api.dedicated.server.OvhRtmPci;
import net.minidev.ovh.api.dedicated.server.OvhRtmRaid;
import net.minidev.ovh.api.dedicated.server.OvhRtmRaidVolume;
import net.minidev.ovh.api.dedicated.server.OvhRtmRaidVolumePort;
import net.minidev.ovh.api.dedicated.server.OvhServerBurst;
import net.minidev.ovh.api.dedicated.server.OvhServiceMonitoring;
import net.minidev.ovh.api.dedicated.server.OvhSmsAlert;
import net.minidev.ovh.api.dedicated.server.OvhSpla;
import net.minidev.ovh.api.dedicated.server.OvhSplaStatusEnum;
import net.minidev.ovh.api.dedicated.server.OvhSplaTypeEnum;
import net.minidev.ovh.api.dedicated.server.OvhSupportReplaceHddInfo;
import net.minidev.ovh.api.dedicated.server.OvhTask;
import net.minidev.ovh.api.dedicated.server.OvhTemplateCaps;
import net.minidev.ovh.api.dedicated.server.OvhTrafficOrderable;
import net.minidev.ovh.api.dedicated.server.OvhUsbKeyOrderableDetails;
import net.minidev.ovh.api.dedicated.server.OvhVirtualMac;
import net.minidev.ovh.api.dedicated.server.OvhVirtualMacManagement;
import net.minidev.ovh.api.dedicated.server.OvhVmacTypeEnum;
import net.minidev.ovh.api.dedicated.server.backup.OvhBackupOffer;
import net.minidev.ovh.api.dedicated.server.backup.OvhBackupPassword;
import net.minidev.ovh.api.dedicated.virtualnetworkinterface.OvhVirtualNetworkInterface;
import net.minidev.ovh.api.dedicated.virtualnetworkinterface.OvhVirtualNetworkInterfaceModeEnum;
import net.minidev.ovh.api.license.OvhWindowsOsVersionEnum;
import net.minidev.ovh.api.license.OvhWindowsSqlVersionEnum;
import net.minidev.ovh.api.nichandle.OvhOvhSubsidiaryEnum;
import net.minidev.ovh.api.secondarydns.OvhSecondaryDNS;
import net.minidev.ovh.api.secondarydns.OvhSecondaryDNSCheckField;
import net.minidev.ovh.api.secondarydns.OvhSecondaryDNSNameServer;
import net.minidev.ovh.api.service.OvhTerminationFutureUseEnum;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.support.OvhNewMessageInfo;
import net.minidev.ovh.api.vrack.OvhDedicatedServer;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/dedicated/server
 * version:1.0
 */
public class ApiOvhDedicatedserver extends ApiOvhBase {
	public ApiOvhDedicatedserver(ApiOvhCore core) {
		super(core);
	}

	/**
	 * List the availability of dedicated server
	 *
	 * REST: GET /dedicated/server/availabilities/raw
	 */
	public ArrayList<OvhAvailabilitiesRaw> availabilities_raw_GET() throws IOException {
		String qPath = "/dedicated/server/availabilities/raw";
		StringBuilder sb = path(qPath);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhAvailabilitiesRaw>> t1 = new TypeReference<ArrayList<OvhAvailabilitiesRaw>>() {};

	/**
	 * List the availability of dedicated server
	 *
	 * REST: GET /dedicated/server/availabilities
	 * @param country [required] The subsidiary company where the availability is requested
	 * @param hardware [required] The kind of hardware which is requested
	 *
	 * API beta
	 */
	public ArrayList<OvhAvailabilities> availabilities_GET(OvhOvhSubsidiaryEnum country, String hardware) throws IOException {
		String qPath = "/dedicated/server/availabilities";
		StringBuilder sb = path(qPath);
		query(sb, "country", country);
		query(sb, "hardware", hardware);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhAvailabilities>> t2 = new TypeReference<ArrayList<OvhAvailabilities>>() {};

	/**
	 * Get VirtualNetworkInterface details
	 *
	 * REST: GET /dedicated/server/virtualNetworkInterface/{uuid}
	 * @param uuid [required] VirtualNetworkInterface uuid
	 */
	public OvhVirtualNetworkInterface virtualNetworkInterface_uuid_GET(String uuid) throws IOException {
		String qPath = "/dedicated/server/virtualNetworkInterface/{uuid}";
		StringBuilder sb = path(qPath, uuid);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVirtualNetworkInterface.class);
	}

	/**
	 * List available services
	 *
	 * REST: GET /dedicated/server
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/dedicated/server";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<String>> t3 = new TypeReference<ArrayList<String>>() {};

	/**
	 * List the os available for a specified hardware reference
	 *
	 * REST: GET /dedicated/server/osAvailabilities
	 * @param hardware [required] Hardware reference requested
	 */
	public ArrayList<OvhOsAvailabilitiesEnum> osAvailabilities_GET(String hardware) throws IOException {
		String qPath = "/dedicated/server/osAvailabilities";
		StringBuilder sb = path(qPath);
		query(sb, "hardware", hardware);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhOsAvailabilitiesEnum>> t4 = new TypeReference<ArrayList<OvhOsAvailabilitiesEnum>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics/disk/{disk}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param disk [required] Disk
	 */
	public OvhRtmDisk serviceName_statistics_disk_disk_GET(String serviceName, String disk) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics/disk/{disk}";
		StringBuilder sb = path(qPath, serviceName, disk);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRtmDisk.class);
	}

	/**
	 * Get disk smart informations
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics/disk/{disk}/smart
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param disk [required] Disk
	 */
	public OvhRtmDiskSmart serviceName_statistics_disk_disk_smart_GET(String serviceName, String disk) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics/disk/{disk}/smart";
		StringBuilder sb = path(qPath, serviceName, disk);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRtmDiskSmart.class);
	}

	/**
	 * Server disks
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics/disk
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> serviceName_statistics_disk_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics/disk";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhRtm serviceName_statistics_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRtm.class);
	}

	/**
	 * Get server PCI devices informations
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics/pci
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<OvhRtmPci> serviceName_statistics_pci_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics/pci";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<OvhRtmPci>> t5 = new TypeReference<ArrayList<OvhRtmPci>>() {};

	/**
	 * Get server motherboard hardware informations
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics/motherboard
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhRtmMotherboardHw serviceName_statistics_motherboard_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics/motherboard";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRtmMotherboardHw.class);
	}

	/**
	 * Server partitions
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics/partition
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> serviceName_statistics_partition_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics/partition";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics/partition/{partition}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param partition [required] Partition
	 */
	public OvhRtmPartition serviceName_statistics_partition_partition_GET(String serviceName, String partition) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics/partition/{partition}";
		StringBuilder sb = path(qPath, serviceName, partition);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRtmPartition.class);
	}

	/**
	 * Retrieve partition charts
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics/partition/{partition}/chart
	 * @param period [required] chart period
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param partition [required] Partition
	 */
	public OvhChartReturn serviceName_statistics_partition_partition_chart_GET(String serviceName, String partition, OvhRtmChartPeriodEnum period) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics/partition/{partition}/chart";
		StringBuilder sb = path(qPath, serviceName, partition);
		query(sb, "period", period);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhChartReturn.class);
	}

	/**
	 * Get server memory informations
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics/memory
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<OvhRtmMemory> serviceName_statistics_memory_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics/memory";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t6);
	}
	private static TypeReference<ArrayList<OvhRtmMemory>> t6 = new TypeReference<ArrayList<OvhRtmMemory>>() {};

	/**
	 * Get server opened connections
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics/connection
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<OvhRtmConnection> serviceName_statistics_connection_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics/connection";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t7);
	}
	private static TypeReference<ArrayList<OvhRtmConnection>> t7 = new TypeReference<ArrayList<OvhRtmConnection>>() {};

	/**
	 * Get server process
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics/process
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<OvhRtmCommandSize> serviceName_statistics_process_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics/process";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t8);
	}
	private static TypeReference<ArrayList<OvhRtmCommandSize>> t8 = new TypeReference<ArrayList<OvhRtmCommandSize>>() {};

	/**
	 * Get server cpu informations
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics/cpu
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhRtmCpu serviceName_statistics_cpu_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics/cpu";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRtmCpu.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics/raid/{unit}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param unit [required] Raid unit
	 */
	public OvhRtmRaid serviceName_statistics_raid_unit_GET(String serviceName, String unit) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics/raid/{unit}";
		StringBuilder sb = path(qPath, serviceName, unit);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRtmRaid.class);
	}

	/**
	 * Raid unit volumes
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics/raid/{unit}/volume
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param unit [required] Raid unit
	 */
	public ArrayList<String> serviceName_statistics_raid_unit_volume_GET(String serviceName, String unit) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics/raid/{unit}/volume";
		StringBuilder sb = path(qPath, serviceName, unit);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics/raid/{unit}/volume/{volume}/port/{port}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param unit [required] Raid unit
	 * @param volume [required] Raid volume name
	 * @param port [required] Raid volume port
	 */
	public OvhRtmRaidVolumePort serviceName_statistics_raid_unit_volume_volume_port_port_GET(String serviceName, String unit, String volume, String port) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics/raid/{unit}/volume/{volume}/port/{port}";
		StringBuilder sb = path(qPath, serviceName, unit, volume, port);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRtmRaidVolumePort.class);
	}

	/**
	 * Raid unit volume ports
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics/raid/{unit}/volume/{volume}/port
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param unit [required] Raid unit
	 * @param volume [required] Raid volume name
	 */
	public ArrayList<String> serviceName_statistics_raid_unit_volume_volume_port_GET(String serviceName, String unit, String volume) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics/raid/{unit}/volume/{volume}/port";
		StringBuilder sb = path(qPath, serviceName, unit, volume);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics/raid/{unit}/volume/{volume}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param unit [required] Raid unit
	 * @param volume [required] Raid volume name
	 */
	public OvhRtmRaidVolume serviceName_statistics_raid_unit_volume_volume_GET(String serviceName, String unit, String volume) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics/raid/{unit}/volume/{volume}";
		StringBuilder sb = path(qPath, serviceName, unit, volume);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRtmRaidVolume.class);
	}

	/**
	 * Server raid informations
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics/raid
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> serviceName_statistics_raid_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics/raid";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get server os informations
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics/os
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhRtmOs serviceName_statistics_os_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics/os";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRtmOs.class);
	}

	/**
	 * Retrieve RTM graph values
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics/chart
	 * @param type [required] RTM chart type
	 * @param period [required] chart period
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhChartReturn serviceName_statistics_chart_GET(String serviceName, OvhRtmChartPeriodEnum period, OvhRtmChartTypeEnum type) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics/chart";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "period", period);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhChartReturn.class);
	}

	/**
	 * Get server load
	 *
	 * REST: GET /dedicated/server/{serviceName}/statistics/load
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhRtmLoad serviceName_statistics_load_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/statistics/load";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRtmLoad.class);
	}

	/**
	 * Add your existing windows license serial to this dedicated server. Will be manageable in /license/windows.
	 *
	 * REST: POST /dedicated/server/{serviceName}/license/windows
	 * @param licenseId [required] Your license serial number
	 * @param version [required] Your license version
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhTask serviceName_license_windows_POST(String serviceName, String licenseId, OvhWindowsOsVersionEnum version) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/license/windows";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "licenseId", licenseId);
		addBody(o, "version", version);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get the windows license compliant with your server.
	 *
	 * REST: GET /dedicated/server/{serviceName}/license/compliantWindows
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<OvhWindowsOsVersionEnum> serviceName_license_compliantWindows_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/license/compliantWindows";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t9);
	}
	private static TypeReference<ArrayList<OvhWindowsOsVersionEnum>> t9 = new TypeReference<ArrayList<OvhWindowsOsVersionEnum>>() {};

	/**
	 * Get the windows SQL server license compliant with your server.
	 *
	 * REST: GET /dedicated/server/{serviceName}/license/compliantWindowsSqlServer
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<OvhWindowsSqlVersionEnum> serviceName_license_compliantWindowsSqlServer_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/license/compliantWindowsSqlServer";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t10);
	}
	private static TypeReference<ArrayList<OvhWindowsSqlVersionEnum>> t10 = new TypeReference<ArrayList<OvhWindowsSqlVersionEnum>>() {};

	/**
	 * Get details on offered backup cloud if available for the current server
	 *
	 * REST: GET /dedicated/server/{serviceName}/backupCloudOfferDetails
	 * @param serviceName [required] The internal name of your dedicated server
	 *
	 * API beta
	 */
	public OvhBackupOffer serviceName_backupCloudOfferDetails_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/backupCloudOfferDetails";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackupOffer.class);
	}

	/**
	 * Service monitoring details
	 *
	 * REST: GET /dedicated/server/{serviceName}/serviceMonitoring
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<Long> serviceName_serviceMonitoring_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/serviceMonitoring";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t11);
	}
	private static TypeReference<ArrayList<Long>> t11 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Add a new service monitoring
	 *
	 * REST: POST /dedicated/server/{serviceName}/serviceMonitoring
	 * @param protocol [required] The protocol to use
	 * @param challengeText [required] The expected return
	 * @param port [required] The service port to monitor
	 * @param ip [required] The IP to monitor
	 * @param enabled [required] Is this service monitoring is enabled
	 * @param url [required] The URL to test
	 * @param interval [required] The test interval
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhServiceMonitoring serviceName_serviceMonitoring_POST(String serviceName, String challengeText, Boolean enabled, OvhMonitoringIntervalEnum interval, String ip, Long port, OvhMonitoringProtocolEnum protocol, String url) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/serviceMonitoring";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "challengeText", challengeText);
		addBody(o, "enabled", enabled);
		addBody(o, "interval", interval);
		addBody(o, "ip", ip);
		addBody(o, "port", port);
		addBody(o, "protocol", protocol);
		addBody(o, "url", url);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhServiceMonitoring.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}/alert/sms/{alertId}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param monitoringId [required] This monitoring id
	 * @param alertId [required] Id of this alert
	 */
	public OvhSmsAlert serviceName_serviceMonitoring_monitoringId_alert_sms_alertId_GET(String serviceName, Long monitoringId, Long alertId) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}/alert/sms/{alertId}";
		StringBuilder sb = path(qPath, serviceName, monitoringId, alertId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSmsAlert.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}/alert/sms/{alertId}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param monitoringId [required] This monitoring id
	 * @param alertId [required] Id of this alert
	 */
	public void serviceName_serviceMonitoring_monitoringId_alert_sms_alertId_PUT(String serviceName, Long monitoringId, Long alertId, OvhSmsAlert body) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}/alert/sms/{alertId}";
		StringBuilder sb = path(qPath, serviceName, monitoringId, alertId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Remove this SMS alert
	 *
	 * REST: DELETE /dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}/alert/sms/{alertId}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param monitoringId [required] This monitoring id
	 * @param alertId [required] Id of this alert
	 */
	public void serviceName_serviceMonitoring_monitoringId_alert_sms_alertId_DELETE(String serviceName, Long monitoringId, Long alertId) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}/alert/sms/{alertId}";
		StringBuilder sb = path(qPath, serviceName, monitoringId, alertId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Service monitoring alert by SMS
	 *
	 * REST: GET /dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}/alert/sms
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param monitoringId [required] This monitoring id
	 */
	public ArrayList<Long> serviceName_serviceMonitoring_monitoringId_alert_sms_GET(String serviceName, Long monitoringId) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}/alert/sms";
		StringBuilder sb = path(qPath, serviceName, monitoringId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t11);
	}

	/**
	 * Create a SMS alert
	 *
	 * REST: POST /dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}/alert/sms
	 * @param fromHour [required] Daily hour start time for SMS notification
	 * @param smsAccount [required] Your SMS account
	 * @param language [required] Alert language
	 * @param phoneNumberTo [required] Alert destination
	 * @param toHour [required] Daily hour end time for SMS notification
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param monitoringId [required] This monitoring id
	 */
	public OvhSmsAlert serviceName_serviceMonitoring_monitoringId_alert_sms_POST(String serviceName, Long monitoringId, Long fromHour, OvhAlertLanguageEnum language, String phoneNumberTo, String smsAccount, Long toHour) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}/alert/sms";
		StringBuilder sb = path(qPath, serviceName, monitoringId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "fromHour", fromHour);
		addBody(o, "language", language);
		addBody(o, "phoneNumberTo", phoneNumberTo);
		addBody(o, "smsAccount", smsAccount);
		addBody(o, "toHour", toHour);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhSmsAlert.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}/alert/email/{alertId}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param monitoringId [required] This monitoring id
	 * @param alertId [required] This monitoring id
	 */
	public OvhEmailAlert serviceName_serviceMonitoring_monitoringId_alert_email_alertId_GET(String serviceName, Long monitoringId, Long alertId) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}/alert/email/{alertId}";
		StringBuilder sb = path(qPath, serviceName, monitoringId, alertId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEmailAlert.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}/alert/email/{alertId}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param monitoringId [required] This monitoring id
	 * @param alertId [required] This monitoring id
	 */
	public void serviceName_serviceMonitoring_monitoringId_alert_email_alertId_PUT(String serviceName, Long monitoringId, Long alertId, OvhEmailAlert body) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}/alert/email/{alertId}";
		StringBuilder sb = path(qPath, serviceName, monitoringId, alertId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Remove this Email alert monitoring
	 *
	 * REST: DELETE /dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}/alert/email/{alertId}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param monitoringId [required] This monitoring id
	 * @param alertId [required] This monitoring id
	 */
	public void serviceName_serviceMonitoring_monitoringId_alert_email_alertId_DELETE(String serviceName, Long monitoringId, Long alertId) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}/alert/email/{alertId}";
		StringBuilder sb = path(qPath, serviceName, monitoringId, alertId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Service monitoring alert by email
	 *
	 * REST: GET /dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}/alert/email
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param monitoringId [required] This monitoring id
	 */
	public ArrayList<Long> serviceName_serviceMonitoring_monitoringId_alert_email_GET(String serviceName, Long monitoringId) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}/alert/email";
		StringBuilder sb = path(qPath, serviceName, monitoringId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t11);
	}

	/**
	 * Add a new email alert
	 *
	 * REST: POST /dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}/alert/email
	 * @param language [required] Alert language
	 * @param email [required] Alert destination
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param monitoringId [required] This monitoring id
	 */
	public OvhEmailAlert serviceName_serviceMonitoring_monitoringId_alert_email_POST(String serviceName, Long monitoringId, String email, OvhAlertLanguageEnum language) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}/alert/email";
		StringBuilder sb = path(qPath, serviceName, monitoringId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "email", email);
		addBody(o, "language", language);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhEmailAlert.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param monitoringId [required] This monitoring id
	 */
	public OvhServiceMonitoring serviceName_serviceMonitoring_monitoringId_GET(String serviceName, Long monitoringId) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}";
		StringBuilder sb = path(qPath, serviceName, monitoringId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhServiceMonitoring.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param monitoringId [required] This monitoring id
	 */
	public void serviceName_serviceMonitoring_monitoringId_PUT(String serviceName, Long monitoringId, OvhServiceMonitoring body) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}";
		StringBuilder sb = path(qPath, serviceName, monitoringId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Remove this service monitoring
	 *
	 * REST: DELETE /dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param monitoringId [required] This monitoring id
	 */
	public void serviceName_serviceMonitoring_monitoringId_DELETE(String serviceName, Long monitoringId) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/serviceMonitoring/{monitoringId}";
		StringBuilder sb = path(qPath, serviceName, monitoringId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/burst
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhServerBurst serviceName_burst_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/burst";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhServerBurst.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicated/server/{serviceName}/burst
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public void serviceName_burst_PUT(String serviceName, OvhServerBurst body) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/burst";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * domain name server informations
	 *
	 * REST: GET /dedicated/server/{serviceName}/secondaryDnsDomains/{domain}/dnsServer
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param domain [required] domain on slave server
	 */
	public OvhSecondaryDNSNameServer serviceName_secondaryDnsDomains_domain_dnsServer_GET(String serviceName, String domain) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/secondaryDnsDomains/{domain}/dnsServer";
		StringBuilder sb = path(qPath, serviceName, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSecondaryDNSNameServer.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/secondaryDnsDomains/{domain}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param domain [required] domain on slave server
	 */
	public OvhSecondaryDNS serviceName_secondaryDnsDomains_domain_GET(String serviceName, String domain) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/secondaryDnsDomains/{domain}";
		StringBuilder sb = path(qPath, serviceName, domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSecondaryDNS.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicated/server/{serviceName}/secondaryDnsDomains/{domain}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param domain [required] domain on slave server
	 */
	public void serviceName_secondaryDnsDomains_domain_PUT(String serviceName, String domain, OvhSecondaryDNS body) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/secondaryDnsDomains/{domain}";
		StringBuilder sb = path(qPath, serviceName, domain);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * remove this domain
	 *
	 * REST: DELETE /dedicated/server/{serviceName}/secondaryDnsDomains/{domain}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param domain [required] domain on slave server
	 */
	public void serviceName_secondaryDnsDomains_domain_DELETE(String serviceName, String domain) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/secondaryDnsDomains/{domain}";
		StringBuilder sb = path(qPath, serviceName, domain);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * List of secondary dns domain name
	 *
	 * REST: GET /dedicated/server/{serviceName}/secondaryDnsDomains
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> serviceName_secondaryDnsDomains_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/secondaryDnsDomains";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * add a domain on secondary dns
	 *
	 * REST: POST /dedicated/server/{serviceName}/secondaryDnsDomains
	 * @param domain [required] The domain to add
	 * @param ip [required]
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public void serviceName_secondaryDnsDomains_POST(String serviceName, String domain, String ip) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/secondaryDnsDomains";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		addBody(o, "ip", ip);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Your own SPLA licenses attached to this dedicated server
	 *
	 * REST: GET /dedicated/server/{serviceName}/spla
	 * @param type [required] Filter the value of type property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<Long> serviceName_spla_GET(String serviceName, OvhSplaStatusEnum status, OvhSplaTypeEnum type) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/spla";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "status", status);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t11);
	}

	/**
	 * Add a new SPLA license
	 *
	 * REST: POST /dedicated/server/{serviceName}/spla
	 * @param serialNumber [required] License serial number
	 * @param type [required] License type
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public Long serviceName_spla_POST(String serviceName, String serialNumber, OvhSplaTypeEnum type) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/spla";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "serialNumber", serialNumber);
		addBody(o, "type", type);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, Long.class);
	}

	/**
	 * Revoke an SPLA license
	 *
	 * REST: POST /dedicated/server/{serviceName}/spla/{id}/revoke
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param id [required] License id
	 */
	public void serviceName_spla_id_revoke_POST(String serviceName, Long id) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/spla/{id}/revoke";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/spla/{id}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param id [required] License id
	 */
	public OvhSpla serviceName_spla_id_GET(String serviceName, Long id) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/spla/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSpla.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicated/server/{serviceName}/spla/{id}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param id [required] License id
	 */
	public void serviceName_spla_id_PUT(String serviceName, Long id, OvhSpla body) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/spla/{id}";
		StringBuilder sb = path(qPath, serviceName, id);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Ask for a broken HDD replacement
	 *
	 * REST: POST /dedicated/server/{serviceName}/support/replace/hardDiskDrive
	 * @param comment [required] User comment
	 * @param inverse [required] If set to 'true', replace only NON LISTED DISKS
	 * @param disks [required] If 'inverse' is set as 'false', the list of HDD TO REPLACE. If 'inverse' is set as 'true', the list of HDD TO NOT REPLACE.
	 * @param serviceName [required] The internal name of your dedicated server
	 *
	 * API beta
	 */
	public OvhNewMessageInfo serviceName_support_replace_hardDiskDrive_POST(String serviceName, String comment, OvhSupportReplaceHddInfo[] disks, Boolean inverse) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/support/replace/hardDiskDrive";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "comment", comment);
		addBody(o, "disks", disks);
		addBody(o, "inverse", inverse);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhNewMessageInfo.class);
	}

	/**
	 * Merge a splitted block and route it to the choosen server. You cannot undo this operation
	 *
	 * REST: POST /dedicated/server/{serviceName}/ipBlockMerge
	 * @param block [required] The splitted block you want to merge
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhTask serviceName_ipBlockMerge_POST(String serviceName, String block) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/ipBlockMerge";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "block", block);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Is a KVM orderable with your server
	 *
	 * REST: GET /dedicated/server/{serviceName}/orderable/kvm
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public Boolean serviceName_orderable_kvm_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/orderable/kvm";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Get USB keys orderable with your server
	 *
	 * REST: GET /dedicated/server/{serviceName}/orderable/usbKey
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhUsbKeyOrderableDetails serviceName_orderable_usbKey_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/orderable/usbKey";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhUsbKeyOrderableDetails.class);
	}

	/**
	 * Get the backup storage orderable with your server.
	 *
	 * REST: GET /dedicated/server/{serviceName}/orderable/backupStorage
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhBackupStorageOrderable serviceName_orderable_backupStorage_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/orderable/backupStorage";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackupStorageOrderable.class);
	}

	/**
	 * Is this feature orderable with your server
	 *
	 * REST: GET /dedicated/server/{serviceName}/orderable/feature
	 * @param feature [required] the feature
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public Boolean serviceName_orderable_feature_GET(String serviceName, OvhOrderableSysFeatureEnum feature) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/orderable/feature";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "feature", feature);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Get orderable traffic with your server.
	 *
	 * REST: GET /dedicated/server/{serviceName}/orderable/traffic
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhTrafficOrderable serviceName_orderable_traffic_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/orderable/traffic";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTrafficOrderable.class);
	}

	/**
	 * Is professional use orderable with your server
	 *
	 * REST: GET /dedicated/server/{serviceName}/orderable/professionalUse
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public Boolean serviceName_orderable_professionalUse_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/orderable/professionalUse";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Is a KVM express orderable with your server
	 *
	 * REST: GET /dedicated/server/{serviceName}/orderable/kvmExpress
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public Boolean serviceName_orderable_kvmExpress_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/orderable/kvmExpress";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Get bandwidth orderable with your server.
	 *
	 * REST: GET /dedicated/server/{serviceName}/orderable/bandwidth
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhBandwidthOrderable serviceName_orderable_bandwidth_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/orderable/bandwidth";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBandwidthOrderable.class);
	}

	/**
	 * Get IP orderable with your server.
	 *
	 * REST: GET /dedicated/server/{serviceName}/orderable/ip
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhIpOrderable serviceName_orderable_ip_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/orderable/ip";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhIpOrderable.class);
	}

	/**
	 * Get vRack bandwidth orderable with your server.
	 *
	 * REST: GET /dedicated/server/{serviceName}/orderable/bandwidthvRack
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhBandwidthvRackOrderable serviceName_orderable_bandwidthvRack_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/orderable/bandwidthvRack";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBandwidthvRackOrderable.class);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /dedicated/server/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactBilling, String contactTech) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactBilling", contactBilling);
		addBody(o, "contactTech", contactTech);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t11);
	}

	/**
	 * technical intervention history
	 *
	 * REST: GET /dedicated/server/{serviceName}/intervention
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<Long> serviceName_intervention_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/intervention";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t11);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/intervention/{interventionId}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param interventionId [required] The intervention id
	 */
	public OvhIntervention serviceName_intervention_interventionId_GET(String serviceName, Long interventionId) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/intervention/{interventionId}";
		StringBuilder sb = path(qPath, serviceName, interventionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhIntervention.class);
	}

	/**
	 * Retrieve traffic graph values
	 *
	 * REST: GET /dedicated/server/{serviceName}/mrtg
	 * @param type [required] mrtg type
	 * @param period [required] mrtg period
	 * @param serviceName [required] The internal name of your dedicated server
	 * @deprecated
	 */
	public ArrayList<OvhMrtgTimestampValue> serviceName_mrtg_GET(String serviceName, OvhMrtgPeriodEnum period, OvhMrtgTypeEnum type) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/mrtg";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "period", period);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t12);
	}
	private static TypeReference<ArrayList<OvhMrtgTimestampValue>> t12 = new TypeReference<ArrayList<OvhMrtgTimestampValue>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/task/{taskId}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param taskId [required] the id of the task
	 */
	public OvhTask serviceName_task_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/task/{taskId}";
		StringBuilder sb = path(qPath, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * this action stop the task progression if it's possible
	 *
	 * REST: POST /dedicated/server/{serviceName}/task/{taskId}/cancel
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param taskId [required] the id of the task
	 */
	public void serviceName_task_taskId_cancel_POST(String serviceName, Long taskId) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/task/{taskId}/cancel";
		StringBuilder sb = path(qPath, serviceName, taskId);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Dedicated server todos
	 *
	 * REST: GET /dedicated/server/{serviceName}/task
	 * @param function [required] Filter the value of function property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<Long> serviceName_task_GET(String serviceName, OvhTaskFunctionEnum function, OvhTaskStatusEnum status) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/task";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "function", function);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t11);
	}

	/**
	 * Secondary nameServer available for your Server
	 *
	 * REST: GET /dedicated/server/{serviceName}/secondaryDnsNameServerAvailable
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhSecondaryDNSNameServer serviceName_secondaryDnsNameServerAvailable_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/secondaryDnsNameServerAvailable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSecondaryDNSNameServer.class);
	}

	/**
	 * Retrieve available country for IP order
	 *
	 * REST: GET /dedicated/server/{serviceName}/ipCountryAvailable
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<OvhIpCountryEnum> serviceName_ipCountryAvailable_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/ipCountryAvailable";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t13);
	}
	private static TypeReference<ArrayList<OvhIpCountryEnum>> t13 = new TypeReference<ArrayList<OvhIpCountryEnum>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/networkInterfaceController/{mac}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param mac [required] NetworkInterfaceController mac
	 *
	 * API beta
	 */
	public OvhNetworkInterfaceController serviceName_networkInterfaceController_mac_GET(String serviceName, String mac) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/networkInterfaceController/{mac}";
		StringBuilder sb = path(qPath, serviceName, mac);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhNetworkInterfaceController.class);
	}

	/**
	 * Retrieve traffic graph values
	 *
	 * REST: GET /dedicated/server/{serviceName}/networkInterfaceController/{mac}/mrtg
	 * @param period [required] mrtg period
	 * @param type [required] mrtg type
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param mac [required] NetworkInterfaceController mac
	 *
	 * API beta
	 */
	public ArrayList<OvhMrtgTimestampValue> serviceName_networkInterfaceController_mac_mrtg_GET(String serviceName, String mac, OvhMrtgPeriodEnum period, OvhMrtgTypeEnum type) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/networkInterfaceController/{mac}/mrtg";
		StringBuilder sb = path(qPath, serviceName, mac);
		query(sb, "period", period);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t12);
	}

	/**
	 * List server networkInterfaceController
	 *
	 * REST: GET /dedicated/server/{serviceName}/networkInterfaceController
	 * @param linkType [required] Filter the value of linkType property (=)
	 * @param serviceName [required] The internal name of your dedicated server
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_networkInterfaceController_GET(String serviceName, OvhNetworkInterfaceControllerLinkTypeEnum linkType) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/networkInterfaceController";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "linkType", linkType);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhDedicated serviceName_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDedicated.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicated/server/{serviceName}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public void serviceName_PUT(String serviceName, OvhDedicated body) throws IOException {
		String qPath = "/dedicated/server/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Hard reboot this server
	 *
	 * REST: POST /dedicated/server/{serviceName}/reboot
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhTask serviceName_reboot_POST(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/reboot";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/option/{option}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param option [required] The option name
	 */
	public OvhOption serviceName_option_option_GET(String serviceName, net.minidev.ovh.api.dedicated.server.OvhOptionEnum option) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/option/{option}";
		StringBuilder sb = path(qPath, serviceName, option);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOption.class);
	}

	/**
	 * Release a given option
	 *
	 * REST: DELETE /dedicated/server/{serviceName}/option/{option}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param option [required] The option name
	 */
	public void serviceName_option_option_DELETE(String serviceName, net.minidev.ovh.api.dedicated.server.OvhOptionEnum option) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/option/{option}";
		StringBuilder sb = path(qPath, serviceName, option);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * List of dedicated server options
	 *
	 * REST: GET /dedicated/server/{serviceName}/option
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<OvhOptionEnum> serviceName_option_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/option";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t14);
	}
	private static TypeReference<ArrayList<OvhOptionEnum>> t14 = new TypeReference<ArrayList<OvhOptionEnum>>() {};

	/**
	 * Start an install
	 *
	 * REST: POST /dedicated/server/{serviceName}/install/start
	 * @param details [required] parameters for default install
	 * @param templateName [required] Template name
	 * @param partitionSchemeName [required] Partition scheme name
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhTask serviceName_install_start_POST(String serviceName, OvhInstallCustom details, String partitionSchemeName, String templateName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/install/start";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "details", details);
		addBody(o, "partitionSchemeName", partitionSchemeName);
		addBody(o, "templateName", templateName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Retrieve compatible  install template partitions scheme
	 *
	 * REST: GET /dedicated/server/{serviceName}/install/compatibleTemplatePartitionSchemes
	 * @param templateName [required]
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> serviceName_install_compatibleTemplatePartitionSchemes_GET(String serviceName, String templateName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/install/compatibleTemplatePartitionSchemes";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "templateName", templateName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get installation status
	 *
	 * REST: GET /dedicated/server/{serviceName}/install/status
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhInstallationProgressStatus serviceName_install_status_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/install/status";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhInstallationProgressStatus.class);
	}

	/**
	 * Gives some capabilities regarding the template for the current dedicated server.
	 *
	 * REST: GET /dedicated/server/{serviceName}/install/templateCapabilities
	 * @param templateName [required]
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhTemplateCaps serviceName_install_templateCapabilities_GET(String serviceName, String templateName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/install/templateCapabilities";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "templateName", templateName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTemplateCaps.class);
	}

	/**
	 * Retrieve compatible  install templates names
	 *
	 * REST: GET /dedicated/server/{serviceName}/install/compatibleTemplates
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhInstallTemplate serviceName_install_compatibleTemplates_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/install/compatibleTemplates";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhInstallTemplate.class);
	}

	/**
	 * Get hardware RAID size for a given configuration
	 *
	 * REST: GET /dedicated/server/{serviceName}/install/hardwareRaidSize
	 * @param templateName [required] Template name
	 * @param partitionSchemeName [required] Partition scheme name
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhHardwareRaidSize serviceName_install_hardwareRaidSize_GET(String serviceName, String partitionSchemeName, String templateName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/install/hardwareRaidSize";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "partitionSchemeName", partitionSchemeName);
		query(sb, "templateName", templateName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhHardwareRaidSize.class);
	}

	/**
	 * Retrieve hardware RAID profile
	 *
	 * REST: GET /dedicated/server/{serviceName}/install/hardwareRaidProfile
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhHardwareRaidProfile serviceName_install_hardwareRaidProfile_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/install/hardwareRaidProfile";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhHardwareRaidProfile.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/virtualMac/{macAddress}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param macAddress [required] Virtual MAC address in 00:00:00:00:00:00 format
	 */
	public OvhVirtualMac serviceName_virtualMac_macAddress_GET(String serviceName, String macAddress) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/virtualMac/{macAddress}";
		StringBuilder sb = path(qPath, serviceName, macAddress);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVirtualMac.class);
	}

	/**
	 * List of IPs associated to this Virtual MAC
	 *
	 * REST: GET /dedicated/server/{serviceName}/virtualMac/{macAddress}/virtualAddress
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param macAddress [required] Virtual MAC address in 00:00:00:00:00:00 format
	 */
	public ArrayList<String> serviceName_virtualMac_macAddress_virtualAddress_GET(String serviceName, String macAddress) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/virtualMac/{macAddress}/virtualAddress";
		StringBuilder sb = path(qPath, serviceName, macAddress);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Add an IP to this Virtual MAC
	 *
	 * REST: POST /dedicated/server/{serviceName}/virtualMac/{macAddress}/virtualAddress
	 * @param virtualMachineName [required] Friendly name of your Virtual Machine behind this IP/MAC
	 * @param ipAddress [required] IP address to link to this virtual MAC
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param macAddress [required] Virtual MAC address in 00:00:00:00:00:00 format
	 */
	public OvhTask serviceName_virtualMac_macAddress_virtualAddress_POST(String serviceName, String macAddress, String ipAddress, String virtualMachineName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/virtualMac/{macAddress}/virtualAddress";
		StringBuilder sb = path(qPath, serviceName, macAddress);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ipAddress", ipAddress);
		addBody(o, "virtualMachineName", virtualMachineName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/virtualMac/{macAddress}/virtualAddress/{ipAddress}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param macAddress [required] Virtual MAC address in 00:00:00:00:00:00 format
	 * @param ipAddress [required] IP address
	 */
	public OvhVirtualMacManagement serviceName_virtualMac_macAddress_virtualAddress_ipAddress_GET(String serviceName, String macAddress, String ipAddress) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/virtualMac/{macAddress}/virtualAddress/{ipAddress}";
		StringBuilder sb = path(qPath, serviceName, macAddress, ipAddress);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVirtualMacManagement.class);
	}

	/**
	 * Remove this ip from virtual mac , if you remove the last linked Ip, virtualmac will be deleted
	 *
	 * REST: DELETE /dedicated/server/{serviceName}/virtualMac/{macAddress}/virtualAddress/{ipAddress}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param macAddress [required] Virtual MAC address in 00:00:00:00:00:00 format
	 * @param ipAddress [required] IP address
	 */
	public OvhTask serviceName_virtualMac_macAddress_virtualAddress_ipAddress_DELETE(String serviceName, String macAddress, String ipAddress) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/virtualMac/{macAddress}/virtualAddress/{ipAddress}";
		StringBuilder sb = path(qPath, serviceName, macAddress, ipAddress);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Virtual MAC addresses of the server
	 *
	 * REST: GET /dedicated/server/{serviceName}/virtualMac
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> serviceName_virtualMac_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/virtualMac";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Add a virtual mac to an IP address
	 *
	 * REST: POST /dedicated/server/{serviceName}/virtualMac
	 * @param virtualMachineName [required] Friendly name of your Virtual Machine behind this IP/MAC
	 * @param type [required] vmac address type
	 * @param ipAddress [required] Ip address to link with this virtualMac
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhTask serviceName_virtualMac_POST(String serviceName, String ipAddress, OvhVmacTypeEnum type, String virtualMachineName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/virtualMac";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ipAddress", ipAddress);
		addBody(o, "type", type);
		addBody(o, "virtualMachineName", virtualMachineName);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Server Vracks
	 *
	 * REST: GET /dedicated/server/{serviceName}/vrack
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> serviceName_vrack_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/vrack";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Retrieve vrack traffic graph values
	 *
	 * REST: GET /dedicated/server/{serviceName}/vrack/{vrack}/mrtg
	 * @param type [required] mrtg type
	 * @param period [required] mrtg period
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param vrack [required] vrack name
	 * @deprecated
	 */
	public ArrayList<OvhMrtgTimestampValue> serviceName_vrack_vrack_mrtg_GET(String serviceName, String vrack, OvhMrtgPeriodEnum period, OvhMrtgTypeEnum type) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/vrack/{vrack}/mrtg";
		StringBuilder sb = path(qPath, serviceName, vrack);
		query(sb, "period", period);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t12);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/vrack/{vrack}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param vrack [required] vrack name
	 */
	public OvhDedicatedServer serviceName_vrack_vrack_GET(String serviceName, String vrack) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/vrack/{vrack}";
		StringBuilder sb = path(qPath, serviceName, vrack);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDedicatedServer.class);
	}

	/**
	 * remove this server from this vrack
	 *
	 * REST: DELETE /dedicated/server/{serviceName}/vrack/{vrack}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param vrack [required] vrack name
	 */
	public net.minidev.ovh.api.vrack.OvhTask serviceName_vrack_vrack_DELETE(String serviceName, String vrack) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/vrack/{vrack}";
		StringBuilder sb = path(qPath, serviceName, vrack);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.vrack.OvhTask.class);
	}

	/**
	 * List all ip from server
	 *
	 * REST: GET /dedicated/server/{serviceName}/ips
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> serviceName_ips_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/ips";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * DNS field to temporarily add to your zone so that we can verify you are the owner of this domain
	 *
	 * REST: GET /dedicated/server/{serviceName}/secondaryDnsNameDomainToken
	 * @param domain [required] The domain to check
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhSecondaryDNSCheckField serviceName_secondaryDnsNameDomainToken_GET(String serviceName, String domain) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/secondaryDnsNameDomainToken";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "domain", domain);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSecondaryDNSCheckField.class);
	}

	/**
	 * Confirm termination of your service
	 *
	 * REST: POST /dedicated/server/{serviceName}/confirmTermination
	 * @param futureUse What next after your termination request
	 * @param reason Reason of your termination request
	 * @param commentary Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public String serviceName_confirmTermination_POST(String serviceName, String commentary, OvhTerminationFutureUseEnum futureUse, OvhTerminationReasonEnum reason, String token) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/confirmTermination";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "commentary", commentary);
		addBody(o, "futureUse", futureUse);
		addBody(o, "reason", reason);
		addBody(o, "token", token);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Terminate your service
	 *
	 * REST: POST /dedicated/server/{serviceName}/terminate
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public String serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/terminate";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * List server VirtualNetworkInterfaces
	 *
	 * REST: GET /dedicated/server/{serviceName}/virtualNetworkInterface
	 * @param mode [required] Filter the value of mode property (=)
	 * @param name [required] Filter the value of name property (=)
	 * @param vrack [required] Filter the value of vrack property (=)
	 * @param serviceName [required] The internal name of your dedicated server
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_virtualNetworkInterface_GET(String serviceName, OvhVirtualNetworkInterfaceModeEnum mode, String name, String vrack) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/virtualNetworkInterface";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "mode", mode);
		query(sb, "name", name);
		query(sb, "vrack", vrack);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/virtualNetworkInterface/{uuid}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param uuid [required] VirtualNetworkInterface unique id
	 *
	 * API beta
	 */
	public OvhVirtualNetworkInterface serviceName_virtualNetworkInterface_uuid_GET(String serviceName, String uuid) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/virtualNetworkInterface/{uuid}";
		StringBuilder sb = path(qPath, serviceName, uuid);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVirtualNetworkInterface.class);
	}

	/**
	 * Move an Ip failover to this server
	 *
	 * REST: POST /dedicated/server/{serviceName}/ipMove
	 * @param ip [required] The ip to move to this server
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhTask serviceName_ipMove_POST(String serviceName, String ip) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/ipMove";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ip", ip);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Server compatibles netboots
	 *
	 * REST: GET /dedicated/server/{serviceName}/boot
	 * @param bootType [required] Filter the value of bootType property (=)
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<Long> serviceName_boot_GET(String serviceName, OvhBootTypeEnum bootType) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/boot";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "bootType", bootType);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t11);
	}

	/**
	 * Option used on this netboot
	 *
	 * REST: GET /dedicated/server/{serviceName}/boot/{bootId}/option
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param bootId [required] boot id
	 */
	public ArrayList<OvhBootOptionEnum> serviceName_boot_bootId_option_GET(String serviceName, Long bootId) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/boot/{bootId}/option";
		StringBuilder sb = path(qPath, serviceName, bootId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t15);
	}
	private static TypeReference<ArrayList<OvhBootOptionEnum>> t15 = new TypeReference<ArrayList<OvhBootOptionEnum>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/boot/{bootId}/option/{option}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param bootId [required] boot id
	 * @param option [required] The option of this boot
	 */
	public OvhNetbootOption serviceName_boot_bootId_option_option_GET(String serviceName, Long bootId, net.minidev.ovh.api.dedicated.server.OvhBootOptionEnum option) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/boot/{bootId}/option/{option}";
		StringBuilder sb = path(qPath, serviceName, bootId, option);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhNetbootOption.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/boot/{bootId}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param bootId [required] boot id
	 */
	public OvhNetboot serviceName_boot_bootId_GET(String serviceName, Long bootId) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/boot/{bootId}";
		StringBuilder sb = path(qPath, serviceName, bootId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhNetboot.class);
	}

	/**
	 * Check if given IP can be moved to this server
	 *
	 * REST: GET /dedicated/server/{serviceName}/ipCanBeMovedTo
	 * @param ip [required] The ip to move to this server
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public void serviceName_ipCanBeMovedTo_GET(String serviceName, String ip) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/ipCanBeMovedTo";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "ip", ip);
		exec(qPath, "GET", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicated/server/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Retrieve secret to connect to the server / application
	 *
	 * REST: POST /dedicated/server/{serviceName}/authenticationSecret
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<OvhAccess> serviceName_authenticationSecret_POST(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/authenticationSecret";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, t16);
	}
	private static TypeReference<ArrayList<OvhAccess>> t16 = new TypeReference<ArrayList<OvhAccess>>() {};

	/**
	 * Reset KVM IPMI sessions
	 *
	 * REST: POST /dedicated/server/{serviceName}/features/ipmi/resetSessions
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhTask serviceName_features_ipmi_resetSessions_POST(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/ipmi/resetSessions";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * IPMI access method
	 *
	 * REST: GET /dedicated/server/{serviceName}/features/ipmi/access
	 * @param type [required] IPMI console access
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhIpmiAccessValue serviceName_features_ipmi_access_GET(String serviceName, OvhIpmiAccessTypeEnum type) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/ipmi/access";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhIpmiAccessValue.class);
	}

	/**
	 * Request an acces on KVM IPMI interface
	 *
	 * REST: POST /dedicated/server/{serviceName}/features/ipmi/access
	 * @param type [required] IPMI console access
	 * @param sshKey [required] SSH key name to allow access on KVM/IP interface with (name from /me/sshKey)
	 * @param ipToAllow [required] IP to allow connection from for this IPMI session
	 * @param ttl [required] Session access time to live in minutes
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhTask serviceName_features_ipmi_access_POST(String serviceName, String ipToAllow, String sshKey, OvhCacheTTLEnum ttl, OvhIpmiAccessTypeEnum type) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/ipmi/access";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ipToAllow", ipToAllow);
		addBody(o, "sshKey", sshKey);
		addBody(o, "ttl", ttl);
		addBody(o, "type", type);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Reset KVM IPMI interface
	 *
	 * REST: POST /dedicated/server/{serviceName}/features/ipmi/resetInterface
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhTask serviceName_features_ipmi_resetInterface_POST(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/ipmi/resetInterface";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/features/ipmi
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhIpmi serviceName_features_ipmi_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/ipmi";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhIpmi.class);
	}

	/**
	 * Launch test on KVM IPMI interface
	 *
	 * REST: POST /dedicated/server/{serviceName}/features/ipmi/test
	 * @param type [required] Test to make on KVM IPMI interface
	 * @param ttl [required] Result time to live in minutes
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhTask serviceName_features_ipmi_test_POST(String serviceName, OvhCacheTTLEnum ttl, OvhIpmiTestTypeEnum type) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/ipmi/test";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ttl", ttl);
		addBody(o, "type", type);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Result of http, ping and identification tests on IPMI interface
	 *
	 * REST: GET /dedicated/server/{serviceName}/features/ipmi/test
	 * @param type [required] Test type result on KVM IPMI interface
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhIpmiTestResult serviceName_features_ipmi_test_GET(String serviceName, OvhIpmiTestTypeEnum type) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/ipmi/test";
		StringBuilder sb = path(qPath, serviceName);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhIpmiTestResult.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/features/firewall
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhFirewall serviceName_features_firewall_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/firewall";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFirewall.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicated/server/{serviceName}/features/firewall
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public void serviceName_features_firewall_PUT(String serviceName, OvhFirewall body) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/firewall";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/features/kvm
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhKvm serviceName_features_kvm_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/kvm";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhKvm.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/features/backupFTP
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhBackupFtp serviceName_features_backupFTP_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/backupFTP";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackupFtp.class);
	}

	/**
	 * Create a new Backup FTP space
	 *
	 * REST: POST /dedicated/server/{serviceName}/features/backupFTP
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhTask serviceName_features_backupFTP_POST(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/backupFTP";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Terminate your Backup FTP service, ALL DATA WILL BE PERMANENTLY DELETED
	 *
	 * REST: DELETE /dedicated/server/{serviceName}/features/backupFTP
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhTask serviceName_features_backupFTP_DELETE(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/backupFTP";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Change your Backup FTP password
	 *
	 * REST: POST /dedicated/server/{serviceName}/features/backupFTP/password
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhTask serviceName_features_backupFTP_password_POST(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/backupFTP/password";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get all IP blocks that can be used in the ACL
	 *
	 * REST: GET /dedicated/server/{serviceName}/features/backupFTP/authorizableBlocks
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> serviceName_features_backupFTP_authorizableBlocks_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/backupFTP/authorizableBlocks";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * List of IP blocks (and protocols to allow on these blocks) authorized on your backup FTP
	 *
	 * REST: GET /dedicated/server/{serviceName}/features/backupFTP/access
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public ArrayList<String> serviceName_features_backupFTP_access_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/backupFTP/access";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new Backup FTP ACL
	 *
	 * REST: POST /dedicated/server/{serviceName}/features/backupFTP/access
	 * @param cifs [required] Wether to allow the CIFS (SMB) protocol for this ACL
	 * @param ftp [required] Wether to allow the FTP protocol for this ACL
	 * @param nfs [required] Wether to allow the NFS protocol for this ACL
	 * @param ipBlock [required] The IP Block specific to this ACL. It musts belong to your server.
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhTask serviceName_features_backupFTP_access_POST(String serviceName, Boolean cifs, Boolean ftp, String ipBlock, Boolean nfs) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/backupFTP/access";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "cifs", cifs);
		addBody(o, "ftp", ftp);
		addBody(o, "ipBlock", ipBlock);
		addBody(o, "nfs", nfs);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/features/backupFTP/access/{ipBlock}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param ipBlock [required] The IP Block specific to this ACL
	 */
	public OvhBackupFtpAcl serviceName_features_backupFTP_access_ipBlock_GET(String serviceName, String ipBlock) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/backupFTP/access/{ipBlock}";
		StringBuilder sb = path(qPath, serviceName, ipBlock);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackupFtpAcl.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /dedicated/server/{serviceName}/features/backupFTP/access/{ipBlock}
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param ipBlock [required] The IP Block specific to this ACL
	 */
	public void serviceName_features_backupFTP_access_ipBlock_PUT(String serviceName, String ipBlock, OvhBackupFtpAcl body) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/backupFTP/access/{ipBlock}";
		StringBuilder sb = path(qPath, serviceName, ipBlock);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Revoke this ACL
	 *
	 * REST: DELETE /dedicated/server/{serviceName}/features/backupFTP/access/{ipBlock}
	 * @param serviceName [required] The internal name of your dedicated server
	 * @param ipBlock [required] The IP Block specific to this ACL
	 */
	public OvhTask serviceName_features_backupFTP_access_ipBlock_DELETE(String serviceName, String ipBlock) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/backupFTP/access/{ipBlock}";
		StringBuilder sb = path(qPath, serviceName, ipBlock);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /dedicated/server/{serviceName}/features/backupCloud
	 * @param serviceName [required] The internal name of your dedicated server
	 *
	 * API beta
	 */
	public OvhBackupCloud serviceName_features_backupCloud_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/backupCloud";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBackupCloud.class);
	}

	/**
	 * Create a new storage backup space associated to server
	 *
	 * REST: POST /dedicated/server/{serviceName}/features/backupCloud
	 * @param projectDescription [required] Project description of the project to be created (ignored when an existing project is already specified)
	 * @param cloudProjectId [required] cloud project id
	 * @param serviceName [required] The internal name of your dedicated server
	 *
	 * API beta
	 */
	public OvhBackupCloud serviceName_features_backupCloud_POST(String serviceName, String cloudProjectId, String projectDescription) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/backupCloud";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "cloudProjectId", cloudProjectId);
		addBody(o, "projectDescription", projectDescription);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhBackupCloud.class);
	}

	/**
	 * Deactivate the cloud backup associated to the server. This does not delete container data.
	 *
	 * REST: DELETE /dedicated/server/{serviceName}/features/backupCloud
	 * @param serviceName [required] The internal name of your dedicated server
	 *
	 * API beta
	 */
	public void serviceName_features_backupCloud_DELETE(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/backupCloud";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Change your cloud account password
	 *
	 * REST: POST /dedicated/server/{serviceName}/features/backupCloud/password
	 * @param serviceName [required] The internal name of your dedicated server
	 *
	 * API beta
	 */
	public OvhBackupPassword serviceName_features_backupCloud_password_POST(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/features/backupCloud/password";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhBackupPassword.class);
	}

	/**
	 * Retrieve IP capabilities about this dedicated server
	 *
	 * REST: GET /dedicated/server/{serviceName}/specifications/ip
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhIpOrderable serviceName_specifications_ip_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/specifications/ip";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhIpOrderable.class);
	}

	/**
	 * Retrieve network informations about this dedicated server
	 *
	 * REST: GET /dedicated/server/{serviceName}/specifications/network
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhNetworkSpecifications serviceName_specifications_network_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/specifications/network";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhNetworkSpecifications.class);
	}

	/**
	 * Retrieve hardware informations about this dedicated server
	 *
	 * REST: GET /dedicated/server/{serviceName}/specifications/hardware
	 * @param serviceName [required] The internal name of your dedicated server
	 */
	public OvhHardwareSpecifications serviceName_specifications_hardware_GET(String serviceName) throws IOException {
		String qPath = "/dedicated/server/{serviceName}/specifications/hardware";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhHardwareSpecifications.class);
	}
}
