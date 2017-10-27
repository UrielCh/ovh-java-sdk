package net.minidev.ovh.api;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

public class ApiOvh extends ApiOvhBase {
	final public ApiOvhAllDom allDom;
	final public ApiOvhAuth auth;
	final public ApiOvhCaascontainers caasContainers;
	final public ApiOvhCaasregistry caasRegistry;
	final public ApiOvhCdndedicated cdnDedicated;
	final public ApiOvhCdnwebsite cdnWebsite;
	final public ApiOvhCdnwebstorage cdnWebstorage;
	final public ApiOvhCloud cloud;
	final public ApiOvhClusterhadoop clusterHadoop;
	final public ApiOvhDbaaslogs dbaasLogs;
	final public ApiOvhDbaasqueue dbaasQueue;
	final public ApiOvhDbaastimeseries dbaasTimeseries;
	final public ApiOvhDedicatedceph dedicatedCeph;
	final public ApiOvhDedicatedhousing dedicatedHousing;
	final public ApiOvhDedicatedinstallationTemplate dedicatedInstallationTemplate;
	final public ApiOvhDedicatednas dedicatedNas;
	final public ApiOvhDedicatednasha dedicatedNasha;
	final public ApiOvhDedicatedserver dedicatedServer;
	final public ApiOvhDedicatedCloud dedicatedCloud;
	final public ApiOvhDeskaas deskaas;
	final public ApiOvhDistributionimage distributionImage;
	final public ApiOvhDomain domain;
	final public ApiOvhEmaildomain emailDomain;
	final public ApiOvhEmailexchange emailExchange;
	final public ApiOvhEmailimapCopy emailImapCopy;
	final public ApiOvhEmailpro emailPro;
	final public ApiOvhFreefax freefax;
	final public ApiOvhHorizonView horizonView;
	final public ApiOvhHostingprivateDatabase hostingPrivateDatabase;
	final public ApiOvhHostingreseller hostingReseller;
	final public ApiOvhHostingweb hostingWeb;
	final public ApiOvhHostingwindows hostingWindows;
	final public ApiOvhHpcspot hpcspot;
	final public ApiOvhIp ip;
	final public ApiOvhIpLoadbalancing ipLoadbalancing;
	final public ApiOvhLicensecloudLinux licenseCloudLinux;
	final public ApiOvhLicensecpanel licenseCpanel;
	final public ApiOvhLicensedirectadmin licenseDirectadmin;
	final public ApiOvhLicenseoffice licenseOffice;
	final public ApiOvhLicenseplesk licensePlesk;
	final public ApiOvhLicensesqlserver licenseSqlserver;
	final public ApiOvhLicensevirtuozzo licenseVirtuozzo;
	final public ApiOvhLicensewindows licenseWindows;
	final public ApiOvhLicenseworklight licenseWorklight;
	final public ApiOvhMe me;
	final public ApiOvhMsServices msServices;
	final public ApiOvhNewAccount newAccount;
	final public ApiOvhOrder order;
	final public ApiOvhOverTheBox overTheBox;
	// final public ApiOvhPaasdatabase paasDatabase;
	final public ApiOvhPaasmonitoring paasMonitoring;
	final public ApiOvhPaastimeseries paasTimeseries;
	final public ApiOvhPackxdsl packXdsl;
	final public ApiOvhPrice price;
	final public ApiOvhRouter router;
	final public ApiOvhSaascsp2 saasCsp2;
	final public ApiOvhSms sms;
	final public ApiOvhSsl ssl;
	final public ApiOvhSslGateway sslGateway;
	final public ApiOvhStackmis stackMis;
	final public ApiOvhStore store;
	final public ApiOvhSupplymondialRelay supplyMondialRelay;
	final public ApiOvhSupport support;
	final public ApiOvhTelephony telephony;
	final public ApiOvhVeeamCloudConnect veeamCloudConnect;
	final public ApiOvhVps vps;
	final public ApiOvhVrack vrack;
	final public ApiOvhXdsl xdsl;

