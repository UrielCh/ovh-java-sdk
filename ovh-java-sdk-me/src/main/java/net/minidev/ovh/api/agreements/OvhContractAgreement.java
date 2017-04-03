package net.minidev.ovh.api.agreements;

import java.util.Date;

/**
 * Contract agreement
 */
public class OvhContractAgreement {
	/**
	 * Date the agreed contract was effective
	 *
	 * canBeNull && readOnly
	 */
	public Date date;

	/**
	 * Id of the agreed contract
	 *
	 * canBeNull && readOnly
	 */
	public Long contractId;

	/**
	 * Id of the contract
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * State of the agreement
	 *
	 * canBeNull && readOnly
	 */
	public OvhAgreementStateEnum agreed;
}
