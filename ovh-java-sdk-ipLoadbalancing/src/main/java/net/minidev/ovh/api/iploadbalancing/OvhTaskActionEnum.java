package net.minidev.ovh.api.iploadbalancing;

/**
 * Possible task action
 */
public enum OvhTaskActionEnum {
	deleteIplb("deleteIplb"),
	deployIplb("deployIplb"),
	install("install"),
	installIplb("installIplb"),
	installZone("installZone"),
	orderFreeCertificate("orderFreeCertificate"),
	orderPaidCertificate("orderPaidCertificate"),
	orderSsl("orderSsl"),
	refreshIplb("refreshIplb"),
	releaseIplb("releaseIplb"),
	releaseIplbZone("releaseIplbZone"),
	reopenIplb("reopenIplb"),
	suspendIplb("suspendIplb"),
	suspendZone("suspendZone"),
	switchToIplbNextGenerationApi("switchToIplbNextGenerationApi"),
	vrackAttach("vrackAttach"),
	vrackDetach("vrackDetach");

	final String value;

	OvhTaskActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
