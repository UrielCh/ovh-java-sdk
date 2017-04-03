package net.minidev.ovh.api.xdsl.linediagnostic;

/**
 * Possible customer questions
 */
public enum OvhQuestionsEnum {
	comment("comment"),
	conditionsAccepted("conditionsAccepted"),
	contactPhone("contactPhone"),
	datetimeOfAppearance("datetimeOfAppearance"),
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
	otrsTicket("otrsTicket"),
	resolvedAfterTests("resolvedAfterTests"),
	secureSite("secureSite"),
	severalInternetConnections("severalInternetConnections"),
	siteClosedDays("siteClosedDays"),
	siteDigicode("siteDigicode"),
	siteOpening("siteOpening"),
	startAfternoonHours("startAfternoonHours"),
	startMorningHours("startMorningHours");

	final String value;

	OvhQuestionsEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
