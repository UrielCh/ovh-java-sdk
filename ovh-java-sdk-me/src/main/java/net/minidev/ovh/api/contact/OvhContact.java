package net.minidev.ovh.api.contact;

import java.util.Date;
import net.minidev.ovh.api.nichandle.OvhCountryEnum;
import net.minidev.ovh.api.nichandle.OvhGenderEnum;
import net.minidev.ovh.api.nichandle.OvhLanguageEnum;
import net.minidev.ovh.api.nichandle.OvhLegalFormEnum;

/**
 * Representation of a Contact
 */
public class OvhContact {
	/**
	 * Birth date
	 *
	 * canBeNull && readOnly
	 */
	public Date birthDay;

	/**
	 * Last name
	 *
	 * canBeNull && readOnly
	 */
	public String lastName;

	/**
	 * Address for this contact
	 *
	 * canBeNull && readOnly
	 */
	public OvhAddress address;

	/**
	 * Gender
	 *
	 * canBeNull && readOnly
	 */
	public OvhGenderEnum gender;

	/**
	 * VAT number
	 *
	 * canBeNull && readOnly
	 */
	public String vat;

	/**
	 * National identification number of your company
	 *
	 * canBeNull && readOnly
	 */
	public String companyNationalIdentificationNumber;

	/**
	 * Birth city
	 *
	 * canBeNull && readOnly
	 */
	public String birthCity;

	/**
	 * Language
	 *
	 * canBeNull && readOnly
	 */
	public OvhLanguageEnum language;

	/**
	 * Legal form of the contact
	 *
	 * canBeNull && readOnly
	 */
	public OvhLegalFormEnum legalForm;

	/**
	 * Organisation type
	 *
	 * canBeNull && readOnly
	 */
	public String organisationType;

	/**
	 * First name
	 *
	 * canBeNull && readOnly
	 */
	public String firstName;

	/**
	 * Organisation name
	 *
	 * canBeNull && readOnly
	 */
	public String organisationName;

	/**
	 * Nationality
	 *
	 * canBeNull && readOnly
	 */
	public OvhCountryEnum nationality;

	/**
	 * Telephone number
	 *
	 * canBeNull && readOnly
	 */
	public String phone;

	/**
	 * Birth Country
	 *
	 * canBeNull && readOnly
	 */
	public OvhCountryEnum birthCountry;

	/**
	 * Spare email address
	 *
	 * canBeNull && readOnly
	 */
	public String spareEmail;

	/**
	 * Contact Identifier
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Fax number
	 *
	 * canBeNull && readOnly
	 */
	public String fax;

	/**
	 * Email address
	 *
	 * canBeNull && readOnly
	 */
	public String email;

	/**
	 * Cellphone number
	 *
	 * canBeNull && readOnly
	 */
	public String cellPhone;

	/**
	 * National identification number of the contact
	 *
	 * canBeNull && readOnly
	 */
	public String nationalIdentificationNumber;

	/**
	 * Birth Zipcode
	 *
	 * canBeNull && readOnly
	 */
	public String birthZip;
}
