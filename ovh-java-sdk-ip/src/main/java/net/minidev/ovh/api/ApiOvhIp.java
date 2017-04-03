package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.complextype.OvhRange;
import net.minidev.ovh.api.ip.OvhAntiphishing;
import net.minidev.ovh.api.ip.OvhAntiphishingStateEnum;
import net.minidev.ovh.api.ip.OvhArpBlockedIp;
import net.minidev.ovh.api.ip.OvhArpStateEnum;
import net.minidev.ovh.api.ip.OvhBlockedIp;
import net.minidev.ovh.api.ip.OvhBlockedIpStateEnum;
import net.minidev.ovh.api.ip.OvhDestinations;
import net.minidev.ovh.api.ip.OvhFirewallActionEnum;
import net.minidev.ovh.api.ip.OvhFirewallIp;
import net.minidev.ovh.api.ip.OvhFirewallNetworkRule;
import net.minidev.ovh.api.ip.OvhFirewallOptionTCP;
import net.minidev.ovh.api.ip.OvhFirewallProtocolEnum;
import net.minidev.ovh.api.ip.OvhFirewallRuleStateEnum;
import net.minidev.ovh.api.ip.OvhFirewallSequenceRangeEnum;
import net.minidev.ovh.api.ip.OvhFirewallStateEnum;
import net.minidev.ovh.api.ip.OvhGameMitigation;
import net.minidev.ovh.api.ip.OvhGameMitigationRule;
import net.minidev.ovh.api.ip.OvhGameMitigationRuleProtocolEnum;
import net.minidev.ovh.api.ip.OvhIp;
import net.minidev.ovh.api.ip.OvhIpMigrationToken;
import net.minidev.ovh.api.ip.OvhIpTask;
import net.minidev.ovh.api.ip.OvhIpTypeEnum;
import net.minidev.ovh.api.ip.OvhLoadBalancingAdditionalPortEnum;
import net.minidev.ovh.api.ip.OvhLoadBalancingBackendIp;
import net.minidev.ovh.api.ip.OvhLoadBalancingBackendProbeEnum;
import net.minidev.ovh.api.ip.OvhLoadBalancingIp;
import net.minidev.ovh.api.ip.OvhLoadBalancingStickinessEnum;
import net.minidev.ovh.api.ip.OvhLoadBalancingTask;
import net.minidev.ovh.api.ip.OvhLoadBalancingZoneEnum;
import net.minidev.ovh.api.ip.OvhMitigationDetailedStats;
import net.minidev.ovh.api.ip.OvhMitigationIp;
import net.minidev.ovh.api.ip.OvhMitigationProfile;
import net.minidev.ovh.api.ip.OvhMitigationProfileAutoMitigationTimeOutEnum;
import net.minidev.ovh.api.ip.OvhMitigationStateEnum;
import net.minidev.ovh.api.ip.OvhMitigationStats;
import net.minidev.ovh.api.ip.OvhMitigationStatsScaleEnum;
import net.minidev.ovh.api.ip.OvhReverseDelegation;
import net.minidev.ovh.api.ip.OvhReverseIp;
import net.minidev.ovh.api.ip.OvhRipeInfos;
import net.minidev.ovh.api.ip.OvhServiceIp;
import net.minidev.ovh.api.ip.OvhSpamIp;
import net.minidev.ovh.api.ip.OvhSpamStateEnum;
import net.minidev.ovh.api.ip.OvhSpamStats;
import net.minidev.ovh.api.ip.OvhTaskFunctionEnum;
import net.minidev.ovh.api.ip.OvhTaskStatusEnum;
import net.minidev.ovh.api.ip.loadbalancingip.OvhLoadBalancingPort;
import net.minidev.ovh.api.iploadbalancing.task.OvhTask;
import net.minidev.ovh.api.service.OvhTerminationReasonEnum;
import net.minidev.ovh.api.services.OvhNonExpiringService;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/ip
 * version:1.0
 */
public class ApiOvhIp extends ApiOvhBase {
	public ApiOvhIp(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Your OVH IPs
	 * 
	 * REST: GET /ip
	 * @param ip [required] Filter the value of ip property (contains or equals)
	 * @param routedTo_serviceName [required] Filter the value of routedTo.serviceName property (like)
	 * @param type [required] Filter the value of type property (=)
	 * @param description [required] Filter the value of description property (like)
	 */
	public ArrayList<String> GET(String description, String ip, String routedTo_serviceName, OvhIpTypeEnum type) throws IOException {
		String qPath = "/ip";
		qPath = query(qPath, "description", description);
		qPath = query(qPath, "ip", ip);
		qPath = query(qPath, "routedTo.serviceName", routedTo_serviceName);
		qPath = query(qPath, "type", type);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/{ip}
	 * @param ip [required]
	 */
	public OvhIp ip_GET(String ip) throws IOException {
		String qPath = "/ip/{ip}";
		qPath = qPath.replace("{ip}", ip);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhIp.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ip/{ip}
	 * @param null [required] New object properties
	 * @param ip [required]
	 */
	public void ip_PUT(String ip, OvhIp body) throws IOException {
		String qPath = "/ip/{ip}";
		qPath = qPath.replace("{ip}", ip);
		exec("PUT", qPath, body);
	}

	/**
	 * Move this IP to another service
	 * 
	 * REST: POST /ip/{ip}/move
	 * @param nexthop [required] Nexthop of destination service
	 * @param to [required] Service destination
	 * @param ip [required]
	 */
	public OvhIpTask ip_move_POST(String ip, String nexthop, String to) throws IOException {
		String qPath = "/ip/{ip}/move";
		qPath = qPath.replace("{ip}", ip);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "nexthop", nexthop);
		addBody(o, "to", to);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhIpTask.class);
	}

	/**
	 * List services available as a destination
	 * 
	 * REST: GET /ip/{ip}/move
	 * @param ip [required]
	 */
	public OvhDestinations ip_move_GET(String ip) throws IOException {
		String qPath = "/ip/{ip}/move";
		qPath = qPath.replace("{ip}", ip);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDestinations.class);
	}

