package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.minidev.ovh.api.registry.OvhImage;
import net.minidev.ovh.api.registry.OvhInputImage;
import net.minidev.ovh.api.registry.OvhInputNamespace;
import net.minidev.ovh.api.registry.OvhInputPermissions;
import net.minidev.ovh.api.registry.OvhInputUser;
import net.minidev.ovh.api.registry.OvhNamespace;
import net.minidev.ovh.api.registry.OvhPermissions;
import net.minidev.ovh.api.registry.OvhTag;
import net.minidev.ovh.api.registry.OvhUser;
import net.minidev.ovh.api.services.OvhService;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/caas/registry
 * version:1.0
 */
public class ApiOvhCaasregistry extends ApiOvhBase {
	public ApiOvhCaasregistry(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get this object properties
	 * 
	 * REST: GET /caas/registry/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal ID of your project
	 */
	public OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/caas/registry/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Alter this object properties
	 * 
	 * REST: PUT /caas/registry/{serviceName}/serviceInfos
	 * @param null [required] New object properties
	 * @param serviceName [required] The internal ID of your project
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, OvhService body) throws IOException {
		String qPath = "/caas/registry/{serviceName}/serviceInfos";
		qPath = qPath.replace("{serviceName}", serviceName);
		exec("PUT", qPath, body);
	}