	public ApiOvh(ApiOvhCore core) {
		super(core);
		this.allDom = new ApiOvhAllDom(core);
		this.auth = new ApiOvhAuth(core);
		this.caasContainers = new ApiOvhCaascontainers(core);
		this.caasRegistry = new ApiOvhCaasregistry(core);
		this.cdnDedicated = new ApiOvhCdndedicated(core);
		this.cdnWebsite = new ApiOvhCdnwebsite(core);
		this.cdnWebstorage = new ApiOvhCdnwebstorage(core);
		this.cloud = new ApiOvhCloud(core);
		this.clusterHadoop = new ApiOvhClusterhadoop(core);
		this.dbaasLogs = new ApiOvhDbaaslogs(core);
		this.dbaasQueue = new ApiOvhDbaasqueue(core);
		this.dbaasTimeseries = new ApiOvhDbaastimeseries(core);
		this.dedicatedCeph = new ApiOvhDedicatedceph(core);
		this.dedicatedHousing = new ApiOvhDedicatedhousing(core);
		this.dedicatedInstallationTemplate = new ApiOvhDedicatedinstallationTemplate(core);
		this.dedicatedNas = new ApiOvhDedicatednas(core);
		this.dedicatedNasha = new ApiOvhDedicatednasha(core);
		this.dedicatedServer = new ApiOvhDedicatedserver(core);
		this.dedicatedCloud = new ApiOvhDedicatedCloud(core);
		this.deskaas = new ApiOvhDeskaas(core);
		this.distributionImage = new ApiOvhDistributionimage(core);
		this.domain = new ApiOvhDomain(core);
		this.emailDomain = new ApiOvhEmaildomain(core);
		this.emailExchange = new ApiOvhEmailexchange(core);
		this.emailImapCopy = new ApiOvhEmailimapCopy(core);
		this.emailPro = new ApiOvhEmailpro(core);
		this.freefax = new ApiOvhFreefax(core);
		this.horizonView = new ApiOvhHorizonView(core);
		this.hostingPrivateDatabase = new ApiOvhHostingprivateDatabase(core);
		this.hostingReseller = new ApiOvhHostingreseller(core);
		this.hostingWeb = new ApiOvhHostingweb(core);
		this.hostingWindows = new ApiOvhHostingwindows(core);
		this.hpcspot = new ApiOvhHpcspot(core);
		this.ip = new ApiOvhIp(core);
		this.ipLoadbalancing = new ApiOvhIpLoadbalancing(core);
		this.licenseCloudLinux = new ApiOvhLicensecloudLinux(core);
		this.licenseCpanel = new ApiOvhLicensecpanel(core);
		this.licenseDirectadmin = new ApiOvhLicensedirectadmin(core);
		this.licenseOffice = new ApiOvhLicenseoffice(core);
		this.licensePlesk = new ApiOvhLicenseplesk(core);
		this.licenseSqlserver = new ApiOvhLicensesqlserver(core);
		this.licenseVirtuozzo = new ApiOvhLicensevirtuozzo(core);
		this.licenseWindows = new ApiOvhLicensewindows(core);
		this.licenseWorklight = new ApiOvhLicenseworklight(core);
		this.me = new ApiOvhMe(core);
		this.msServices = new ApiOvhMsServices(core);
		this.newAccount = new ApiOvhNewAccount(core);
		this.order = new ApiOvhOrder(core);
		this.overTheBox = new ApiOvhOverTheBox(core);
		//this.paasDatabase = new ApiOvhPaasdatabase(core);
		this.paasMonitoring = new ApiOvhPaasmonitoring(core);
		this.paasTimeseries = new ApiOvhPaastimeseries(core);
		this.packXdsl = new ApiOvhPackxdsl(core);
		this.price = new ApiOvhPrice(core);
		this.router = new ApiOvhRouter(core);
		this.saasCsp2 = new ApiOvhSaascsp2(core);
		this.sms = new ApiOvhSms(core);
		this.ssl = new ApiOvhSsl(core);
		this.sslGateway = new ApiOvhSslGateway(core);
		this.stackMis = new ApiOvhStackmis(core);
		this.store = new ApiOvhStore(core);
		this.supplyMondialRelay = new ApiOvhSupplymondialRelay(core);
		this.support = new ApiOvhSupport(core);
		this.telephony = new ApiOvhTelephony(core);
		this.veeamCloudConnect = new ApiOvhVeeamCloudConnect(core);
		this.vps = new ApiOvhVps(core);
		this.vrack = new ApiOvhVrack(core);
		this.xdsl = new ApiOvhXdsl(core);

	}

	public static ApiOvh getInstance(String ac, String password) {
		return getInstance(ac, password, 900);
	}

	private static HashMap<String, ApiOvh> cache = new HashMap<String, ApiOvh>();

	public static ApiOvh getInstance(String ac, String password, int timeInSec) {
		ApiOvh api = cache.get(ac);
		if (api != null)
			return api;
		synchronized (cache) {
			api = cache.get(ac);
			if (api != null)
				return api;
			ApiOvhCore core = ApiOvhCore.getInstance(ac, password, timeInSec);
			api = new ApiOvh(core);
			cache.put(ac, api);
		}
		return api;
	}

	/**
	 * helper
	 * @return
	 * @throws IOException
	 */
	public List<String> listDomHosting() throws IOException {
		ArrayList<String> doms = new ArrayList<String>();
		HashSet<String> d = new HashSet<String>(this.domain.GET(null));
		for (String s : this.hostingWeb.GET())
			if (d.contains(s))
				doms.add(s);
		return doms;
	}

	public ApiOvh clone() {
		ApiOvh api = new ApiOvh(super.core.clone());
		return api;
	}

}
