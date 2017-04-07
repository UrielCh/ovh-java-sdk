package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.complextype.OvhSafeKeyValue;
import net.minidev.ovh.api.complextype.OvhUnitAndValues;
import net.minidev.ovh.api.order.OvhPrice;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.api.spare.telephony.OvhTelephonySpare;
import net.minidev.ovh.api.telephony.OvhAbbreviatedNumber;
import net.minidev.ovh.api.telephony.OvhAbbreviatedNumberGroup;
import net.minidev.ovh.api.telephony.OvhAccessoryOffer;
import net.minidev.ovh.api.telephony.OvhBannerAccess;
import net.minidev.ovh.api.telephony.OvhBillDocument;
import net.minidev.ovh.api.telephony.OvhBillDocumentExtension;
import net.minidev.ovh.api.telephony.OvhBillingAccount;
import net.minidev.ovh.api.telephony.OvhCallDiagnostics;
import net.minidev.ovh.api.telephony.OvhCallsGenerated;
import net.minidev.ovh.api.telephony.OvhCallsGeneratorDialplanEnum;
import net.minidev.ovh.api.telephony.OvhClick2CallUser;
import net.minidev.ovh.api.telephony.OvhConference;
import net.minidev.ovh.api.telephony.OvhConferenceHistory;
import net.minidev.ovh.api.telephony.OvhConferenceInformations;
import net.minidev.ovh.api.telephony.OvhConferenceParticipants;
import net.minidev.ovh.api.telephony.OvhConferenceProperties;
import net.minidev.ovh.api.telephony.OvhContactsExportFormatsEnum;
import net.minidev.ovh.api.telephony.OvhDatetimeAndIpvalue;
import net.minidev.ovh.api.telephony.OvhDdi;
import net.minidev.ovh.api.telephony.OvhDefaultSipDomains;
import net.minidev.ovh.api.telephony.OvhDetailedRateCodeInformation;
import net.minidev.ovh.api.telephony.OvhDiagnosticReport;
import net.minidev.ovh.api.telephony.OvhDiagnosticReportIndexEnum;
import net.minidev.ovh.api.telephony.OvhDirectoryHeadingPJ;
import net.minidev.ovh.api.telephony.OvhDirectoryInfo;
import net.minidev.ovh.api.telephony.OvhDirectoryWayType;
import net.minidev.ovh.api.telephony.OvhEasyHunting;
import net.minidev.ovh.api.telephony.OvhEasyHuntingScreenListsConditions;
import net.minidev.ovh.api.telephony.OvhEasyHuntingScreenListsConditionsSettings;
import net.minidev.ovh.api.telephony.OvhEasyHuntingTimeConditions;
import net.minidev.ovh.api.telephony.OvhEasyHuntingTimeConditionsPolicyEnum;
import net.minidev.ovh.api.telephony.OvhEasyHuntingTimeConditionsSettings;
import net.minidev.ovh.api.telephony.OvhEasyMiniPabxHuntingAgent;
import net.minidev.ovh.api.telephony.OvhEasyPabx;
import net.minidev.ovh.api.telephony.OvhEasyPabxHunting;
import net.minidev.ovh.api.telephony.OvhEntrepriseNumberInformationsTask;
import net.minidev.ovh.api.telephony.OvhEventToken;
import net.minidev.ovh.api.telephony.OvhFax;
import net.minidev.ovh.api.telephony.OvhFaxCampaign;
import net.minidev.ovh.api.telephony.OvhFaxCampaignDetail;
import net.minidev.ovh.api.telephony.OvhFaxCampaignRecipientsTypeEnum;
import net.minidev.ovh.api.telephony.OvhFaxCampaignSendTypeEnum;
import net.minidev.ovh.api.telephony.OvhFaxConsumption;
import net.minidev.ovh.api.telephony.OvhFaxConsumptionWayTypeEnum;
import net.minidev.ovh.api.telephony.OvhFaxProperties;
import net.minidev.ovh.api.telephony.OvhFunctionKey;
import net.minidev.ovh.api.telephony.OvhGenericScreen;
import net.minidev.ovh.api.telephony.OvhHardwareOffer;
import net.minidev.ovh.api.telephony.OvhHistoryConsumption;
import net.minidev.ovh.api.telephony.OvhHistoryRepaymentConsumption;
import net.minidev.ovh.api.telephony.OvhHistoryTollfreeConsumption;
import net.minidev.ovh.api.telephony.OvhLine;
import net.minidev.ovh.api.telephony.OvhLineBlockingMode;
import net.minidev.ovh.api.telephony.OvhLineOffer;
import net.minidev.ovh.api.telephony.OvhLineOffersAndContracts;
import net.minidev.ovh.api.telephony.OvhLineOptions;
import net.minidev.ovh.api.telephony.OvhLinePhone;
import net.minidev.ovh.api.telephony.OvhLineStatisticsTypeEnum;
import net.minidev.ovh.api.telephony.OvhMiniPabx;
import net.minidev.ovh.api.telephony.OvhMiniPabxHunting;
import net.minidev.ovh.api.telephony.OvhNumber;
import net.minidev.ovh.api.telephony.OvhNumberCountryEnum;
import net.minidev.ovh.api.telephony.OvhNumberDetailedZone;
import net.minidev.ovh.api.telephony.OvhNumberTypeEnum;
import net.minidev.ovh.api.telephony.OvhOfferChange;
import net.minidev.ovh.api.telephony.OvhOfferTask;
import net.minidev.ovh.api.telephony.OvhOfferTaskActionEnum;
import net.minidev.ovh.api.telephony.OvhOfferTaskTypeEnum;
import net.minidev.ovh.api.telephony.OvhOvhPabx;
import net.minidev.ovh.api.telephony.OvhOvhPabxCustomStatus;
import net.minidev.ovh.api.telephony.OvhOvhPabxDialplan;
import net.minidev.ovh.api.telephony.OvhOvhPabxDialplanExtension;
import net.minidev.ovh.api.telephony.OvhOvhPabxDialplanExtensionConditionScreenList;
import net.minidev.ovh.api.telephony.OvhOvhPabxDialplanExtensionConditionScreenListTypeEnum;
import net.minidev.ovh.api.telephony.OvhOvhPabxDialplanExtensionConditionTime;
import net.minidev.ovh.api.telephony.OvhOvhPabxDialplanExtensionConditionTimeWeekDayEnum;
import net.minidev.ovh.api.telephony.OvhOvhPabxDialplanExtensionRule;
import net.minidev.ovh.api.telephony.OvhOvhPabxDialplanExtensionRuleActionEnum;
import net.minidev.ovh.api.telephony.OvhOvhPabxDialplanNumberPresentationEnum;
import net.minidev.ovh.api.telephony.OvhOvhPabxHunting;
import net.minidev.ovh.api.telephony.OvhOvhPabxHuntingAgent;
import net.minidev.ovh.api.telephony.OvhOvhPabxHuntingAgentLiveStatus;
import net.minidev.ovh.api.telephony.OvhOvhPabxHuntingAgentQueue;
import net.minidev.ovh.api.telephony.OvhOvhPabxHuntingAgentStatusEnum;
import net.minidev.ovh.api.telephony.OvhOvhPabxHuntingQueue;
import net.minidev.ovh.api.telephony.OvhOvhPabxHuntingQueueLiveCalls;
import net.minidev.ovh.api.telephony.OvhOvhPabxHuntingQueueLiveStatistics;
import net.minidev.ovh.api.telephony.OvhOvhPabxHuntingQueueRecordDisablingDigitEnum;
import net.minidev.ovh.api.telephony.OvhOvhPabxHuntingQueueRecordDisablingLanguageEnum;
import net.minidev.ovh.api.telephony.OvhOvhPabxHuntingQueueStrategyEnum;
import net.minidev.ovh.api.telephony.OvhOvhPabxIvrMenuEntryActionEnum;
import net.minidev.ovh.api.telephony.OvhOvhPabxMenu;
import net.minidev.ovh.api.telephony.OvhOvhPabxMenuEntry;
import net.minidev.ovh.api.telephony.OvhOvhPabxQueueActionEnum;
import net.minidev.ovh.api.telephony.OvhOvhPabxRecord;
import net.minidev.ovh.api.telephony.OvhOvhPabxSound;
import net.minidev.ovh.api.telephony.OvhOvhPabxTts;
import net.minidev.ovh.api.telephony.OvhOvhPabxTtsVoiceEnum;
import net.minidev.ovh.api.telephony.OvhOvhPabxWhisperingModeEnum;
import net.minidev.ovh.api.telephony.OvhPcsFile;
import net.minidev.ovh.api.telephony.OvhPhone;
import net.minidev.ovh.api.telephony.OvhPhonebook;
import net.minidev.ovh.api.telephony.OvhPhonebookContact;
import net.minidev.ovh.api.telephony.OvhPhonebookMaster;
import net.minidev.ovh.api.telephony.OvhPortability;
import net.minidev.ovh.api.telephony.OvhPortabilityStep;
import net.minidev.ovh.api.telephony.OvhPreviousVoiceConsumption;
import net.minidev.ovh.api.telephony.OvhRateCodeInformation;
import net.minidev.ovh.api.telephony.OvhRedirect;
import net.minidev.ovh.api.telephony.OvhRegistrationInformations;
import net.minidev.ovh.api.telephony.OvhRepaymentConsumption;
import net.minidev.ovh.api.telephony.OvhResetPhoneInfo;
import net.minidev.ovh.api.telephony.OvhRma;
import net.minidev.ovh.api.telephony.OvhRmaPublicTypeEnum;
import net.minidev.ovh.api.telephony.OvhRmaReturn;
import net.minidev.ovh.api.telephony.OvhRsva;
import net.minidev.ovh.api.telephony.OvhScheduler;
import net.minidev.ovh.api.telephony.OvhSchedulerCategoryEnum;
import net.minidev.ovh.api.telephony.OvhSchedulerEvent;
import net.minidev.ovh.api.telephony.OvhScreen;
import net.minidev.ovh.api.telephony.OvhScreenList;
import net.minidev.ovh.api.telephony.OvhScreenListNatureEnum;
import net.minidev.ovh.api.telephony.OvhScreenListTypeEnum;
import net.minidev.ovh.api.telephony.OvhServiceVoicemailAudioFormatEnum;
import net.minidev.ovh.api.telephony.OvhSipDomainProductTypeEnum;
import net.minidev.ovh.api.telephony.OvhSpecificNumber;
import net.minidev.ovh.api.telephony.OvhStatisticsTimeframeEnum;
import net.minidev.ovh.api.telephony.OvhTask;
import net.minidev.ovh.api.telephony.OvhTaskStatusEnum;
import net.minidev.ovh.api.telephony.OvhTelephonyGenericService;
import net.minidev.ovh.api.telephony.OvhTelephonySearchService;
import net.minidev.ovh.api.telephony.OvhTelephonyService;
import net.minidev.ovh.api.telephony.OvhTerminationReasonEnum;
import net.minidev.ovh.api.telephony.OvhTimeCondition;
import net.minidev.ovh.api.telephony.OvhTimeConditionOptions;
import net.minidev.ovh.api.telephony.OvhTimeConditionsDayEnum;
import net.minidev.ovh.api.telephony.OvhTimeConditionsPolicyEnum;
import net.minidev.ovh.api.telephony.OvhTimestampAndValue;
import net.minidev.ovh.api.telephony.OvhTokenExpirationEnum;
import net.minidev.ovh.api.telephony.OvhTones;
import net.minidev.ovh.api.telephony.OvhTonesTypeEnum;
import net.minidev.ovh.api.telephony.OvhTypeEnum;
import net.minidev.ovh.api.telephony.OvhVoiceConsumption;
import net.minidev.ovh.api.telephony.OvhVoiceConsumptionDestinationTypeEnum;
import net.minidev.ovh.api.telephony.OvhVoiceConsumptionPlanTypeEnum;
import net.minidev.ovh.api.telephony.OvhVoiceConsumptionWayTypeEnum;
import net.minidev.ovh.api.telephony.OvhVoicefaxRoutingEnum;
import net.minidev.ovh.api.telephony.OvhVoicemail;
import net.minidev.ovh.api.telephony.OvhVoicemailGreetings;
import net.minidev.ovh.api.telephony.OvhVoicemailMessageFolderDirectoryEnum;
import net.minidev.ovh.api.telephony.OvhVoicemailMessageFolderGreetingEnum;
import net.minidev.ovh.api.telephony.OvhVoicemailMessages;
import net.minidev.ovh.api.telephony.OvhVoicemailProperties;
import net.minidev.ovh.api.telephony.OvhVxml;
import net.minidev.ovh.api.telephony.OvhVxmlProperties;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/telephony
 * version:1.0
 */