	/**
	 * Inspect service.
	 * 
	 * REST: GET /caas/registry/{serviceName}
	 * @param serviceName [required] Service name
	 */
	public net.minidev.ovh.api.registry.OvhService serviceName_GET(String serviceName) throws IOException {
		String qPath = "/caas/registry/{serviceName}";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, net.minidev.ovh.api.registry.OvhService.class);
	}

	/**
	 * Create user
	 * 
	 * REST: POST /caas/registry/{serviceName}/users
	 * @param null [required] A registry user account
	 * @param serviceName [required] Service name
	 */
	public OvhUser serviceName_users_POST(String serviceName, OvhInputUser body) throws IOException {
		String qPath = "/caas/registry/{serviceName}/users";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath, body);
		return convertTo(resp, OvhUser.class);
	}

	/**
	 * List users
	 * 
	 * REST: GET /caas/registry/{serviceName}/users
	 * @param serviceName [required] Service name
	 */
	public ArrayList<String> serviceName_users_GET(String serviceName) throws IOException {
		String qPath = "/caas/registry/{serviceName}/users";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Delete user
	 * 
	 * REST: DELETE /caas/registry/{serviceName}/users/{userId}
	 * @param serviceName [required] Service name
	 * @param userId [required] User id
	 */
	public void serviceName_users_userId_DELETE(String serviceName, String userId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/users/{userId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userId}", userId);
		exec("DELETE", qPath);
	}

	/**
	 * Inspect user
	 * 
	 * REST: GET /caas/registry/{serviceName}/users/{userId}
	 * @param serviceName [required] Service name
	 * @param userId [required] User id
	 */
	public OvhUser serviceName_users_userId_GET(String serviceName, String userId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/users/{userId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userId}", userId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhUser.class);
	}

	/**
	 * Update user password
	 * 
	 * REST: POST /caas/registry/{serviceName}/users/{userId}/changePassword
	 * @param serviceName [required] Service name
	 * @param userId [required] User id
	 */
	public OvhUser serviceName_users_userId_changePassword_POST(String serviceName, String userId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/users/{userId}/changePassword";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{userId}", userId);
		String resp = exec("POST", qPath);
		return convertTo(resp, OvhUser.class);
	}

	/**
	 * Launch a contact change procedure
	 * 
	 * REST: POST /caas/registry/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal ID of your project
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactTech, String contactBilling) throws IOException {
		String qPath = "/caas/registry/{serviceName}/changeContact";
		qPath = qPath.replace("{serviceName}", serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactTech", contactTech);
		addBody(o, "contactBilling", contactBilling);
		String resp = exec("POST", qPath, o);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Create namespace
	 * 
	 * REST: POST /caas/registry/{serviceName}/namespaces
	 * @param null [required] A namespace in which a user can either read, write or delete images
	 * @param serviceName [required] Service name
	 */
	public OvhNamespace serviceName_namespaces_POST(String serviceName, OvhInputNamespace body) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("POST", qPath, body);
		return convertTo(resp, OvhNamespace.class);
	}

	/**
	 * List namespace
	 * 
	 * REST: GET /caas/registry/{serviceName}/namespaces
	 * @param serviceName [required] Service name
	 */
	public ArrayList<String> serviceName_namespaces_GET(String serviceName) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces";
		qPath = qPath.replace("{serviceName}", serviceName);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Delete namespace
	 * 
	 * REST: DELETE /caas/registry/{serviceName}/namespaces/{namespaceId}
	 * @param namespaceId [required] Namespace id
	 * @param serviceName [required] Service name
	 */
	public void serviceName_namespaces_namespaceId_DELETE(String serviceName, String namespaceId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{namespaceId}", namespaceId);
		exec("DELETE", qPath);
	}

	/**
	 * Inspect namespace
	 * 
	 * REST: GET /caas/registry/{serviceName}/namespaces/{namespaceId}
	 * @param namespaceId [required] Namespace id
	 * @param serviceName [required] Service name
	 */
	public OvhNamespace serviceName_namespaces_namespaceId_GET(String serviceName, String namespaceId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{namespaceId}", namespaceId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhNamespace.class);
	}

	/**
	 * List all images in namespace
	 * 
	 * REST: GET /caas/registry/{serviceName}/namespaces/{namespaceId}/images
	 * @param namespaceId [required] Namespace id
	 * @param serviceName [required] Service name
	 */
	public ArrayList<String> serviceName_namespaces_namespaceId_images_GET(String serviceName, String namespaceId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/images";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{namespaceId}", namespaceId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Delete image
	 * 
	 * REST: DELETE /caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}
	 * @param imageId [required] Image id
	 * @param namespaceId [required] Namespace id
	 * @param serviceName [required] Service name
	 */
	public void serviceName_namespaces_namespaceId_images_imageId_DELETE(String serviceName, String namespaceId, String imageId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{namespaceId}", namespaceId);
		qPath = qPath.replace("{imageId}", imageId);
		exec("DELETE", qPath);
	}

	/**
	 * Inspect image
	 * 
	 * REST: GET /caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}
	 * @param imageId [required] Image id
	 * @param namespaceId [required] Namespace id
	 * @param serviceName [required] Service name
	 */
	public OvhImage serviceName_namespaces_namespaceId_images_imageId_GET(String serviceName, String namespaceId, String imageId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{namespaceId}", namespaceId);
		qPath = qPath.replace("{imageId}", imageId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhImage.class);
	}

	/**
	 * Update image
	 * 
	 * REST: PUT /caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}
	 * @param null [required] A container image
	 * @param imageId [required] Image id
	 * @param namespaceId [required] Namespace id
	 * @param serviceName [required] Service name
	 */
	public OvhImage serviceName_namespaces_namespaceId_images_imageId_PUT(String serviceName, String namespaceId, String imageId, OvhInputImage body) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{namespaceId}", namespaceId);
		qPath = qPath.replace("{imageId}", imageId);
		String resp = exec("PUT", qPath, body);
		return convertTo(resp, OvhImage.class);
	}

	/**
	 * Create image permissions
	 * 
	 * REST: POST /caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/permissions
	 * @param imageId [required] Image id
	 * @param namespaceId [required] Namespace id
	 * @param null [required] Permissions of a user over a namespace
	 * @param serviceName [required] Service name
	 */
	public OvhPermissions serviceName_namespaces_namespaceId_images_imageId_permissions_POST(String serviceName, String namespaceId, String imageId, OvhInputPermissions body) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/permissions";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{namespaceId}", namespaceId);
		qPath = qPath.replace("{imageId}", imageId);
		String resp = exec("POST", qPath, body);
		return convertTo(resp, OvhPermissions.class);
	}

	/**
	 * List image permissions
	 * 
	 * REST: GET /caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/permissions
	 * @param imageId [required] Image id
	 * @param namespaceId [required] Namespace id
	 * @param serviceName [required] Service name
	 */
	public ArrayList<String> serviceName_namespaces_namespaceId_images_imageId_permissions_GET(String serviceName, String namespaceId, String imageId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/permissions";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{namespaceId}", namespaceId);
		qPath = qPath.replace("{imageId}", imageId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Delete image permissions.
	 * 
	 * REST: DELETE /caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/permissions/{permissionId}
	 * @param imageId [required] Image id
	 * @param namespaceId [required] Namespace id
	 * @param permissionId [required] Permission id
	 * @param serviceName [required] Service name
	 */
	public void serviceName_namespaces_namespaceId_images_imageId_permissions_permissionId_DELETE(String serviceName, String namespaceId, String imageId, String permissionId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/permissions/{permissionId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{namespaceId}", namespaceId);
		qPath = qPath.replace("{imageId}", imageId);
		qPath = qPath.replace("{permissionId}", permissionId);
		exec("DELETE", qPath);
	}

	/**
	 * Inspect image permissions
	 * 
	 * REST: GET /caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/permissions/{permissionId}
	 * @param imageId [required] Image id
	 * @param namespaceId [required] Namespace id
	 * @param permissionId [required] Permission id
	 * @param serviceName [required] Service name
	 */
	public OvhPermissions serviceName_namespaces_namespaceId_images_imageId_permissions_permissionId_GET(String serviceName, String namespaceId, String imageId, String permissionId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/permissions/{permissionId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{namespaceId}", namespaceId);
		qPath = qPath.replace("{imageId}", imageId);
		qPath = qPath.replace("{permissionId}", permissionId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPermissions.class);
	}

	/**
	 * Inspect image tag
	 * 
	 * REST: GET /caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/tags/{tagId}
	 * @param imageId [required] Image id
	 * @param namespaceId [required] Namespace id
	 * @param serviceName [required] Service name
	 * @param tagId [required] Tag id
	 */
	public OvhTag serviceName_namespaces_namespaceId_images_imageId_tags_tagId_GET(String serviceName, String namespaceId, String imageId, String tagId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/tags/{tagId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{namespaceId}", namespaceId);
		qPath = qPath.replace("{imageId}", imageId);
		qPath = qPath.replace("{tagId}", tagId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhTag.class);
	}

	/**
	 * List image tags
	 * 
	 * REST: GET /caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/tags
	 * @param imageId [required] Image id
	 * @param namespaceId [required] Namespace id
	 * @param serviceName [required] Service name
	 */
	public ArrayList<String> serviceName_namespaces_namespaceId_images_imageId_tags_GET(String serviceName, String namespaceId, String imageId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/tags";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{namespaceId}", namespaceId);
		qPath = qPath.replace("{imageId}", imageId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Create namespace permissions
	 * 
	 * REST: POST /caas/registry/{serviceName}/namespaces/{namespaceId}/permissions
	 * @param namespaceId [required] Namespace id
	 * @param null [required] Permissions of a user over a namespace
	 * @param serviceName [required] Service name
	 */
	public OvhPermissions serviceName_namespaces_namespaceId_permissions_POST(String serviceName, String namespaceId, OvhInputPermissions body) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/permissions";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{namespaceId}", namespaceId);
		String resp = exec("POST", qPath, body);
		return convertTo(resp, OvhPermissions.class);
	}

	/**
	 * List namespace permissions
	 * 
	 * REST: GET /caas/registry/{serviceName}/namespaces/{namespaceId}/permissions
	 * @param namespaceId [required] Namespace id
	 * @param serviceName [required] Service name
	 */
	public ArrayList<String> serviceName_namespaces_namespaceId_permissions_GET(String serviceName, String namespaceId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/permissions";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{namespaceId}", namespaceId);
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}

	/**
	 * Delete namespace permissions
	 * 
	 * REST: DELETE /caas/registry/{serviceName}/namespaces/{namespaceId}/permissions/{permissionId}
	 * @param namespaceId [required] Namespace id
	 * @param permissionId [required] Permission id
	 * @param serviceName [required] Service name
	 */
	public void serviceName_namespaces_namespaceId_permissions_permissionId_DELETE(String serviceName, String namespaceId, String permissionId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/permissions/{permissionId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{namespaceId}", namespaceId);
		qPath = qPath.replace("{permissionId}", permissionId);
		exec("DELETE", qPath);
	}

	/**
	 * Inspect permission
	 * 
	 * REST: GET /caas/registry/{serviceName}/namespaces/{namespaceId}/permissions/{permissionId}
	 * @param namespaceId [required] Namespace id
	 * @param permissionId [required] Permission id
	 * @param serviceName [required] Service name
	 */
	public OvhPermissions serviceName_namespaces_namespaceId_permissions_permissionId_GET(String serviceName, String namespaceId, String permissionId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/permissions/{permissionId}";
		qPath = qPath.replace("{serviceName}", serviceName);
		qPath = qPath.replace("{namespaceId}", namespaceId);
		qPath = qPath.replace("{permissionId}", permissionId);
		String resp = exec("GET", qPath);
		return convertTo(resp, OvhPermissions.class);
	}

	/**
	 * List available services
	 * 
	 * REST: GET /caas/registry
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/caas/registry";
		String resp = exec("GET", qPath);
		return convertTo(resp, t1);
	}
}
