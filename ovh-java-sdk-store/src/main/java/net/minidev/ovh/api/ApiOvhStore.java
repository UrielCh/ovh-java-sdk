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
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/store
 * version:1.0
 */
public class ApiOvhStore extends ApiOvhBase {
	public ApiOvhStore(ApiOvhCore core) {
		super(core);
	}

	/**
	 * List current customer documents
	 * 
	 * REST: GET /store/document
	 */
	public ArrayList<OvhDocument> document_GET() throws IOException {
		String qPath = "/store/document";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhDocument>> t1 = new TypeReference<ArrayList<OvhDocument>>() {};

	/**
	 * Create a document
	 * 
	 * REST: POST /store/document
	 * @param name [required] Name of the document
	 * @param tags [required] Optional tags for document
	 */
	public OvhDocument document_POST(String name, OvhSafeKeyValue<String>[] tags) throws IOException {
		String qPath = "/store/document";
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "name", name);
		addBody(o, "tags", tags);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhDocument.class);
	}

	/**
	 * Add CORS support on your container
	 * 
	 * REST: POST /store/document/cors
	 * @param origin [required] Allow this origin
	 */
	public void document_cors_POST(String origin) throws IOException {
		String qPath = "/store/document/cors";
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "origin", origin);
		exec("POST", qPath, o);
	}

	/**
	 * Get document info
	 * 
	 * REST: GET /store/document/{documentId}
	 * @param documentId [required] Id of the document to fetch
	 */
	public OvhDocument document_documentId_GET(String documentId) throws IOException {
		String qPath = "/store/document/{documentId}";
		qPath = qPath.replace("{documentId}", documentId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhDocument.class);
	}

	/**
	 * Delete document
	 * 
	 * REST: DELETE /store/document/{documentId}
	 * @param documentId [required] Id of the object to delete
	 */
	public String document_documentId_DELETE(String documentId) throws IOException {
		String qPath = "/store/document/{documentId}";
		qPath = qPath.replace("{documentId}", documentId);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * List current customer contacts
	 * 
	 * REST: GET /store/contact
	 */
	public ArrayList<OvhContact> contact_GET() throws IOException {
		String qPath = "/store/contact";
		String resp = exec("GET", qPath);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<OvhContact>> t2 = new TypeReference<ArrayList<OvhContact>>() {};

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
	 */
	public OvhContact contact_POST(String title, String firstname, String lastname, String email, String street, String country, String zip, String province, String city, String phone) throws IOException {
		String qPath = "/store/contact";
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "title", title);
		addBody(o, "firstname", firstname);
		addBody(o, "lastname", lastname);
		addBody(o, "email", email);
		addBody(o, "street", street);
		addBody(o, "country", country);
		addBody(o, "zip", zip);
		addBody(o, "province", province);
		addBody(o, "city", city);
		addBody(o, "phone", phone);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhContact.class);
	}

	/**
	 * Get contact details
	 * 
	 * REST: GET /store/contact/{contactId}
	 * @param contactId [required] Id of the contact to fetch
	 */
	public OvhContact contact_contactId_GET(String contactId) throws IOException {
		String qPath = "/store/contact/{contactId}";
		qPath = qPath.replace("{contactId}", contactId);
		String resp = exec("GET", qPath);
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
	 */
	public OvhContact contact_contactId_PUT(String contactId, String title, String firstname, String lastname, String email, String street, String country, String zip, String province, String city, String phone) throws IOException {
		String qPath = "/store/contact/{contactId}";
		qPath = qPath.replace("{contactId}", contactId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "title", title);
		addBody(o, "firstname", firstname);
		addBody(o, "lastname", lastname);
		addBody(o, "email", email);
		addBody(o, "street", street);
		addBody(o, "country", country);
		addBody(o, "zip", zip);
		addBody(o, "province", province);
		addBody(o, "city", city);
		addBody(o, "phone", phone);
		String resp = exec("PUT", qPath, o);
		return convertTo(resp, OvhContact.class);
	}

	/**
	 * Remove an existing contact
	 * 
	 * REST: DELETE /store/contact/{contactId}
	 * @param contactId [required] Id of the contact to remove
	 */
	public String contact_contactId_DELETE(String contactId) throws IOException {
		String qPath = "/store/contact/{contactId}";
		qPath = qPath.replace("{contactId}", contactId);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * List document associated with contact
	 * 
	 * REST: GET /store/contact/{contactId}/document
	 * @param contactId [required] Id of the contact to fetch
	 */
	public ArrayList<String> contact_contactId_document_GET(String contactId) throws IOException {
		String qPath = "/store/contact/{contactId}/document";
		qPath = qPath.replace("{contactId}", contactId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}
	private static TypeReference<ArrayList<String>> t3 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Add a document to a contact
	 * 
	 * REST: POST /store/contact/{contactId}/document
	 * @param documentId [required] Document id to link
	 * @param contactId [required] Id of the contact to fetch
	 */
	public ArrayList<String> contact_contactId_document_POST(String contactId, String documentId) throws IOException {
		String qPath = "/store/contact/{contactId}/document";
		qPath = qPath.replace("{contactId}", contactId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "documentId", documentId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t3);
	}

	/**
	 * Unlink a document from a contact
	 * 
	 * REST: DELETE /store/contact/{contactId}/document/{documentId}
	 * @param contactId [required] Id of the contact to fetch
	 * @param documentId [required] Id of the document
	 */
	public ArrayList<String> contact_contactId_document_documentId_DELETE(String contactId, String documentId) throws IOException {
		String qPath = "/store/contact/{contactId}/document/{documentId}";
		qPath = qPath.replace("{contactId}", contactId);
		qPath = qPath.replace("{documentId}", documentId);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * List current customer partners
	 * 
	 * REST: GET /store/partner
	 */
	public ArrayList<OvhPartner> partner_GET() throws IOException {
		String qPath = "/store/partner";
		String resp = exec("GET", qPath);
		return convertTo(resp, t4);
	}
	private static TypeReference<ArrayList<OvhPartner>> t4 = new TypeReference<ArrayList<OvhPartner>>() {};

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
	 */
	public OvhPartner partner_POST(String legalForm, String organisationName, String country, String city, String street, String zip, String language, String description, String vat, String organisationDisplayName, String companyNationalIdentificationNumber, String url, String otherDetails, String category, String province, String contact) throws IOException {
		String qPath = "/store/partner";
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "legalForm", legalForm);
		addBody(o, "organisationName", organisationName);
		addBody(o, "country", country);
		addBody(o, "city", city);
		addBody(o, "street", street);
		addBody(o, "zip", zip);
		addBody(o, "language", language);
		addBody(o, "description", description);
		addBody(o, "vat", vat);
		addBody(o, "organisationDisplayName", organisationDisplayName);
		addBody(o, "companyNationalIdentificationNumber", companyNationalIdentificationNumber);
		addBody(o, "url", url);
		addBody(o, "otherDetails", otherDetails);
		addBody(o, "category", category);
		addBody(o, "province", province);
		addBody(o, "contact", contact);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhPartner.class);
	}

	/**
	 * Get partner info
	 * 
	 * REST: GET /store/partner/{partnerId}
	 * @param partnerId [required] Id of the partner
	 */
	public OvhPartner partner_partnerId_GET(String partnerId) throws IOException {
		String qPath = "/store/partner/{partnerId}";
		qPath = qPath.replace("{partnerId}", partnerId);
		String resp = exec("GET", qPath);
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
	 */
	public OvhPartner partner_partnerId_PUT(String partnerId, String legalForm, String organisationName, String country, String city, String street, String zip, String language, String description, String vat, String category, String organisationDisplayName, String companyNationalIdentificationNumber, String url, String otherDetails, String province, String contact) throws IOException {
		String qPath = "/store/partner/{partnerId}";
		qPath = qPath.replace("{partnerId}", partnerId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "legalForm", legalForm);
		addBody(o, "organisationName", organisationName);
		addBody(o, "country", country);
		addBody(o, "city", city);
		addBody(o, "street", street);
		addBody(o, "zip", zip);
		addBody(o, "language", language);
		addBody(o, "description", description);
		addBody(o, "vat", vat);
		addBody(o, "category", category);
		addBody(o, "organisationDisplayName", organisationDisplayName);
		addBody(o, "companyNationalIdentificationNumber", companyNationalIdentificationNumber);
		addBody(o, "url", url);
		addBody(o, "otherDetails", otherDetails);
		addBody(o, "province", province);
		addBody(o, "contact", contact);
		String resp = exec("PUT", qPath, o);
		return convertTo(resp, OvhPartner.class);
	}

	/**
	 * Delete partner
	 * 
	 * REST: DELETE /store/partner/{partnerId}
	 * @param partnerId [required] Id of the object to fetch
	 */
	public String partner_partnerId_DELETE(String partnerId) throws IOException {
		String qPath = "/store/partner/{partnerId}";
		qPath = qPath.replace("{partnerId}", partnerId);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * List document associated with partner
	 * 
	 * REST: GET /store/partner/{partnerId}/document
	 * @param partnerId [required] Id of the partner
	 */
	public ArrayList<String> partner_partnerId_document_GET(String partnerId) throws IOException {
		String qPath = "/store/partner/{partnerId}/document";
		qPath = qPath.replace("{partnerId}", partnerId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Add a document to a partner
	 * 
	 * REST: POST /store/partner/{partnerId}/document
	 * @param documentId [required] Document id to link
	 * @param partnerId [required] Id of the partner
	 */
	public ArrayList<String> partner_partnerId_document_POST(String partnerId, String documentId) throws IOException {
		String qPath = "/store/partner/{partnerId}/document";
		qPath = qPath.replace("{partnerId}", partnerId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "documentId", documentId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t3);
	}

	/**
	 * Unlink a document from a partner
	 * 
	 * REST: DELETE /store/partner/{partnerId}/document/{documentId}
	 * @param partnerId [required] Id of the partner
	 * @param documentId [required] Id of the document
	 */
	public ArrayList<String> partner_partnerId_document_documentId_DELETE(String partnerId, String documentId) throws IOException {
		String qPath = "/store/partner/{partnerId}/document/{documentId}";
		qPath = qPath.replace("{partnerId}", partnerId);
		qPath = qPath.replace("{documentId}", documentId);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * List partner's products
	 * 
	 * REST: GET /store/partner/{partnerId}/product
	 * @param partnerId [required] Id of the partner
	 */
	public ArrayList<OvhEditResponse> partner_partnerId_product_GET(String partnerId) throws IOException {
		String qPath = "/store/partner/{partnerId}/product";
		qPath = qPath.replace("{partnerId}", partnerId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t5);
	}
	private static TypeReference<ArrayList<OvhEditResponse>> t5 = new TypeReference<ArrayList<OvhEditResponse>>() {};

	/**
	 * Create a new product for partner
	 * 
	 * REST: POST /store/partner/{partnerId}/product
	 * @param partnerId [required] Id of the partner
	 * @param description [required] Description of product
	 * @param name [required] Name of product
	 * @param otherDetails [required] Additional information
	 * @param category [required] Name of product category
	 */
	public OvhEditResponse partner_partnerId_product_POST(String partnerId, String description, String name, String otherDetails, String category) throws IOException {
		String qPath = "/store/partner/{partnerId}/product";
		qPath = qPath.replace("{partnerId}", partnerId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "name", name);
		addBody(o, "otherDetails", otherDetails);
		addBody(o, "category", category);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, OvhEditResponse.class);
	}

	/**
	 * Get partner info
	 * 
	 * REST: GET /store/partner/{partnerId}/product/{productId}
	 * @param partnerId [required] Id of the partner
	 * @param productId [required] Id of the product
	 */
	public OvhEditResponse partner_partnerId_product_productId_GET(String partnerId, String productId) throws IOException {
		String qPath = "/store/partner/{partnerId}/product/{productId}";
		qPath = qPath.replace("{partnerId}", partnerId);
		qPath = qPath.replace("{productId}", productId);
		String resp = exec("GET", qPath);
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
	 */
	public OvhEditResponse partner_partnerId_product_productId_PUT(String partnerId, String productId, String description, String name, String category, String otherDetails) throws IOException {
		String qPath = "/store/partner/{partnerId}/product/{productId}";
		qPath = qPath.replace("{partnerId}", partnerId);
		qPath = qPath.replace("{productId}", productId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "description", description);
		addBody(o, "name", name);
		addBody(o, "category", category);
		addBody(o, "otherDetails", otherDetails);
		String resp = exec("PUT", qPath, o);
		return convertTo(resp, OvhEditResponse.class);
	}

	/**
	 * Delete product
	 * 
	 * REST: DELETE /store/partner/{partnerId}/product/{productId}
	 * @param partnerId [required] Id of the partner
	 * @param productId [required] Id of the product
	 */
	public String partner_partnerId_product_productId_DELETE(String partnerId, String productId) throws IOException {
		String qPath = "/store/partner/{partnerId}/product/{productId}";
		qPath = qPath.replace("{partnerId}", partnerId);
		qPath = qPath.replace("{productId}", productId);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, String.class);
	}

	/**
	 * List document associated with product
	 * 
	 * REST: GET /store/partner/{partnerId}/product/{productId}/document
	 * @param partnerId [required] Id of the partner
	 * @param productId [required] Id of the product
	 */
	public ArrayList<String> partner_partnerId_product_productId_document_GET(String partnerId, String productId) throws IOException {
		String qPath = "/store/partner/{partnerId}/product/{productId}/document";
		qPath = qPath.replace("{partnerId}", partnerId);
		qPath = qPath.replace("{productId}", productId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t3);
	}

	/**
	 * Add a document to a product
	 * 
	 * REST: POST /store/partner/{partnerId}/product/{productId}/document
	 * @param documentId [required] Document id to link
	 * @param partnerId [required] Id of the partner
	 * @param productId [required] Id of the product
	 */
	public ArrayList<String> partner_partnerId_product_productId_document_POST(String partnerId, String productId, String documentId) throws IOException {
		String qPath = "/store/partner/{partnerId}/product/{productId}/document";
		qPath = qPath.replace("{partnerId}", partnerId);
		qPath = qPath.replace("{productId}", productId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "documentId", documentId);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t3);
	}

	/**
	 * Unlink a document from a product
	 * 
	 * REST: DELETE /store/partner/{partnerId}/product/{productId}/document/{documentId}
	 * @param partnerId [required] Id of the partner
	 * @param productId [required] Id of the product
	 * @param documentId [required] Id of the document
	 */
	public ArrayList<String> partner_partnerId_product_productId_document_documentId_DELETE(String partnerId, String productId, String documentId) throws IOException {
		String qPath = "/store/partner/{partnerId}/product/{productId}/document/{documentId}";
		qPath = qPath.replace("{partnerId}", partnerId);
		qPath = qPath.replace("{productId}", productId);
		qPath = qPath.replace("{documentId}", documentId);
		String resp = exec("DELETE", qPath);
		return convertTo(resp, t3);
	}
}
