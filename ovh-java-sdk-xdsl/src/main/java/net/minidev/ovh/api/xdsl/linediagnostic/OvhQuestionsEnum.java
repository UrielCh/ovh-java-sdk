package net.minidev.ovh.api.xdsl.linediagnostic;

/**
 * Possible customer questions
 */
public enum OvhQuestionsEnum {
	bandwidthTestUnit("bandwidthTestUnit"),
	comment("comment"),
	conditionsAccepted("conditionsAccepted"),
	contactPhone("contactPhone"),
	datetimeOfAppearance("datetimeOfAppearance"),
	downloadBandwidthTest("downloadBandwidthTest"),
	endAfternoonHours("endAfternoonHours"),
	endMorningHours("endMorningHours"),
	followBySms("followBySms"),
	hasModemKeptSynchronization("hasModemKeptSynchronization"),
	idAppointment("idAppointment"),
	individualSite("individualSite"),
	modemIsSynchronized("modemIsSynchronized"),
	modemMac("modemMac"),
	modemStillSynchronized("modemStillSynchronized"),
	modemType("modemType"),
	ovhTicket("ovhTicket"),
	problemType("problemType"),
	resolvedAfterTests("resolvedAfterTests"),
	secureSite("secureSite"),
	severalInternetConnections("severalInternetConnections"),
	siteClosedDays("siteClosedDays"),
	siteDigicode("siteDigicode"),
	siteOpening("siteOpening"),
	startAfternoonHours("startAfternoonHours"),
	startMorningHours("startMorningHours"),
	uploadBandwidthTest("uploadBandwidthTest");

	final String value;

	OvhQuestionsEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
