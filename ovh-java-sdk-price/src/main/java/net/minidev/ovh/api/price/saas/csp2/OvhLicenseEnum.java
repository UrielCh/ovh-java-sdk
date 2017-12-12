package net.minidev.ovh.api.price.saas.csp2;

/**
 * Enum of Licenses
 */
public enum OvhLicenseEnum {
	AzureActiveDirectoryBasic("AzureActiveDirectoryBasic"),
	AzureActiveDirectoryPremiumP1("AzureActiveDirectoryPremiumP1"),
	Business("Business"),
	BusinessEssentials("BusinessEssentials"),
	BusinessPremium("BusinessPremium"),
	EnterpriseE1("EnterpriseE1"),
	EnterpriseE3("EnterpriseE3"),
	EnterpriseK1("EnterpriseK1"),
	ExchangeOnlinePlan1("ExchangeOnlinePlan1"),
	ProPlus("ProPlus"),
	ProjectOnline("ProjectOnline"),
	ProjectOnlineProfessional("ProjectOnlineProfessional"),
	VisioPro("VisioPro");

	final String value;

	OvhLicenseEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
