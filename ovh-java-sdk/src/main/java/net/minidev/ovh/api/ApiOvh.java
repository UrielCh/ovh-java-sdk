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
	final public ApiOvhCaascontainers caascontainers;
	final public ApiOvhCaasregistry caasregistry;
	final public ApiOvhCdndedicated cdndedicated;
	final public ApiOvhCdnwebsite cdnwebsite;
	final public ApiOvhCdnwebstorage cdnwebstorage;
	final public ApiOvhCloud cloud;
	final public ApiOvhClusterhadoop clusterhadoop;
	final public ApiOvhConnectivity connectivity;
	final public ApiOvhContact contact;
	final public ApiOvhAuth auth;
	final public ApiOvhDbaaslogs dbaaslogs;
	final public ApiOvhDbaasqueue dbaasqueue;
	final public ApiOvhDbaastimeseries dbaastimeseries;
	final public ApiOvhDedicatedCloud dedicatedCloud;
	final public ApiOvhDedicatedceph dedicatedceph;
	final public ApiOvhDedicatedhousing dedicatedhousing;
	final public ApiOvhDedicatedinstallationTemplate dedicatedinstallationTemplate;
	final public ApiOvhDedicatednas dedicatednas;
	final public ApiOvhDedicatednasha dedicatednasha;
	final public ApiOvhDedicatedserver dedicatedserver;
	final public ApiOvhDeskaas deskaas;
	final public ApiOvhDistributionimage distributionimage;
	final public ApiOvhDomain domain;
	final public ApiOvhEmaildomain emaildomain;
	final public ApiOvhEmailexchange emailexchange;
	final public ApiOvhEmailpro emailpro;
	final public ApiOvhFreefax freefax;
	final public ApiOvhHorizonView horizonView;
	final public ApiOvhHostingprivateDatabase hostingprivateDatabase;
	final public ApiOvhHostingreseller hostingreseller;
	final public ApiOvhHostingweb hostingweb;
	final public ApiOvhHpcspot hpcspot;
	final public ApiOvhIp ip;
	final public ApiOvhIpLoadbalancing ipLoadbalancing;
	final public ApiOvhKube kube;
	final public ApiOvhLicensecloudLinux licensecloudLinux;
	final public ApiOvhLicensecpanel licensecpanel;
	final public ApiOvhLicensedirectadmin licensedirectadmin;
	final public ApiOvhLicenseoffice licenseoffice;
	final public ApiOvhLicenseplesk licenseplesk;
	final public ApiOvhLicensesqlserver licensesqlserver;
	final public ApiOvhLicensevirtuozzo licensevirtuozzo;
	final public ApiOvhLicensewindows licensewindows;
	final public ApiOvhLicenseworklight licenseworklight;
	final public ApiOvhMe me;
	final public ApiOvhMetrics metrics;
	final public ApiOvhMsServices msServices;
	final public ApiOvhNewAccount newAccount;
	final public ApiOvhOrder order;
	final public ApiOvhOverTheBox overTheBox;
	final public ApiOvhPaastimeseries paastimeseries;
	final public ApiOvhPacksiptrunk packsiptrunk;
	final public ApiOvhPackxdsl packxdsl;
	final public ApiOvhPartners partners;
	final public ApiOvhPrice price;
	final public ApiOvhRouter router;
	final public ApiOvhSaascsp2 saascsp2;
	final public ApiOvhSecret secret;
	final public ApiOvhService service;
	final public ApiOvhSms sms;
	final public ApiOvhSsl ssl;
	final public ApiOvhSslGateway sslGateway;
	final public ApiOvhStackmis stackmis;
	final public ApiOvhStatus status;
	final public ApiOvhStore store;
	final public ApiOvhSupplymondialRelay supplymondialRelay;
	final public ApiOvhSupport support;
	final public ApiOvhTelephony telephony;
	final public ApiOvhVeeamCloudConnect veeamCloudConnect;
	final public ApiOvhVeeamveeamEnterprise veeamveeamEnterprise;
	final public ApiOvhVip vip;
	final public ApiOvhVps vps;
	final public ApiOvhVrack vrack;
	final public ApiOvhXdsl xdsl;


	public ApiOvh(ApiOvhCore core) {
		super(core);
		this.allDom = new ApiOvhAllDom(core);
		this.caascontainers = new ApiOvhCaascontainers(core);
		this.caasregistry = new ApiOvhCaasregistry(core);
		this.cdndedicated = new ApiOvhCdndedicated(core);
		this.cdnwebsite = new ApiOvhCdnwebsite(core);
		this.cdnwebstorage = new ApiOvhCdnwebstorage(core);
		this.cloud = new ApiOvhCloud(core);
		this.clusterhadoop = new ApiOvhClusterhadoop(core);
		this.connectivity = new ApiOvhConnectivity(core);
		this.contact = new ApiOvhContact(core);
		this.auth = new ApiOvhAuth(core);
		this.dbaaslogs = new ApiOvhDbaaslogs(core);
		this.dbaasqueue = new ApiOvhDbaasqueue(core);
		this.dbaastimeseries = new ApiOvhDbaastimeseries(core);
		this.dedicatedCloud = new ApiOvhDedicatedCloud(core);
		this.dedicatedceph = new ApiOvhDedicatedceph(core);
		this.dedicatedhousing = new ApiOvhDedicatedhousing(core);
		this.dedicatedinstallationTemplate = new ApiOvhDedicatedinstallationTemplate(core);
		this.dedicatednas = new ApiOvhDedicatednas(core);
		this.dedicatednasha = new ApiOvhDedicatednasha(core);
		this.dedicatedserver = new ApiOvhDedicatedserver(core);
		this.deskaas = new ApiOvhDeskaas(core);
		this.distributionimage = new ApiOvhDistributionimage(core);
		this.domain = new ApiOvhDomain(core);
		this.emaildomain = new ApiOvhEmaildomain(core);
		this.emailexchange = new ApiOvhEmailexchange(core);
		this.emailpro = new ApiOvhEmailpro(core);
		this.freefax = new ApiOvhFreefax(core);
		this.horizonView = new ApiOvhHorizonView(core);
		this.hostingprivateDatabase = new ApiOvhHostingprivateDatabase(core);
		this.hostingreseller = new ApiOvhHostingreseller(core);
		this.hostingweb = new ApiOvhHostingweb(core);
		this.hpcspot = new ApiOvhHpcspot(core);
		this.ip = new ApiOvhIp(core);
		this.ipLoadbalancing = new ApiOvhIpLoadbalancing(core);
		this.kube = new ApiOvhKube(core);
		this.licensecloudLinux = new ApiOvhLicensecloudLinux(core);
		this.licensecpanel = new ApiOvhLicensecpanel(core);
		this.licensedirectadmin = new ApiOvhLicensedirectadmin(core);
		this.licenseoffice = new ApiOvhLicenseoffice(core);
		this.licenseplesk = new ApiOvhLicenseplesk(core);
		this.licensesqlserver = new ApiOvhLicensesqlserver(core);
		this.licensevirtuozzo = new ApiOvhLicensevirtuozzo(core);
		this.licensewindows = new ApiOvhLicensewindows(core);
		this.licenseworklight = new ApiOvhLicenseworklight(core);
		this.me = new ApiOvhMe(core);
		this.metrics = new ApiOvhMetrics(core);
		this.msServices = new ApiOvhMsServices(core);
		this.newAccount = new ApiOvhNewAccount(core);
		this.order = new ApiOvhOrder(core);
		this.overTheBox = new ApiOvhOverTheBox(core);
		this.paastimeseries = new ApiOvhPaastimeseries(core);
		this.packsiptrunk = new ApiOvhPacksiptrunk(core);
		this.packxdsl = new ApiOvhPackxdsl(core);
		this.partners = new ApiOvhPartners(core);
		this.price = new ApiOvhPrice(core);
		this.router = new ApiOvhRouter(core);
		this.saascsp2 = new ApiOvhSaascsp2(core);
		this.secret = new ApiOvhSecret(core);
		this.service = new ApiOvhService(core);
		this.sms = new ApiOvhSms(core);
		this.ssl = new ApiOvhSsl(core);
		this.sslGateway = new ApiOvhSslGateway(core);
		this.stackmis = new ApiOvhStackmis(core);
		this.status = new ApiOvhStatus(core);
		this.store = new ApiOvhStore(core);
		this.supplymondialRelay = new ApiOvhSupplymondialRelay(core);
		this.support = new ApiOvhSupport(core);
		this.telephony = new ApiOvhTelephony(core);
		this.veeamCloudConnect = new ApiOvhVeeamCloudConnect(core);
		this.veeamveeamEnterprise = new ApiOvhVeeamveeamEnterprise(core);
		this.vip = new ApiOvhVip(core);
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
		for (String s : this.hostingweb.GET())
			if (d.contains(s))
				doms.add(s);
		return doms;
	}

	public ApiOvh clone() {
		ApiOvh api = new ApiOvh(super.core.clone());
		return api;
	}

}
