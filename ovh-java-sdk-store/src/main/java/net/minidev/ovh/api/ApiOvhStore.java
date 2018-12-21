package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.complextype.OvhSafeKeyValue;
import net.minidev.ovh.api.marketplace.OvhDocument;
import net.minidev.ovh.api.marketplace.OvhPartner;
import net.minidev.ovh.api.marketplacecontact.OvhContact;
import net.minidev.ovh.api.marketplacepartnerproduct.OvhEditResponse;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/store
 * version:1.0
 */
public class ApiOvhStore extends ApiOvhBase {
	public ApiOvhStore(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Unlink a document from a product
	 *
	 * REST: DELETE /store/partner/{partnerId}/product/{productId}/document/{documentId}
	 * @param partnerId [required] Id of the partner
	 * @param productId [required] Id of the product
	 * @param documentId [required] Id of the document
	 *
	 * API beta
	 */
	public ArrayList<String> partner_partnerId_product_productId_document_documentId_DELETE(String partnerId, String productId, String documentId) throws IOException {
		String qPath = "/store/partner/{partnerId}/product/{productId}/document/{documentId}";
		StringBuilder sb = path(qPath, partnerId, productId, documentId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * List document associated with product
	 *
	 * REST: GET /store/partner/{partnerId}/product/{productId}/document
	 * @param partnerId [required] Id of the partner
	 * @param productId [required] Id of the product
	 *
	 * API beta
	 */
	public ArrayList<String> partner_partnerId_product_productId_document_GET(String partnerId, String productId) throws IOException {
		String qPath = "/store/partner/{partnerId}/product/{productId}/document";
		StringBuilder sb = path(qPath, partnerId, productId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Add a document to a product
	 *
	 * REST: POST /store/partner/{partnerId}/product/{productId}/document
	 * @param documentId [required] Document id to link
	 * @param partnerId [required] Id of the partner
	 * @param productId [required] Id of the product
	 *
	 * API beta
	 */
	public ArrayList<String> partner_partnerId_product_productId_document_POST(String partnerId, String productId, String documentId) throws IOException {
		String qPath = "/store/partner/{partnerId}/product/{productId}/document";
		StringBuilder sb = path(qPath, partnerId, productId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "documentId", documentId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t1);
	}

	/**
	 * Get partner info
	 *
	 * REST: GET /store/partner/{partnerId}/product/{productId}
	 * @param partnerId [required] Id of the partner
	 * @param productId [required] Id of the product
	 *
	 * API beta
	 */
	public OvhEditResponse partner_partnerId_product_productId_GET(String partnerId, String productId) throws IOException {
		String qPath = "/store/partner/{partnerId}/product/{productId}";
		StringBuilder sb = path(qPath, partnerId, productId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhEditResponse.class);
	}

	/**
	 * Edit product info
	 *
	 * REST: PUT /store/partner/{partnerId}/product/{productId}
	 * @param partnerId [required] Id of the partner
	 * @param productId [required] Id of the product
	 * @param description [required] Description of product
	 * @param name [required] Name of product
	 * @param category [required] Name of product category
	 * @param otherDetails [required] Additional information
	 *
	 * API beta
	 */
	public OvhEditResponse partner_partnerId_product_productId_PUT(String partnerId, String productId, String category, String description, String name, String otherDetails) throws IOException {
		String qPath = "/store/partner/{partnerId}/product/{productId}";
		StringBuilder sb = path(qPath, partnerId, productId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "category", category);
		addBody(o, "description", description);
		addBody(o, "name", name);
		addBody(o, "otherDetails", otherDetails);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhEditResponse.class);
	}

	/**
	 * Delete product
	 *
	 * REST: DELETE /store/partner/{partnerId}/product/{productId}
	 * @param partnerId [required] Id of the partner
	 * @param productId [required] Id of the product
	 *
	 * API beta
	 */
	public String partner_partnerId_product_productId_DELETE(String partnerId, String productId) throws IOException {
		String qPath = "/store/partner/{partnerId}/product/{productId}";
		StringBuilder sb = path(qPath, partnerId, productId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * List partner's products
	 *
	 * REST: GET /store/partner/{partnerId}/product
	 * @param partnerId [required] Id of the partner
	 *
	 * API beta
	 */
	public ArrayList<OvhEditResponse> partner_partnerId_product_GET(String partnerId) throws IOException {
		String qPath = "/store/partner/{partnerId}/product";
		StringBuilder sb = path(qPath, partnerId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhEditResponse>> t2 = new TypeReference<ArrayList<OvhEditResponse>>() {};

	/**
	 * Create a new product for partner
	 *
	 * REST: POST /store/partner/{partnerId}/product
	 * @param partnerId [required] Id of the partner
	 * @param description [required] Description of product
	 * @param name [required] Name of product
	 * @param otherDetails [required] Additional information
	 * @param category [required] Name of product category
	 *
	 * API beta
	 */
	public OvhEditResponse partner_partnerId_product_POST(String partnerId, String category, String description, String name, String otherDetails) throws IOException {
		String qPath = "/store/partner/{partnerId}/product";
		StringBuilder sb = path(qPath, partnerId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "category", category);
		addBody(o, "description", description);
		addBody(o, "name", name);
		addBody(o, "otherDetails", otherDetails);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhEditResponse.class);
	}

	/**
	 * Unlink a document from a partner
	 *
	 * REST: DELETE /store/partner/{partnerId}/document/{documentId}
	 * @param partnerId [required] Id of the partner
	 * @param documentId [required] Id of the document
	 *
	 * API beta
	 */
	public ArrayList<String> partner_partnerId_document_documentId_DELETE(String partnerId, String documentId) throws IOException {
		String qPath = "/store/partner/{partnerId}/document/{documentId}";
		StringBuilder sb = path(qPath, partnerId, documentId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * List document associated with partner
	 *
	 * REST: GET /store/partner/{partnerId}/document
	 * @param partnerId [required] Id of the partner
	 *
	 * API beta
	 */
	public ArrayList<String> partner_partnerId_document_GET(String partnerId) throws IOException {
		String qPath = "/store/partner/{partnerId}/document";
		StringBuilder sb = path(qPath, partnerId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Add a document to a partner
	 *
	 * REST: POST /store/partner/{partnerId}/document
	 * @param documentId [required] Document id to link
	 * @param partnerId [required] Id of the partner
	 *
	 * API beta
	 */
	public ArrayList<String> partner_partnerId_document_POST(String partnerId, String documentId) throws IOException {
		String qPath = "/store/partner/{partnerId}/document";
		StringBuilder sb = path(qPath, partnerId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "documentId", documentId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t1);
	}

	/**
	 * Get partner info
	 *
	 * REST: GET /store/partner/{partnerId}
	 * @param partnerId [required] Id of the partner
	 *
	 * API beta
	 */
	public OvhPartner partner_partnerId_GET(String partnerId) throws IOException {
		String qPath = "/store/partner/{partnerId}";
		StringBuilder sb = path(qPath, partnerId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPartner.class);
	}

	/**
	 * Edit partner info
	 *
	 * REST: PUT /store/partner/{partnerId}
	 * @param partnerId [required] Id of the partner
	 * @param legalForm [required] Legal form
	 * @param organisationName [required] Organisation name
	 * @param country [required] Country
	 * @param city [required] City
	 * @param street [required] Street address
	 * @param zip [required] ZipCode
	 * @param language [required] Language
	 * @param description [required] Complete description
	 * @param vat [required] VAT number
	 * @param category [required] Category
	 * @param organisationDisplayName [required] Organisation display name
	 * @param companyNationalIdentificationNumber [required] Company national identification number
	 * @param url [required] Website address
	 * @param otherDetails [required] Complementary information
	 * @param province [required] Province name
	 * @param contact [required] Linked contact id
	 *
	 * API beta
	 */
	public OvhPartner partner_partnerId_PUT(String partnerId, String category, String city, String companyNationalIdentificationNumber, String contact, String country, String description, String language, String legalForm, String organisationDisplayName, String organisationName, String otherDetails, String province, String street, String url, String vat, String zip) throws IOException {
		String qPath = "/store/partner/{partnerId}";
		StringBuilder sb = path(qPath, partnerId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "category", category);
		addBody(o, "city", city);
		addBody(o, "companyNationalIdentificationNumber", companyNationalIdentificationNumber);
		addBody(o, "contact", contact);
		addBody(o, "country", country);
		addBody(o, "description", description);
		addBody(o, "language", language);
		addBody(o, "legalForm", legalForm);
		addBody(o, "organisationDisplayName", organisationDisplayName);
		addBody(o, "organisationName", organisationName);
		addBody(o, "otherDetails", otherDetails);
		addBody(o, "province", province);
		addBody(o, "street", street);
		addBody(o, "url", url);
		addBody(o, "vat", vat);
		addBody(o, "zip", zip);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhPartner.class);
	}

	/**
	 * Delete partner
	 *
	 * REST: DELETE /store/partner/{partnerId}
	 * @param partnerId [required] Id of the object to fetch
	 *
	 * API beta
	 */
	public String partner_partnerId_DELETE(String partnerId) throws IOException {
		String qPath = "/store/partner/{partnerId}";
		StringBuilder sb = path(qPath, partnerId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * List current customer partners
	 *
	 * REST: GET /store/partner
	 *
	 * API beta
	 */
	public ArrayList<OvhPartner> partner_GET() throws IOException {
		String qPath = "/store/partner";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<OvhPartner>> t3 = new TypeReference<ArrayList<OvhPartner>>() {};

	/**
	 * Create a 'marketplace' partner for current nic
	 *
	 * REST: POST /store/partner
	 * @param legalForm [required] Legal form
	 * @param organisationName [required] Organisation name
	 * @param country [required] Country
	 * @param city [required] City
	 * @param street [required] Street address
	 * @param zip [required] ZipCode
	 * @param language [required] Language
	 * @param description [required] Complete description
	 * @param vat [required] VAT number
	 * @param organisationDisplayName [required] Organisation display name
	 * @param companyNationalIdentificationNumber [required] Company national identification number
	 * @param url [required] Website address
	 * @param otherDetails [required] Complementary information
	 * @param category [required] Category
	 * @param province [required] Province name
	 * @param contact [required] Linked contact id
	 *
	 * API beta
	 */
	public OvhPartner partner_POST(String category, String city, String companyNationalIdentificationNumber, String contact, String country, String description, String language, String legalForm, String organisationDisplayName, String organisationName, String otherDetails, String province, String street, String url, String vat, String zip) throws IOException {
		String qPath = "/store/partner";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "category", category);
		addBody(o, "city", city);
		addBody(o, "companyNationalIdentificationNumber", companyNationalIdentificationNumber);
		addBody(o, "contact", contact);
		addBody(o, "country", country);
		addBody(o, "description", description);
		addBody(o, "language", language);
		addBody(o, "legalForm", legalForm);
		addBody(o, "organisationDisplayName", organisationDisplayName);
		addBody(o, "organisationName", organisationName);
		addBody(o, "otherDetails", otherDetails);
		addBody(o, "province", province);
		addBody(o, "street", street);
		addBody(o, "url", url);
		addBody(o, "vat", vat);
		addBody(o, "zip", zip);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhPartner.class);
	}

	/**
	 * List current customer documents
	 *
	 * REST: GET /store/document
	 *
	 * API beta
	 */
	public ArrayList<OvhDocument> document_GET() throws IOException {
		String qPath = "/store/document";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhDocument>> t4 = new TypeReference<ArrayList<OvhDocument>>() {};

	/**
	 * Create a document
	 *
	 * REST: POST /store/document
	 * @param name [required] Name of the document
	 * @param tags [required] Optional tags for document
	 *
	 * API beta
	 */
	public OvhDocument document_POST(String name, OvhSafeKeyValue<String>[] tags) throws IOException {
		String qPath = "/store/document";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "tags", tags);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhDocument.class);
	}

	/**
	 * Add CORS support on your container
	 *
	 * REST: POST /store/document/cors
	 * @param origin [required] Allow this origin
	 *
	 * API beta
	 */
	public void document_cors_POST(String origin) throws IOException {
		String qPath = "/store/document/cors";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "origin", origin);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Get document info
	 *
	 * REST: GET /store/document/{documentId}
	 * @param documentId [required] Id of the document to fetch
	 *
	 * API beta
	 */
	public OvhDocument document_documentId_GET(String documentId) throws IOException {
		String qPath = "/store/document/{documentId}";
		StringBuilder sb = path(qPath, documentId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhDocument.class);
	}

	/**
	 * Delete document
	 *
	 * REST: DELETE /store/document/{documentId}
	 * @param documentId [required] Id of the object to delete
	 *
	 * API beta
	 */
	public String document_documentId_DELETE(String documentId) throws IOException {
		String qPath = "/store/document/{documentId}";
		StringBuilder sb = path(qPath, documentId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, String.class);
	}

	/**
	 * List current customer contacts
	 *
	 * REST: GET /store/contact
	 *
	 * API beta
	 */
	public ArrayList<OvhContact> contact_GET() throws IOException {
		String qPath = "/store/contact";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<OvhContact>> t5 = new TypeReference<ArrayList<OvhContact>>() {};

	/**
	 * Create a 'marketplace' contact for current nic
	 *
	 * REST: POST /store/contact
	 * @param title [required] Title
	 * @param firstname [required] First name
	 * @param lastname [required] Last name
	 * @param email [required] Email address
	 * @param street [required] Street address
	 * @param country [required] Country
	 * @param zip [required] Zipcode
	 * @param province [required] Province name
	 * @param city [required] City
	 * @param phone [required] Phone number
	 *
	 * API beta
	 */
	public OvhContact contact_POST(String city, String country, String email, String firstname, String lastname, String phone, String province, String street, String title, String zip) throws IOException {
		String qPath = "/store/contact";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "city", city);
		addBody(o, "country", country);
		addBody(o, "email", email);
		addBody(o, "firstname", firstname);
		addBody(o, "lastname", lastname);
		addBody(o, "phone", phone);
		addBody(o, "province", province);
		addBody(o, "street", street);
		addBody(o, "title", title);
		addBody(o, "zip", zip);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhContact.class);
	}

	/**
	 * List document associated with contact
	 *
	 * REST: GET /store/contact/{contactId}/document
	 * @param contactId [required] Id of the contact to fetch
	 *
	 * API beta
	 */
	public ArrayList<String> contact_contactId_document_GET(String contactId) throws IOException {
		String qPath = "/store/contact/{contactId}/document";
		StringBuilder sb = path(qPath, contactId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Add a document to a contact
	 *
	 * REST: POST /store/contact/{contactId}/document
	 * @param documentId [required] Document id to link
	 * @param contactId [required] Id of the contact to fetch
	 *
	 * API beta
	 */
	public ArrayList<String> contact_contactId_document_POST(String contactId, String documentId) throws IOException {
		String qPath = "/store/contact/{contactId}/document";
		StringBuilder sb = path(qPath, contactId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "documentId", documentId);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t1);
	}

	/**
	 * Unlink a document from a contact
	 *
	 * REST: DELETE /store/contact/{contactId}/document/{documentId}
	 * @param contactId [required] Id of the contact to fetch
	 * @param documentId [required] Id of the document
	 *
	 * API beta
	 */
	public ArrayList<String> contact_contactId_document_documentId_DELETE(String contactId, String documentId) throws IOException {
		String qPath = "/store/contact/{contactId}/document/{documentId}";
		StringBuilder sb = path(qPath, contactId, documentId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Get contact details
	 *
	 * REST: GET /store/contact/{contactId}
	 * @param contactId [required] Id of the contact to fetch
	 *
	 * API beta
	 */
	public OvhContact contact_contactId_GET(String contactId) throws IOException {
		String qPath = "/store/contact/{contactId}";
		StringBuilder sb = path(qPath, contactId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhContact.class);
	}

	/**
	 * Edit contact information
	 *
	 * REST: PUT /store/contact/{contactId}
	 * @param contactId [required] Id of the contact to fetch
	 * @param title [required] Title
	 * @param firstname [required] First name
	 * @param lastname [required] Last name
	 * @param email [required] Email address
	 * @param street [required] Street address
	 * @param country [required] Country
	 * @param zip [required] Zipcode
	 * @param province [required] Province name
	 * @param city [required] City
	 * @param phone [required] Phone number
	 *
	 * API beta
	 */
	public OvhContact contact_contactId_PUT(String contactId, String city, String country, String email, String firstname, String lastname, String phone, String province, String street, String title, String zip) throws IOException {
		String qPath = "/store/contact/{contactId}";
		StringBuilder sb = path(qPath, contactId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "city", city);
		addBody(o, "country", country);
		addBody(o, "email", email);
		addBody(o, "firstname", firstname);
		addBody(o, "lastname", lastname);
		addBody(o, "phone", phone);
		addBody(o, "province", province);
		addBody(o, "street", street);
		addBody(o, "title", title);
		addBody(o, "zip", zip);
		String resp = exec(qPath, "PUT", sb.toString(), o);
		return convertTo(resp, OvhContact.class);
	}

	/**
	 * Remove an existing contact
	 *
	 * REST: DELETE /store/contact/{contactId}
	 * @param contactId [required] Id of the contact to remove
	 *
	 * API beta
	 */
	public String contact_contactId_DELETE(String contactId) throws IOException {
		String qPath = "/store/contact/{contactId}";
		StringBuilder sb = path(qPath, contactId);
		String resp = exec(qPath, "DELETE", sb.toString(), null);
		return convertTo(resp, String.class);
	}
}