	/**
	 * ARP blocked IP
	 * 
	 * REST: GET /ip/{ip}/arp
	 * @param state [required] Filter the value of state property (=)
	 * @param ip [required]
	 */
	public ArrayList<String> ip_arp_GET(String ip, OvhArpStateEnum state) throws IOException {
		String qPath = "/ip/{ip}/arp";
		qPath = qPath.replace("{ip}", ip);
		qPath = query(qPath, "state", state);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/{ip}/arp/{ipBlocked}
	 * @param ip [required]
	 * @param ipBlocked [required] your IP
	 */
	public OvhArpBlockedIp ip_arp_ipBlocked_GET(String ip, String ipBlocked) throws IOException {
		String qPath = "/ip/{ip}/arp/{ipBlocked}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipBlocked}", ipBlocked);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhArpBlockedIp.class);
	}

	/**
	 * Unblock this IP
	 * 
	 * REST: POST /ip/{ip}/arp/{ipBlocked}/unblock
	 * @param ip [required]
	 * @param ipBlocked [required] your IP
	 */
	public void ip_arp_ipBlocked_unblock_POST(String ip, String ipBlocked) throws IOException {
		String qPath = "/ip/{ip}/arp/{ipBlocked}/unblock";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipBlocked}", ipBlocked);
		exec("POST", qPath);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/{ip}/ripe
	 * @param ip [required]
	 */
	public OvhRipeInfos ip_ripe_GET(String ip) throws IOException {
		String qPath = "/ip/{ip}/ripe";
		qPath = qPath.replace("{ip}", ip);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhRipeInfos.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ip/{ip}/ripe
	 * @param null [required] New object properties
	 * @param ip [required]
	 */
	public void ip_ripe_PUT(String ip, OvhRipeInfos body) throws IOException {
		String qPath = "/ip/{ip}/ripe";
		qPath = qPath.replace("{ip}", ip);
		exec("PUT", qPath, body);
	}

	/**
	 * Delete a failover IP
	 * 
	 * REST: POST /ip/{ip}/terminate
	 * @param ip [required]
	 */
	public OvhIpTask ip_terminate_POST(String ip) throws IOException {
		String qPath = "/ip/{ip}/terminate";
		qPath = qPath.replace("{ip}", ip);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhIpTask.class);
	}

	/**
	 * Change organisation of this IP
	 * 
	 * REST: POST /ip/{ip}/changeOrg
	 * @param organisation [required] Your organisation id (RIPE_XXXX) to add on block informations
	 * @param ip [required]
	 */
	public OvhIpTask ip_changeOrg_POST(String ip, String organisation) throws IOException {
		String qPath = "/ip/{ip}/changeOrg";
		qPath = qPath.replace("{ip}", ip);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "organisation", organisation);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhIpTask.class);
	}

	/**
	 * Park this IP
	 * 
	 * REST: POST /ip/{ip}/park
	 * @param ip [required]
	 */
	public OvhIpTask ip_park_POST(String ip) throws IOException {
		String qPath = "/ip/{ip}/park";
		qPath = qPath.replace("{ip}", ip);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhIpTask.class);
	}

	/**
	 * Ip spamming
	 * 
	 * REST: GET /ip/{ip}/spam
	 * @param state [required] Filter the value of state property (=)
	 * @param ip [required]
	 */
	public ArrayList<String> ip_spam_GET(String ip, OvhSpamStateEnum state) throws IOException {
		String qPath = "/ip/{ip}/spam";
		qPath = qPath.replace("{ip}", ip);
		qPath = query(qPath, "state", state);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/{ip}/spam/{ipSpamming}
	 * @param ip [required]
	 * @param ipSpamming [required] IP address which is sending spam
	 */
	public OvhSpamIp ip_spam_ipSpamming_GET(String ip, String ipSpamming) throws IOException {
		String qPath = "/ip/{ip}/spam/{ipSpamming}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipSpamming}", ipSpamming);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhSpamIp.class);
	}

	/**
	 * Release the ip from anti-spam system
	 * 
	 * REST: POST /ip/{ip}/spam/{ipSpamming}/unblock
	 * @param ip [required]
	 * @param ipSpamming [required] IP address which is sending spam
	 */
	public OvhSpamIp ip_spam_ipSpamming_unblock_POST(String ip, String ipSpamming) throws IOException {
		String qPath = "/ip/{ip}/spam/{ipSpamming}/unblock";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipSpamming}", ipSpamming);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhSpamIp.class);
	}

	/**
	 * Get statistics about the email traffic
	 * 
	 * REST: GET /ip/{ip}/spam/{ipSpamming}/stats
	 * @param to [required] End date
	 * @param from [required] Start date
	 * @param ip [required]
	 * @param ipSpamming [required] IP address which is sending spam
	 */
	public ArrayList<OvhSpamStats> ip_spam_ipSpamming_stats_GET(String ip, String ipSpamming, Date from, Date to) throws IOException {
		String qPath = "/ip/{ip}/spam/{ipSpamming}/stats";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipSpamming}", ipSpamming);
		qPath = query(qPath, "from", from);
		qPath = query(qPath, "to", to);
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhSpamStats>> t2 = new TypeReference<ArrayList<OvhSpamStats>>() {};

	/**
	 * Reverse delegation on IPv6 subnet
	 * 
	 * REST: GET /ip/{ip}/delegation
	 * @param ip [required]
	 */
	public ArrayList<String> ip_delegation_GET(String ip) throws IOException {
		String qPath = "/ip/{ip}/delegation";
		qPath = qPath.replace("{ip}", ip);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Add target for reverse delegation on IPv6 subnet
	 * 
	 * REST: POST /ip/{ip}/delegation
	 * @param target [required] Target for reverse delegation on IPv6
	 * @param ip [required]
	 */
	public OvhReverseDelegation ip_delegation_POST(String ip, String target) throws IOException {
		String qPath = "/ip/{ip}/delegation";
		qPath = qPath.replace("{ip}", ip);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "target", target);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhReverseDelegation.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/{ip}/delegation/{target}
	 * @param ip [required]
	 * @param target [required] NS target for delegation
	 */
	public OvhReverseDelegation ip_delegation_target_GET(String ip, String target) throws IOException {
		String qPath = "/ip/{ip}/delegation/{target}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{target}", target);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhReverseDelegation.class);
	}

	/**
	 * Delete a target for reverse delegation on IPv6 subnet
	 * 
	 * REST: DELETE /ip/{ip}/delegation/{target}
	 * @param ip [required]
	 * @param target [required] NS target for delegation
	 */
	public void ip_delegation_target_DELETE(String ip, String target) throws IOException {
		String qPath = "/ip/{ip}/delegation/{target}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{target}", target);
		exec("DELETE", qPath);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/{ip}/migrationToken
	 * @param ip [required]
	 */
	public OvhIpMigrationToken ip_migrationToken_GET(String ip) throws IOException {
		String qPath = "/ip/{ip}/migrationToken";
		qPath = qPath.replace("{ip}", ip);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhIpMigrationToken.class);
	}

	/**
	 * Generate a migration token
	 * 
	 * REST: POST /ip/{ip}/migrationToken
	 * @param customerId [required] destination customer ID
	 * @param ip [required]
	 */
	public OvhIpMigrationToken ip_migrationToken_POST(String ip, String customerId) throws IOException {
		String qPath = "/ip/{ip}/migrationToken";
		qPath = qPath.replace("{ip}", ip);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "customerId", customerId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhIpMigrationToken.class);
	}

	/**
	 * Manage mitigation profile on your IPs
	 * 
	 * REST: GET /ip/{ip}/mitigationProfiles
	 * @param ip [required]
	 */
	public ArrayList<String> ip_mitigationProfiles_GET(String ip) throws IOException {
		String qPath = "/ip/{ip}/mitigationProfiles";
		qPath = qPath.replace("{ip}", ip);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Create new profile for one of your ip
	 * 
	 * REST: POST /ip/{ip}/mitigationProfiles
	 * @param ipMitigationProfile [required]
	 * @param autoMitigationTimeOut [required] Delay to wait before remove ip from auto mitigation after an attack
	 * @param ip [required]
	 */
	public OvhMitigationProfile ip_mitigationProfiles_POST(String ip, String ipMitigationProfile, OvhMitigationProfileAutoMitigationTimeOutEnum autoMitigationTimeOut) throws IOException {
		String qPath = "/ip/{ip}/mitigationProfiles";
		qPath = qPath.replace("{ip}", ip);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ipMitigationProfile", ipMitigationProfile);
		addBody(o, "autoMitigationTimeOut", autoMitigationTimeOut);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhMitigationProfile.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/{ip}/mitigationProfiles/{ipMitigationProfile}
	 * @param ip [required]
	 * @param ipMitigationProfile [required]
	 */
	public OvhMitigationProfile ip_mitigationProfiles_ipMitigationProfile_GET(String ip, String ipMitigationProfile) throws IOException {
		String qPath = "/ip/{ip}/mitigationProfiles/{ipMitigationProfile}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipMitigationProfile}", ipMitigationProfile);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhMitigationProfile.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ip/{ip}/mitigationProfiles/{ipMitigationProfile}
	 * @param null [required] New object properties
	 * @param ip [required]
	 * @param ipMitigationProfile [required]
	 */
	public void ip_mitigationProfiles_ipMitigationProfile_PUT(String ip, String ipMitigationProfile, OvhMitigationProfile body) throws IOException {
		String qPath = "/ip/{ip}/mitigationProfiles/{ipMitigationProfile}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipMitigationProfile}", ipMitigationProfile);
		exec("PUT", qPath, body);
	}

	/**
	 * Delete mitigation profile
	 * 
	 * REST: DELETE /ip/{ip}/mitigationProfiles/{ipMitigationProfile}
	 * @param ip [required]
	 * @param ipMitigationProfile [required]
	 */
	public void ip_mitigationProfiles_ipMitigationProfile_DELETE(String ip, String ipMitigationProfile) throws IOException {
		String qPath = "/ip/{ip}/mitigationProfiles/{ipMitigationProfile}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipMitigationProfile}", ipMitigationProfile);
		exec("DELETE", qPath);
	}

	/**
	 * IP tasks
	 * 
	 * REST: GET /ip/{ip}/task
	 * @param function [required] Filter the value of function property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param ip [required]
	 */
	public ArrayList<Long> ip_task_GET(String ip, OvhTaskFunctionEnum function, OvhTaskStatusEnum status) throws IOException {
		String qPath = "/ip/{ip}/task";
		qPath = qPath.replace("{ip}", ip);
		qPath = query(qPath, "function", function);
		qPath = query(qPath, "status", status);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<Long>> t3 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/{ip}/task/{taskId}
	 * @param ip [required]
	 * @param taskId [required] the id of the task
	 */
	public OvhIpTask ip_task_taskId_GET(String ip, Long taskId) throws IOException {
		String qPath = "/ip/{ip}/task/{taskId}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{taskId}", taskId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhIpTask.class);
	}

	/**
	 * WorkLight licenses associated to this IP
	 * 
	 * REST: GET /ip/{ip}/license/worklight
	 * @param ipAddress [required] Filter the value of ipAddress property (=)
	 * @param ip [required]
	 */
	public ArrayList<String> ip_license_worklight_GET(String ip, String ipAddress) throws IOException {
		String qPath = "/ip/{ip}/license/worklight";
		qPath = qPath.replace("{ip}", ip);
		qPath = query(qPath, "ipAddress", ipAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Cloud Linux licenses associated to this IP
	 * 
	 * REST: GET /ip/{ip}/license/cloudLinux
	 * @param ipAddress [required] Filter the value of ipAddress property (=)
	 * @param ip [required]
	 */
	public ArrayList<String> ip_license_cloudLinux_GET(String ip, String ipAddress) throws IOException {
		String qPath = "/ip/{ip}/license/cloudLinux";
		qPath = qPath.replace("{ip}", ip);
		qPath = query(qPath, "ipAddress", ipAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * DirectAdmin licenses associated to this IP
	 * 
	 * REST: GET /ip/{ip}/license/directadmin
	 * @param ipAddress [required] Filter the value of ipAddress property (=)
	 * @param ip [required]
	 */
	public ArrayList<String> ip_license_directadmin_GET(String ip, String ipAddress) throws IOException {
		String qPath = "/ip/{ip}/license/directadmin";
		qPath = qPath.replace("{ip}", ip);
		qPath = query(qPath, "ipAddress", ipAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Windows licenses associated to this IP
	 * 
	 * REST: GET /ip/{ip}/license/windows
	 * @param ipAddress [required] Filter the value of ipAddress property (=)
	 * @param ip [required]
	 */
	public ArrayList<String> ip_license_windows_GET(String ip, String ipAddress) throws IOException {
		String qPath = "/ip/{ip}/license/windows";
		qPath = qPath.replace("{ip}", ip);
		qPath = query(qPath, "ipAddress", ipAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Virtuozzo licenses associated to this IP
	 * 
	 * REST: GET /ip/{ip}/license/virtuozzo
	 * @param ipAddress [required] Filter the value of ipAddress property (=)
	 * @param ip [required]
	 */
	public ArrayList<String> ip_license_virtuozzo_GET(String ip, String ipAddress) throws IOException {
		String qPath = "/ip/{ip}/license/virtuozzo";
		qPath = qPath.replace("{ip}", ip);
		qPath = query(qPath, "ipAddress", ipAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Cpanel licenses associated to this IP
	 * 
	 * REST: GET /ip/{ip}/license/cpanel
	 * @param ipAddress [required] Filter the value of ipAddress property (=)
	 * @param ip [required]
	 */
	public ArrayList<String> ip_license_cpanel_GET(String ip, String ipAddress) throws IOException {
		String qPath = "/ip/{ip}/license/cpanel";
		qPath = qPath.replace("{ip}", ip);
		qPath = query(qPath, "ipAddress", ipAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * SQL Server licenses associated to this IP
	 * 
	 * REST: GET /ip/{ip}/license/sqlserver
	 * @param ipAddress [required] Filter the value of ipAddress property (=)
	 * @param ip [required]
	 */
	public ArrayList<String> ip_license_sqlserver_GET(String ip, String ipAddress) throws IOException {
		String qPath = "/ip/{ip}/license/sqlserver";
		qPath = qPath.replace("{ip}", ip);
		qPath = query(qPath, "ipAddress", ipAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Plesk licenses associated to this IP
	 * 
	 * REST: GET /ip/{ip}/license/plesk
	 * @param ipAddress [required] Filter the value of ipAddress property (=)
	 * @param ip [required]
	 */
	public ArrayList<String> ip_license_plesk_GET(String ip, String ipAddress) throws IOException {
		String qPath = "/ip/{ip}/license/plesk";
		qPath = qPath.replace("{ip}", ip);
		qPath = query(qPath, "ipAddress", ipAddress);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Ip under mitigation
	 * 
	 * REST: GET /ip/{ip}/mitigation
	 * @param auto [required] Filter the value of auto property (=)
	 * @param state [required] Filter the value of state property (=)
	 * @param ip [required]
	 */
	public ArrayList<String> ip_mitigation_GET(String ip, Boolean auto, OvhMitigationStateEnum state) throws IOException {
		String qPath = "/ip/{ip}/mitigation";
		qPath = qPath.replace("{ip}", ip);
		qPath = query(qPath, "auto", auto);
		qPath = query(qPath, "state", state);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * AntiDDOS option. Add new IP on permanent mitigation
	 * 
	 * REST: POST /ip/{ip}/mitigation
	 * @param ipOnMitigation [required]
	 * @param ip [required]
	 */
	public OvhMitigationIp ip_mitigation_POST(String ip, String ipOnMitigation) throws IOException {
		String qPath = "/ip/{ip}/mitigation";
		qPath = qPath.replace("{ip}", ip);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ipOnMitigation", ipOnMitigation);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhMitigationIp.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/{ip}/mitigation/{ipOnMitigation}
	 * @param ip [required]
	 * @param ipOnMitigation [required]
	 */
	public OvhMitigationIp ip_mitigation_ipOnMitigation_GET(String ip, String ipOnMitigation) throws IOException {
		String qPath = "/ip/{ip}/mitigation/{ipOnMitigation}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipOnMitigation}", ipOnMitigation);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhMitigationIp.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ip/{ip}/mitigation/{ipOnMitigation}
	 * @param null [required] New object properties
	 * @param ip [required]
	 * @param ipOnMitigation [required]
	 */
	public void ip_mitigation_ipOnMitigation_PUT(String ip, String ipOnMitigation, OvhMitigationIp body) throws IOException {
		String qPath = "/ip/{ip}/mitigation/{ipOnMitigation}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipOnMitigation}", ipOnMitigation);
		exec("PUT", qPath, body);
	}

	/**
	 * AntiDDOS option. Delete IP from mitigation
	 * 
	 * REST: DELETE /ip/{ip}/mitigation/{ipOnMitigation}
	 * @param ip [required]
	 * @param ipOnMitigation [required]
	 */
	public OvhMitigationIp ip_mitigation_ipOnMitigation_DELETE(String ip, String ipOnMitigation) throws IOException {
		String qPath = "/ip/{ip}/mitigation/{ipOnMitigation}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipOnMitigation}", ipOnMitigation);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhMitigationIp.class);
	}

	/**
	 * AntiDDOS option. Get statistics about your traffic in and out during this mitigation
	 * 
	 * REST: GET /ip/{ip}/mitigation/{ipOnMitigation}/stats
	 * @param to [required] End date
	 * @param from [required] Start date
	 * @param scale [required] Scale of aggregation
	 * @param ip [required]
	 * @param ipOnMitigation [required]
	 */
	public ArrayList<OvhMitigationStats> ip_mitigation_ipOnMitigation_stats_GET(String ip, String ipOnMitigation, Date from, OvhMitigationStatsScaleEnum scale, Date to) throws IOException {
		String qPath = "/ip/{ip}/mitigation/{ipOnMitigation}/stats";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipOnMitigation}", ipOnMitigation);
		qPath = query(qPath, "from", from);
		qPath = query(qPath, "scale", scale);
		qPath = query(qPath, "to", to);
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhMitigationStats>> t4 = new TypeReference<ArrayList<OvhMitigationStats>>() {};

	/**
	 * AntiDDOS option. Get top stream on your ip on a specific timestamp
	 * 
	 * REST: GET /ip/{ip}/mitigation/{ipOnMitigation}/topStream
	 * @param date [required] Date to view top traffic
	 * @param scale [required] Scale of aggregation
	 * @param ip [required]
	 * @param ipOnMitigation [required]
	 */
	public ArrayList<OvhMitigationDetailedStats> ip_mitigation_ipOnMitigation_topStream_GET(String ip, String ipOnMitigation, Date date, OvhMitigationStatsScaleEnum scale) throws IOException {
		String qPath = "/ip/{ip}/mitigation/{ipOnMitigation}/topStream";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipOnMitigation}", ipOnMitigation);
		qPath = query(qPath, "date", date);
		qPath = query(qPath, "scale", scale);
		String resp = exec("GET", qPath);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<OvhMitigationDetailedStats>> t5 = new TypeReference<ArrayList<OvhMitigationDetailedStats>>() {};

	/**
	 * Reverse on your ip
	 * 
	 * REST: GET /ip/{ip}/reverse
	 * @param ip [required]
	 */
	public ArrayList<String> ip_reverse_GET(String ip) throws IOException {
		String qPath = "/ip/{ip}/reverse";
		qPath = qPath.replace("{ip}", ip);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Add reverse on an ip
	 * 
	 * REST: POST /ip/{ip}/reverse
	 * @param ipReverse [required]
	 * @param reverse [required]
	 * @param ip [required]
	 */
	public OvhReverseIp ip_reverse_POST(String ip, String ipReverse, String reverse) throws IOException {
		String qPath = "/ip/{ip}/reverse";
		qPath = qPath.replace("{ip}", ip);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ipReverse", ipReverse);
		addBody(o, "reverse", reverse);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhReverseIp.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/{ip}/reverse/{ipReverse}
	 * @param ip [required]
	 * @param ipReverse [required]
	 */
	public OvhReverseIp ip_reverse_ipReverse_GET(String ip, String ipReverse) throws IOException {
		String qPath = "/ip/{ip}/reverse/{ipReverse}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipReverse}", ipReverse);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhReverseIp.class);
	}

	/**
	 * Delete a reverse on one IP
	 * 
	 * REST: DELETE /ip/{ip}/reverse/{ipReverse}
	 * @param ip [required]
	 * @param ipReverse [required]
	 */
	public void ip_reverse_ipReverse_DELETE(String ip, String ipReverse) throws IOException {
		String qPath = "/ip/{ip}/reverse/{ipReverse}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipReverse}", ipReverse);
		exec("DELETE", qPath);
	}

	/**
	 * Anti-Hack blocked IP
	 * 
	 * REST: GET /ip/{ip}/antihack
	 * @param state [required] Filter the value of state property (=)
	 * @param ip [required]
	 */
	public ArrayList<String> ip_antihack_GET(String ip, OvhBlockedIpStateEnum state) throws IOException {
		String qPath = "/ip/{ip}/antihack";
		qPath = qPath.replace("{ip}", ip);
		qPath = query(qPath, "state", state);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/{ip}/antihack/{ipBlocked}
	 * @param ip [required]
	 * @param ipBlocked [required] your IP
	 */
	public OvhBlockedIp ip_antihack_ipBlocked_GET(String ip, String ipBlocked) throws IOException {
		String qPath = "/ip/{ip}/antihack/{ipBlocked}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipBlocked}", ipBlocked);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhBlockedIp.class);
	}

	/**
	 * Unblock this IP
	 * 
	 * REST: POST /ip/{ip}/antihack/{ipBlocked}/unblock
	 * @param ip [required]
	 * @param ipBlocked [required] your IP
	 */
	public void ip_antihack_ipBlocked_unblock_POST(String ip, String ipBlocked) throws IOException {
		String qPath = "/ip/{ip}/antihack/{ipBlocked}/unblock";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipBlocked}", ipBlocked);
		exec("POST", qPath);
	}

	/**
	 * Ip under anti-phishing
	 * 
	 * REST: GET /ip/{ip}/phishing
	 * @param ipOnAntiphishing [required] Filter the value of ipOnAntiphishing property (within or equals)
	 * @param state [required] Filter the value of state property (=)
	 * @param ip [required]
	 */
	public ArrayList<Long> ip_phishing_GET(String ip, String ipOnAntiphishing, OvhAntiphishingStateEnum state) throws IOException {
		String qPath = "/ip/{ip}/phishing";
		qPath = qPath.replace("{ip}", ip);
		qPath = query(qPath, "ipOnAntiphishing", ipOnAntiphishing);
		qPath = query(qPath, "state", state);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/{ip}/phishing/{id}
	 * @param ip [required]
	 * @param id [required] Internal ID of the phishing entry
	 */
	public OvhAntiphishing ip_phishing_id_GET(String ip, Long id) throws IOException {
		String qPath = "/ip/{ip}/phishing/{id}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhAntiphishing.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/{ip}/game/{ipOnGame}
	 * @param ip [required]
	 * @param ipOnGame [required]
	 */
	public OvhGameMitigation ip_game_ipOnGame_GET(String ip, String ipOnGame) throws IOException {
		String qPath = "/ip/{ip}/game/{ipOnGame}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipOnGame}", ipOnGame);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhGameMitigation.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ip/{ip}/game/{ipOnGame}
	 * @param null [required] New object properties
	 * @param ip [required]
	 * @param ipOnGame [required]
	 */
	public void ip_game_ipOnGame_PUT(String ip, String ipOnGame, OvhGameMitigation body) throws IOException {
		String qPath = "/ip/{ip}/game/{ipOnGame}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipOnGame}", ipOnGame);
		exec("PUT", qPath, body);
	}

	/**
	 * IDs of rules configured for this IP
	 * 
	 * REST: GET /ip/{ip}/game/{ipOnGame}/rule
	 * @param ip [required]
	 * @param ipOnGame [required]
	 */
	public ArrayList<Long> ip_game_ipOnGame_rule_GET(String ip, String ipOnGame) throws IOException {
		String qPath = "/ip/{ip}/game/{ipOnGame}/rule";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipOnGame}", ipOnGame);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Add new rule on your IP
	 * 
	 * REST: POST /ip/{ip}/game/{ipOnGame}/rule
	 * @param protocol [required] The protocol running behind the given port
	 * @param ports [required] The UDP port range to apply the rule on
	 * @param ip [required]
	 * @param ipOnGame [required]
	 */
	public OvhGameMitigationRule ip_game_ipOnGame_rule_POST(String ip, String ipOnGame, OvhGameMitigationRuleProtocolEnum protocol, OvhRange<Long> ports) throws IOException {
		String qPath = "/ip/{ip}/game/{ipOnGame}/rule";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipOnGame}", ipOnGame);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "protocol", protocol);
		addBody(o, "ports", ports);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhGameMitigationRule.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/{ip}/game/{ipOnGame}/rule/{id}
	 * @param ip [required]
	 * @param ipOnGame [required]
	 * @param id [required] ID of the rule
	 */
	public OvhGameMitigationRule ip_game_ipOnGame_rule_id_GET(String ip, String ipOnGame, Long id) throws IOException {
		String qPath = "/ip/{ip}/game/{ipOnGame}/rule/{id}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipOnGame}", ipOnGame);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhGameMitigationRule.class);
	}

	/**
	 * Delete rule
	 * 
	 * REST: DELETE /ip/{ip}/game/{ipOnGame}/rule/{id}
	 * @param ip [required]
	 * @param ipOnGame [required]
	 * @param id [required] ID of the rule
	 */
	public OvhGameMitigationRule ip_game_ipOnGame_rule_id_DELETE(String ip, String ipOnGame, Long id) throws IOException {
		String qPath = "/ip/{ip}/game/{ipOnGame}/rule/{id}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipOnGame}", ipOnGame);
		qPath = qPath.replace("{id}", id.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhGameMitigationRule.class);
	}

	/**
	 * Ip under game anti-ddos
	 * 
	 * REST: GET /ip/{ip}/game
	 * @param ip [required]
	 */
	public ArrayList<String> ip_game_GET(String ip) throws IOException {
		String qPath = "/ip/{ip}/game";
		qPath = qPath.replace("{ip}", ip);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Ip under firewall
	 * 
	 * REST: GET /ip/{ip}/firewall
	 * @param state [required] Filter the value of state property (=)
	 * @param enabled [required] Filter the value of enabled property (=)
	 * @param ip [required]
	 */
	public ArrayList<String> ip_firewall_GET(String ip, Boolean enabled, OvhFirewallStateEnum state) throws IOException {
		String qPath = "/ip/{ip}/firewall";
		qPath = qPath.replace("{ip}", ip);
		qPath = query(qPath, "enabled", enabled);
		qPath = query(qPath, "state", state);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * AntiDDOS option. Add new IP on firewall
	 * 
	 * REST: POST /ip/{ip}/firewall
	 * @param ipOnFirewall [required]
	 * @param ip [required]
	 */
	public OvhFirewallIp ip_firewall_POST(String ip, String ipOnFirewall) throws IOException {
		String qPath = "/ip/{ip}/firewall";
		qPath = qPath.replace("{ip}", ip);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ipOnFirewall", ipOnFirewall);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhFirewallIp.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/{ip}/firewall/{ipOnFirewall}
	 * @param ip [required]
	 * @param ipOnFirewall [required]
	 */
	public OvhFirewallIp ip_firewall_ipOnFirewall_GET(String ip, String ipOnFirewall) throws IOException {
		String qPath = "/ip/{ip}/firewall/{ipOnFirewall}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipOnFirewall}", ipOnFirewall);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhFirewallIp.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ip/{ip}/firewall/{ipOnFirewall}
	 * @param null [required] New object properties
	 * @param ip [required]
	 * @param ipOnFirewall [required]
	 */
	public void ip_firewall_ipOnFirewall_PUT(String ip, String ipOnFirewall, OvhFirewallIp body) throws IOException {
		String qPath = "/ip/{ip}/firewall/{ipOnFirewall}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipOnFirewall}", ipOnFirewall);
		exec("PUT", qPath, body);
	}

	/**
	 * AntiDDOS option. Delete IP and rules from firewall
	 * 
	 * REST: DELETE /ip/{ip}/firewall/{ipOnFirewall}
	 * @param ip [required]
	 * @param ipOnFirewall [required]
	 */
	public String ip_firewall_ipOnFirewall_DELETE(String ip, String ipOnFirewall) throws IOException {
		String qPath = "/ip/{ip}/firewall/{ipOnFirewall}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipOnFirewall}", ipOnFirewall);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Rules for this IP
	 * 
	 * REST: GET /ip/{ip}/firewall/{ipOnFirewall}/rule
	 * @param state [required] Filter the value of state property (=)
	 * @param ip [required]
	 * @param ipOnFirewall [required]
	 */
	public ArrayList<Long> ip_firewall_ipOnFirewall_rule_GET(String ip, String ipOnFirewall, OvhFirewallRuleStateEnum state) throws IOException {
		String qPath = "/ip/{ip}/firewall/{ipOnFirewall}/rule";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipOnFirewall}", ipOnFirewall);
		qPath = query(qPath, "state", state);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * AntiDDOS option. Add new rule on your IP
	 * 
	 * REST: POST /ip/{ip}/firewall/{ipOnFirewall}/rule
	 * @param tcpOption [required] Option on your rule. Can only be used with TCP protocol
	 * @param source [required] Source ip for your rule. Any if not set
	 * @param protocol [required] Network protocol
	 * @param destinationPort [required] Destination port for your rule. Only with TCP/UDP protocol
	 * @param sequence [required] Sequence number of your rule
	 * @param action [required] Action on this rule
	 * @param sourcePort [required] Source port for your rule. Only with TCP/UDP protocol
	 * @param ip [required]
	 * @param ipOnFirewall [required]
	 */
	public OvhFirewallNetworkRule ip_firewall_ipOnFirewall_rule_POST(String ip, String ipOnFirewall, OvhFirewallOptionTCP tcpOption, String source, OvhFirewallProtocolEnum protocol, Long destinationPort, OvhFirewallSequenceRangeEnum sequence, OvhFirewallActionEnum action, Long sourcePort) throws IOException {
		String qPath = "/ip/{ip}/firewall/{ipOnFirewall}/rule";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipOnFirewall}", ipOnFirewall);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "tcpOption", tcpOption);
		addBody(o, "source", source);
		addBody(o, "protocol", protocol);
		addBody(o, "destinationPort", destinationPort);
		addBody(o, "sequence", sequence);
		addBody(o, "action", action);
		addBody(o, "sourcePort", sourcePort);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhFirewallNetworkRule.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/{ip}/firewall/{ipOnFirewall}/rule/{sequence}
	 * @param ip [required]
	 * @param ipOnFirewall [required]
	 * @param sequence [required]
	 */
	public OvhFirewallNetworkRule ip_firewall_ipOnFirewall_rule_sequence_GET(String ip, String ipOnFirewall, Long sequence) throws IOException {
		String qPath = "/ip/{ip}/firewall/{ipOnFirewall}/rule/{sequence}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipOnFirewall}", ipOnFirewall);
		qPath = qPath.replace("{sequence}", sequence.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhFirewallNetworkRule.class);
	}

	/**
	 * AntiDDOS option. Delete rule
	 * 
	 * REST: DELETE /ip/{ip}/firewall/{ipOnFirewall}/rule/{sequence}
	 * @param ip [required]
	 * @param ipOnFirewall [required]
	 * @param sequence [required]
	 */
	public OvhFirewallNetworkRule ip_firewall_ipOnFirewall_rule_sequence_DELETE(String ip, String ipOnFirewall, Long sequence) throws IOException {
		String qPath = "/ip/{ip}/firewall/{ipOnFirewall}/rule/{sequence}";
		qPath = qPath.replace("{ip}", ip);
		qPath = qPath.replace("{ipOnFirewall}", ipOnFirewall);
		qPath = qPath.replace("{sequence}", sequence.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhFirewallNetworkRule.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/loadBalancing/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhService loadBalancing_serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ip/loadBalancing/{serviceName}/serviceInfos
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public void loadBalancing_serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Import your own ssl certificate on your IP load balancing. Ssl option is needed to use this url.
	 * 
	 * REST: POST /ip/loadBalancing/{serviceName}/importCustomSsl
	 * @param chain [required] certificate chain
	 * @param certificate [required] certificate
	 * @param key [required] certificate key
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhLoadBalancingTask loadBalancing_serviceName_importCustomSsl_POST(String serviceName, String chain, String certificate, String key) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/importCustomSsl";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "chain", chain);
		addBody(o, "certificate", certificate);
		addBody(o, "key", key);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhLoadBalancingTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/loadBalancing/{serviceName}
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhLoadBalancingIp loadBalancing_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhLoadBalancingIp.class);
	}

	/**
	 * List of backends you can attach to your IP
	 * 
	 * REST: GET /ip/loadBalancing/{serviceName}/allowedBackends
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<String> loadBalancing_serviceName_allowedBackends_GET(String serviceName) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/allowedBackends";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Ip subnet used by OVH to nat requests on your ip lb to your backends. You must ensure that your backends are not part of a network that overlap with this one.
	 * 
	 * REST: GET /ip/loadBalancing/{serviceName}/internalNatIp
	 * @param zone [required] one of your ip loadbalancing's zone
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public String loadBalancing_serviceName_internalNatIp_GET(String serviceName, OvhLoadBalancingZoneEnum zone) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/internalNatIp";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "zone", zone);
		String resp = exec("GET", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Backends for this IP load balancing
	 * 
	 * REST: GET /ip/loadBalancing/{serviceName}/backend
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<String> loadBalancing_serviceName_backend_GET(String serviceName) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/backend";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Add a new backend on your IP load balancing
	 * 
	 * REST: POST /ip/loadBalancing/{serviceName}/backend
	 * @param weight [required] Weight of the backend on its zone, must be between 1 and 100
	 * @param ipBackend [required] IP of your backend
	 * @param probe [required] The type of probe used
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhLoadBalancingTask loadBalancing_serviceName_backend_POST(String serviceName, Long weight, String ipBackend, OvhLoadBalancingBackendProbeEnum probe) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/backend";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "weight", weight);
		addBody(o, "ipBackend", ipBackend);
		addBody(o, "probe", probe);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhLoadBalancingTask.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/loadBalancing/{serviceName}/backend/{backend}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param backend [required] IP of your backend
	 */
	public OvhLoadBalancingBackendIp loadBalancing_serviceName_backend_backend_GET(String serviceName, String backend) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/backend/{backend}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{backend}", backend);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhLoadBalancingBackendIp.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ip/loadBalancing/{serviceName}/backend/{backend}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param backend [required] IP of your backend
	 */
	public void loadBalancing_serviceName_backend_backend_PUT(String serviceName, String backend, OvhLoadBalancingBackendIp body) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/backend/{backend}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{backend}", backend);
		exec("PUT", qPath, body);
	}

	/**
	 * Remove a backend IP
	 * 
	 * REST: DELETE /ip/loadBalancing/{serviceName}/backend/{backend}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param backend [required] IP of your backend
	 */
	public OvhLoadBalancingTask loadBalancing_serviceName_backend_backend_DELETE(String serviceName, String backend) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/backend/{backend}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{backend}", backend);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhLoadBalancingTask.class);
	}

	/**
	 * Set or unset the backend as a backup of another backend. Requests will be directed to the backup only if the main backend is in probe fail
	 * 
	 * REST: POST /ip/loadBalancing/{serviceName}/backend/{backend}/backupState
	 * @param mainBackendIp [required] Main backend ip, must be in the same zone as the backup
	 * @param backupStateSet [required] Set or unset the backend as backup. mainBackendIp is optional in case of unset
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param backend [required] IP of your backend
	 */
	public OvhLoadBalancingTask loadBalancing_serviceName_backend_backend_backupState_POST(String serviceName, String backend, String mainBackendIp, Boolean backupStateSet) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/backend/{backend}/backupState";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{backend}", backend);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "mainBackendIp", mainBackendIp);
		addBody(o, "backupStateSet", backupStateSet);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhLoadBalancingTask.class);
	}

	/**
	 * Set the weight of a backend. For instance, if backend A has a weight of 8 and backup B was a weight of 16, backend B will receive twice more connections as backend A. Backends must be on the same POP for the weight parameter to take effect between them.
	 * 
	 * REST: POST /ip/loadBalancing/{serviceName}/backend/{backend}/setWeight
	 * @param weight [required] weight of the backend, must be between 1 and 100, default is 8
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param backend [required] IP of your backend
	 */
	public OvhLoadBalancingTask loadBalancing_serviceName_backend_backend_setWeight_POST(String serviceName, String backend, Long weight) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/backend/{backend}/setWeight";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{backend}", backend);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "weight", weight);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhLoadBalancingTask.class);
	}

	/**
	 * Task list associated with this IP
	 * 
	 * REST: GET /ip/loadBalancing/{serviceName}/task
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<Long> loadBalancing_serviceName_task_GET(String serviceName) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/task";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/loadBalancing/{serviceName}/task/{taskId}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param taskId [required] Identifier of your task
	 */
	public OvhLoadBalancingTask loadBalancing_serviceName_task_taskId_GET(String serviceName, Long taskId) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/task/{taskId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{taskId}", taskId.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhLoadBalancingTask.class);
	}

	/**
	 * Restore OVH' ssl certificate on your IP load balancing. Ssl option is needed to use this url. (A DCV mail will be sent to postmaster@your-domain.abc)
	 * 
	 * REST: POST /ip/loadBalancing/{serviceName}/restoreSsl
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhLoadBalancingTask loadBalancing_serviceName_restoreSsl_POST(String serviceName) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/restoreSsl";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhLoadBalancingTask.class);
	}

	/**
	 * Set Stickiness type. 'ipSource' will stick clients to a backend by their source ip, 'cookie' will stick them by inserting a cookie, 'none' is to set no stickiness
	 * 
	 * REST: POST /ip/loadBalancing/{serviceName}/stickiness
	 * @param stickiness [required] The stickiness you want on your IP LoadBalancing
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhLoadBalancingTask loadBalancing_serviceName_stickiness_POST(String serviceName, OvhLoadBalancingStickinessEnum stickiness) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/stickiness";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "stickiness", stickiness);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhLoadBalancingTask.class);
	}

	/**
	 * Get all srcPort
	 * 
	 * REST: GET /ip/loadBalancing/{serviceName}/portsRedirection
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<OvhLoadBalancingAdditionalPortEnum> loadBalancing_serviceName_portsRedirection_GET(String serviceName) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/portsRedirection";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t6);
	}
	private static TypeReference<ArrayList<OvhLoadBalancingAdditionalPortEnum>> t6 = new TypeReference<ArrayList<OvhLoadBalancingAdditionalPortEnum>>() {};

	/**
	 * Add a new port redirection
	 * 
	 * REST: POST /ip/loadBalancing/{serviceName}/portsRedirection
	 * @param null [required] The port you want to redirect to
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhLoadBalancingTask loadBalancing_serviceName_portsRedirection_POST(String serviceName, OvhLoadBalancingPort body) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/portsRedirection";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath, body);
		return convertTo(resp, OvhLoadBalancingTask.class);
	}

	/**
	 * Get the value for the given srcPort
	 * 
	 * REST: GET /ip/loadBalancing/{serviceName}/portsRedirection/{srcPort}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param srcPort [required] The port you want to redirect from
	 */
	public OvhLoadBalancingPort loadBalancing_serviceName_portsRedirection_srcPort_GET(String serviceName, net.minidev.ovh.api.ip.OvhLoadBalancingAdditionalPortEnum srcPort) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/portsRedirection/{srcPort}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{srcPort}", srcPort.toString());
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhLoadBalancingPort.class);
	}

	/**
	 * Delete a port redirection
	 * 
	 * REST: DELETE /ip/loadBalancing/{serviceName}/portsRedirection/{srcPort}
	 * @param serviceName [required] The internal name of your IP load balancing
	 * @param srcPort [required] The port you want to redirect from
	 */
	public OvhLoadBalancingTask loadBalancing_serviceName_portsRedirection_srcPort_DELETE(String serviceName, net.minidev.ovh.api.ip.OvhLoadBalancingAdditionalPortEnum srcPort) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/portsRedirection/{srcPort}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{srcPort}", srcPort.toString());
		String resp = exec("DELETE", qPath);
		return convertTo(resp, OvhLoadBalancingTask.class);
	}

	/**
	 * Ip subnet used to send probes to your backends
	 * 
	 * REST: GET /ip/loadBalancing/{serviceName}/probeIp
	 * @param zone [required] one of your ip loadbalancing's zone
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public ArrayList<String> loadBalancing_serviceName_probeIp_GET(String serviceName, OvhLoadBalancingZoneEnum zone) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/probeIp";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = query(qPath, "zone", zone);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Switch to ipLoadbalancing next-gen API. Benefits : additionnals probes, DDOS protection.
	 * 
	 * REST: POST /ip/loadBalancing/{serviceName}/switchToIplbNextGenerationApi
	 * @param serviceName [required] The internal name of your IP load balancing
	 */
	public OvhTask loadBalancing_serviceName_switchToIplbNextGenerationApi_POST(String serviceName) throws IOException {
		String qPath = "/ip/loadBalancing/{serviceName}/switchToIplbNextGenerationApi";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /ip/loadBalancing
	 */
	public ArrayList<String> loadBalancing_GET() throws IOException {
		String qPath = "/ip/loadBalancing";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/service/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal name of your IP services
	 */
	public OvhNonExpiringService service_serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/ip/service/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhNonExpiringService.class);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /ip/service/{serviceName}
	 * @param serviceName [required] The internal name of your IP services
	 */
	public OvhServiceIp service_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/ip/service/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhServiceIp.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /ip/service/{serviceName}
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal name of your IP services
	 */
	public void service_serviceName_PUT(String serviceName, OvhServiceIp body) throws IOException {
		String qPath = "/ip/service/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Confirm termination of your service
	 * 
	 * REST: POST /ip/service/{serviceName}/confirmTermination
	 * @param reason Reason of your termination request
	 * @param commentary Commentary about your termination request
	 * @param token [required] The termination token sent by mail to the admin contact
	 * @param serviceName [required] The internal name of your IP services
	 */
	public String service_serviceName_confirmTermination_POST(String serviceName, OvhTerminationReasonEnum reason, String commentary, String token) throws IOException {
		String qPath = "/ip/service/{serviceName}/confirmTermination";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "reason", reason);
		addBody(o, "commentary", commentary);
		addBody(o, "token", token);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, String.class);
	}

	/**
	 * Terminate your service
	 * 
	 * REST: POST /ip/service/{serviceName}/terminate
	 * @param serviceName [required] The internal name of your IP services
	 */
	public String service_serviceName_terminate_POST(String serviceName) throws IOException {
		String qPath = "/ip/service/{serviceName}/terminate";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * Launch a contact change procedure
	 * 
	 * REST: POST /ip/service/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal name of your IP services
	 */
	public ArrayList<Long> service_serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/ip/service/{serviceName}/changeContact";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t3);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /ip/service
	 */
	public ArrayList<String> service_GET() throws IOException {
		String qPath = "/ip/service";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
}