public class ApiOvhTelephony extends ApiOvhBase {
	public ApiOvhTelephony(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get all available SIP domains by country
	 *
	 * REST: GET /telephony/availableDefaultSipDomains
	 * @param type [required] Product type
	 */
	public ArrayList<OvhDefaultSipDomains> availableDefaultSipDomains_GET(OvhSipDomainProductTypeEnum type) throws IOException {
		String qPath = "/telephony/availableDefaultSipDomains";
		StringBuilder sb = path(qPath);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhDefaultSipDomains>> t1 = new TypeReference<ArrayList<OvhDefaultSipDomains>>() {};

	/**
	 * List available services
	 *
	 * REST: GET /telephony
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/telephony";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<String>> t2 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Get current order ids
	 *
	 * REST: GET /telephony/currentOrderIds
	 */
	public ArrayList<Long> currentOrderIds_GET() throws IOException {
		String qPath = "/telephony/currentOrderIds";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<Long>> t3 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Get all available geographic zone with some details, from a country
	 *
	 * REST: GET /telephony/number/detailedZones
	 * @param country [required] The country
	 * @param axiom [required] Enter a part of a city name or a zip for specific zne returns
	 */
	public ArrayList<OvhNumberDetailedZone> number_detailedZones_GET(String axiom, OvhNumberCountryEnum country) throws IOException {
		String qPath = "/telephony/number/detailedZones";
		StringBuilder sb = path(qPath);
		query(sb, "axiom", axiom);
		query(sb, "country", country);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhNumberDetailedZone>> t4 = new TypeReference<ArrayList<OvhNumberDetailedZone>>() {};

	/**
	 * Get all available specific number from a country
	 *
	 * REST: GET /telephony/number/specificNumbers
	 * @param country [required] The country
	 * @param zone [required] The zone (geographic number)
	 * @param range [required] The range (special number)
	 * @param type [required] The type of number
	 */
	public ArrayList<OvhSpecificNumber> number_specificNumbers_GET(OvhNumberCountryEnum country, String range, OvhNumberTypeEnum type, String zone) throws IOException {
		String qPath = "/telephony/number/specificNumbers";
		StringBuilder sb = path(qPath);
		query(sb, "country", country);
		query(sb, "range", range);
		query(sb, "type", type);
		query(sb, "zone", zone);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<OvhSpecificNumber>> t5 = new TypeReference<ArrayList<OvhSpecificNumber>>() {};

	/**
	 * Get all available geographic zone from a country
	 *
	 * REST: GET /telephony/number/zones
	 * @param country [required] The country
	 * @param axiom [required] Enter a part of a city name or a zip for specific zne returns
	 */
	public ArrayList<String> number_zones_GET(String axiom, OvhNumberCountryEnum country) throws IOException {
		String qPath = "/telephony/number/zones";
		StringBuilder sb = path(qPath);
		query(sb, "axiom", axiom);
		query(sb, "country", country);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get all available special range from a country
	 *
	 * REST: GET /telephony/number/ranges
	 * @param country [required] The country
	 */
	public ArrayList<String> number_ranges_GET(OvhNumberCountryEnum country) throws IOException {
		String qPath = "/telephony/number/ranges";
		StringBuilder sb = path(qPath);
		query(sb, "country", country);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public OvhBillingAccount billingAccount_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBillingAccount.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public void billingAccount_PUT(String billingAccount, OvhBillingAccount body) throws IOException {
		String qPath = "/telephony/{billingAccount}";
		StringBuilder sb = path(qPath, billingAccount);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Ask for a billing account termination.
	 *
	 * REST: DELETE /telephony/{billingAccount}
	 * @param reason [required] Termination reason
	 * @param details [required] Termination reason details
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public void billingAccount_DELETE(String billingAccount, String details, OvhTerminationReasonEnum reason) throws IOException {
		String qPath = "/telephony/{billingAccount}";
		StringBuilder sb = path(qPath, billingAccount);
		query(sb, "details", details);
		query(sb, "reason", reason);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Previous tollfree bill
	 *
	 * REST: GET /telephony/{billingAccount}/historyTollfreeConsumption
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<Date> billingAccount_historyTollfreeConsumption_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/historyTollfreeConsumption";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t6);
	}
	private static TypeReference<ArrayList<Date>> t6 = new TypeReference<ArrayList<Date>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/historyTollfreeConsumption/{date}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param date [required] date of the bill
	 */
	public OvhHistoryTollfreeConsumption billingAccount_historyTollfreeConsumption_date_GET(String billingAccount, java.util.Date date) throws IOException {
		String qPath = "/telephony/{billingAccount}/historyTollfreeConsumption/{date}";
		StringBuilder sb = path(qPath, billingAccount, date);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhHistoryTollfreeConsumption.class);
	}

	/**
	 * Get the csv document
	 *
	 * REST: GET /telephony/{billingAccount}/historyTollfreeConsumption/{date}/document
	 * @param billingAccount [required] The name of your billingAccount
	 * @param date [required] date of the bill
	 */
	public OvhPcsFile billingAccount_historyTollfreeConsumption_date_document_GET(String billingAccount, java.util.Date date) throws IOException {
		String qPath = "/telephony/{billingAccount}/historyTollfreeConsumption/{date}/document";
		StringBuilder sb = path(qPath, billingAccount, date);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPcsFile.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/timeCondition/{serviceName}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhGenericScreen billingAccount_timeCondition_serviceName_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/timeCondition/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhGenericScreen.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/timeCondition/{serviceName}/options
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhTimeConditionOptions billingAccount_timeCondition_serviceName_options_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/timeCondition/{serviceName}/options";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTimeConditionOptions.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/timeCondition/{serviceName}/options
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_timeCondition_serviceName_options_PUT(String billingAccount, String serviceName, OvhTimeConditionOptions body) throws IOException {
		String qPath = "/telephony/{billingAccount}/timeCondition/{serviceName}/options";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Rules for time conditions for this service
	 *
	 * REST: GET /telephony/{billingAccount}/timeCondition/{serviceName}/condition
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_timeCondition_serviceName_condition_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/timeCondition/{serviceName}/condition";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new time condition rule
	 *
	 * REST: POST /telephony/{billingAccount}/timeCondition/{serviceName}/condition
	 * @param hourEnd [required] The hour where the time condition ends (format : hhmm)
	 * @param policy [required] The policy
	 * @param day [required] The day of the time condition
	 * @param hourBegin [required] The hour where the time condition begins (format : hhmm)
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhTimeCondition billingAccount_timeCondition_serviceName_condition_POST(String billingAccount, String serviceName, String hourEnd, OvhTimeConditionsPolicyEnum policy, OvhTimeConditionsDayEnum day, String hourBegin) throws IOException {
		String qPath = "/telephony/{billingAccount}/timeCondition/{serviceName}/condition";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "hourEnd", hourEnd);
		addBody(o, "policy", policy);
		addBody(o, "day", day);
		addBody(o, "hourBegin", hourBegin);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTimeCondition.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/timeCondition/{serviceName}/condition/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhTimeCondition billingAccount_timeCondition_serviceName_condition_id_GET(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/timeCondition/{serviceName}/condition/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTimeCondition.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/timeCondition/{serviceName}/condition/{id}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public void billingAccount_timeCondition_serviceName_condition_id_PUT(String billingAccount, String serviceName, Long id, OvhTimeCondition body) throws IOException {
		String qPath = "/telephony/{billingAccount}/timeCondition/{serviceName}/condition/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the given screen list
	 *
	 * REST: DELETE /telephony/{billingAccount}/timeCondition/{serviceName}/condition/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public void billingAccount_timeCondition_serviceName_condition_id_DELETE(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/timeCondition/{serviceName}/condition/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Time conditions compatible numbers associated with this billing account
	 *
	 * REST: GET /telephony/{billingAccount}/timeCondition
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<String> billingAccount_timeCondition_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/timeCondition";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Abbreviated numbers for the billing account
	 *
	 * REST: GET /telephony/{billingAccount}/abbreviatedNumber
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<Long> billingAccount_abbreviatedNumber_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/abbreviatedNumber";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new abbreviated number for the billing account
	 *
	 * REST: POST /telephony/{billingAccount}/abbreviatedNumber
	 * @param destinationNumber [required] The destination of the abbreviated number
	 * @param abbreviatedNumber [required] The abbreviated number which must start with "7" and must have a length of 3 or 4 digits
	 * @param name [required]
	 * @param surname [required]
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public OvhAbbreviatedNumberGroup billingAccount_abbreviatedNumber_POST(String billingAccount, String destinationNumber, Long abbreviatedNumber, String name, String surname) throws IOException {
		String qPath = "/telephony/{billingAccount}/abbreviatedNumber";
		StringBuilder sb = path(qPath, billingAccount);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "destinationNumber", destinationNumber);
		addBody(o, "abbreviatedNumber", abbreviatedNumber);
		addBody(o, "name", name);
		addBody(o, "surname", surname);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhAbbreviatedNumberGroup.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/abbreviatedNumber/{abbreviatedNumber}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param abbreviatedNumber [required] The abbreviated number which must start with "7" and must have a length of 3 or 4 digits
	 */
	public OvhAbbreviatedNumberGroup billingAccount_abbreviatedNumber_abbreviatedNumber_GET(String billingAccount, Long abbreviatedNumber) throws IOException {
		String qPath = "/telephony/{billingAccount}/abbreviatedNumber/{abbreviatedNumber}";
		StringBuilder sb = path(qPath, billingAccount, abbreviatedNumber);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAbbreviatedNumberGroup.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/abbreviatedNumber/{abbreviatedNumber}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param abbreviatedNumber [required] The abbreviated number which must start with "7" and must have a length of 3 or 4 digits
	 */
	public void billingAccount_abbreviatedNumber_abbreviatedNumber_PUT(String billingAccount, Long abbreviatedNumber, OvhAbbreviatedNumberGroup body) throws IOException {
		String qPath = "/telephony/{billingAccount}/abbreviatedNumber/{abbreviatedNumber}";
		StringBuilder sb = path(qPath, billingAccount, abbreviatedNumber);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the given abbreviated number
	 *
	 * REST: DELETE /telephony/{billingAccount}/abbreviatedNumber/{abbreviatedNumber}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param abbreviatedNumber [required] The abbreviated number which must start with "7" and must have a length of 3 or 4 digits
	 */
	public void billingAccount_abbreviatedNumber_abbreviatedNumber_DELETE(String billingAccount, Long abbreviatedNumber) throws IOException {
		String qPath = "/telephony/{billingAccount}/abbreviatedNumber/{abbreviatedNumber}";
		StringBuilder sb = path(qPath, billingAccount, abbreviatedNumber);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/voicemail/{serviceName}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhVoicemail billingAccount_voicemail_serviceName_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/voicemail/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVoicemail.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/voicemail/{serviceName}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_voicemail_serviceName_PUT(String billingAccount, String serviceName, OvhVoicemail body) throws IOException {
		String qPath = "/telephony/{billingAccount}/voicemail/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Voicemail directory messages
	 *
	 * REST: GET /telephony/{billingAccount}/voicemail/{serviceName}/directories
	 * @param dir [required] Filter the value of dir property (=)
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_voicemail_serviceName_directories_GET(String billingAccount, String serviceName, OvhVoicemailMessageFolderDirectoryEnum dir) throws IOException {
		String qPath = "/telephony/{billingAccount}/voicemail/{serviceName}/directories";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		query(sb, "dir", dir);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/voicemail/{serviceName}/directories/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhVoicemailMessages billingAccount_voicemail_serviceName_directories_id_GET(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/voicemail/{serviceName}/directories/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVoicemailMessages.class);
	}

	/**
	 * Delete the given voicemail message
	 *
	 * REST: DELETE /telephony/{billingAccount}/voicemail/{serviceName}/directories/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public void billingAccount_voicemail_serviceName_directories_id_DELETE(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/voicemail/{serviceName}/directories/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Move the message to another directory
	 *
	 * REST: POST /telephony/{billingAccount}/voicemail/{serviceName}/directories/{id}/move
	 * @param dir [required] Greeting voicemail directory
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public void billingAccount_voicemail_serviceName_directories_id_move_POST(String billingAccount, String serviceName, Long id, OvhVoicemailMessageFolderDirectoryEnum dir) throws IOException {
		String qPath = "/telephony/{billingAccount}/voicemail/{serviceName}/directories/{id}/move";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "dir", dir);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Get a url to download the sound file
	 *
	 * REST: GET /telephony/{billingAccount}/voicemail/{serviceName}/directories/{id}/download
	 * @param format [required] File format wanted
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhPcsFile billingAccount_voicemail_serviceName_directories_id_download_GET(String billingAccount, String serviceName, Long id, OvhServiceVoicemailAudioFormatEnum format) throws IOException {
		String qPath = "/telephony/{billingAccount}/voicemail/{serviceName}/directories/{id}/download";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		query(sb, "format", format);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPcsFile.class);
	}

	/**
	 * Change the voicemail on a new version to manager greetings, directories and extra settings.
	 *
	 * REST: POST /telephony/{billingAccount}/voicemail/{serviceName}/migrateOnNewVersion
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_voicemail_serviceName_migrateOnNewVersion_POST(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/voicemail/{serviceName}/migrateOnNewVersion";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/voicemail/{serviceName}/settings
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhVoicemailProperties billingAccount_voicemail_serviceName_settings_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/voicemail/{serviceName}/settings";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVoicemailProperties.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/voicemail/{serviceName}/settings
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_voicemail_serviceName_settings_PUT(String billingAccount, String serviceName, OvhVoicemailProperties body) throws IOException {
		String qPath = "/telephony/{billingAccount}/voicemail/{serviceName}/settings";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Disable/Enable voicemail. Available only if the line has fax capabilities
	 *
	 * REST: POST /telephony/{billingAccount}/voicemail/{serviceName}/settings/changeRouting
	 * @param routing [required] Activate or Desactivate voicemail on the line
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_voicemail_serviceName_settings_changeRouting_POST(String billingAccount, String serviceName, OvhVoicefaxRoutingEnum routing) throws IOException {
		String qPath = "/telephony/{billingAccount}/voicemail/{serviceName}/settings/changeRouting";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "routing", routing);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Change the voicemail password. It must be 4 digit
	 *
	 * REST: POST /telephony/{billingAccount}/voicemail/{serviceName}/settings/changePassword
	 * @param password [required] The password
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_voicemail_serviceName_settings_changePassword_POST(String billingAccount, String serviceName, String password) throws IOException {
		String qPath = "/telephony/{billingAccount}/voicemail/{serviceName}/settings/changePassword";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Get the status of the voicemail. Available only if the line has fax capabilities
	 *
	 * REST: GET /telephony/{billingAccount}/voicemail/{serviceName}/settings/routing
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhVoicefaxRoutingEnum billingAccount_voicemail_serviceName_settings_routing_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/voicemail/{serviceName}/settings/routing";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVoicefaxRoutingEnum.class);
	}

	/**
	 * Voicemail greeting message properties
	 *
	 * REST: GET /telephony/{billingAccount}/voicemail/{serviceName}/greetings
	 * @param dir [required] Filter the value of dir property (=)
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_voicemail_serviceName_greetings_GET(String billingAccount, String serviceName, OvhVoicemailMessageFolderGreetingEnum dir) throws IOException {
		String qPath = "/telephony/{billingAccount}/voicemail/{serviceName}/greetings";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		query(sb, "dir", dir);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Upload a new sound for a specific greeting. Return a task id.
	 *
	 * REST: POST /telephony/{billingAccount}/voicemail/{serviceName}/greetings
	 * @param documentId [required] Get the /me/document uuid generated
	 * @param dir [required] Greeting voicemail directory
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public Long billingAccount_voicemail_serviceName_greetings_POST(String billingAccount, String serviceName, String documentId, OvhVoicemailMessageFolderGreetingEnum dir) throws IOException {
		String qPath = "/telephony/{billingAccount}/voicemail/{serviceName}/greetings";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "documentId", documentId);
		addBody(o, "dir", dir);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, Long.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/voicemail/{serviceName}/greetings/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhVoicemailGreetings billingAccount_voicemail_serviceName_greetings_id_GET(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/voicemail/{serviceName}/greetings/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVoicemailGreetings.class);
	}

	/**
	 * Delete the customized greeting
	 *
	 * REST: DELETE /telephony/{billingAccount}/voicemail/{serviceName}/greetings/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public void billingAccount_voicemail_serviceName_greetings_id_DELETE(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/voicemail/{serviceName}/greetings/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Move the message to another directory
	 *
	 * REST: POST /telephony/{billingAccount}/voicemail/{serviceName}/greetings/{id}/move
	 * @param dir [required] Greeting voicemail directory
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public void billingAccount_voicemail_serviceName_greetings_id_move_POST(String billingAccount, String serviceName, Long id, OvhVoicemailMessageFolderGreetingEnum dir) throws IOException {
		String qPath = "/telephony/{billingAccount}/voicemail/{serviceName}/greetings/{id}/move";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "dir", dir);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Get a url to download the sound file
	 *
	 * REST: GET /telephony/{billingAccount}/voicemail/{serviceName}/greetings/{id}/download
	 * @param format [required] File format wanted
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhPcsFile billingAccount_voicemail_serviceName_greetings_id_download_GET(String billingAccount, String serviceName, Long id, OvhServiceVoicemailAudioFormatEnum format) throws IOException {
		String qPath = "/telephony/{billingAccount}/voicemail/{serviceName}/greetings/{id}/download";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		query(sb, "format", format);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPcsFile.class);
	}

	/**
	 * Voicemails associated with this billing account
	 *
	 * REST: GET /telephony/{billingAccount}/voicemail
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<String> billingAccount_voicemail_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/voicemail";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyPabx/{serviceName}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhEasyPabx billingAccount_easyPabx_serviceName_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyPabx/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEasyPabx.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/easyPabx/{serviceName}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_easyPabx_serviceName_PUT(String billingAccount, String serviceName, OvhEasyPabx body) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyPabx/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyPabx/{serviceName}/hunting
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhEasyPabxHunting billingAccount_easyPabx_serviceName_hunting_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyPabx/{serviceName}/hunting";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEasyPabxHunting.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/easyPabx/{serviceName}/hunting
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_easyPabx_serviceName_hunting_PUT(String billingAccount, String serviceName, OvhEasyPabxHunting body) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyPabx/{serviceName}/hunting";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Hunting agents
	 *
	 * REST: GET /telephony/{billingAccount}/easyPabx/{serviceName}/hunting/agent
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<String> billingAccount_easyPabx_serviceName_hunting_agent_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyPabx/{serviceName}/hunting/agent";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Create a new agent
	 *
	 * REST: POST /telephony/{billingAccount}/easyPabx/{serviceName}/hunting/agent
	 * @param agentNumber [required] The phone number of the agent
	 * @param position [required] The position in the hunting
	 * @param logged [required] True if the agent is logged
	 * @param noReplyTimer [required] The maxium ringing time
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhEasyMiniPabxHuntingAgent billingAccount_easyPabx_serviceName_hunting_agent_POST(String billingAccount, String serviceName, String agentNumber, Long position, Boolean logged, Long noReplyTimer) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyPabx/{serviceName}/hunting/agent";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "agentNumber", agentNumber);
		addBody(o, "position", position);
		addBody(o, "logged", logged);
		addBody(o, "noReplyTimer", noReplyTimer);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhEasyMiniPabxHuntingAgent.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyPabx/{serviceName}/hunting/agent/{agentNumber}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentNumber [required] The phone number of the agent
	 */
	public OvhEasyMiniPabxHuntingAgent billingAccount_easyPabx_serviceName_hunting_agent_agentNumber_GET(String billingAccount, String serviceName, String agentNumber) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyPabx/{serviceName}/hunting/agent/{agentNumber}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentNumber);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEasyMiniPabxHuntingAgent.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/easyPabx/{serviceName}/hunting/agent/{agentNumber}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentNumber [required] The phone number of the agent
	 */
	public void billingAccount_easyPabx_serviceName_hunting_agent_agentNumber_PUT(String billingAccount, String serviceName, String agentNumber, OvhEasyMiniPabxHuntingAgent body) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyPabx/{serviceName}/hunting/agent/{agentNumber}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentNumber);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the agent
	 *
	 * REST: DELETE /telephony/{billingAccount}/easyPabx/{serviceName}/hunting/agent/{agentNumber}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentNumber [required] The phone number of the agent
	 */
	public void billingAccount_easyPabx_serviceName_hunting_agent_agentNumber_DELETE(String billingAccount, String serviceName, String agentNumber) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyPabx/{serviceName}/hunting/agent/{agentNumber}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentNumber);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyPabx/{serviceName}/hunting/tones
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhTones billingAccount_easyPabx_serviceName_hunting_tones_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyPabx/{serviceName}/hunting/tones";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTones.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/easyPabx/{serviceName}/hunting/tones
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_easyPabx_serviceName_hunting_tones_PUT(String billingAccount, String serviceName, OvhTones body) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyPabx/{serviceName}/hunting/tones";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Upload new tone file
	 *
	 * REST: POST /telephony/{billingAccount}/easyPabx/{serviceName}/hunting/tones/toneUpload
	 * @param url [required]
	 * @param type [required]
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhTask billingAccount_easyPabx_serviceName_hunting_tones_toneUpload_POST(String billingAccount, String serviceName, String url, OvhTonesTypeEnum type) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyPabx/{serviceName}/hunting/tones/toneUpload";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "url", url);
		addBody(o, "type", type);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * EasyPabx associated with this billing account
	 *
	 * REST: GET /telephony/{billingAccount}/easyPabx
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<String> billingAccount_easyPabx_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyPabx";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Give all amounts availables for your billing account
	 *
	 * REST: GET /telephony/{billingAccount}/amountSecurityDeposit
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<OvhPrice> billingAccount_amountSecurityDeposit_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/amountSecurityDeposit";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t7);
	}
	private static TypeReference<ArrayList<OvhPrice>> t7 = new TypeReference<ArrayList<OvhPrice>>() {};

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhLine billingAccount_line_serviceName_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhLine.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/line/{serviceName}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_line_serviceName_PUT(String billingAccount, String serviceName, OvhLine body) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Remove extra simultaneous lines
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/removeSimultaneousLines
	 * @param quantityRemove [required] The quantity of extra simultaneous lines to remove
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_line_serviceName_removeSimultaneousLines_POST(String billingAccount, String serviceName, Long quantityRemove) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/removeSimultaneousLines";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "quantityRemove", quantityRemove);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/options
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhLineOptions billingAccount_line_serviceName_options_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/options";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhLineOptions.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/line/{serviceName}/options
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_line_serviceName_options_PUT(String billingAccount, String serviceName, OvhLineOptions body) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/options";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get the default codecs for this line if none are set
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/options/defaultCodecs
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public String billingAccount_line_serviceName_options_defaultCodecs_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/options/defaultCodecs";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * List of codecs combinaisons available for this line
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/options/availableCodecs
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<String> billingAccount_line_serviceName_options_availableCodecs_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/options/availableCodecs";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Return public offer property
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/offer
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhLineOffer billingAccount_line_serviceName_offer_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/offer";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhLineOffer.class);
	}

	/**
	 * Get statistics of the current line
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/statistics
	 * @param timeframe [required]
	 * @param type [required]
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhUnitAndValues<OvhTimestampAndValue> billingAccount_line_serviceName_statistics_GET(String billingAccount, String serviceName, OvhStatisticsTimeframeEnum timeframe, OvhLineStatisticsTypeEnum type) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/statistics";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		query(sb, "timeframe", timeframe);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t8);
	}
	private static TypeReference<OvhUnitAndValues<OvhTimestampAndValue>> t8 = new TypeReference<OvhUnitAndValues<OvhTimestampAndValue>>() {};

	/**
	 * List the phones with Sip slot available
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/phoneCanBeAssociable
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<OvhLinePhone> billingAccount_line_serviceName_phoneCanBeAssociable_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phoneCanBeAssociable";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t9);
	}
	private static TypeReference<ArrayList<OvhLinePhone>> t9 = new TypeReference<ArrayList<OvhLinePhone>>() {};

	/**
	 * Abbreviated numbers for the line
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/abbreviatedNumber
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_line_serviceName_abbreviatedNumber_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/abbreviatedNumber";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new abbreviated number for the line
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/abbreviatedNumber
	 * @param destinationNumber [required] The destination of the abbreviated number
	 * @param abbreviatedNumber [required] The abbreviated number which must start with "2" and must have a length of 3 or 4 digits
	 * @param name [required]
	 * @param surname [required]
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhAbbreviatedNumber billingAccount_line_serviceName_abbreviatedNumber_POST(String billingAccount, String serviceName, String destinationNumber, Long abbreviatedNumber, String name, String surname) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/abbreviatedNumber";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "destinationNumber", destinationNumber);
		addBody(o, "abbreviatedNumber", abbreviatedNumber);
		addBody(o, "name", name);
		addBody(o, "surname", surname);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhAbbreviatedNumber.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/abbreviatedNumber/{abbreviatedNumber}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param abbreviatedNumber [required] The abbreviated number which must start with "2" and must have a length of 3 or 4 digits
	 */
	public OvhAbbreviatedNumber billingAccount_line_serviceName_abbreviatedNumber_abbreviatedNumber_GET(String billingAccount, String serviceName, Long abbreviatedNumber) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/abbreviatedNumber/{abbreviatedNumber}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, abbreviatedNumber);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhAbbreviatedNumber.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/line/{serviceName}/abbreviatedNumber/{abbreviatedNumber}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param abbreviatedNumber [required] The abbreviated number which must start with "2" and must have a length of 3 or 4 digits
	 */
	public void billingAccount_line_serviceName_abbreviatedNumber_abbreviatedNumber_PUT(String billingAccount, String serviceName, Long abbreviatedNumber, OvhAbbreviatedNumber body) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/abbreviatedNumber/{abbreviatedNumber}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, abbreviatedNumber);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the given abbreviated number
	 *
	 * REST: DELETE /telephony/{billingAccount}/line/{serviceName}/abbreviatedNumber/{abbreviatedNumber}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param abbreviatedNumber [required] The abbreviated number which must start with "2" and must have a length of 3 or 4 digits
	 */
	public void billingAccount_line_serviceName_abbreviatedNumber_abbreviatedNumber_DELETE(String billingAccount, String serviceName, Long abbreviatedNumber) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/abbreviatedNumber/{abbreviatedNumber}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, abbreviatedNumber);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * User which can use click 2 call on the line
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/click2CallUser
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_line_serviceName_click2CallUser_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/click2CallUser";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new user for click 2 call
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/click2CallUser
	 * @param password [required] The user password
	 * @param login [required] Name of the contact
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public Long billingAccount_line_serviceName_click2CallUser_POST(String billingAccount, String serviceName, String password, String login) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/click2CallUser";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		addBody(o, "login", login);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, Long.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/click2CallUser/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhClick2CallUser billingAccount_line_serviceName_click2CallUser_id_GET(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/click2CallUser/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhClick2CallUser.class);
	}

	/**
	 * Delete a click 2 call user
	 *
	 * REST: DELETE /telephony/{billingAccount}/line/{serviceName}/click2CallUser/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public void billingAccount_line_serviceName_click2CallUser_id_DELETE(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/click2CallUser/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Make a phone call from the current line
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/click2CallUser/{id}/click2Call
	 * @param callingNumber [required]
	 * @param calledNumber [required]
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public void billingAccount_line_serviceName_click2CallUser_id_click2Call_POST(String billingAccount, String serviceName, Long id, String callingNumber, String calledNumber) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/click2CallUser/{id}/click2Call";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "callingNumber", callingNumber);
		addBody(o, "calledNumber", calledNumber);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Change the password of the click2call user
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/click2CallUser/{id}/changePassword
	 * @param password [required] The password
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public void billingAccount_line_serviceName_click2CallUser_id_changePassword_POST(String billingAccount, String serviceName, Long id, String password) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/click2CallUser/{id}/changePassword";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Listing of last ips registry
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/ips
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<OvhDatetimeAndIpvalue> billingAccount_line_serviceName_ips_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/ips";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t10);
	}
	private static TypeReference<ArrayList<OvhDatetimeAndIpvalue>> t10 = new TypeReference<ArrayList<OvhDatetimeAndIpvalue>>() {};

	/**
	 * Automatic Calls made by Calls Generator on this line
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/automaticCall
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<String> billingAccount_line_serviceName_automaticCall_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/automaticCall";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Make an automatic phone call. Return generated call identifier
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/automaticCall
	 * @param playbackAudioFileDialplan [required] Name of the audioFile (if needed) with extention. This audio file must have been upload previously
	 * @param calledNumber [required] Number to call
	 * @param callingNumber [required] Optional, number where the call come from
	 * @param bridgeNumberDialplan [required] Number to call if transfer in dialplan selected
	 * @param ttsTextDialplan [required] Text to read if TTS on dialplan selected
	 * @param isAnonymous [required] For anonymous call
	 * @param dialplan [required] Dialplan used for the call
	 * @param timeout [required] Timeout (in seconds). Default is 20 seconds
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public String billingAccount_line_serviceName_automaticCall_POST(String billingAccount, String serviceName, String playbackAudioFileDialplan, String calledNumber, String callingNumber, String bridgeNumberDialplan, String ttsTextDialplan, Boolean isAnonymous, OvhCallsGeneratorDialplanEnum dialplan, Long timeout) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/automaticCall";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "playbackAudioFileDialplan", playbackAudioFileDialplan);
		addBody(o, "calledNumber", calledNumber);
		addBody(o, "callingNumber", callingNumber);
		addBody(o, "bridgeNumberDialplan", bridgeNumberDialplan);
		addBody(o, "ttsTextDialplan", ttsTextDialplan);
		addBody(o, "isAnonymous", isAnonymous);
		addBody(o, "dialplan", dialplan);
		addBody(o, "timeout", timeout);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/automaticCall/{identifier}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param identifier [required] Generated call identifier
	 */
	public OvhCallsGenerated billingAccount_line_serviceName_automaticCall_identifier_GET(String billingAccount, String serviceName, String identifier) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/automaticCall/{identifier}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, identifier);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhCallsGenerated.class);
	}

	/**
	 * Unblock the line. It will remove any incoming and outboing block made earlier
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/unblock
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_line_serviceName_unblock_POST(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/unblock";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Associate a device to the current line with the device mac address
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/associateDevice
	 * @param macAddress [required] The mac address of the device you want to associate to the line (format: AABBCCDDEEFF)
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_line_serviceName_associateDevice_POST(String billingAccount, String serviceName, String macAddress) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/associateDevice";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "macAddress", macAddress);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Cancel a scheduled conversion to number
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/cancelConvertToNumber
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_line_serviceName_cancelConvertToNumber_POST(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/cancelConvertToNumber";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * List the informations about the last registrations (i.e. IP, port, User-Agent...)
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/lastRegistrations
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<OvhRegistrationInformations> billingAccount_line_serviceName_lastRegistrations_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/lastRegistrations";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t11);
	}
	private static TypeReference<ArrayList<OvhRegistrationInformations>> t11 = new TypeReference<ArrayList<OvhRegistrationInformations>>() {};

	/**
	 * The current calls of your line
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/calls
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_line_serviceName_calls_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/calls";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/calls/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhOvhPabxHuntingQueueLiveCalls billingAccount_line_serviceName_calls_id_GET(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/calls/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHuntingQueueLiveCalls.class);
	}

	/**
	 * Hangup a call
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/calls/{id}/hangup
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_line_serviceName_calls_id_hangup_POST(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/calls/{id}/hangup";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Eavesdrop on a call
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/calls/{id}/eavesdrop
	 * @param number [required] Phone number that will be called and bridged in the communication
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_line_serviceName_calls_id_eavesdrop_POST(String billingAccount, String serviceName, Long id, String number) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/calls/{id}/eavesdrop";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "number", number);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Transfer an answered call
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/calls/{id}/transfer
	 * @param number [required] Phone number to whom the communication will be transfered
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_line_serviceName_calls_id_transfer_POST(String billingAccount, String serviceName, Long id, String number) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/calls/{id}/transfer";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "number", number);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Toogle hold on call
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/calls/{id}/hold
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_line_serviceName_calls_id_hold_POST(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/calls/{id}/hold";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Whisper on a call
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/calls/{id}/whisper
	 * @param whisperingMode [required] Whispering mode
	 * @param number [required] Phone number that will be called and bridged in the communication
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_line_serviceName_calls_id_whisper_POST(String billingAccount, String serviceName, Long id, OvhOvhPabxWhisperingModeEnum whisperingMode, String number) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/calls/{id}/whisper";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "whisperingMode", whisperingMode);
		addBody(o, "number", number);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Intercept a non answered call
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/calls/{id}/intercept
	 * @param number [required] Phone number that will be called and that will intercept the communication
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_line_serviceName_calls_id_intercept_POST(String billingAccount, String serviceName, Long id, String number) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/calls/{id}/intercept";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "number", number);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Make a phone call from the current line
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/click2Call
	 * @param callingNumber [required]
	 * @param calledNumber [required]
	 * @param intercom [required] Activate the calling number in intercom mode automatically (pick up and speaker automatic activation).
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_line_serviceName_click2Call_POST(String billingAccount, String serviceName, String callingNumber, String calledNumber, Boolean intercom) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/click2Call";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "callingNumber", callingNumber);
		addBody(o, "calledNumber", calledNumber);
		addBody(o, "intercom", intercom);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * The recordings of your line outgoing calls
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/records
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_line_serviceName_records_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/records";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/records/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhOvhPabxRecord billingAccount_line_serviceName_records_id_GET(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/records/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxRecord.class);
	}

	/**
	 * Delete the given record
	 *
	 * REST: DELETE /telephony/{billingAccount}/line/{serviceName}/records/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public void billingAccount_line_serviceName_records_id_DELETE(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/records/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Schedule a conversion to number
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/convertToNumber
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhOfferTask billingAccount_line_serviceName_convertToNumber_POST(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/convertToNumber";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhOfferTask.class);
	}

	/**
	 * Change the SIP account password. It must be more than 7 and less than 21 alpha and numerical characters.
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/changePassword
	 * @param password [required] The password
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_line_serviceName_changePassword_POST(String billingAccount, String serviceName, String password) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/changePassword";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/phone
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhPhone billingAccount_line_serviceName_phone_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPhone.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/line/{serviceName}/phone
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_line_serviceName_phone_PUT(String billingAccount, String serviceName, OvhPhone body) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Create a task to reboot the phone
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/phone/reboot
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhTask billingAccount_line_serviceName_phone_reboot_POST(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/reboot";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Return phonebooks associated
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/phone/phonebook
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<String> billingAccount_line_serviceName_phone_phonebook_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/phonebook";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Add a phonebook. Return the bookKey.
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/phone/phonebook
	 * @param name [required] Name of the wanted phonebook
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public String billingAccount_line_serviceName_phone_phonebook_POST(String billingAccount, String serviceName, String name) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/phonebook";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Phonebook contacts
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/phone/phonebook/{bookKey}/phonebookContact
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param bookKey [required] Identifier of the phonebook
	 */
	public ArrayList<Long> billingAccount_line_serviceName_phone_phonebook_bookKey_phonebookContact_GET(String billingAccount, String serviceName, String bookKey) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/phonebook/{bookKey}/phonebookContact";
		StringBuilder sb = path(qPath, billingAccount, serviceName, bookKey);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a phonebook contact. Return identifier of the phonebook contact.
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/phone/phonebook/{bookKey}/phonebookContact
	 * @param homeMobile [required] Home mobile phone number of the contact
	 * @param workMobile [required] Mobile phone office number of the contact
	 * @param group [required] Group name of the phonebook
	 * @param name [required] Name of the contact
	 * @param homePhone [required] Home landline phone number of the contact
	 * @param workPhone [required] Landline phone office number of the contact
	 * @param surname [required] Contact surname
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param bookKey [required] Identifier of the phonebook
	 */
	public Long billingAccount_line_serviceName_phone_phonebook_bookKey_phonebookContact_POST(String billingAccount, String serviceName, String bookKey, String homeMobile, String workMobile, String group, String name, String homePhone, String workPhone, String surname) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/phonebook/{bookKey}/phonebookContact";
		StringBuilder sb = path(qPath, billingAccount, serviceName, bookKey);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "homeMobile", homeMobile);
		addBody(o, "workMobile", workMobile);
		addBody(o, "group", group);
		addBody(o, "name", name);
		addBody(o, "homePhone", homePhone);
		addBody(o, "workPhone", workPhone);
		addBody(o, "surname", surname);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, Long.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/phone/phonebook/{bookKey}/phonebookContact/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param bookKey [required] Identifier of the phonebook
	 * @param id [required] Contact identifier
	 */
	public OvhPhonebookContact billingAccount_line_serviceName_phone_phonebook_bookKey_phonebookContact_id_GET(String billingAccount, String serviceName, String bookKey, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/phonebook/{bookKey}/phonebookContact/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, bookKey, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPhonebookContact.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/line/{serviceName}/phone/phonebook/{bookKey}/phonebookContact/{id}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param bookKey [required] Identifier of the phonebook
	 * @param id [required] Contact identifier
	 */
	public void billingAccount_line_serviceName_phone_phonebook_bookKey_phonebookContact_id_PUT(String billingAccount, String serviceName, String bookKey, Long id, OvhPhonebookContact body) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/phonebook/{bookKey}/phonebookContact/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, bookKey, id);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete a phonebook contact
	 *
	 * REST: DELETE /telephony/{billingAccount}/line/{serviceName}/phone/phonebook/{bookKey}/phonebookContact/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param bookKey [required] Identifier of the phonebook
	 * @param id [required] Contact identifier
	 */
	public void billingAccount_line_serviceName_phone_phonebook_bookKey_phonebookContact_id_DELETE(String billingAccount, String serviceName, String bookKey, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/phonebook/{bookKey}/phonebookContact/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, bookKey, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/phone/phonebook/{bookKey}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param bookKey [required] Identifier of the phonebook
	 */
	public OvhPhonebook billingAccount_line_serviceName_phone_phonebook_bookKey_GET(String billingAccount, String serviceName, String bookKey) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/phonebook/{bookKey}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, bookKey);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPhonebook.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/line/{serviceName}/phone/phonebook/{bookKey}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param bookKey [required] Identifier of the phonebook
	 */
	public void billingAccount_line_serviceName_phone_phonebook_bookKey_PUT(String billingAccount, String serviceName, String bookKey, OvhPhonebook body) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/phonebook/{bookKey}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, bookKey);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete a phonebook
	 *
	 * REST: DELETE /telephony/{billingAccount}/line/{serviceName}/phone/phonebook/{bookKey}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param bookKey [required] Identifier of the phonebook
	 */
	public void billingAccount_line_serviceName_phone_phonebook_bookKey_DELETE(String billingAccount, String serviceName, String bookKey) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/phonebook/{bookKey}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, bookKey);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Export the phonebook's contacts
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/phone/phonebook/{bookKey}/export
	 * @param format [required] Format of the file
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param bookKey [required] Identifier of the phonebook
	 */
	public OvhPcsFile billingAccount_line_serviceName_phone_phonebook_bookKey_export_GET(String billingAccount, String serviceName, String bookKey, OvhContactsExportFormatsEnum format) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/phonebook/{bookKey}/export";
		StringBuilder sb = path(qPath, billingAccount, serviceName, bookKey);
		query(sb, "format", format);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPcsFile.class);
	}

	/**
	 * Import a contacts file. Supported formats are Excel (.xls and .xlsx) and CSV
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/phone/phonebook/{bookKey}/import
	 * @param documentId [required] ID of the /me/document file you want to import
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param bookKey [required] Identifier of the phonebook
	 */
	public OvhTask billingAccount_line_serviceName_phone_phonebook_bookKey_import_POST(String billingAccount, String serviceName, String bookKey, String documentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/phonebook/{bookKey}/import";
		StringBuilder sb = path(qPath, billingAccount, serviceName, bookKey);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "documentId", documentId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Reinitialize the phone configuration
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/phone/resetConfig
	 * @param ip [required] The public ip phone allowed for reset
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhResetPhoneInfo billingAccount_line_serviceName_phone_resetConfig_POST(String billingAccount, String serviceName, String ip) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/resetConfig";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "ip", ip);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhResetPhoneInfo.class);
	}

	/**
	 * Create a task to refresh the screen of the MGCP phone
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/phone/refreshScreen
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhTask billingAccount_line_serviceName_phone_refreshScreen_POST(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/refreshScreen";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Plug & Phone function keys
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/phone/functionKey
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_line_serviceName_phone_functionKey_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/functionKey";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/phone/functionKey/{keyNum}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param keyNum [required] The number of the function key
	 */
	public OvhFunctionKey billingAccount_line_serviceName_phone_functionKey_keyNum_GET(String billingAccount, String serviceName, Long keyNum) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/functionKey/{keyNum}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, keyNum);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFunctionKey.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/line/{serviceName}/phone/functionKey/{keyNum}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param keyNum [required] The number of the function key
	 */
	public void billingAccount_line_serviceName_phone_functionKey_keyNum_PUT(String billingAccount, String serviceName, Long keyNum, OvhFunctionKey body) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/functionKey/{keyNum}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, keyNum);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * List the available functions for the key
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/phone/functionKey/{keyNum}/availableFunction
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param keyNum [required] The number of the function key
	 */
	public ArrayList<String> billingAccount_line_serviceName_phone_functionKey_keyNum_availableFunction_GET(String billingAccount, String serviceName, Long keyNum) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/functionKey/{keyNum}/availableFunction";
		StringBuilder sb = path(qPath, billingAccount, serviceName, keyNum);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * List of available exchange merchandise brand
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/phone/merchandiseAvailable
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<OvhHardwareOffer> billingAccount_line_serviceName_phone_merchandiseAvailable_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/merchandiseAvailable";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t12);
	}
	private static TypeReference<ArrayList<OvhHardwareOffer>> t12 = new TypeReference<ArrayList<OvhHardwareOffer>>() {};

	/**
	 * Edit configuration of the phone remotely by provisioning
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/phone/changePhoneConfiguration
	 * @param newConfigurations [required] Name value pairs of provisioning options
	 * @param autoReboot [required] Automatically reboot phone when applying the configuration
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_line_serviceName_phone_changePhoneConfiguration_POST(String billingAccount, String serviceName, OvhSafeKeyValue<String>[] newConfigurations, Boolean autoReboot) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/changePhoneConfiguration";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "newConfigurations", newConfigurations);
		addBody(o, "autoReboot", autoReboot);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Return Merchandise Authorisation associated
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/phone/rma
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<String> billingAccount_line_serviceName_phone_rma_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/rma";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Create a specific rma
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/phone/rma
	 * @param shippingContactId [required] Shipping contact information id from /me entry point
	 * @param newMerchandise [required] New merchandise brand in case of exchange
	 * @param mondialRelayId [required] Use /supply/mondialRelay entry point to specify a relay point and ignore shipping contact address information entry.
	 * @param type [required] Typology process of merchandise return
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhRmaReturn billingAccount_line_serviceName_phone_rma_POST(String billingAccount, String serviceName, Long shippingContactId, String newMerchandise, String mondialRelayId, OvhRmaPublicTypeEnum type) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/rma";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "shippingContactId", shippingContactId);
		addBody(o, "newMerchandise", newMerchandise);
		addBody(o, "mondialRelayId", mondialRelayId);
		addBody(o, "type", type);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhRmaReturn.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/phone/rma/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Return merchandise authorisation identifier
	 */
	public OvhRma billingAccount_line_serviceName_phone_rma_id_GET(String billingAccount, String serviceName, String id) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/rma/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRma.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/line/{serviceName}/phone/rma/{id}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Return merchandise authorisation identifier
	 */
	public void billingAccount_line_serviceName_phone_rma_id_PUT(String billingAccount, String serviceName, String id, OvhRma body) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/rma/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Cancel the rma
	 *
	 * REST: DELETE /telephony/{billingAccount}/line/{serviceName}/phone/rma/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Return merchandise authorisation identifier
	 */
	public void billingAccount_line_serviceName_phone_rma_id_DELETE(String billingAccount, String serviceName, String id) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/phone/rma/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Dissociate a device from the current line with the device mac address
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/dissociateDevice
	 * @param macAddress [required] The mac address of the device you want to dissociate from the line (format: AABBCCDDEEFF)
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_line_serviceName_dissociateDevice_POST(String billingAccount, String serviceName, String macAddress) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/dissociateDevice";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "macAddress", macAddress);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Listing of domains Sip availables
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/availableSipDomains
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<String> billingAccount_line_serviceName_availableSipDomains_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/availableSipDomains";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Block the line. By default it will block incoming and outgoing calls (except for emergency numbers)
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/block
	 * @param mode [required] The block mode : outgoing, incoming, both (default: both)
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_line_serviceName_block_POST(String billingAccount, String serviceName, OvhLineBlockingMode mode) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/block";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "mode", mode);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Get the maximum available simultaneous lines for this line
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/maximumAvailableSimultaneousLines
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public Long billingAccount_line_serviceName_maximumAvailableSimultaneousLines_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/maximumAvailableSimultaneousLines";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Long.class);
	}

	/**
	 * Ability to manage SIP password on this service
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/canChangePassword
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public Boolean billingAccount_line_serviceName_canChangePassword_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/canChangePassword";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/line/{serviceName}/tones
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhTones billingAccount_line_serviceName_tones_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/tones";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTones.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/line/{serviceName}/tones
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_line_serviceName_tones_PUT(String billingAccount, String serviceName, OvhTones body) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/tones";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Upload new tone file
	 *
	 * REST: POST /telephony/{billingAccount}/line/{serviceName}/tones/toneUpload
	 * @param url [required]
	 * @param type [required]
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhTask billingAccount_line_serviceName_tones_toneUpload_POST(String billingAccount, String serviceName, String url, OvhTonesTypeEnum type) throws IOException {
		String qPath = "/telephony/{billingAccount}/line/{serviceName}/tones/toneUpload";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "url", url);
		addBody(o, "type", type);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Lines associated with this billing account
	 *
	 * REST: GET /telephony/{billingAccount}/line
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<String> billingAccount_line_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/line";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Return phonebooks associated to this group
	 *
	 * REST: GET /telephony/{billingAccount}/phonebook
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<String> billingAccount_phonebook_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/phonebook";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Add a phonebook on group. Return the bookKey.
	 *
	 * REST: POST /telephony/{billingAccount}/phonebook
	 * @param name [required] Name of the wanted phonebook
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public String billingAccount_phonebook_POST(String billingAccount, String name) throws IOException {
		String qPath = "/telephony/{billingAccount}/phonebook";
		StringBuilder sb = path(qPath, billingAccount);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Phonebook contacts
	 *
	 * REST: GET /telephony/{billingAccount}/phonebook/{bookKey}/phonebookContact
	 * @param billingAccount [required] The name of your billingAccount
	 * @param bookKey [required] Identifier of the phonebook
	 */
	public ArrayList<Long> billingAccount_phonebook_bookKey_phonebookContact_GET(String billingAccount, String bookKey) throws IOException {
		String qPath = "/telephony/{billingAccount}/phonebook/{bookKey}/phonebookContact";
		StringBuilder sb = path(qPath, billingAccount, bookKey);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a phonebook contact. Return identifier of the phonebook contact.
	 *
	 * REST: POST /telephony/{billingAccount}/phonebook/{bookKey}/phonebookContact
	 * @param homeMobile [required] Home mobile phone number of the contact
	 * @param workMobile [required] Mobile phone office number of the contact
	 * @param group [required] Group name of the phonebook
	 * @param name [required] Name of the contact
	 * @param homePhone [required] Home landline phone number of the contact
	 * @param workPhone [required] Landline phone office number of the contact
	 * @param surname [required] Contact surname
	 * @param billingAccount [required] The name of your billingAccount
	 * @param bookKey [required] Identifier of the phonebook
	 */
	public Long billingAccount_phonebook_bookKey_phonebookContact_POST(String billingAccount, String bookKey, String homeMobile, String workMobile, String group, String name, String homePhone, String workPhone, String surname) throws IOException {
		String qPath = "/telephony/{billingAccount}/phonebook/{bookKey}/phonebookContact";
		StringBuilder sb = path(qPath, billingAccount, bookKey);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "homeMobile", homeMobile);
		addBody(o, "workMobile", workMobile);
		addBody(o, "group", group);
		addBody(o, "name", name);
		addBody(o, "homePhone", homePhone);
		addBody(o, "workPhone", workPhone);
		addBody(o, "surname", surname);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, Long.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/phonebook/{bookKey}/phonebookContact/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param bookKey [required] Identifier of the phonebook
	 * @param id [required] Contact identifier
	 */
	public OvhPhonebookContact billingAccount_phonebook_bookKey_phonebookContact_id_GET(String billingAccount, String bookKey, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/phonebook/{bookKey}/phonebookContact/{id}";
		StringBuilder sb = path(qPath, billingAccount, bookKey, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPhonebookContact.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/phonebook/{bookKey}/phonebookContact/{id}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param bookKey [required] Identifier of the phonebook
	 * @param id [required] Contact identifier
	 */
	public void billingAccount_phonebook_bookKey_phonebookContact_id_PUT(String billingAccount, String bookKey, Long id, OvhPhonebookContact body) throws IOException {
		String qPath = "/telephony/{billingAccount}/phonebook/{bookKey}/phonebookContact/{id}";
		StringBuilder sb = path(qPath, billingAccount, bookKey, id);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete a phonebook contact
	 *
	 * REST: DELETE /telephony/{billingAccount}/phonebook/{bookKey}/phonebookContact/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param bookKey [required] Identifier of the phonebook
	 * @param id [required] Contact identifier
	 */
	public void billingAccount_phonebook_bookKey_phonebookContact_id_DELETE(String billingAccount, String bookKey, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/phonebook/{bookKey}/phonebookContact/{id}";
		StringBuilder sb = path(qPath, billingAccount, bookKey, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/phonebook/{bookKey}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param bookKey [required] Identifier of the phonebook
	 */
	public OvhPhonebookMaster billingAccount_phonebook_bookKey_GET(String billingAccount, String bookKey) throws IOException {
		String qPath = "/telephony/{billingAccount}/phonebook/{bookKey}";
		StringBuilder sb = path(qPath, billingAccount, bookKey);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPhonebookMaster.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/phonebook/{bookKey}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param bookKey [required] Identifier of the phonebook
	 */
	public void billingAccount_phonebook_bookKey_PUT(String billingAccount, String bookKey, OvhPhonebookMaster body) throws IOException {
		String qPath = "/telephony/{billingAccount}/phonebook/{bookKey}";
		StringBuilder sb = path(qPath, billingAccount, bookKey);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete a phonebook
	 *
	 * REST: DELETE /telephony/{billingAccount}/phonebook/{bookKey}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param bookKey [required] Identifier of the phonebook
	 */
	public void billingAccount_phonebook_bookKey_DELETE(String billingAccount, String bookKey) throws IOException {
		String qPath = "/telephony/{billingAccount}/phonebook/{bookKey}";
		StringBuilder sb = path(qPath, billingAccount, bookKey);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Export the phonebook's contacts
	 *
	 * REST: GET /telephony/{billingAccount}/phonebook/{bookKey}/export
	 * @param format [required] Format of the file
	 * @param billingAccount [required] The name of your billingAccount
	 * @param bookKey [required] Identifier of the phonebook
	 */
	public OvhPcsFile billingAccount_phonebook_bookKey_export_GET(String billingAccount, String bookKey, OvhContactsExportFormatsEnum format) throws IOException {
		String qPath = "/telephony/{billingAccount}/phonebook/{bookKey}/export";
		StringBuilder sb = path(qPath, billingAccount, bookKey);
		query(sb, "format", format);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPcsFile.class);
	}

	/**
	 * Import a contacts file. Supported formats are Excel (.xls and .xlsx) and CSV
	 *
	 * REST: POST /telephony/{billingAccount}/phonebook/{bookKey}/import
	 * @param documentId [required] ID of the /me/document file you want to import
	 * @param billingAccount [required] The name of your billingAccount
	 * @param bookKey [required] Identifier of the phonebook
	 */
	public OvhTask billingAccount_phonebook_bookKey_import_POST(String billingAccount, String bookKey, String documentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/phonebook/{bookKey}/import";
		StringBuilder sb = path(qPath, billingAccount, bookKey);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "documentId", documentId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/service/{serviceName}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhTelephonyService billingAccount_service_serviceName_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTelephonyService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/service/{serviceName}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_service_serviceName_PUT(String billingAccount, String serviceName, OvhTelephonyService body) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Ask for a service termination.
	 *
	 * REST: DELETE /telephony/{billingAccount}/service/{serviceName}
	 * @param reason [required] Termination reason
	 * @param details [required] Termination reason details
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_service_serviceName_DELETE(String billingAccount, String serviceName, String details, OvhTerminationReasonEnum reason) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		query(sb, "details", details);
		query(sb, "reason", reason);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Call delivery records.
	 *
	 * REST: GET /telephony/{billingAccount}/service/{serviceName}/voiceConsumption
	 * @param planType [required] Filter the value of planType property (=)
	 * @param destinationType [required] Filter the value of destinationType property (=)
	 * @param creationDatetime_to [required] Filter the value of creationDatetime property (<=)
	 * @param creationDatetime_from [required] Filter the value of creationDatetime property (>=)
	 * @param wayType [required] Filter the value of wayType property (=)
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_service_serviceName_voiceConsumption_GET(String billingAccount, String serviceName, Date creationDatetime_from, Date creationDatetime_to, OvhVoiceConsumptionDestinationTypeEnum destinationType, OvhVoiceConsumptionPlanTypeEnum planType, OvhVoiceConsumptionWayTypeEnum wayType) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/voiceConsumption";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		query(sb, "creationDatetime.from", creationDatetime_from);
		query(sb, "creationDatetime.to", creationDatetime_to);
		query(sb, "destinationType", destinationType);
		query(sb, "planType", planType);
		query(sb, "wayType", wayType);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/service/{serviceName}/voiceConsumption/{consumptionId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param consumptionId [required]
	 */
	public OvhVoiceConsumption billingAccount_service_serviceName_voiceConsumption_consumptionId_GET(String billingAccount, String serviceName, Long consumptionId) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/voiceConsumption/{consumptionId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, consumptionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVoiceConsumption.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/service/{serviceName}/voiceConsumption/{consumptionId}/callDiagnostics
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param consumptionId [required]
	 */
	public OvhCallDiagnostics billingAccount_service_serviceName_voiceConsumption_consumptionId_callDiagnostics_GET(String billingAccount, String serviceName, Long consumptionId) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/voiceConsumption/{consumptionId}/callDiagnostics";
		StringBuilder sb = path(qPath, billingAccount, serviceName, consumptionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhCallDiagnostics.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/service/{serviceName}/offerChange
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhOfferChange billingAccount_service_serviceName_offerChange_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/offerChange";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOfferChange.class);
	}

	/**
	 * Add a new offer change
	 *
	 * REST: POST /telephony/{billingAccount}/service/{serviceName}/offerChange
	 * @param offer [required] The future offer
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_service_serviceName_offerChange_POST(String billingAccount, String serviceName, String offer) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/offerChange";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "offer", offer);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Delete the replacement offer scheduling
	 *
	 * REST: DELETE /telephony/{billingAccount}/service/{serviceName}/offerChange
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_service_serviceName_offerChange_DELETE(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/offerChange";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Call delivery records of the previous month.
	 *
	 * REST: GET /telephony/{billingAccount}/service/{serviceName}/previousVoiceConsumption
	 * @param planType [required] Filter the value of planType property (=)
	 * @param destinationType [required] Filter the value of destinationType property (=)
	 * @param creationDatetime_to [required] Filter the value of creationDatetime property (<=)
	 * @param creationDatetime_from [required] Filter the value of creationDatetime property (>=)
	 * @param wayType [required] Filter the value of wayType property (=)
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_service_serviceName_previousVoiceConsumption_GET(String billingAccount, String serviceName, Date creationDatetime_from, Date creationDatetime_to, OvhVoiceConsumptionDestinationTypeEnum destinationType, OvhVoiceConsumptionPlanTypeEnum planType, OvhVoiceConsumptionWayTypeEnum wayType) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/previousVoiceConsumption";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		query(sb, "creationDatetime.from", creationDatetime_from);
		query(sb, "creationDatetime.to", creationDatetime_to);
		query(sb, "destinationType", destinationType);
		query(sb, "planType", planType);
		query(sb, "wayType", wayType);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/service/{serviceName}/previousVoiceConsumption/{consumptionId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param consumptionId [required]
	 */
	public OvhPreviousVoiceConsumption billingAccount_service_serviceName_previousVoiceConsumption_consumptionId_GET(String billingAccount, String serviceName, Long consumptionId) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/previousVoiceConsumption/{consumptionId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, consumptionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPreviousVoiceConsumption.class);
	}

	/**
	 * Cancel the service termination
	 *
	 * REST: POST /telephony/{billingAccount}/service/{serviceName}/cancelTermination
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_service_serviceName_cancelTermination_POST(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/cancelTermination";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Operations on a telephony service
	 *
	 * REST: GET /telephony/{billingAccount}/service/{serviceName}/task
	 * @param serviceType [required] Filter the value of serviceType property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param action [required] Filter the value of action property (=)
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_service_serviceName_task_GET(String billingAccount, String serviceName, String action, String serviceType, OvhTaskStatusEnum status) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/task";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		query(sb, "action", action);
		query(sb, "serviceType", serviceType);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/service/{serviceName}/task/{taskId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param taskId [required]
	 */
	public OvhTask billingAccount_service_serviceName_task_taskId_GET(String billingAccount, String serviceName, Long taskId) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/task/{taskId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Call which could be repayable
	 *
	 * REST: GET /telephony/{billingAccount}/service/{serviceName}/repaymentConsumption
	 * @param creationDatetime_to [required] Filter the value of creationDatetime property (<=)
	 * @param creationDatetime_from [required] Filter the value of creationDatetime property (>=)
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_service_serviceName_repaymentConsumption_GET(String billingAccount, String serviceName, Date creationDatetime_from, Date creationDatetime_to) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/repaymentConsumption";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		query(sb, "creationDatetime.from", creationDatetime_from);
		query(sb, "creationDatetime.to", creationDatetime_to);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/service/{serviceName}/repaymentConsumption/{consumptionId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param consumptionId [required]
	 */
	public OvhRepaymentConsumption billingAccount_service_serviceName_repaymentConsumption_consumptionId_GET(String billingAccount, String serviceName, Long consumptionId) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/repaymentConsumption/{consumptionId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, consumptionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRepaymentConsumption.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/service/{serviceName}/directory
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhDirectoryInfo billingAccount_service_serviceName_directory_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/directory";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDirectoryInfo.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/service/{serviceName}/directory
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_service_serviceName_directory_PUT(String billingAccount, String serviceName, OvhDirectoryInfo body) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/directory";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get all the way types availables
	 *
	 * REST: GET /telephony/{billingAccount}/service/{serviceName}/directory/getWayTypes
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<OvhDirectoryWayType> billingAccount_service_serviceName_directory_getWayTypes_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/directory/getWayTypes";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t13);
	}
	private static TypeReference<ArrayList<OvhDirectoryWayType>> t13 = new TypeReference<ArrayList<OvhDirectoryWayType>>() {};

	/**
	 * Get directory service code from an APE code ( principal activity of the firm code )
	 *
	 * REST: GET /telephony/{billingAccount}/service/{serviceName}/directory/getDirectoryServiceCode
	 * @param apeCode [required]
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<OvhDirectoryHeadingPJ> billingAccount_service_serviceName_directory_getDirectoryServiceCode_GET(String billingAccount, String serviceName, String apeCode) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/directory/getDirectoryServiceCode";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		query(sb, "apeCode", apeCode);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t14);
	}
	private static TypeReference<ArrayList<OvhDirectoryHeadingPJ>> t14 = new TypeReference<ArrayList<OvhDirectoryHeadingPJ>>() {};

	/**
	 * Get company entreprise informations by providing entreprise number
	 *
	 * REST: POST /telephony/{billingAccount}/service/{serviceName}/directory/fetchEntrepriseInformations
	 * @param entrepriseNumber [required] Entreprise number to fetch informations from
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhEntrepriseNumberInformationsTask billingAccount_service_serviceName_directory_fetchEntrepriseInformations_POST(String billingAccount, String serviceName, String entrepriseNumber) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/directory/fetchEntrepriseInformations";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "entrepriseNumber", entrepriseNumber);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhEntrepriseNumberInformationsTask.class);
	}

	/**
	 * Fax delivery records.
	 *
	 * REST: GET /telephony/{billingAccount}/service/{serviceName}/faxConsumption
	 * @param creationDatetime_to [required] Filter the value of creationDatetime property (<=)
	 * @param creationDatetime_from [required] Filter the value of creationDatetime property (>=)
	 * @param wayType [required] Filter the value of wayType property (=)
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_service_serviceName_faxConsumption_GET(String billingAccount, String serviceName, Date creationDatetime_from, Date creationDatetime_to, OvhFaxConsumptionWayTypeEnum wayType) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/faxConsumption";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		query(sb, "creationDatetime.from", creationDatetime_from);
		query(sb, "creationDatetime.to", creationDatetime_to);
		query(sb, "wayType", wayType);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/service/{serviceName}/faxConsumption/{consumptionId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param consumptionId [required]
	 */
	public OvhFaxConsumption billingAccount_service_serviceName_faxConsumption_consumptionId_GET(String billingAccount, String serviceName, Long consumptionId) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/faxConsumption/{consumptionId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, consumptionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFaxConsumption.class);
	}

	/**
	 * Operations on a telephony service's offer
	 *
	 * REST: GET /telephony/{billingAccount}/service/{serviceName}/offerTask
	 * @param status [required] Filter the value of status property (=)
	 * @param action [required] Filter the value of action property (=)
	 * @param type [required] Filter the value of type property (=)
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_service_serviceName_offerTask_GET(String billingAccount, String serviceName, OvhOfferTaskActionEnum action, OvhTaskStatusEnum status, OvhOfferTaskTypeEnum type) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/offerTask";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		query(sb, "action", action);
		query(sb, "status", status);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/service/{serviceName}/offerTask/{taskId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param taskId [required]
	 */
	public OvhOfferTask billingAccount_service_serviceName_offerTask_taskId_GET(String billingAccount, String serviceName, Long taskId) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/offerTask/{taskId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOfferTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/service/{serviceName}/eventToken
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhEventToken billingAccount_service_serviceName_eventToken_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/eventToken";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEventToken.class);
	}

	/**
	 * Create a new token
	 *
	 * REST: POST /telephony/{billingAccount}/service/{serviceName}/eventToken
	 * @param expiration [required] Time to live in seconds for the token
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public String billingAccount_service_serviceName_eventToken_POST(String billingAccount, String serviceName, OvhTokenExpirationEnum expiration) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/eventToken";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "expiration", expiration);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Delete the given token
	 *
	 * REST: DELETE /telephony/{billingAccount}/service/{serviceName}/eventToken
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_service_serviceName_eventToken_DELETE(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/eventToken";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Move a service of billing account. Source and destination nics should be the same.
	 *
	 * REST: POST /telephony/{billingAccount}/service/{serviceName}/changeOfBillingAccount
	 * @param billingAccountDestination [required] Billing account destination target
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_service_serviceName_changeOfBillingAccount_POST(String billingAccount, String serviceName, String billingAccountDestination) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/changeOfBillingAccount";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "billingAccountDestination", billingAccountDestination);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Get Relevant informations of the service detected from the MOS or the signal leg in SIP/MGCP protocol.
	 *
	 * REST: GET /telephony/{billingAccount}/service/{serviceName}/diagnosticReports
	 * @param dayInterval [required] The date index interval
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<OvhDiagnosticReport> billingAccount_service_serviceName_diagnosticReports_GET(String billingAccount, String serviceName, OvhDiagnosticReportIndexEnum dayInterval) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/diagnosticReports";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		query(sb, "dayInterval", dayInterval);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t15);
	}
	private static TypeReference<ArrayList<OvhDiagnosticReport>> t15 = new TypeReference<ArrayList<OvhDiagnosticReport>>() {};

	/**
	 * List all available offer changes compatibilities
	 *
	 * REST: GET /telephony/{billingAccount}/service/{serviceName}/offerChanges
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<OvhLineOffer> billingAccount_service_serviceName_offerChanges_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/service/{serviceName}/offerChanges";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t16);
	}
	private static TypeReference<ArrayList<OvhLineOffer>> t16 = new TypeReference<ArrayList<OvhLineOffer>>() {};

	/**
	 * Services associated with this billing account
	 *
	 * REST: GET /telephony/{billingAccount}/service
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<String> billingAccount_service_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/service";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Used to overwrite current billing account feature by the billing account site
	 *
	 * REST: POST /telephony/{billingAccount}/billingAccountSite
	 * @param billingAccountSite [required] Billing account site (master billing account)
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public void billingAccount_billingAccountSite_POST(String billingAccount, String billingAccountSite) throws IOException {
		String qPath = "/telephony/{billingAccount}/billingAccountSite";
		StringBuilder sb = path(qPath, billingAccount);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "billingAccountSite", billingAccountSite);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Current billing account site (billing account features are overwritten by the site)
	 *
	 * REST: GET /telephony/{billingAccount}/billingAccountSite
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public String billingAccount_billingAccountSite_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/billingAccountSite";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/scheduler/{serviceName}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhScheduler billingAccount_scheduler_serviceName_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/scheduler/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhScheduler.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/scheduler/{serviceName}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_scheduler_serviceName_PUT(String billingAccount, String serviceName, OvhScheduler body) throws IOException {
		String qPath = "/telephony/{billingAccount}/scheduler/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Add scheduler events in ICS format
	 *
	 * REST: POST /telephony/{billingAccount}/scheduler/{serviceName}/importIcsCalendar
	 * @param url [required] The URL of your ICS formated calendar
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhTask billingAccount_scheduler_serviceName_importIcsCalendar_POST(String billingAccount, String serviceName, String url) throws IOException {
		String qPath = "/telephony/{billingAccount}/scheduler/{serviceName}/importIcsCalendar";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "url", url);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Custom events scheduled
	 *
	 * REST: GET /telephony/{billingAccount}/scheduler/{serviceName}/events
	 * @param dateEnd_from [required] Filter the value of dateEnd property (>=)
	 * @param dateStart_to [required] Filter the value of dateStart property (<=)
	 * @param dateEnd_to [required] Filter the value of dateEnd property (<=)
	 * @param dateStart_from [required] Filter the value of dateStart property (>=)
	 * @param categories [required] Filter the value of categories property (=)
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<String> billingAccount_scheduler_serviceName_events_GET(String billingAccount, String serviceName, OvhSchedulerCategoryEnum categories, Date dateEnd_from, Date dateEnd_to, Date dateStart_from, Date dateStart_to) throws IOException {
		String qPath = "/telephony/{billingAccount}/scheduler/{serviceName}/events";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		query(sb, "categories", categories);
		query(sb, "dateEnd.from", dateEnd_from);
		query(sb, "dateEnd.to", dateEnd_to);
		query(sb, "dateStart.from", dateStart_from);
		query(sb, "dateStart.to", dateStart_to);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Add a scheduler event
	 *
	 * REST: POST /telephony/{billingAccount}/scheduler/{serviceName}/events
	 * @param uid [required] The unique ICS event identifier
	 * @param dateStart [required] The beginning date of the event
	 * @param category [required] The category of the event
	 * @param dateEnd [required] The ending date of the event
	 * @param title [required] The title of the event
	 * @param description [required] The descritpion of the event
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_scheduler_serviceName_events_POST(String billingAccount, String serviceName, String uid, Date dateStart, OvhSchedulerCategoryEnum category, Date dateEnd, String title, String description) throws IOException {
		String qPath = "/telephony/{billingAccount}/scheduler/{serviceName}/events";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "uid", uid);
		addBody(o, "dateStart", dateStart);
		addBody(o, "category", category);
		addBody(o, "dateEnd", dateEnd);
		addBody(o, "title", title);
		addBody(o, "description", description);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/scheduler/{serviceName}/events/{uid}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param uid [required] The unique ICS event identifier
	 */
	public OvhSchedulerEvent billingAccount_scheduler_serviceName_events_uid_GET(String billingAccount, String serviceName, String uid) throws IOException {
		String qPath = "/telephony/{billingAccount}/scheduler/{serviceName}/events/{uid}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, uid);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhSchedulerEvent.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/scheduler/{serviceName}/events/{uid}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param uid [required] The unique ICS event identifier
	 */
	public void billingAccount_scheduler_serviceName_events_uid_PUT(String billingAccount, String serviceName, String uid, OvhSchedulerEvent body) throws IOException {
		String qPath = "/telephony/{billingAccount}/scheduler/{serviceName}/events/{uid}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, uid);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the given scheduler event
	 *
	 * REST: DELETE /telephony/{billingAccount}/scheduler/{serviceName}/events/{uid}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param uid [required] The unique ICS event identifier
	 */
	public void billingAccount_scheduler_serviceName_events_uid_DELETE(String billingAccount, String serviceName, String uid) throws IOException {
		String qPath = "/telephony/{billingAccount}/scheduler/{serviceName}/events/{uid}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, uid);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Scheduled events
	 *
	 * REST: GET /telephony/{billingAccount}/scheduler
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<String> billingAccount_scheduler_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/scheduler";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/serviceInfos
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public OvhService billingAccount_serviceInfos_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/serviceInfos";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/serviceInfos
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public void billingAccount_serviceInfos_PUT(String billingAccount, OvhService body) throws IOException {
		String qPath = "/telephony/{billingAccount}/serviceInfos";
		StringBuilder sb = path(qPath, billingAccount);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Transfer security deposit between two billing accounts
	 *
	 * REST: POST /telephony/{billingAccount}/transferSecurityDeposit
	 * @param amount [required] The amount, in euros, you want to transfer
	 * @param billingAccountDestination [required] The destination billing account
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public void billingAccount_transferSecurityDeposit_POST(String billingAccount, Long amount, String billingAccountDestination) throws IOException {
		String qPath = "/telephony/{billingAccount}/transferSecurityDeposit";
		StringBuilder sb = path(qPath, billingAccount);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "amount", amount);
		addBody(o, "billingAccountDestination", billingAccountDestination);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/number/{serviceName}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required] Name of the service
	 */
	public OvhNumber billingAccount_number_serviceName_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/number/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhNumber.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/number/{serviceName}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required] Name of the service
	 */
	public void billingAccount_number_serviceName_PUT(String billingAccount, String serviceName, OvhNumber body) throws IOException {
		String qPath = "/telephony/{billingAccount}/number/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get the available line offers to schedule a conversion to line
	 *
	 * REST: GET /telephony/{billingAccount}/number/{serviceName}/convertToLineAvailableOffers
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required] Name of the service
	 */
	public OvhLineOffersAndContracts billingAccount_number_serviceName_convertToLineAvailableOffers_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/number/{serviceName}/convertToLineAvailableOffers";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhLineOffersAndContracts.class);
	}

	/**
	 * Schedule a conversion to line
	 *
	 * REST: POST /telephony/{billingAccount}/number/{serviceName}/convertToLine
	 * @param offer [required] The future offer of the converted number
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required] Name of the service
	 */
	public OvhOfferTask billingAccount_number_serviceName_convertToLine_POST(String billingAccount, String serviceName, String offer) throws IOException {
		String qPath = "/telephony/{billingAccount}/number/{serviceName}/convertToLine";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "offer", offer);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOfferTask.class);
	}

	/**
	 * Cancel a scheduled conversion to line
	 *
	 * REST: POST /telephony/{billingAccount}/number/{serviceName}/cancelConvertToLine
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required] Name of the service
	 */
	public void billingAccount_number_serviceName_cancelConvertToLine_POST(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/number/{serviceName}/cancelConvertToLine";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Change the feature type of the phone number
	 *
	 * REST: POST /telephony/{billingAccount}/number/{serviceName}/changeFeatureType
	 * @param featureType [required] The new feature of the number
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required] Name of the service
	 */
	public OvhTask billingAccount_number_serviceName_changeFeatureType_POST(String billingAccount, String serviceName, OvhTypeEnum featureType) throws IOException {
		String qPath = "/telephony/{billingAccount}/number/{serviceName}/changeFeatureType";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "featureType", featureType);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Additional numbers associated with this billing account
	 *
	 * REST: GET /telephony/{billingAccount}/number
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<String> billingAccount_number_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/number";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /telephony/{billingAccount}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<Long> billingAccount_changeContact_POST(String billingAccount, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/telephony/{billingAccount}/changeContact";
		StringBuilder sb = path(qPath, billingAccount);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t3);
	}

	/**
	 * Check if security deposit transfer is possible between two billing accounts
	 *
	 * REST: POST /telephony/{billingAccount}/canTransferSecurityDeposit
	 * @param billingAccountDestination [required] The destination billing account
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public Boolean billingAccount_canTransferSecurityDeposit_POST(String billingAccount, String billingAccountDestination) throws IOException {
		String qPath = "/telephony/{billingAccount}/canTransferSecurityDeposit";
		StringBuilder sb = path(qPath, billingAccount);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "billingAccountDestination", billingAccountDestination);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/eventToken
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public OvhEventToken billingAccount_eventToken_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/eventToken";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEventToken.class);
	}

	/**
	 * Create a new token
	 *
	 * REST: POST /telephony/{billingAccount}/eventToken
	 * @param expiration [required] Time to live in seconds for the token
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public String billingAccount_eventToken_POST(String billingAccount, OvhTokenExpirationEnum expiration) throws IOException {
		String qPath = "/telephony/{billingAccount}/eventToken";
		StringBuilder sb = path(qPath, billingAccount);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "expiration", expiration);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Delete the given token
	 *
	 * REST: DELETE /telephony/{billingAccount}/eventToken
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public void billingAccount_eventToken_DELETE(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/eventToken";
		StringBuilder sb = path(qPath, billingAccount);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Current number portabilities for this billing account
	 *
	 * REST: GET /telephony/{billingAccount}/portability
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<Long> billingAccount_portability_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/portability";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/portability/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param id [required] The ID of the portability
	 */
	public OvhPortability billingAccount_portability_id_GET(String billingAccount, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/portability/{id}";
		StringBuilder sb = path(qPath, billingAccount, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPortability.class);
	}

	/**
	 * Indicates whether or not the portability date can be changed
	 *
	 * REST: GET /telephony/{billingAccount}/portability/{id}/dateCanBeChanged
	 * @param billingAccount [required] The name of your billingAccount
	 * @param id [required] The ID of the portability
	 */
	public Boolean billingAccount_portability_id_dateCanBeChanged_GET(String billingAccount, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/portability/{id}/dateCanBeChanged";
		StringBuilder sb = path(qPath, billingAccount, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Indicates the current status of the portability, with a list of steps
	 *
	 * REST: GET /telephony/{billingAccount}/portability/{id}/status
	 * @param billingAccount [required] The name of your billingAccount
	 * @param id [required] The ID of the portability
	 */
	public ArrayList<OvhPortabilityStep> billingAccount_portability_id_status_GET(String billingAccount, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/portability/{id}/status";
		StringBuilder sb = path(qPath, billingAccount, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t17);
	}
	private static TypeReference<ArrayList<OvhPortabilityStep>> t17 = new TypeReference<ArrayList<OvhPortabilityStep>>() {};

	/**
	 * Indicates whether or not the portability can be cancelled
	 *
	 * REST: GET /telephony/{billingAccount}/portability/{id}/canBeCancelled
	 * @param billingAccount [required] The name of your billingAccount
	 * @param id [required] The ID of the portability
	 */
	public Boolean billingAccount_portability_id_canBeCancelled_GET(String billingAccount, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/portability/{id}/canBeCancelled";
		StringBuilder sb = path(qPath, billingAccount, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Ask to execute the portability
	 *
	 * REST: POST /telephony/{billingAccount}/portability/{id}/execute
	 * @param billingAccount [required] The name of your billingAccount
	 * @param id [required] The ID of the portability
	 */
	public void billingAccount_portability_id_execute_POST(String billingAccount, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/portability/{id}/execute";
		StringBuilder sb = path(qPath, billingAccount, id);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Ask to change the portability date
	 *
	 * REST: POST /telephony/{billingAccount}/portability/{id}/changeDate
	 * @param billingAccount [required] The name of your billingAccount
	 * @param id [required] The ID of the portability
	 */
	public void billingAccount_portability_id_changeDate_POST(String billingAccount, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/portability/{id}/changeDate";
		StringBuilder sb = path(qPath, billingAccount, id);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Indicates whether or not the portability can be executed
	 *
	 * REST: GET /telephony/{billingAccount}/portability/{id}/canBeExecuted
	 * @param billingAccount [required] The name of your billingAccount
	 * @param id [required] The ID of the portability
	 */
	public Boolean billingAccount_portability_id_canBeExecuted_GET(String billingAccount, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/portability/{id}/canBeExecuted";
		StringBuilder sb = path(qPath, billingAccount, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Ask to cancel the portability
	 *
	 * REST: POST /telephony/{billingAccount}/portability/{id}/cancel
	 * @param billingAccount [required] The name of your billingAccount
	 * @param id [required] The ID of the portability
	 */
	public void billingAccount_portability_id_cancel_POST(String billingAccount, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/portability/{id}/cancel";
		StringBuilder sb = path(qPath, billingAccount, id);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Previous repayment bill
	 *
	 * REST: GET /telephony/{billingAccount}/historyRepaymentConsumption
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<Date> billingAccount_historyRepaymentConsumption_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/historyRepaymentConsumption";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t6);
	}

	/**
	 * Ask for a new repayment
	 *
	 * REST: POST /telephony/{billingAccount}/historyRepaymentConsumption
	 * @param billingNumber [required] The number of the bill
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public OvhHistoryRepaymentConsumption billingAccount_historyRepaymentConsumption_POST(String billingAccount, String billingNumber) throws IOException {
		String qPath = "/telephony/{billingAccount}/historyRepaymentConsumption";
		StringBuilder sb = path(qPath, billingAccount);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "billingNumber", billingNumber);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhHistoryRepaymentConsumption.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/historyRepaymentConsumption/{date}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param date [required] date of the bill
	 */
	public OvhHistoryRepaymentConsumption billingAccount_historyRepaymentConsumption_date_GET(String billingAccount, java.util.Date date) throws IOException {
		String qPath = "/telephony/{billingAccount}/historyRepaymentConsumption/{date}";
		StringBuilder sb = path(qPath, billingAccount, date);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhHistoryRepaymentConsumption.class);
	}

	/**
	 * Get the csv document
	 *
	 * REST: GET /telephony/{billingAccount}/historyRepaymentConsumption/{date}/document
	 * @param billingAccount [required] The name of your billingAccount
	 * @param date [required] date of the bill
	 */
	public OvhPcsFile billingAccount_historyRepaymentConsumption_date_document_GET(String billingAccount, java.util.Date date) throws IOException {
		String qPath = "/telephony/{billingAccount}/historyRepaymentConsumption/{date}/document";
		StringBuilder sb = path(qPath, billingAccount, date);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPcsFile.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/vxml/{serviceName}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhVxml billingAccount_vxml_serviceName_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/vxml/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVxml.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/vxml/{serviceName}/settings
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhVxmlProperties billingAccount_vxml_serviceName_settings_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/vxml/{serviceName}/settings";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhVxmlProperties.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/vxml/{serviceName}/settings
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_vxml_serviceName_settings_PUT(String billingAccount, String serviceName, OvhVxmlProperties body) throws IOException {
		String qPath = "/telephony/{billingAccount}/vxml/{serviceName}/settings";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Vxml numbers associated with this billing account
	 *
	 * REST: GET /telephony/{billingAccount}/vxml
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<String> billingAccount_vxml_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/vxml";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/redirect/{serviceName}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhRedirect billingAccount_redirect_serviceName_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/redirect/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRedirect.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/redirect/{serviceName}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_redirect_serviceName_PUT(String billingAccount, String serviceName, OvhRedirect body) throws IOException {
		String qPath = "/telephony/{billingAccount}/redirect/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Change the destination of the redirect
	 *
	 * REST: POST /telephony/{billingAccount}/redirect/{serviceName}/changeDestination
	 * @param destination [required] The destination
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhTask billingAccount_redirect_serviceName_changeDestination_POST(String billingAccount, String serviceName, String destination) throws IOException {
		String qPath = "/telephony/{billingAccount}/redirect/{serviceName}/changeDestination";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "destination", destination);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Redirects associated with this billing account
	 *
	 * REST: GET /telephony/{billingAccount}/redirect
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<String> billingAccount_redirect_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/redirect";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/rsva/{serviceName}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhRsva billingAccount_rsva_serviceName_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/rsva/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhRsva.class);
	}

	/**
	 * New scheduled rate code related to this sva
	 *
	 * REST: GET /telephony/{billingAccount}/rsva/{serviceName}/scheduledRateCode
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhDetailedRateCodeInformation billingAccount_rsva_serviceName_scheduledRateCode_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/rsva/{serviceName}/scheduledRateCode";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDetailedRateCodeInformation.class);
	}

	/**
	 * Schedule a new rate code for this sva
	 *
	 * REST: POST /telephony/{billingAccount}/rsva/{serviceName}/scheduleRateCode
	 * @param rateCode [required] The specified rate code
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhDetailedRateCodeInformation billingAccount_rsva_serviceName_scheduleRateCode_POST(String billingAccount, String serviceName, String rateCode) throws IOException {
		String qPath = "/telephony/{billingAccount}/rsva/{serviceName}/scheduleRateCode";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "rateCode", rateCode);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhDetailedRateCodeInformation.class);
	}

	/**
	 * Compatible rate codes related to this value added service
	 *
	 * REST: GET /telephony/{billingAccount}/rsva/{serviceName}/allowedRateCodes
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<OvhRateCodeInformation> billingAccount_rsva_serviceName_allowedRateCodes_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/rsva/{serviceName}/allowedRateCodes";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t18);
	}
	private static TypeReference<ArrayList<OvhRateCodeInformation>> t18 = new TypeReference<ArrayList<OvhRateCodeInformation>>() {};

	/**
	 * Current rate code related to this sva
	 *
	 * REST: GET /telephony/{billingAccount}/rsva/{serviceName}/currentRateCode
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhDetailedRateCodeInformation billingAccount_rsva_serviceName_currentRateCode_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/rsva/{serviceName}/currentRateCode";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDetailedRateCodeInformation.class);
	}

	/**
	 * Cancel a scheduled rate code update
	 *
	 * REST: POST /telephony/{billingAccount}/rsva/{serviceName}/cancelScheduledRateCode
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_rsva_serviceName_cancelScheduledRateCode_POST(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/rsva/{serviceName}/cancelScheduledRateCode";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Service concerned by the french RSVA reform
	 *
	 * REST: GET /telephony/{billingAccount}/rsva
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<String> billingAccount_rsva_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/rsva";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/fax/{serviceName}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhFax billingAccount_fax_serviceName_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/fax/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFax.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/fax/{serviceName}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_fax_serviceName_PUT(String billingAccount, String serviceName, OvhFax body) throws IOException {
		String qPath = "/telephony/{billingAccount}/fax/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Fax campaigns of the associate fax
	 *
	 * REST: GET /telephony/{billingAccount}/fax/{serviceName}/campaigns
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_fax_serviceName_campaigns_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/fax/{serviceName}/campaigns";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new fax campaign
	 *
	 * REST: POST /telephony/{billingAccount}/fax/{serviceName}/campaigns
	 * @param recipientsType [required] Method to set the campaign recipient
	 * @param recipientsDocId [required] If recipientsType is set to document, the id of the document containing the recipients phone numbers
	 * @param documentId [required] The id of the /me/document pdf you want to send
	 * @param recipientsList [required] If recipientsType is set to list, the list of recipients phone numbers
	 * @param sendDate [required] Sending date of the campaign (when sendType is scheduled)
	 * @param name [required] The name of the fax campaign
	 * @param sendType [required] Sending type of the campaign
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhFaxCampaign billingAccount_fax_serviceName_campaigns_POST(String billingAccount, String serviceName, OvhFaxCampaignRecipientsTypeEnum recipientsType, String recipientsDocId, String documentId, String[] recipientsList, Date sendDate, String name, OvhFaxCampaignSendTypeEnum sendType) throws IOException {
		String qPath = "/telephony/{billingAccount}/fax/{serviceName}/campaigns";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "recipientsType", recipientsType);
		addBody(o, "recipientsDocId", recipientsDocId);
		addBody(o, "documentId", documentId);
		addBody(o, "recipientsList", recipientsList);
		addBody(o, "sendDate", sendDate);
		addBody(o, "name", name);
		addBody(o, "sendType", sendType);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhFaxCampaign.class);
	}

	/**
	 * Detail of the fax recipients by status
	 *
	 * REST: GET /telephony/{billingAccount}/fax/{serviceName}/campaigns/{id}/detail
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhFaxCampaignDetail billingAccount_fax_serviceName_campaigns_id_detail_GET(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/fax/{serviceName}/campaigns/{id}/detail";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFaxCampaignDetail.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/fax/{serviceName}/campaigns/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhFaxCampaign billingAccount_fax_serviceName_campaigns_id_GET(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/fax/{serviceName}/campaigns/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFaxCampaign.class);
	}

	/**
	 * Delete a fax campaign
	 *
	 * REST: DELETE /telephony/{billingAccount}/fax/{serviceName}/campaigns/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public void billingAccount_fax_serviceName_campaigns_id_DELETE(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/fax/{serviceName}/campaigns/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Stop a fax campaign
	 *
	 * REST: POST /telephony/{billingAccount}/fax/{serviceName}/campaigns/{id}/stop
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public void billingAccount_fax_serviceName_campaigns_id_stop_POST(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/fax/{serviceName}/campaigns/{id}/stop";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Start a fax campaign
	 *
	 * REST: POST /telephony/{billingAccount}/fax/{serviceName}/campaigns/{id}/start
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public void billingAccount_fax_serviceName_campaigns_id_start_POST(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/fax/{serviceName}/campaigns/{id}/start";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/fax/{serviceName}/settings
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhFaxProperties billingAccount_fax_serviceName_settings_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/fax/{serviceName}/settings";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhFaxProperties.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/fax/{serviceName}/settings
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_fax_serviceName_settings_PUT(String billingAccount, String serviceName, OvhFaxProperties body) throws IOException {
		String qPath = "/telephony/{billingAccount}/fax/{serviceName}/settings";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Generates a new password for your fax account
	 *
	 * REST: POST /telephony/{billingAccount}/fax/{serviceName}/settings/changePassword
	 * @param password [required] The password, if not specified, a random password will be generated
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public String billingAccount_fax_serviceName_settings_changePassword_POST(String billingAccount, String serviceName, String password) throws IOException {
		String qPath = "/telephony/{billingAccount}/fax/{serviceName}/settings/changePassword";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "password", password);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Generates a new password for your fax account
	 *
	 * REST: POST /telephony/{billingAccount}/fax/{serviceName}/settings/newPassword
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @deprecated
	 */
	public String billingAccount_fax_serviceName_settings_newPassword_POST(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/fax/{serviceName}/settings/newPassword";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * Send a fax
	 *
	 * REST: POST /telephony/{billingAccount}/fax/{serviceName}/settings/sendFax
	 * @param pdfUrl [required] Url of the pdf document you want to send
	 * @param dateSchedule [required] If you want to schedule your fax later, you can specify a date
	 * @param recipients [required] List of recipients of your fax
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhTask billingAccount_fax_serviceName_settings_sendFax_POST(String billingAccount, String serviceName, String pdfUrl, Date dateSchedule, String[] recipients) throws IOException {
		String qPath = "/telephony/{billingAccount}/fax/{serviceName}/settings/sendFax";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "pdfUrl", pdfUrl);
		addBody(o, "dateSchedule", dateSchedule);
		addBody(o, "recipients", recipients);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Faxes associated with this billing account
	 *
	 * REST: GET /telephony/{billingAccount}/fax
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<String> billingAccount_fax_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/fax";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/conference/{serviceName}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhConference billingAccount_conference_serviceName_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/conference/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhConference.class);
	}

	/**
	 * Lock the conference room
	 *
	 * REST: POST /telephony/{billingAccount}/conference/{serviceName}/unlock
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhTask billingAccount_conference_serviceName_unlock_POST(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/conference/{serviceName}/unlock";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Current participants of the associate conference
	 *
	 * REST: GET /telephony/{billingAccount}/conference/{serviceName}/participants
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_conference_serviceName_participants_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/conference/{serviceName}/participants";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Change a participant level of audio transmission
	 *
	 * REST: POST /telephony/{billingAccount}/conference/{serviceName}/participants/{id}/energy
	 * @param value [required] The value of energy level
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_conference_serviceName_participants_id_energy_POST(String billingAccount, String serviceName, Long id, Long value) throws IOException {
		String qPath = "/telephony/{billingAccount}/conference/{serviceName}/participants/{id}/energy";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "value", value);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/conference/{serviceName}/participants/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhConferenceParticipants billingAccount_conference_serviceName_participants_id_GET(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/conference/{serviceName}/participants/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhConferenceParticipants.class);
	}

	/**
	 * Unmute a participant in your conference room
	 *
	 * REST: POST /telephony/{billingAccount}/conference/{serviceName}/participants/{id}/unmute
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_conference_serviceName_participants_id_unmute_POST(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/conference/{serviceName}/participants/{id}/unmute";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Mute a participant in your conference room
	 *
	 * REST: POST /telephony/{billingAccount}/conference/{serviceName}/participants/{id}/mute
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_conference_serviceName_participants_id_mute_POST(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/conference/{serviceName}/participants/{id}/mute";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Eject a participant from your conference room
	 *
	 * REST: POST /telephony/{billingAccount}/conference/{serviceName}/participants/{id}/kick
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_conference_serviceName_participants_id_kick_POST(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/conference/{serviceName}/participants/{id}/kick";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Make a participant deaf in your conference room
	 *
	 * REST: POST /telephony/{billingAccount}/conference/{serviceName}/participants/{id}/deaf
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_conference_serviceName_participants_id_deaf_POST(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/conference/{serviceName}/participants/{id}/deaf";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Make a participant undeaf your conference room
	 *
	 * REST: POST /telephony/{billingAccount}/conference/{serviceName}/participants/{id}/undeaf
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_conference_serviceName_participants_id_undeaf_POST(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/conference/{serviceName}/participants/{id}/undeaf";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * List your past conferences for this number
	 *
	 * REST: GET /telephony/{billingAccount}/conference/{serviceName}/histories
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_conference_serviceName_histories_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/conference/{serviceName}/histories";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/conference/{serviceName}/histories/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhConferenceHistory billingAccount_conference_serviceName_histories_id_GET(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/conference/{serviceName}/histories/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhConferenceHistory.class);
	}

	/**
	 * Lock the conference room
	 *
	 * REST: POST /telephony/{billingAccount}/conference/{serviceName}/lock
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhTask billingAccount_conference_serviceName_lock_POST(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/conference/{serviceName}/lock";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get realtime conference informations
	 *
	 * REST: GET /telephony/{billingAccount}/conference/{serviceName}/informations
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhConferenceInformations billingAccount_conference_serviceName_informations_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/conference/{serviceName}/informations";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhConferenceInformations.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/conference/{serviceName}/settings
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhConferenceProperties billingAccount_conference_serviceName_settings_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/conference/{serviceName}/settings";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhConferenceProperties.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/conference/{serviceName}/settings
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_conference_serviceName_settings_PUT(String billingAccount, String serviceName, OvhConferenceProperties body) throws IOException {
		String qPath = "/telephony/{billingAccount}/conference/{serviceName}/settings";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Conferences associated with this billing account
	 *
	 * REST: GET /telephony/{billingAccount}/conference
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<String> billingAccount_conference_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/conference";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/miniPabx/{serviceName}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhMiniPabx billingAccount_miniPabx_serviceName_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/miniPabx/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhMiniPabx.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/miniPabx/{serviceName}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_miniPabx_serviceName_PUT(String billingAccount, String serviceName, OvhMiniPabx body) throws IOException {
		String qPath = "/telephony/{billingAccount}/miniPabx/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/miniPabx/{serviceName}/hunting
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhMiniPabxHunting billingAccount_miniPabx_serviceName_hunting_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/miniPabx/{serviceName}/hunting";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhMiniPabxHunting.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/miniPabx/{serviceName}/hunting
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_miniPabx_serviceName_hunting_PUT(String billingAccount, String serviceName, OvhMiniPabxHunting body) throws IOException {
		String qPath = "/telephony/{billingAccount}/miniPabx/{serviceName}/hunting";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Hunting agents
	 *
	 * REST: GET /telephony/{billingAccount}/miniPabx/{serviceName}/hunting/agent
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<String> billingAccount_miniPabx_serviceName_hunting_agent_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/miniPabx/{serviceName}/hunting/agent";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Create a new agent
	 *
	 * REST: POST /telephony/{billingAccount}/miniPabx/{serviceName}/hunting/agent
	 * @param agentNumber [required] The phone number of the agent
	 * @param position [required] The position in the hunting
	 * @param logged [required] True if the agent is logged
	 * @param noReplyTimer [required] The maxium ringing time
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhEasyMiniPabxHuntingAgent billingAccount_miniPabx_serviceName_hunting_agent_POST(String billingAccount, String serviceName, String agentNumber, Long position, Boolean logged, Long noReplyTimer) throws IOException {
		String qPath = "/telephony/{billingAccount}/miniPabx/{serviceName}/hunting/agent";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "agentNumber", agentNumber);
		addBody(o, "position", position);
		addBody(o, "logged", logged);
		addBody(o, "noReplyTimer", noReplyTimer);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhEasyMiniPabxHuntingAgent.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/miniPabx/{serviceName}/hunting/agent/{agentNumber}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentNumber [required] The phone number of the agent
	 */
	public OvhEasyMiniPabxHuntingAgent billingAccount_miniPabx_serviceName_hunting_agent_agentNumber_GET(String billingAccount, String serviceName, String agentNumber) throws IOException {
		String qPath = "/telephony/{billingAccount}/miniPabx/{serviceName}/hunting/agent/{agentNumber}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentNumber);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEasyMiniPabxHuntingAgent.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/miniPabx/{serviceName}/hunting/agent/{agentNumber}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentNumber [required] The phone number of the agent
	 */
	public void billingAccount_miniPabx_serviceName_hunting_agent_agentNumber_PUT(String billingAccount, String serviceName, String agentNumber, OvhEasyMiniPabxHuntingAgent body) throws IOException {
		String qPath = "/telephony/{billingAccount}/miniPabx/{serviceName}/hunting/agent/{agentNumber}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentNumber);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the agent
	 *
	 * REST: DELETE /telephony/{billingAccount}/miniPabx/{serviceName}/hunting/agent/{agentNumber}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentNumber [required] The phone number of the agent
	 */
	public void billingAccount_miniPabx_serviceName_hunting_agent_agentNumber_DELETE(String billingAccount, String serviceName, String agentNumber) throws IOException {
		String qPath = "/telephony/{billingAccount}/miniPabx/{serviceName}/hunting/agent/{agentNumber}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentNumber);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/miniPabx/{serviceName}/tones
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhTones billingAccount_miniPabx_serviceName_tones_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/miniPabx/{serviceName}/tones";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTones.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/miniPabx/{serviceName}/tones
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_miniPabx_serviceName_tones_PUT(String billingAccount, String serviceName, OvhTones body) throws IOException {
		String qPath = "/telephony/{billingAccount}/miniPabx/{serviceName}/tones";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Upload new tone file
	 *
	 * REST: POST /telephony/{billingAccount}/miniPabx/{serviceName}/tones/toneUpload
	 * @param url [required]
	 * @param type [required]
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhTask billingAccount_miniPabx_serviceName_tones_toneUpload_POST(String billingAccount, String serviceName, String url, OvhTonesTypeEnum type) throws IOException {
		String qPath = "/telephony/{billingAccount}/miniPabx/{serviceName}/tones/toneUpload";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "url", url);
		addBody(o, "type", type);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Miniabx associated with this billing account
	 *
	 * REST: GET /telephony/{billingAccount}/miniPabx
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<String> billingAccount_miniPabx_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/miniPabx";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get the allowed creditThreshold for this billing account
	 *
	 * REST: GET /telephony/{billingAccount}/allowedCreditThreshold
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<OvhPrice> billingAccount_allowedCreditThreshold_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/allowedCreditThreshold";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t7);
	}

	/**
	 * Previous billed consumptions
	 *
	 * REST: GET /telephony/{billingAccount}/historyConsumption
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<Date> billingAccount_historyConsumption_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/historyConsumption";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t6);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/historyConsumption/{date}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param date [required]
	 */
	public OvhHistoryConsumption billingAccount_historyConsumption_date_GET(String billingAccount, java.util.Date date) throws IOException {
		String qPath = "/telephony/{billingAccount}/historyConsumption/{date}";
		StringBuilder sb = path(qPath, billingAccount, date);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhHistoryConsumption.class);
	}

	/**
	 * Previous billed consumptions document
	 *
	 * REST: GET /telephony/{billingAccount}/historyConsumption/{date}/document
	 * @param extension [required] Document extension
	 * @param billingAccount [required] The name of your billingAccount
	 * @param date [required]
	 * @deprecated
	 */
	public OvhPcsFile billingAccount_historyConsumption_date_document_GET(String billingAccount, java.util.Date date, OvhBillDocumentExtension extension) throws IOException {
		String qPath = "/telephony/{billingAccount}/historyConsumption/{date}/document";
		StringBuilder sb = path(qPath, billingAccount, date);
		query(sb, "extension", extension);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPcsFile.class);
	}

	/**
	 * Previous billed consumption files
	 *
	 * REST: GET /telephony/{billingAccount}/historyConsumption/{date}/file
	 * @param extension [required] Document suffix
	 * @param billingAccount [required] The name of your billingAccount
	 * @param date [required]
	 */
	public OvhPcsFile billingAccount_historyConsumption_date_file_GET(String billingAccount, java.util.Date date, OvhBillDocument extension) throws IOException {
		String qPath = "/telephony/{billingAccount}/historyConsumption/{date}/file";
		StringBuilder sb = path(qPath, billingAccount, date);
		query(sb, "extension", extension);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPcsFile.class);
	}

	/**
	 * Upload new sound file
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/soundUpload
	 * @param name [required]
	 * @param url [required]
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhTask billingAccount_easyHunting_serviceName_soundUpload_POST(String billingAccount, String serviceName, String name, String url) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/soundUpload";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "url", url);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhEasyHunting billingAccount_easyHunting_serviceName_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEasyHunting.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/easyHunting/{serviceName}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_easyHunting_serviceName_PUT(String billingAccount, String serviceName, OvhEasyHunting body) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Records associated with this PABX
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/records
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_easyHunting_serviceName_records_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/records";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/records/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required]
	 */
	public OvhOvhPabxRecord billingAccount_easyHunting_serviceName_records_id_GET(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/records/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxRecord.class);
	}

	/**
	 * Delete the given record
	 *
	 * REST: DELETE /telephony/{billingAccount}/easyHunting/{serviceName}/records/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required]
	 */
	public void billingAccount_easyHunting_serviceName_records_id_DELETE(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/records/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/screenListConditions
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhEasyHuntingScreenListsConditionsSettings billingAccount_easyHunting_serviceName_screenListConditions_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/screenListConditions";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEasyHuntingScreenListsConditionsSettings.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/easyHunting/{serviceName}/screenListConditions
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_easyHunting_serviceName_screenListConditions_PUT(String billingAccount, String serviceName, OvhEasyHuntingScreenListsConditionsSettings body) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/screenListConditions";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Screen lists conditions checked when a call is received
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/screenListConditions/conditions
	 * @param screenListType [required] Filter the value of screenListType property (=)
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_easyHunting_serviceName_screenListConditions_conditions_GET(String billingAccount, String serviceName, OvhOvhPabxDialplanExtensionConditionScreenListTypeEnum screenListType) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/screenListConditions/conditions";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		query(sb, "screenListType", screenListType);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new screenlist condition for an extension
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/screenListConditions/conditions
	 * @param destinationNumber [required] Add a screenlist based on the destination number
	 * @param callerIdNumber [required] Add a screenlist based on the presented caller number
	 * @param screenListType [required] Type of screenlist
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhEasyHuntingScreenListsConditions billingAccount_easyHunting_serviceName_screenListConditions_conditions_POST(String billingAccount, String serviceName, String destinationNumber, String callerIdNumber, OvhOvhPabxDialplanExtensionConditionScreenListTypeEnum screenListType) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/screenListConditions/conditions";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "destinationNumber", destinationNumber);
		addBody(o, "callerIdNumber", callerIdNumber);
		addBody(o, "screenListType", screenListType);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhEasyHuntingScreenListsConditions.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/screenListConditions/conditions/{conditionId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param conditionId [required]
	 */
	public OvhEasyHuntingScreenListsConditions billingAccount_easyHunting_serviceName_screenListConditions_conditions_conditionId_GET(String billingAccount, String serviceName, Long conditionId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/screenListConditions/conditions/{conditionId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, conditionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEasyHuntingScreenListsConditions.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/easyHunting/{serviceName}/screenListConditions/conditions/{conditionId}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param conditionId [required]
	 */
	public void billingAccount_easyHunting_serviceName_screenListConditions_conditions_conditionId_PUT(String billingAccount, String serviceName, Long conditionId, OvhEasyHuntingScreenListsConditions body) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/screenListConditions/conditions/{conditionId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, conditionId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the given condition
	 *
	 * REST: DELETE /telephony/{billingAccount}/easyHunting/{serviceName}/screenListConditions/conditions/{conditionId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param conditionId [required]
	 */
	public void billingAccount_easyHunting_serviceName_screenListConditions_conditions_conditionId_DELETE(String billingAccount, String serviceName, Long conditionId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/screenListConditions/conditions/{conditionId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, conditionId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhOvhPabxHunting billingAccount_easyHunting_serviceName_hunting_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHunting.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/easyHunting/{serviceName}/hunting
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_easyHunting_serviceName_hunting_PUT(String billingAccount, String serviceName, OvhOvhPabxHunting body) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Calls agents
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_easyHunting_serviceName_hunting_agent_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new agent
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent
	 * @param wrapUpTime [required] The wrap up time (in seconds) after the calls
	 * @param number [required] The number of the agent
	 * @param simultaneousLines [required] The maximum of simultaneous calls that the agent will receive from the hunting
	 * @param status [required] The current status of the agent
	 * @param timeout [required] The waiting timeout (in seconds) before hangup for an assigned called
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhOvhPabxHuntingAgent billingAccount_easyHunting_serviceName_hunting_agent_POST(String billingAccount, String serviceName, Long wrapUpTime, String number, Long simultaneousLines, OvhOvhPabxHuntingAgentStatusEnum status, Long timeout) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "wrapUpTime", wrapUpTime);
		addBody(o, "number", number);
		addBody(o, "simultaneousLines", simultaneousLines);
		addBody(o, "status", status);
		addBody(o, "timeout", timeout);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOvhPabxHuntingAgent.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public OvhOvhPabxHuntingAgent billingAccount_easyHunting_serviceName_hunting_agent_agentId_GET(String billingAccount, String serviceName, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHuntingAgent.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public void billingAccount_easyHunting_serviceName_hunting_agent_agentId_PUT(String billingAccount, String serviceName, Long agentId, OvhOvhPabxHuntingAgent body) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the given agent
	 *
	 * REST: DELETE /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public void billingAccount_easyHunting_serviceName_hunting_agent_agentId_DELETE(String billingAccount, String serviceName, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Current calls of the callcenter agent
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/calls
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public ArrayList<Long> billingAccount_easyHunting_serviceName_hunting_agent_agentId_calls_GET(String billingAccount, String serviceName, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/calls";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/calls/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param id [required] Id of the object
	 */
	public OvhOvhPabxHuntingQueueLiveCalls billingAccount_easyHunting_serviceName_hunting_agent_agentId_calls_id_GET(String billingAccount, String serviceName, Long agentId, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/calls/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHuntingQueueLiveCalls.class);
	}

	/**
	 * Hangup a call
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/calls/{id}/hangup
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_easyHunting_serviceName_hunting_agent_agentId_calls_id_hangup_POST(String billingAccount, String serviceName, Long agentId, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/calls/{id}/hangup";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, id);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Eavesdrop on a call
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/calls/{id}/eavesdrop
	 * @param number [required] Phone number that will be called and bridged in the communication
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_easyHunting_serviceName_hunting_agent_agentId_calls_id_eavesdrop_POST(String billingAccount, String serviceName, Long agentId, Long id, String number) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/calls/{id}/eavesdrop";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "number", number);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Transfer an answered call
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/calls/{id}/transfer
	 * @param number [required] Phone number to whom the communication will be transfered
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_easyHunting_serviceName_hunting_agent_agentId_calls_id_transfer_POST(String billingAccount, String serviceName, Long agentId, Long id, String number) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/calls/{id}/transfer";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "number", number);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Toogle hold on call
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/calls/{id}/hold
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_easyHunting_serviceName_hunting_agent_agentId_calls_id_hold_POST(String billingAccount, String serviceName, Long agentId, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/calls/{id}/hold";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, id);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Whisper on a call
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/calls/{id}/whisper
	 * @param whisperingMode [required] Whispering mode
	 * @param number [required] Phone number that will be called and bridged in the communication
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_easyHunting_serviceName_hunting_agent_agentId_calls_id_whisper_POST(String billingAccount, String serviceName, Long agentId, Long id, OvhOvhPabxWhisperingModeEnum whisperingMode, String number) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/calls/{id}/whisper";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "whisperingMode", whisperingMode);
		addBody(o, "number", number);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Intercept a non answered call
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/calls/{id}/intercept
	 * @param number [required] Phone number that will be called and that will intercept the communication
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_easyHunting_serviceName_hunting_agent_agentId_calls_id_intercept_POST(String billingAccount, String serviceName, Long agentId, Long id, String number) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/calls/{id}/intercept";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "number", number);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/liveStatus
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public OvhOvhPabxHuntingAgentLiveStatus billingAccount_easyHunting_serviceName_hunting_agent_agentId_liveStatus_GET(String billingAccount, String serviceName, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/liveStatus";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHuntingAgentLiveStatus.class);
	}

	/**
	 * Agent assigned to the queues
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/queue
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public ArrayList<Long> billingAccount_easyHunting_serviceName_hunting_agent_agentId_queue_GET(String billingAccount, String serviceName, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/queue";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new skill for an agent (it adds the agent in a queue)
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/queue
	 * @param queueId [required] The queue where you want to add the agent
	 * @param position [required] The position of the agent in the queue
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public OvhOvhPabxHuntingAgentQueue billingAccount_easyHunting_serviceName_hunting_agent_agentId_queue_POST(String billingAccount, String serviceName, Long agentId, Long queueId, Long position) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/queue";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "queueId", queueId);
		addBody(o, "position", position);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOvhPabxHuntingAgentQueue.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/queue/{queueId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param queueId [required]
	 */
	public OvhOvhPabxHuntingAgentQueue billingAccount_easyHunting_serviceName_hunting_agent_agentId_queue_queueId_GET(String billingAccount, String serviceName, Long agentId, Long queueId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/queue/{queueId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, queueId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHuntingAgentQueue.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/queue/{queueId}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param queueId [required]
	 */
	public void billingAccount_easyHunting_serviceName_hunting_agent_agentId_queue_queueId_PUT(String billingAccount, String serviceName, Long agentId, Long queueId, OvhOvhPabxHuntingAgentQueue body) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/queue/{queueId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, queueId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the given skill
	 *
	 * REST: DELETE /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/queue/{queueId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param queueId [required]
	 */
	public void billingAccount_easyHunting_serviceName_hunting_agent_agentId_queue_queueId_DELETE(String billingAccount, String serviceName, Long agentId, Long queueId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/queue/{queueId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, queueId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/queue/{queueId}/liveStatus
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param queueId [required]
	 */
	public OvhOvhPabxHuntingAgentLiveStatus billingAccount_easyHunting_serviceName_hunting_agent_agentId_queue_queueId_liveStatus_GET(String billingAccount, String serviceName, Long agentId, Long queueId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/queue/{queueId}/liveStatus";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, queueId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHuntingAgentLiveStatus.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/eventToken
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public OvhEventToken billingAccount_easyHunting_serviceName_hunting_agent_agentId_eventToken_GET(String billingAccount, String serviceName, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/eventToken";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEventToken.class);
	}

	/**
	 * Create a new token
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/eventToken
	 * @param expiration [required] Time to live in seconds for the token
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public String billingAccount_easyHunting_serviceName_hunting_agent_agentId_eventToken_POST(String billingAccount, String serviceName, Long agentId, OvhTokenExpirationEnum expiration) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/eventToken";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "expiration", expiration);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Delete the given token
	 *
	 * REST: DELETE /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/eventToken
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public void billingAccount_easyHunting_serviceName_hunting_agent_agentId_eventToken_DELETE(String billingAccount, String serviceName, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/eventToken";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/bannerAccess
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public OvhBannerAccess billingAccount_easyHunting_serviceName_hunting_agent_agentId_bannerAccess_GET(String billingAccount, String serviceName, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/bannerAccess";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBannerAccess.class);
	}

	/**
	 * Create a new web access for this ressource
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/bannerAccess
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public OvhBannerAccess billingAccount_easyHunting_serviceName_hunting_agent_agentId_bannerAccess_POST(String billingAccount, String serviceName, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/bannerAccess";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhBannerAccess.class);
	}

	/**
	 * Delete the given web access
	 *
	 * REST: DELETE /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/bannerAccess
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public void billingAccount_easyHunting_serviceName_hunting_agent_agentId_bannerAccess_DELETE(String billingAccount, String serviceName, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/agent/{agentId}/bannerAccess";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Custom statuses of your agents
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/customStatus
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_easyHunting_serviceName_hunting_customStatus_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/customStatus";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new custom status
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/customStatus
	 * @param color [required] The color (in hexadecimal) of the status that will be displayed on agent banner web application
	 * @param name [required] The name of the status (Pause, Mission, etc...)
	 * @param description [required] A short description of the status
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhOvhPabxCustomStatus billingAccount_easyHunting_serviceName_hunting_customStatus_POST(String billingAccount, String serviceName, String color, String name, String description) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/customStatus";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "color", color);
		addBody(o, "name", name);
		addBody(o, "description", description);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOvhPabxCustomStatus.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/customStatus/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required]
	 */
	public OvhOvhPabxCustomStatus billingAccount_easyHunting_serviceName_hunting_customStatus_id_GET(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/customStatus/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxCustomStatus.class);
	}

	/**
	 * Delete the given custom status
	 *
	 * REST: DELETE /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/customStatus/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required]
	 */
	public void billingAccount_easyHunting_serviceName_hunting_customStatus_id_DELETE(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/customStatus/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Calls queues
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_easyHunting_serviceName_hunting_queue_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new queue
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue
	 * @param maxWaitTime [required] The maximum waiting time (in seconds) in the queue
	 * @param strategy [required] The calls dispatching strategy
	 * @param actionOnOverflow [required] Action executed when caller enters a full queue
	 * @param askForRecordDisabling [required] Allow the caller to disable call record by pressing a key
	 * @param description [required] The name of the queue
	 * @param actionOnClosure [required] Action executed when there is no member in queue
	 * @param maxMember [required] The maximum of people waiting in the queue
	 * @param recordDisablingDigit [required] Key to press to disable record
	 * @param record [required] Enable record on calls in queue
	 * @param soundOnHold [required] The id of the OvhPabxSound played to caller when on hold
	 * @param actionOnOverflowParam [required] The additionnal parameter of the overflow action
	 * @param recordDisablingLanguage [required] Language of the sound played to the caller to inform that he can disable record
	 * @param actionOnClosureParam [required] The additionnal parameter of the on closure action
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhOvhPabxHuntingQueue billingAccount_easyHunting_serviceName_hunting_queue_POST(String billingAccount, String serviceName, Long maxWaitTime, OvhOvhPabxHuntingQueueStrategyEnum strategy, OvhOvhPabxQueueActionEnum actionOnOverflow, Boolean askForRecordDisabling, String description, OvhOvhPabxQueueActionEnum actionOnClosure, Long maxMember, OvhOvhPabxHuntingQueueRecordDisablingDigitEnum recordDisablingDigit, Boolean record, Long soundOnHold, String actionOnOverflowParam, OvhOvhPabxHuntingQueueRecordDisablingLanguageEnum recordDisablingLanguage, String actionOnClosureParam) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "maxWaitTime", maxWaitTime);
		addBody(o, "strategy", strategy);
		addBody(o, "actionOnOverflow", actionOnOverflow);
		addBody(o, "askForRecordDisabling", askForRecordDisabling);
		addBody(o, "description", description);
		addBody(o, "actionOnClosure", actionOnClosure);
		addBody(o, "maxMember", maxMember);
		addBody(o, "recordDisablingDigit", recordDisablingDigit);
		addBody(o, "record", record);
		addBody(o, "soundOnHold", soundOnHold);
		addBody(o, "actionOnOverflowParam", actionOnOverflowParam);
		addBody(o, "recordDisablingLanguage", recordDisablingLanguage);
		addBody(o, "actionOnClosureParam", actionOnClosureParam);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOvhPabxHuntingQueue.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 */
	public OvhOvhPabxHuntingQueue billingAccount_easyHunting_serviceName_hunting_queue_queueId_GET(String billingAccount, String serviceName, Long queueId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHuntingQueue.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 */
	public void billingAccount_easyHunting_serviceName_hunting_queue_queueId_PUT(String billingAccount, String serviceName, Long queueId, OvhOvhPabxHuntingQueue body) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the given queue
	 *
	 * REST: DELETE /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 */
	public void billingAccount_easyHunting_serviceName_hunting_queue_queueId_DELETE(String billingAccount, String serviceName, Long queueId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Live calls of the queue
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/liveCalls
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 */
	public ArrayList<Long> billingAccount_easyHunting_serviceName_hunting_queue_queueId_liveCalls_GET(String billingAccount, String serviceName, Long queueId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/liveCalls";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param id [required] Id of the object
	 */
	public OvhOvhPabxHuntingQueueLiveCalls billingAccount_easyHunting_serviceName_hunting_queue_queueId_liveCalls_id_GET(String billingAccount, String serviceName, Long queueId, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHuntingQueueLiveCalls.class);
	}

	/**
	 * Hangup a call
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/hangup
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_easyHunting_serviceName_hunting_queue_queueId_liveCalls_id_hangup_POST(String billingAccount, String serviceName, Long queueId, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/hangup";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, id);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Eavesdrop on a call
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/eavesdrop
	 * @param number [required] Phone number that will be called and bridged in the communication
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_easyHunting_serviceName_hunting_queue_queueId_liveCalls_id_eavesdrop_POST(String billingAccount, String serviceName, Long queueId, Long id, String number) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/eavesdrop";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "number", number);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Transfer an answered call
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/transfer
	 * @param number [required] Phone number to whom the communication will be transfered
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_easyHunting_serviceName_hunting_queue_queueId_liveCalls_id_transfer_POST(String billingAccount, String serviceName, Long queueId, Long id, String number) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/transfer";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "number", number);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Toogle hold on call
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/hold
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_easyHunting_serviceName_hunting_queue_queueId_liveCalls_id_hold_POST(String billingAccount, String serviceName, Long queueId, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/hold";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, id);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Whisper on a call
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/whisper
	 * @param whisperingMode [required] Whispering mode
	 * @param number [required] Phone number that will be called and bridged in the communication
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_easyHunting_serviceName_hunting_queue_queueId_liveCalls_id_whisper_POST(String billingAccount, String serviceName, Long queueId, Long id, OvhOvhPabxWhisperingModeEnum whisperingMode, String number) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/whisper";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "whisperingMode", whisperingMode);
		addBody(o, "number", number);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Intercept a non answered call
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/intercept
	 * @param number [required] Phone number that will be called and that will intercept the communication
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_easyHunting_serviceName_hunting_queue_queueId_liveCalls_id_intercept_POST(String billingAccount, String serviceName, Long queueId, Long id, String number) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/intercept";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "number", number);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Agent assigned to the queue
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/agent
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 */
	public ArrayList<Long> billingAccount_easyHunting_serviceName_hunting_queue_queueId_agent_GET(String billingAccount, String serviceName, Long queueId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/agent";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new skill for an agent (it adds the agent in a queue)
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/agent
	 * @param queueId [required] The queue where you want to add the agent
	 * @param position [required] The position of the agent in the queue
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhOvhPabxHuntingAgentQueue billingAccount_easyHunting_serviceName_hunting_queue_queueId_agent_POST(String billingAccount, String serviceName, Long queueId, Long position) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/agent";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "position", position);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOvhPabxHuntingAgentQueue.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/agent/{agentId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param agentId [required]
	 */
	public OvhOvhPabxHuntingAgentQueue billingAccount_easyHunting_serviceName_hunting_queue_queueId_agent_agentId_GET(String billingAccount, String serviceName, Long queueId, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/agent/{agentId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, agentId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHuntingAgentQueue.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/agent/{agentId}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param agentId [required]
	 */
	public void billingAccount_easyHunting_serviceName_hunting_queue_queueId_agent_agentId_PUT(String billingAccount, String serviceName, Long queueId, Long agentId, OvhOvhPabxHuntingAgentQueue body) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/agent/{agentId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, agentId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the given skill
	 *
	 * REST: DELETE /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/agent/{agentId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param agentId [required]
	 */
	public void billingAccount_easyHunting_serviceName_hunting_queue_queueId_agent_agentId_DELETE(String billingAccount, String serviceName, Long queueId, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/agent/{agentId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, agentId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/agent/{agentId}/liveStatus
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param agentId [required]
	 */
	public OvhOvhPabxHuntingAgentLiveStatus billingAccount_easyHunting_serviceName_hunting_queue_queueId_agent_agentId_liveStatus_GET(String billingAccount, String serviceName, Long queueId, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/agent/{agentId}/liveStatus";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, agentId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHuntingAgentLiveStatus.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/liveStatistics
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 */
	public OvhOvhPabxHuntingQueueLiveStatistics billingAccount_easyHunting_serviceName_hunting_queue_queueId_liveStatistics_GET(String billingAccount, String serviceName, Long queueId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/queue/{queueId}/liveStatistics";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHuntingQueueLiveStatistics.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/eventToken
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhEventToken billingAccount_easyHunting_serviceName_hunting_eventToken_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/eventToken";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEventToken.class);
	}

	/**
	 * Create a new token
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/eventToken
	 * @param expiration [required] Time to live in seconds for the token
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public String billingAccount_easyHunting_serviceName_hunting_eventToken_POST(String billingAccount, String serviceName, OvhTokenExpirationEnum expiration) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/eventToken";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "expiration", expiration);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Delete the given token
	 *
	 * REST: DELETE /telephony/{billingAccount}/easyHunting/{serviceName}/hunting/eventToken
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_easyHunting_serviceName_hunting_eventToken_DELETE(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/hunting/eventToken";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/timeConditions
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhEasyHuntingTimeConditionsSettings billingAccount_easyHunting_serviceName_timeConditions_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/timeConditions";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEasyHuntingTimeConditionsSettings.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/easyHunting/{serviceName}/timeConditions
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_easyHunting_serviceName_timeConditions_PUT(String billingAccount, String serviceName, OvhEasyHuntingTimeConditionsSettings body) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/timeConditions";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Time conditions checked when a call is received
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/timeConditions/conditions
	 * @param policy [required] Filter the value of policy property (=)
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_easyHunting_serviceName_timeConditions_conditions_GET(String billingAccount, String serviceName, OvhEasyHuntingTimeConditionsPolicyEnum policy) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/timeConditions/conditions";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		query(sb, "policy", policy);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new time condition
	 *
	 * REST: POST /telephony/{billingAccount}/easyHunting/{serviceName}/timeConditions/conditions
	 * @param timeFrom [required] The time of the day when the extension will start to be executed
	 * @param timeTo [required] The time of the day when the extension will stop to be executed
	 * @param weekDay [required] The day of the week when the extension will be executed
	 * @param policy [required] The time condition's policy
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhEasyHuntingTimeConditions billingAccount_easyHunting_serviceName_timeConditions_conditions_POST(String billingAccount, String serviceName, Date timeFrom, Date timeTo, OvhOvhPabxDialplanExtensionConditionTimeWeekDayEnum weekDay, OvhEasyHuntingTimeConditionsPolicyEnum policy) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/timeConditions/conditions";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "timeFrom", timeFrom);
		addBody(o, "timeTo", timeTo);
		addBody(o, "weekDay", weekDay);
		addBody(o, "policy", policy);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhEasyHuntingTimeConditions.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/timeConditions/conditions/{conditionId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param conditionId [required]
	 */
	public OvhEasyHuntingTimeConditions billingAccount_easyHunting_serviceName_timeConditions_conditions_conditionId_GET(String billingAccount, String serviceName, Long conditionId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/timeConditions/conditions/{conditionId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, conditionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEasyHuntingTimeConditions.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/easyHunting/{serviceName}/timeConditions/conditions/{conditionId}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param conditionId [required]
	 */
	public void billingAccount_easyHunting_serviceName_timeConditions_conditions_conditionId_PUT(String billingAccount, String serviceName, Long conditionId, OvhEasyHuntingTimeConditions body) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/timeConditions/conditions/{conditionId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, conditionId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the given condition
	 *
	 * REST: DELETE /telephony/{billingAccount}/easyHunting/{serviceName}/timeConditions/conditions/{conditionId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param conditionId [required]
	 */
	public void billingAccount_easyHunting_serviceName_timeConditions_conditions_conditionId_DELETE(String billingAccount, String serviceName, Long conditionId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/timeConditions/conditions/{conditionId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, conditionId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Sounds associated with this PABX
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/sound
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_easyHunting_serviceName_sound_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/sound";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting/{serviceName}/sound/{soundId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param soundId [required]
	 */
	public OvhOvhPabxSound billingAccount_easyHunting_serviceName_sound_soundId_GET(String billingAccount, String serviceName, Long soundId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/sound/{soundId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, soundId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxSound.class);
	}

	/**
	 * Delete the given sound
	 *
	 * REST: DELETE /telephony/{billingAccount}/easyHunting/{serviceName}/sound/{soundId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param soundId [required]
	 */
	public void billingAccount_easyHunting_serviceName_sound_soundId_DELETE(String billingAccount, String serviceName, Long soundId) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting/{serviceName}/sound/{soundId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, soundId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * OVH easy calls queues associated with this billing account
	 *
	 * REST: GET /telephony/{billingAccount}/easyHunting
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<String> billingAccount_easyHunting_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/easyHunting";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Cancel the billing account termination
	 *
	 * REST: POST /telephony/{billingAccount}/cancelTermination
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public void billingAccount_cancelTermination_POST(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/cancelTermination";
		StringBuilder sb = path(qPath, billingAccount);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Operations on a telephony billing account
	 *
	 * REST: GET /telephony/{billingAccount}/task
	 * @param serviceType [required] Filter the value of serviceType property (=)
	 * @param status [required] Filter the value of status property (=)
	 * @param action [required] Filter the value of action property (=)
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<Long> billingAccount_task_GET(String billingAccount, String action, String serviceType, OvhTaskStatusEnum status) throws IOException {
		String qPath = "/telephony/{billingAccount}/task";
		StringBuilder sb = path(qPath, billingAccount);
		query(sb, "action", action);
		query(sb, "serviceType", serviceType);
		query(sb, "status", status);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/task/{taskId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param taskId [required]
	 */
	public OvhTask billingAccount_task_taskId_GET(String billingAccount, Long taskId) throws IOException {
		String qPath = "/telephony/{billingAccount}/task/{taskId}";
		StringBuilder sb = path(qPath, billingAccount, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Operations on a telephony service's offer
	 *
	 * REST: GET /telephony/{billingAccount}/offerTask
	 * @param status [required] Filter the value of status property (=)
	 * @param action [required] Filter the value of action property (=)
	 * @param type [required] Filter the value of type property (=)
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<Long> billingAccount_offerTask_GET(String billingAccount, OvhOfferTaskActionEnum action, OvhTaskStatusEnum status, OvhOfferTaskTypeEnum type) throws IOException {
		String qPath = "/telephony/{billingAccount}/offerTask";
		StringBuilder sb = path(qPath, billingAccount);
		query(sb, "action", action);
		query(sb, "status", status);
		query(sb, "type", type);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/offerTask/{taskId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param taskId [required]
	 */
	public OvhOfferTask billingAccount_offerTask_taskId_GET(String billingAccount, Long taskId) throws IOException {
		String qPath = "/telephony/{billingAccount}/offerTask/{taskId}";
		StringBuilder sb = path(qPath, billingAccount, taskId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOfferTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/screen/{serviceName}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhScreen billingAccount_screen_serviceName_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/screen/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhScreen.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/screen/{serviceName}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_screen_serviceName_PUT(String billingAccount, String serviceName, OvhScreen body) throws IOException {
		String qPath = "/telephony/{billingAccount}/screen/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Rules for call filtering for this service
	 *
	 * REST: GET /telephony/{billingAccount}/screen/{serviceName}/screenLists
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_screen_serviceName_screenLists_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/screen/{serviceName}/screenLists";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new screen list rule
	 *
	 * REST: POST /telephony/{billingAccount}/screen/{serviceName}/screenLists
	 * @param callNumber [required] The callNumber of the generic screen list
	 * @param type [required] The type of the generic screen list
	 * @param nature [required] The nature of the generic screen list
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_screen_serviceName_screenLists_POST(String billingAccount, String serviceName, String callNumber, OvhScreenListTypeEnum type, OvhScreenListNatureEnum nature) throws IOException {
		String qPath = "/telephony/{billingAccount}/screen/{serviceName}/screenLists";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "callNumber", callNumber);
		addBody(o, "type", type);
		addBody(o, "nature", nature);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/screen/{serviceName}/screenLists/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public OvhScreenList billingAccount_screen_serviceName_screenLists_id_GET(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/screen/{serviceName}/screenLists/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhScreenList.class);
	}

	/**
	 * Delete the given screen list
	 *
	 * REST: DELETE /telephony/{billingAccount}/screen/{serviceName}/screenLists/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required] Id of the object
	 */
	public void billingAccount_screen_serviceName_screenLists_id_DELETE(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/screen/{serviceName}/screenLists/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Screenlist compatible numbers associated with this billing account
	 *
	 * REST: GET /telephony/{billingAccount}/screen
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<String> billingAccount_screen_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/screen";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Upload new sound file
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/soundUpload
	 * @param documentId [required] ID of the /me/document file you want to import
	 * @param name [required] The name you want to give to your file
	 * @param url [required] URL of the file you want to import (instead of /me/document ID)
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhTask billingAccount_ovhPabx_serviceName_soundUpload_POST(String billingAccount, String serviceName, String documentId, String name, String url) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/soundUpload";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "documentId", documentId);
		addBody(o, "name", name);
		addBody(o, "url", url);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhOvhPabx billingAccount_ovhPabx_serviceName_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabx.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/ovhPabx/{serviceName}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_ovhPabx_serviceName_PUT(String billingAccount, String serviceName, OvhOvhPabx body) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Records associated with this PABX
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/records
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_ovhPabx_serviceName_records_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/records";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/records/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required]
	 */
	public OvhOvhPabxRecord billingAccount_ovhPabx_serviceName_records_id_GET(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/records/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxRecord.class);
	}

	/**
	 * Delete the given record
	 *
	 * REST: DELETE /telephony/{billingAccount}/ovhPabx/{serviceName}/records/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required]
	 */
	public void billingAccount_ovhPabx_serviceName_records_id_DELETE(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/records/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Menus associated with this PABX
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/menu
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_ovhPabx_serviceName_menu_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/menu";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new menu
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/menu
	 * @param name [required] The name of the menu
	 * @param invalidSound [required] The id of the OvhPabxSound played when the caller uses an invalid DTMF
	 * @param greetSoundTts [required] The text to speech sound played to greet
	 * @param invalidSoundTts [required] The text to speech sound played when the caller uses an invalid DTMF
	 * @param greetSound [required] The id of the OvhPabxSound played to greet
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhOvhPabxMenu billingAccount_ovhPabx_serviceName_menu_POST(String billingAccount, String serviceName, String name, Long invalidSound, Long greetSoundTts, Long invalidSoundTts, Long greetSound) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/menu";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "invalidSound", invalidSound);
		addBody(o, "greetSoundTts", greetSoundTts);
		addBody(o, "invalidSoundTts", invalidSoundTts);
		addBody(o, "greetSound", greetSound);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOvhPabxMenu.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/menu/{menuId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param menuId [required]
	 */
	public OvhOvhPabxMenu billingAccount_ovhPabx_serviceName_menu_menuId_GET(String billingAccount, String serviceName, Long menuId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/menu/{menuId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, menuId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxMenu.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/ovhPabx/{serviceName}/menu/{menuId}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param menuId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_menu_menuId_PUT(String billingAccount, String serviceName, Long menuId, OvhOvhPabxMenu body) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/menu/{menuId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, menuId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the given menu
	 *
	 * REST: DELETE /telephony/{billingAccount}/ovhPabx/{serviceName}/menu/{menuId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param menuId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_menu_menuId_DELETE(String billingAccount, String serviceName, Long menuId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/menu/{menuId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, menuId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Menu entry
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/menu/{menuId}/entry
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param menuId [required]
	 */
	public ArrayList<Long> billingAccount_ovhPabx_serviceName_menu_menuId_entry_GET(String billingAccount, String serviceName, Long menuId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/menu/{menuId}/entry";
		StringBuilder sb = path(qPath, billingAccount, serviceName, menuId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new menu entry
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/menu/{menuId}/entry
	 * @param actionParam [required] The additionnal parameter of the action
	 * @param action [required] The action triggered by the DTMF
	 * @param position [required] The position of the entry in the menu
	 * @param dtmf [required] The DTMF that triggers the action
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param menuId [required]
	 */
	public OvhOvhPabxMenuEntry billingAccount_ovhPabx_serviceName_menu_menuId_entry_POST(String billingAccount, String serviceName, Long menuId, String actionParam, OvhOvhPabxIvrMenuEntryActionEnum action, Long position, String dtmf) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/menu/{menuId}/entry";
		StringBuilder sb = path(qPath, billingAccount, serviceName, menuId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "actionParam", actionParam);
		addBody(o, "action", action);
		addBody(o, "position", position);
		addBody(o, "dtmf", dtmf);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOvhPabxMenuEntry.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/menu/{menuId}/entry/{entryId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param menuId [required]
	 * @param entryId [required]
	 */
	public OvhOvhPabxMenuEntry billingAccount_ovhPabx_serviceName_menu_menuId_entry_entryId_GET(String billingAccount, String serviceName, Long menuId, Long entryId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/menu/{menuId}/entry/{entryId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, menuId, entryId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxMenuEntry.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/ovhPabx/{serviceName}/menu/{menuId}/entry/{entryId}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param menuId [required]
	 * @param entryId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_menu_menuId_entry_entryId_PUT(String billingAccount, String serviceName, Long menuId, Long entryId, OvhOvhPabxMenuEntry body) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/menu/{menuId}/entry/{entryId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, menuId, entryId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the given menu entry
	 *
	 * REST: DELETE /telephony/{billingAccount}/ovhPabx/{serviceName}/menu/{menuId}/entry/{entryId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param menuId [required]
	 * @param entryId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_menu_menuId_entry_entryId_DELETE(String billingAccount, String serviceName, Long menuId, Long entryId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/menu/{menuId}/entry/{entryId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, menuId, entryId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhOvhPabxHunting billingAccount_ovhPabx_serviceName_hunting_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHunting.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_ovhPabx_serviceName_hunting_PUT(String billingAccount, String serviceName, OvhOvhPabxHunting body) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Calls agents
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_ovhPabx_serviceName_hunting_agent_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new agent
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent
	 * @param wrapUpTime [required] The wrap up time (in seconds) after the calls
	 * @param number [required] The number of the agent
	 * @param simultaneousLines [required] The maximum of simultaneous calls that the agent will receive from the hunting
	 * @param status [required] The current status of the agent
	 * @param timeout [required] The waiting timeout (in seconds) before hangup for an assigned called
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhOvhPabxHuntingAgent billingAccount_ovhPabx_serviceName_hunting_agent_POST(String billingAccount, String serviceName, Long wrapUpTime, String number, Long simultaneousLines, OvhOvhPabxHuntingAgentStatusEnum status, Long timeout) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "wrapUpTime", wrapUpTime);
		addBody(o, "number", number);
		addBody(o, "simultaneousLines", simultaneousLines);
		addBody(o, "status", status);
		addBody(o, "timeout", timeout);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOvhPabxHuntingAgent.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public OvhOvhPabxHuntingAgent billingAccount_ovhPabx_serviceName_hunting_agent_agentId_GET(String billingAccount, String serviceName, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHuntingAgent.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_hunting_agent_agentId_PUT(String billingAccount, String serviceName, Long agentId, OvhOvhPabxHuntingAgent body) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the given agent
	 *
	 * REST: DELETE /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_hunting_agent_agentId_DELETE(String billingAccount, String serviceName, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Current calls of the callcenter agent
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/calls
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public ArrayList<Long> billingAccount_ovhPabx_serviceName_hunting_agent_agentId_calls_GET(String billingAccount, String serviceName, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/calls";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/calls/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param id [required] Id of the object
	 */
	public OvhOvhPabxHuntingQueueLiveCalls billingAccount_ovhPabx_serviceName_hunting_agent_agentId_calls_id_GET(String billingAccount, String serviceName, Long agentId, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/calls/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHuntingQueueLiveCalls.class);
	}

	/**
	 * Hangup a call
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/calls/{id}/hangup
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_ovhPabx_serviceName_hunting_agent_agentId_calls_id_hangup_POST(String billingAccount, String serviceName, Long agentId, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/calls/{id}/hangup";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, id);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Eavesdrop on a call
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/calls/{id}/eavesdrop
	 * @param number [required] Phone number that will be called and bridged in the communication
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_ovhPabx_serviceName_hunting_agent_agentId_calls_id_eavesdrop_POST(String billingAccount, String serviceName, Long agentId, Long id, String number) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/calls/{id}/eavesdrop";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "number", number);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Transfer an answered call
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/calls/{id}/transfer
	 * @param number [required] Phone number to whom the communication will be transfered
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_ovhPabx_serviceName_hunting_agent_agentId_calls_id_transfer_POST(String billingAccount, String serviceName, Long agentId, Long id, String number) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/calls/{id}/transfer";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "number", number);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Toogle hold on call
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/calls/{id}/hold
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_ovhPabx_serviceName_hunting_agent_agentId_calls_id_hold_POST(String billingAccount, String serviceName, Long agentId, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/calls/{id}/hold";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, id);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Whisper on a call
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/calls/{id}/whisper
	 * @param whisperingMode [required] Whispering mode
	 * @param number [required] Phone number that will be called and bridged in the communication
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_ovhPabx_serviceName_hunting_agent_agentId_calls_id_whisper_POST(String billingAccount, String serviceName, Long agentId, Long id, OvhOvhPabxWhisperingModeEnum whisperingMode, String number) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/calls/{id}/whisper";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "whisperingMode", whisperingMode);
		addBody(o, "number", number);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Intercept a non answered call
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/calls/{id}/intercept
	 * @param number [required] Phone number that will be called and that will intercept the communication
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_ovhPabx_serviceName_hunting_agent_agentId_calls_id_intercept_POST(String billingAccount, String serviceName, Long agentId, Long id, String number) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/calls/{id}/intercept";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "number", number);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/liveStatus
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public OvhOvhPabxHuntingAgentLiveStatus billingAccount_ovhPabx_serviceName_hunting_agent_agentId_liveStatus_GET(String billingAccount, String serviceName, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/liveStatus";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHuntingAgentLiveStatus.class);
	}

	/**
	 * Agent assigned to the queues
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/queue
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public ArrayList<Long> billingAccount_ovhPabx_serviceName_hunting_agent_agentId_queue_GET(String billingAccount, String serviceName, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/queue";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new skill for an agent (it adds the agent in a queue)
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/queue
	 * @param queueId [required] The queue where you want to add the agent
	 * @param position [required] The position of the agent in the queue
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public OvhOvhPabxHuntingAgentQueue billingAccount_ovhPabx_serviceName_hunting_agent_agentId_queue_POST(String billingAccount, String serviceName, Long agentId, Long queueId, Long position) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/queue";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "queueId", queueId);
		addBody(o, "position", position);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOvhPabxHuntingAgentQueue.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/queue/{queueId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param queueId [required]
	 */
	public OvhOvhPabxHuntingAgentQueue billingAccount_ovhPabx_serviceName_hunting_agent_agentId_queue_queueId_GET(String billingAccount, String serviceName, Long agentId, Long queueId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/queue/{queueId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, queueId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHuntingAgentQueue.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/queue/{queueId}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param queueId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_hunting_agent_agentId_queue_queueId_PUT(String billingAccount, String serviceName, Long agentId, Long queueId, OvhOvhPabxHuntingAgentQueue body) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/queue/{queueId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, queueId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the given skill
	 *
	 * REST: DELETE /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/queue/{queueId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param queueId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_hunting_agent_agentId_queue_queueId_DELETE(String billingAccount, String serviceName, Long agentId, Long queueId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/queue/{queueId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, queueId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/queue/{queueId}/liveStatus
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 * @param queueId [required]
	 */
	public OvhOvhPabxHuntingAgentLiveStatus billingAccount_ovhPabx_serviceName_hunting_agent_agentId_queue_queueId_liveStatus_GET(String billingAccount, String serviceName, Long agentId, Long queueId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/queue/{queueId}/liveStatus";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId, queueId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHuntingAgentLiveStatus.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/eventToken
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public OvhEventToken billingAccount_ovhPabx_serviceName_hunting_agent_agentId_eventToken_GET(String billingAccount, String serviceName, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/eventToken";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEventToken.class);
	}

	/**
	 * Create a new token
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/eventToken
	 * @param expiration [required] Time to live in seconds for the token
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public String billingAccount_ovhPabx_serviceName_hunting_agent_agentId_eventToken_POST(String billingAccount, String serviceName, Long agentId, OvhTokenExpirationEnum expiration) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/eventToken";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "expiration", expiration);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Delete the given token
	 *
	 * REST: DELETE /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/eventToken
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_hunting_agent_agentId_eventToken_DELETE(String billingAccount, String serviceName, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/eventToken";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/bannerAccess
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public OvhBannerAccess billingAccount_ovhPabx_serviceName_hunting_agent_agentId_bannerAccess_GET(String billingAccount, String serviceName, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/bannerAccess";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhBannerAccess.class);
	}

	/**
	 * Create a new web access for this ressource
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/bannerAccess
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public OvhBannerAccess billingAccount_ovhPabx_serviceName_hunting_agent_agentId_bannerAccess_POST(String billingAccount, String serviceName, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/bannerAccess";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhBannerAccess.class);
	}

	/**
	 * Delete the given web access
	 *
	 * REST: DELETE /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/bannerAccess
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param agentId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_hunting_agent_agentId_bannerAccess_DELETE(String billingAccount, String serviceName, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/agent/{agentId}/bannerAccess";
		StringBuilder sb = path(qPath, billingAccount, serviceName, agentId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Custom statuses of your agents
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/customStatus
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_ovhPabx_serviceName_hunting_customStatus_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/customStatus";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new custom status
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/customStatus
	 * @param color [required] The color (in hexadecimal) of the status that will be displayed on agent banner web application
	 * @param name [required] The name of the status (Pause, Mission, etc...)
	 * @param description [required] A short description of the status
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhOvhPabxCustomStatus billingAccount_ovhPabx_serviceName_hunting_customStatus_POST(String billingAccount, String serviceName, String color, String name, String description) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/customStatus";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "color", color);
		addBody(o, "name", name);
		addBody(o, "description", description);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOvhPabxCustomStatus.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/customStatus/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required]
	 */
	public OvhOvhPabxCustomStatus billingAccount_ovhPabx_serviceName_hunting_customStatus_id_GET(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/customStatus/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxCustomStatus.class);
	}

	/**
	 * Delete the given custom status
	 *
	 * REST: DELETE /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/customStatus/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required]
	 */
	public void billingAccount_ovhPabx_serviceName_hunting_customStatus_id_DELETE(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/customStatus/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Calls queues
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_ovhPabx_serviceName_hunting_queue_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new queue
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue
	 * @param maxWaitTime [required] The maximum waiting time (in seconds) in the queue
	 * @param strategy [required] The calls dispatching strategy
	 * @param actionOnOverflow [required] Action executed when caller enters a full queue
	 * @param askForRecordDisabling [required] Allow the caller to disable call record by pressing a key
	 * @param description [required] The name of the queue
	 * @param actionOnClosure [required] Action executed when there is no member in queue
	 * @param maxMember [required] The maximum of people waiting in the queue
	 * @param recordDisablingDigit [required] Key to press to disable record
	 * @param record [required] Enable record on calls in queue
	 * @param soundOnHold [required] The id of the OvhPabxSound played to caller when on hold
	 * @param actionOnOverflowParam [required] The additionnal parameter of the overflow action
	 * @param recordDisablingLanguage [required] Language of the sound played to the caller to inform that he can disable record
	 * @param actionOnClosureParam [required] The additionnal parameter of the on closure action
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhOvhPabxHuntingQueue billingAccount_ovhPabx_serviceName_hunting_queue_POST(String billingAccount, String serviceName, Long maxWaitTime, OvhOvhPabxHuntingQueueStrategyEnum strategy, OvhOvhPabxQueueActionEnum actionOnOverflow, Boolean askForRecordDisabling, String description, OvhOvhPabxQueueActionEnum actionOnClosure, Long maxMember, OvhOvhPabxHuntingQueueRecordDisablingDigitEnum recordDisablingDigit, Boolean record, Long soundOnHold, String actionOnOverflowParam, OvhOvhPabxHuntingQueueRecordDisablingLanguageEnum recordDisablingLanguage, String actionOnClosureParam) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "maxWaitTime", maxWaitTime);
		addBody(o, "strategy", strategy);
		addBody(o, "actionOnOverflow", actionOnOverflow);
		addBody(o, "askForRecordDisabling", askForRecordDisabling);
		addBody(o, "description", description);
		addBody(o, "actionOnClosure", actionOnClosure);
		addBody(o, "maxMember", maxMember);
		addBody(o, "recordDisablingDigit", recordDisablingDigit);
		addBody(o, "record", record);
		addBody(o, "soundOnHold", soundOnHold);
		addBody(o, "actionOnOverflowParam", actionOnOverflowParam);
		addBody(o, "recordDisablingLanguage", recordDisablingLanguage);
		addBody(o, "actionOnClosureParam", actionOnClosureParam);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOvhPabxHuntingQueue.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 */
	public OvhOvhPabxHuntingQueue billingAccount_ovhPabx_serviceName_hunting_queue_queueId_GET(String billingAccount, String serviceName, Long queueId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHuntingQueue.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_hunting_queue_queueId_PUT(String billingAccount, String serviceName, Long queueId, OvhOvhPabxHuntingQueue body) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the given queue
	 *
	 * REST: DELETE /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_hunting_queue_queueId_DELETE(String billingAccount, String serviceName, Long queueId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Live calls of the queue
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/liveCalls
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 */
	public ArrayList<Long> billingAccount_ovhPabx_serviceName_hunting_queue_queueId_liveCalls_GET(String billingAccount, String serviceName, Long queueId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/liveCalls";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param id [required] Id of the object
	 */
	public OvhOvhPabxHuntingQueueLiveCalls billingAccount_ovhPabx_serviceName_hunting_queue_queueId_liveCalls_id_GET(String billingAccount, String serviceName, Long queueId, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHuntingQueueLiveCalls.class);
	}

	/**
	 * Hangup a call
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/hangup
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_ovhPabx_serviceName_hunting_queue_queueId_liveCalls_id_hangup_POST(String billingAccount, String serviceName, Long queueId, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/hangup";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, id);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Eavesdrop on a call
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/eavesdrop
	 * @param number [required] Phone number that will be called and bridged in the communication
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_ovhPabx_serviceName_hunting_queue_queueId_liveCalls_id_eavesdrop_POST(String billingAccount, String serviceName, Long queueId, Long id, String number) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/eavesdrop";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "number", number);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Transfer an answered call
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/transfer
	 * @param number [required] Phone number to whom the communication will be transfered
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_ovhPabx_serviceName_hunting_queue_queueId_liveCalls_id_transfer_POST(String billingAccount, String serviceName, Long queueId, Long id, String number) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/transfer";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "number", number);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Toogle hold on call
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/hold
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_ovhPabx_serviceName_hunting_queue_queueId_liveCalls_id_hold_POST(String billingAccount, String serviceName, Long queueId, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/hold";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, id);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Whisper on a call
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/whisper
	 * @param whisperingMode [required] Whispering mode
	 * @param number [required] Phone number that will be called and bridged in the communication
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_ovhPabx_serviceName_hunting_queue_queueId_liveCalls_id_whisper_POST(String billingAccount, String serviceName, Long queueId, Long id, OvhOvhPabxWhisperingModeEnum whisperingMode, String number) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/whisper";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "whisperingMode", whisperingMode);
		addBody(o, "number", number);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Intercept a non answered call
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/intercept
	 * @param number [required] Phone number that will be called and that will intercept the communication
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param id [required] Id of the object
	 */
	public OvhTask billingAccount_ovhPabx_serviceName_hunting_queue_queueId_liveCalls_id_intercept_POST(String billingAccount, String serviceName, Long queueId, Long id, String number) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/liveCalls/{id}/intercept";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, id);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "number", number);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * Agent assigned to the queue
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/agent
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 */
	public ArrayList<Long> billingAccount_ovhPabx_serviceName_hunting_queue_queueId_agent_GET(String billingAccount, String serviceName, Long queueId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/agent";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new skill for an agent (it adds the agent in a queue)
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/agent
	 * @param queueId [required] The queue where you want to add the agent
	 * @param position [required] The position of the agent in the queue
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhOvhPabxHuntingAgentQueue billingAccount_ovhPabx_serviceName_hunting_queue_queueId_agent_POST(String billingAccount, String serviceName, Long queueId, Long position) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/agent";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "position", position);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOvhPabxHuntingAgentQueue.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/agent/{agentId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param agentId [required]
	 */
	public OvhOvhPabxHuntingAgentQueue billingAccount_ovhPabx_serviceName_hunting_queue_queueId_agent_agentId_GET(String billingAccount, String serviceName, Long queueId, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/agent/{agentId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, agentId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHuntingAgentQueue.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/agent/{agentId}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param agentId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_hunting_queue_queueId_agent_agentId_PUT(String billingAccount, String serviceName, Long queueId, Long agentId, OvhOvhPabxHuntingAgentQueue body) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/agent/{agentId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, agentId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the given skill
	 *
	 * REST: DELETE /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/agent/{agentId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param agentId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_hunting_queue_queueId_agent_agentId_DELETE(String billingAccount, String serviceName, Long queueId, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/agent/{agentId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, agentId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/agent/{agentId}/liveStatus
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 * @param agentId [required]
	 */
	public OvhOvhPabxHuntingAgentLiveStatus billingAccount_ovhPabx_serviceName_hunting_queue_queueId_agent_agentId_liveStatus_GET(String billingAccount, String serviceName, Long queueId, Long agentId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/agent/{agentId}/liveStatus";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId, agentId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHuntingAgentLiveStatus.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/liveStatistics
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param queueId [required]
	 */
	public OvhOvhPabxHuntingQueueLiveStatistics billingAccount_ovhPabx_serviceName_hunting_queue_queueId_liveStatistics_GET(String billingAccount, String serviceName, Long queueId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/queue/{queueId}/liveStatistics";
		StringBuilder sb = path(qPath, billingAccount, serviceName, queueId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxHuntingQueueLiveStatistics.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/eventToken
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhEventToken billingAccount_ovhPabx_serviceName_hunting_eventToken_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/eventToken";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEventToken.class);
	}

	/**
	 * Create a new token
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/eventToken
	 * @param expiration [required] Time to live in seconds for the token
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public String billingAccount_ovhPabx_serviceName_hunting_eventToken_POST(String billingAccount, String serviceName, OvhTokenExpirationEnum expiration) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/eventToken";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "expiration", expiration);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, String.class);
	}

	/**
	 * Delete the given token
	 *
	 * REST: DELETE /telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/eventToken
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_ovhPabx_serviceName_hunting_eventToken_DELETE(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/hunting/eventToken";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Text to Speech associated with this PABX
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/tts
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_ovhPabx_serviceName_tts_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/tts";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new text to speech
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/tts
	 * @param voice [required]
	 * @param text [required]
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_ovhPabx_serviceName_tts_POST(String billingAccount, String serviceName, OvhOvhPabxTtsVoiceEnum voice, String text) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/tts";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "voice", voice);
		addBody(o, "text", text);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/tts/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required]
	 */
	public OvhOvhPabxTts billingAccount_ovhPabx_serviceName_tts_id_GET(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/tts/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxTts.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/ovhPabx/{serviceName}/tts/{id}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required]
	 */
	public void billingAccount_ovhPabx_serviceName_tts_id_PUT(String billingAccount, String serviceName, Long id, OvhOvhPabxTts body) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/tts/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the given text to speech
	 *
	 * REST: DELETE /telephony/{billingAccount}/ovhPabx/{serviceName}/tts/{id}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param id [required]
	 */
	public void billingAccount_ovhPabx_serviceName_tts_id_DELETE(String billingAccount, String serviceName, Long id) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/tts/{id}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, id);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 */
	public OvhOvhPabxDialplan billingAccount_ovhPabx_serviceName_dialplan_dialplanId_GET(String billingAccount, String serviceName, Long dialplanId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxDialplan.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_dialplan_dialplanId_PUT(String billingAccount, String serviceName, Long dialplanId, OvhOvhPabxDialplan body) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the given dialplan
	 *
	 * REST: DELETE /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_dialplan_dialplanId_DELETE(String billingAccount, String serviceName, Long dialplanId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Extensions contained in the dialplan
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 */
	public ArrayList<Long> billingAccount_ovhPabx_serviceName_dialplan_dialplanId_extension_GET(String billingAccount, String serviceName, Long dialplanId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new extension for a dialplan
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension
	 * @param enable [required] True to enable the extension
	 * @param screenListType [required] The type of the screenlist
	 * @param position [required] The position of the extension in the dialplan (the extensions are executed following this order)
	 * @param schedulerCategory [required] Additionnal conditions will be used from this chosen scheduler category
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 */
	public OvhOvhPabxDialplanExtension billingAccount_ovhPabx_serviceName_dialplan_dialplanId_extension_POST(String billingAccount, String serviceName, Long dialplanId, Boolean enable, OvhOvhPabxDialplanExtensionConditionScreenListTypeEnum screenListType, Long position, OvhSchedulerCategoryEnum schedulerCategory) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "enable", enable);
		addBody(o, "screenListType", screenListType);
		addBody(o, "position", position);
		addBody(o, "schedulerCategory", schedulerCategory);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOvhPabxDialplanExtension.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 * @param extensionId [required]
	 */
	public OvhOvhPabxDialplanExtension billingAccount_ovhPabx_serviceName_dialplan_dialplanId_extension_extensionId_GET(String billingAccount, String serviceName, Long dialplanId, Long extensionId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId, extensionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxDialplanExtension.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 * @param extensionId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_dialplan_dialplanId_extension_extensionId_PUT(String billingAccount, String serviceName, Long dialplanId, Long extensionId, OvhOvhPabxDialplanExtension body) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId, extensionId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the given extension
	 *
	 * REST: DELETE /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 * @param extensionId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_dialplan_dialplanId_extension_extensionId_DELETE(String billingAccount, String serviceName, Long dialplanId, Long extensionId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId, extensionId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Screenlist conditions checked when executing the extension
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/conditionScreenList
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 * @param extensionId [required]
	 */
	public ArrayList<Long> billingAccount_ovhPabx_serviceName_dialplan_dialplanId_extension_extensionId_conditionScreenList_GET(String billingAccount, String serviceName, Long dialplanId, Long extensionId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/conditionScreenList";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId, extensionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new screenlist condition for an extension
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/conditionScreenList
	 * @param destinationNumber [required] Add a screenlist based on the destination number
	 * @param callerIdNumber [required] Add a screenlist based on the presented caller number
	 * @param screenListType [required] Type of screenlist
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 * @param extensionId [required]
	 */
	public OvhOvhPabxDialplanExtensionConditionScreenList billingAccount_ovhPabx_serviceName_dialplan_dialplanId_extension_extensionId_conditionScreenList_POST(String billingAccount, String serviceName, Long dialplanId, Long extensionId, String destinationNumber, String callerIdNumber, OvhOvhPabxDialplanExtensionConditionScreenListTypeEnum screenListType) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/conditionScreenList";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId, extensionId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "destinationNumber", destinationNumber);
		addBody(o, "callerIdNumber", callerIdNumber);
		addBody(o, "screenListType", screenListType);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOvhPabxDialplanExtensionConditionScreenList.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/conditionScreenList/{conditionId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 * @param extensionId [required]
	 * @param conditionId [required]
	 */
	public OvhOvhPabxDialplanExtensionConditionScreenList billingAccount_ovhPabx_serviceName_dialplan_dialplanId_extension_extensionId_conditionScreenList_conditionId_GET(String billingAccount, String serviceName, Long dialplanId, Long extensionId, Long conditionId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/conditionScreenList/{conditionId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId, extensionId, conditionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxDialplanExtensionConditionScreenList.class);
	}

	/**
	 * Delete the given condition
	 *
	 * REST: DELETE /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/conditionScreenList/{conditionId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 * @param extensionId [required]
	 * @param conditionId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_dialplan_dialplanId_extension_extensionId_conditionScreenList_conditionId_DELETE(String billingAccount, String serviceName, Long dialplanId, Long extensionId, Long conditionId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/conditionScreenList/{conditionId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId, extensionId, conditionId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Rules contained in the extension
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/rule
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 * @param extensionId [required]
	 */
	public ArrayList<Long> billingAccount_ovhPabx_serviceName_dialplan_dialplanId_extension_extensionId_rule_GET(String billingAccount, String serviceName, Long dialplanId, Long extensionId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/rule";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId, extensionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new rule for an extension
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/rule
	 * @param negativeAction [required] If true, the rule will be executed only when the result of the conditions is false
	 * @param actionParam [required] The parameter of the chosen action
	 * @param action [required] The action made by the rule
	 * @param position [required] The position of the rule in the extension (the rules are executed following this order)
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 * @param extensionId [required]
	 */
	public OvhOvhPabxDialplanExtensionRule billingAccount_ovhPabx_serviceName_dialplan_dialplanId_extension_extensionId_rule_POST(String billingAccount, String serviceName, Long dialplanId, Long extensionId, Boolean negativeAction, String actionParam, OvhOvhPabxDialplanExtensionRuleActionEnum action, Long position) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/rule";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId, extensionId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "negativeAction", negativeAction);
		addBody(o, "actionParam", actionParam);
		addBody(o, "action", action);
		addBody(o, "position", position);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOvhPabxDialplanExtensionRule.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/rule/{ruleId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 * @param extensionId [required]
	 * @param ruleId [required]
	 */
	public OvhOvhPabxDialplanExtensionRule billingAccount_ovhPabx_serviceName_dialplan_dialplanId_extension_extensionId_rule_ruleId_GET(String billingAccount, String serviceName, Long dialplanId, Long extensionId, Long ruleId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/rule/{ruleId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId, extensionId, ruleId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxDialplanExtensionRule.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/rule/{ruleId}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 * @param extensionId [required]
	 * @param ruleId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_dialplan_dialplanId_extension_extensionId_rule_ruleId_PUT(String billingAccount, String serviceName, Long dialplanId, Long extensionId, Long ruleId, OvhOvhPabxDialplanExtensionRule body) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/rule/{ruleId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId, extensionId, ruleId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the given rule
	 *
	 * REST: DELETE /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/rule/{ruleId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 * @param extensionId [required]
	 * @param ruleId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_dialplan_dialplanId_extension_extensionId_rule_ruleId_DELETE(String billingAccount, String serviceName, Long dialplanId, Long extensionId, Long ruleId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/rule/{ruleId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId, extensionId, ruleId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Time conditions checked when executing the extension
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/conditionTime
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 * @param extensionId [required]
	 */
	public ArrayList<Long> billingAccount_ovhPabx_serviceName_dialplan_dialplanId_extension_extensionId_conditionTime_GET(String billingAccount, String serviceName, Long dialplanId, Long extensionId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/conditionTime";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId, extensionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new time condition for an extension
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/conditionTime
	 * @param timeFrom [required] The time of the day when the extension will start to be executed
	 * @param timeTo [required] The time of the day when the extension will stop to be executed
	 * @param weekDay [required] The day of the week when the extension will be executed
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 * @param extensionId [required]
	 */
	public OvhOvhPabxDialplanExtensionConditionTime billingAccount_ovhPabx_serviceName_dialplan_dialplanId_extension_extensionId_conditionTime_POST(String billingAccount, String serviceName, Long dialplanId, Long extensionId, Date timeFrom, Date timeTo, OvhOvhPabxDialplanExtensionConditionTimeWeekDayEnum weekDay) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/conditionTime";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId, extensionId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "timeFrom", timeFrom);
		addBody(o, "timeTo", timeTo);
		addBody(o, "weekDay", weekDay);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOvhPabxDialplanExtensionConditionTime.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/conditionTime/{conditionId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 * @param extensionId [required]
	 * @param conditionId [required]
	 */
	public OvhOvhPabxDialplanExtensionConditionTime billingAccount_ovhPabx_serviceName_dialplan_dialplanId_extension_extensionId_conditionTime_conditionId_GET(String billingAccount, String serviceName, Long dialplanId, Long extensionId, Long conditionId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/conditionTime/{conditionId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId, extensionId, conditionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxDialplanExtensionConditionTime.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/conditionTime/{conditionId}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 * @param extensionId [required]
	 * @param conditionId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_dialplan_dialplanId_extension_extensionId_conditionTime_conditionId_PUT(String billingAccount, String serviceName, Long dialplanId, Long extensionId, Long conditionId, OvhOvhPabxDialplanExtensionConditionTime body) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/conditionTime/{conditionId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId, extensionId, conditionId);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Delete the given condition
	 *
	 * REST: DELETE /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/conditionTime/{conditionId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param dialplanId [required]
	 * @param extensionId [required]
	 * @param conditionId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_dialplan_dialplanId_extension_extensionId_conditionTime_conditionId_DELETE(String billingAccount, String serviceName, Long dialplanId, Long extensionId, Long conditionId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan/{dialplanId}/extension/{extensionId}/conditionTime/{conditionId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, dialplanId, extensionId, conditionId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Dialplans associated with this PABX
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_ovhPabx_serviceName_dialplan_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Create a new dialplan
	 *
	 * REST: POST /telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan
	 * @param showCallerNumber [required] The presented number when bridging calls
	 * @param name [required] The dialplan name
	 * @param transferTimeout [required] The timeout (in seconds) when bridging calls
	 * @param anonymousRejection [required] Reject (hangup) anonymous calls
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhOvhPabxDialplan billingAccount_ovhPabx_serviceName_dialplan_POST(String billingAccount, String serviceName, OvhOvhPabxDialplanNumberPresentationEnum showCallerNumber, String name, Long transferTimeout, Boolean anonymousRejection) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/dialplan";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "showCallerNumber", showCallerNumber);
		addBody(o, "name", name);
		addBody(o, "transferTimeout", transferTimeout);
		addBody(o, "anonymousRejection", anonymousRejection);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhOvhPabxDialplan.class);
	}

	/**
	 * Sounds associated with this PABX
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/sound
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public ArrayList<Long> billingAccount_ovhPabx_serviceName_sound_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/sound";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx/{serviceName}/sound/{soundId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param soundId [required]
	 */
	public OvhOvhPabxSound billingAccount_ovhPabx_serviceName_sound_soundId_GET(String billingAccount, String serviceName, Long soundId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/sound/{soundId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, soundId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhOvhPabxSound.class);
	}

	/**
	 * Delete the given sound
	 *
	 * REST: DELETE /telephony/{billingAccount}/ovhPabx/{serviceName}/sound/{soundId}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 * @param soundId [required]
	 */
	public void billingAccount_ovhPabx_serviceName_sound_soundId_DELETE(String billingAccount, String serviceName, Long soundId) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx/{serviceName}/sound/{soundId}";
		StringBuilder sb = path(qPath, billingAccount, serviceName, soundId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * OVH calls queues and OVH IVRs (Interactive Voice Response) associated with this billing account
	 *
	 * REST: GET /telephony/{billingAccount}/ovhPabx
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<String> billingAccount_ovhPabx_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/ovhPabx";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/{billingAccount}/ddi/{serviceName}
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhDdi billingAccount_ddi_serviceName_GET(String billingAccount, String serviceName) throws IOException {
		String qPath = "/telephony/{billingAccount}/ddi/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDdi.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/{billingAccount}/ddi/{serviceName}
	 * @param body [required] New object properties
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public void billingAccount_ddi_serviceName_PUT(String billingAccount, String serviceName, OvhDdi body) throws IOException {
		String qPath = "/telephony/{billingAccount}/ddi/{serviceName}";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Change the destination of the DDI
	 *
	 * REST: POST /telephony/{billingAccount}/ddi/{serviceName}/changeDestination
	 * @param destination [required] The destination
	 * @param billingAccount [required] The name of your billingAccount
	 * @param serviceName [required]
	 */
	public OvhTask billingAccount_ddi_serviceName_changeDestination_POST(String billingAccount, String serviceName, String destination) throws IOException {
		String qPath = "/telephony/{billingAccount}/ddi/{serviceName}/changeDestination";
		StringBuilder sb = path(qPath, billingAccount, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "destination", destination);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhTask.class);
	}

	/**
	 * DDIs (direct dial-in) associated with this billing account
	 *
	 * REST: GET /telephony/{billingAccount}/ddi
	 * @param billingAccount [required] The name of your billingAccount
	 */
	public ArrayList<String> billingAccount_ddi_GET(String billingAccount) throws IOException {
		String qPath = "/telephony/{billingAccount}/ddi";
		StringBuilder sb = path(qPath, billingAccount);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/lines/{serviceName}/serviceInfos
	 * @param serviceName [required] Your line number
	 */
	public OvhService lines_serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/telephony/lines/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/lines/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] Your line number
	 */
	public void lines_serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/telephony/lines/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/lines/{serviceName}
	 * @param serviceName [required] Your line number
	 */
	public OvhTelephonyGenericService lines_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/telephony/lines/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTelephonyGenericService.class);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /telephony/lines/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] Your line number
	 */
	public ArrayList<Long> lines_serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/telephony/lines/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t3);
	}

	/**
	 * List available services
	 *
	 * REST: GET /telephony/lines
	 */
	public ArrayList<String> lines_GET() throws IOException {
		String qPath = "/telephony/lines";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get all available accessories
	 *
	 * REST: GET /telephony/accessories
	 * @param country [required] The country
	 */
	public ArrayList<OvhAccessoryOffer> accessories_GET(OvhNumberCountryEnum country) throws IOException {
		String qPath = "/telephony/accessories";
		StringBuilder sb = path(qPath);
		query(sb, "country", country);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t19);
	}
	private static TypeReference<ArrayList<OvhAccessoryOffer>> t19 = new TypeReference<ArrayList<OvhAccessoryOffer>>() {};

	/**
	 * Search a service with its domain, to get its billing account and type
	 *
	 * REST: GET /telephony/searchServices
	 * @param axiom [required] Filter the value of  property (like)
	 */
	public ArrayList<OvhTelephonySearchService> searchServices_GET(String axiom) throws IOException {
		String qPath = "/telephony/searchServices";
		StringBuilder sb = path(qPath);
		query(sb, "axiom", axiom);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t20);
	}
	private static TypeReference<ArrayList<OvhTelephonySearchService>> t20 = new TypeReference<ArrayList<OvhTelephonySearchService>>() {};

	/**
	 * Get all available SIP domains by country
	 *
	 * REST: POST /telephony/setDefaultSipDomain
	 * @param country [required] Country
	 * @param domain [required] SIP domain to set
	 * @param type [required] Product type
	 */
	public void setDefaultSipDomain_POST(OvhNumberCountryEnum country, String domain, OvhSipDomainProductTypeEnum type) throws IOException {
		String qPath = "/telephony/setDefaultSipDomain";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "country", country);
		addBody(o, "domain", domain);
		addBody(o, "type", type);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Get all available fax offer compatible
	 *
	 * REST: GET /telephony/fax/offers
	 * @param country [required] The country
	 */
	public ArrayList<OvhLineOffer> fax_offers_GET(OvhNumberCountryEnum country) throws IOException {
		String qPath = "/telephony/fax/offers";
		StringBuilder sb = path(qPath);
		query(sb, "country", country);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t16);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/aliases/{serviceName}/serviceInfos
	 * @param serviceName [required] Your line number
	 */
	public OvhService aliases_serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/telephony/aliases/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/aliases/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] Your line number
	 */
	public void aliases_serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/telephony/aliases/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/aliases/{serviceName}
	 * @param serviceName [required] Your line number
	 */
	public OvhTelephonyGenericService aliases_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/telephony/aliases/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTelephonyGenericService.class);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /telephony/aliases/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] Your line number
	 */
	public ArrayList<Long> aliases_serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/telephony/aliases/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t3);
	}

	/**
	 * List available services
	 *
	 * REST: GET /telephony/aliases
	 */
	public ArrayList<String> aliases_GET() throws IOException {
		String qPath = "/telephony/aliases";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * List available services
	 *
	 * REST: GET /telephony/spare
	 */
	public ArrayList<String> spare_GET() throws IOException {
		String qPath = "/telephony/spare";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/spare/{spare}/serviceInfos
	 * @param spare [required] The internal name of your spare
	 */
	public OvhService spare_spare_serviceInfos_GET(String spare) throws IOException {
		String qPath = "/telephony/spare/{spare}/serviceInfos";
		StringBuilder sb = path(qPath, spare);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/spare/{spare}/serviceInfos
	 * @param body [required] New object properties
	 * @param spare [required] The internal name of your spare
	 */
	public void spare_spare_serviceInfos_PUT(String spare, OvhService body) throws IOException {
		String qPath = "/telephony/spare/{spare}/serviceInfos";
		StringBuilder sb = path(qPath, spare);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/spare/{spare}
	 * @param spare [required] The internal name of your spare
	 */
	public OvhTelephonySpare spare_spare_GET(String spare) throws IOException {
		String qPath = "/telephony/spare/{spare}";
		StringBuilder sb = path(qPath, spare);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTelephonySpare.class);
	}

	/**
	 * Delete the spare as if it was not belonging to OVH anymore
	 *
	 * REST: DELETE /telephony/spare/{spare}
	 * @param spare [required] The internal name of your spare
	 */
	public void spare_spare_DELETE(String spare) throws IOException {
		String qPath = "/telephony/spare/{spare}";
		StringBuilder sb = path(qPath, spare);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Replace the phone by its spare. The broken phone became a spare if it was bought. An RMA is created if the broken phone is under securitydeposit.
	 *
	 * REST: POST /telephony/spare/{spare}/replace
	 * @param domain [required] The phone to replace by the spare
	 * @param ip [required] Public ip of the phone
	 * @param spare [required] The internal name of your spare
	 */
	public void spare_spare_replace_POST(String spare, String domain, String ip) throws IOException {
		String qPath = "/telephony/spare/{spare}/replace";
		StringBuilder sb = path(qPath, spare);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "domain", domain);
		addBody(o, "ip", ip);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Return the list of phone domains compatible to be replaced
	 *
	 * REST: GET /telephony/spare/{spare}/compatibleReplacement
	 * @param spare [required] The internal name of your spare
	 */
	public ArrayList<String> spare_spare_compatibleReplacement_GET(String spare) throws IOException {
		String qPath = "/telephony/spare/{spare}/compatibleReplacement";
		StringBuilder sb = path(qPath, spare);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get all available spare brands
	 *
	 * REST: GET /telephony/spare/brands
	 */
	public ArrayList<String> spare_brands_GET() throws IOException {
		String qPath = "/telephony/spare/brands";
		StringBuilder sb = path(qPath);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/trunks/{serviceName}/serviceInfos
	 * @param serviceName [required] Your trunk number
	 */
	public OvhService trunks_serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/telephony/trunks/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /telephony/trunks/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] Your trunk number
	 */
	public void trunks_serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/telephony/trunks/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /telephony/trunks/{serviceName}
	 * @param serviceName [required] Your trunk number
	 */
	public OvhTelephonyGenericService trunks_serviceName_GET(String serviceName) throws IOException {
		String qPath = "/telephony/trunks/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTelephonyGenericService.class);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /telephony/trunks/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] Your trunk number
	 */
	public ArrayList<Long> trunks_serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/telephony/trunks/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t3);
	}

	/**
	 * List available services
	 *
	 * REST: GET /telephony/trunks
	 */
	public ArrayList<String> trunks_GET() throws IOException {
		String qPath = "/telephony/trunks";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}

	/**
	 * Get all available line offer compatible
	 *
	 * REST: GET /telephony/line/offers
	 * @param country [required] The country
	 */
	public ArrayList<OvhLineOffer> line_offers_GET(OvhNumberCountryEnum country) throws IOException {
		String qPath = "/telephony/line/offers";
		StringBuilder sb = path(qPath);
		query(sb, "country", country);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t16);
	}

	/**
	 * Get all available phone brands compatible with lines
	 *
	 * REST: GET /telephony/line/offer/phones
	 * @param country [required] The country
	 * @param offer [required] The selected offer
	 */
	public ArrayList<OvhLinePhone> line_offer_phones_GET(OvhNumberCountryEnum country, String offer) throws IOException {
		String qPath = "/telephony/line/offer/phones";
		StringBuilder sb = path(qPath);
		query(sb, "country", country);
		query(sb, "offer", offer);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t9);
	}
}
