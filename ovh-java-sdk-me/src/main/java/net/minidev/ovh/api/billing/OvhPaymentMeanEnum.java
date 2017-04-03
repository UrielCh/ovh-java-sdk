package net.minidev.ovh.api.billing;

/**
 * All payment means you might have use on an OVH order
 */
public enum OvhPaymentMeanEnum {
	cash("cash"),
	chargeback("chargeback"),
	cheque("cheque"),
	creditCard("creditCard"),
	debtAccount("debtAccount"),
	deposit("deposit"),
	digitalLaunchPad("digitalLaunchPad"),
	edinar("edinar"),
	fidelityPoints("fidelityPoints"),
	free("free"),
	ideal("ideal"),
	incubatorAccount("incubatorAccount"),
	mandat("mandat"),
	multibanco("multibanco"),
	none("none"),
	ovhAccount("ovhAccount"),
	paymentMandate("paymentMandate"),
	paypal("paypal"),
	payu("payu"),
	platnosci("platnosci"),
	refund("refund"),
	transfer("transfer"),
	withdrawal("withdrawal");

	final String value;

	OvhPaymentMeanEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
