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
import net.minidev.ovh.api.registry.OvhService;
import net.minidev.ovh.api.registry.OvhTag;
import net.minidev.ovh.api.registry.OvhUser;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/caas/registry
 * version:1.0
 */
public class ApiOvhCaasregistry extends ApiOvhBase {
	public ApiOvhCaasregistry(ApiOvhCore core) {
		super(core);
	}

	/**
	 * List available services
	 *
	 * REST: GET /caas/registry
	 *
	 * API beta
	 */
	public ArrayList<String> GET() throws IOException {
		String qPath = "/caas/registry";
		StringBuilder sb = path(qPath);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Inspect service.
	 *
	 * REST: GET /caas/registry/{serviceName}
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public OvhService serviceName_GET(String serviceName) throws IOException {
		String qPath = "/caas/registry/{serviceName}";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhService.class);
	}

	/**
	 * Launch a contact change procedure
	 *
	 * REST: POST /caas/registry/{serviceName}/changeContact
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	 * @param serviceName [required] The internal ID of your project
	 *
	 * API beta
	 */
	public ArrayList<Long> serviceName_changeContact_POST(String serviceName, String contactAdmin, String contactBilling, String contactTech) throws IOException {
		String qPath = "/caas/registry/{serviceName}/changeContact";
		StringBuilder sb = path(qPath, serviceName);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "contactAdmin", contactAdmin);
		addBody(o, "contactBilling", contactBilling);
		addBody(o, "contactTech", contactTech);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};

	/**
	 * Create user
	 *
	 * REST: POST /caas/registry/{serviceName}/users
	 * @param body [required] A registry user account
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public OvhUser serviceName_users_POST(String serviceName, OvhInputUser body) throws IOException {
		String qPath = "/caas/registry/{serviceName}/users";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), body);
		return convertTo(resp, OvhUser.class);
	}

	/**
	 * List users
	 *
	 * REST: GET /caas/registry/{serviceName}/users
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_users_GET(String serviceName) throws IOException {
		String qPath = "/caas/registry/{serviceName}/users";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Update user password
	 *
	 * REST: POST /caas/registry/{serviceName}/users/{userId}/changePassword
	 * @param serviceName [required] Service name
	 * @param userId [required] User id
	 *
	 * API beta
	 */
	public OvhUser serviceName_users_userId_changePassword_POST(String serviceName, String userId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/users/{userId}/changePassword";
		StringBuilder sb = path(qPath, serviceName, userId);
		String resp = exec(qPath, "POST", sb.toString(), null);
		return convertTo(resp, OvhUser.class);
	}

	/**
	 * Delete user
	 *
	 * REST: DELETE /caas/registry/{serviceName}/users/{userId}
	 * @param serviceName [required] Service name
	 * @param userId [required] User id
	 *
	 * API beta
	 */
	public void serviceName_users_userId_DELETE(String serviceName, String userId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/users/{userId}";
		StringBuilder sb = path(qPath, serviceName, userId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Inspect user
	 *
	 * REST: GET /caas/registry/{serviceName}/users/{userId}
	 * @param serviceName [required] Service name
	 * @param userId [required] User id
	 *
	 * API beta
	 */
	public OvhUser serviceName_users_userId_GET(String serviceName, String userId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/users/{userId}";
		StringBuilder sb = path(qPath, serviceName, userId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhUser.class);
	}

	/**
	 * Get this object properties
	 *
	 * REST: GET /caas/registry/{serviceName}/serviceInfos
	 * @param serviceName [required] The internal ID of your project
	 *
	 * API beta
	 */
	public net.minidev.ovh.api.services.OvhService serviceName_serviceInfos_GET(String serviceName) throws IOException {
		String qPath = "/caas/registry/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, net.minidev.ovh.api.services.OvhService.class);
	}

	/**
	 * Alter this object properties
	 *
	 * REST: PUT /caas/registry/{serviceName}/serviceInfos
	 * @param body [required] New object properties
	 * @param serviceName [required] The internal ID of your project
	 *
	 * API beta
	 */
	public void serviceName_serviceInfos_PUT(String serviceName, net.minidev.ovh.api.services.OvhService body) throws IOException {
		String qPath = "/caas/registry/{serviceName}/serviceInfos";
		StringBuilder sb = path(qPath, serviceName);
		exec(qPath, "PUT", sb.toString(), body);
	}

	/**
	 * List all images in namespace
	 *
	 * REST: GET /caas/registry/{serviceName}/namespaces/{namespaceId}/images
	 * @param namespaceId [required] Namespace id
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_namespaces_namespaceId_images_GET(String serviceName, String namespaceId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/images";
		StringBuilder sb = path(qPath, serviceName, namespaceId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * List image tags
	 *
	 * REST: GET /caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/tags
	 * @param imageId [required] Image id
	 * @param namespaceId [required] Namespace id
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_namespaces_namespaceId_images_imageId_tags_GET(String serviceName, String namespaceId, String imageId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/tags";
		StringBuilder sb = path(qPath, serviceName, namespaceId, imageId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Inspect image tag
	 *
	 * REST: GET /caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/tags/{tagId}
	 * @param imageId [required] Image id
	 * @param namespaceId [required] Namespace id
	 * @param serviceName [required] Service name
	 * @param tagId [required] Tag id
	 *
	 * API beta
	 */
	public OvhTag serviceName_namespaces_namespaceId_images_imageId_tags_tagId_GET(String serviceName, String namespaceId, String imageId, String tagId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/tags/{tagId}";
		StringBuilder sb = path(qPath, serviceName, namespaceId, imageId, tagId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTag.class);
	}

	/**
	 * Delete image
	 *
	 * REST: DELETE /caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}
	 * @param imageId [required] Image id
	 * @param namespaceId [required] Namespace id
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public void serviceName_namespaces_namespaceId_images_imageId_DELETE(String serviceName, String namespaceId, String imageId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}";
		StringBuilder sb = path(qPath, serviceName, namespaceId, imageId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Inspect image
	 *
	 * REST: GET /caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}
	 * @param imageId [required] Image id
	 * @param namespaceId [required] Namespace id
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public OvhImage serviceName_namespaces_namespaceId_images_imageId_GET(String serviceName, String namespaceId, String imageId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}";
		StringBuilder sb = path(qPath, serviceName, namespaceId, imageId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhImage.class);
	}

	/**
	 * Update image
	 *
	 * REST: PUT /caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}
	 * @param body [required] A container image
	 * @param imageId [required] Image id
	 * @param namespaceId [required] Namespace id
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public OvhImage serviceName_namespaces_namespaceId_images_imageId_PUT(String serviceName, String namespaceId, String imageId, OvhInputImage body) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}";
		StringBuilder sb = path(qPath, serviceName, namespaceId, imageId);
		String resp = exec(qPath, "PUT", sb.toString(), body);
		return convertTo(resp, OvhImage.class);
	}

	/**
	 * Delete image permissions.
	 *
	 * REST: DELETE /caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/permissions/{permissionId}
	 * @param imageId [required] Image id
	 * @param namespaceId [required] Namespace id
	 * @param permissionId [required] Permission id
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public void serviceName_namespaces_namespaceId_images_imageId_permissions_permissionId_DELETE(String serviceName, String namespaceId, String imageId, String permissionId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/permissions/{permissionId}";
		StringBuilder sb = path(qPath, serviceName, namespaceId, imageId, permissionId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Inspect image permissions
	 *
	 * REST: GET /caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/permissions/{permissionId}
	 * @param imageId [required] Image id
	 * @param namespaceId [required] Namespace id
	 * @param permissionId [required] Permission id
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public OvhPermissions serviceName_namespaces_namespaceId_images_imageId_permissions_permissionId_GET(String serviceName, String namespaceId, String imageId, String permissionId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/permissions/{permissionId}";
		StringBuilder sb = path(qPath, serviceName, namespaceId, imageId, permissionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPermissions.class);
	}

	/**
	 * Create image permissions
	 *
	 * REST: POST /caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/permissions
	 * @param imageId [required] Image id
	 * @param namespaceId [required] Namespace id
	 * @param body [required] Permissions of a user over a namespace
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public OvhPermissions serviceName_namespaces_namespaceId_images_imageId_permissions_POST(String serviceName, String namespaceId, String imageId, OvhInputPermissions body) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/permissions";
		StringBuilder sb = path(qPath, serviceName, namespaceId, imageId);
		String resp = exec(qPath, "POST", sb.toString(), body);
		return convertTo(resp, OvhPermissions.class);
	}

	/**
	 * List image permissions
	 *
	 * REST: GET /caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/permissions
	 * @param imageId [required] Image id
	 * @param namespaceId [required] Namespace id
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_namespaces_namespaceId_images_imageId_permissions_GET(String serviceName, String namespaceId, String imageId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/images/{imageId}/permissions";
		StringBuilder sb = path(qPath, serviceName, namespaceId, imageId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Delete namespace
	 *
	 * REST: DELETE /caas/registry/{serviceName}/namespaces/{namespaceId}
	 * @param namespaceId [required] Namespace id
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public void serviceName_namespaces_namespaceId_DELETE(String serviceName, String namespaceId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}";
		StringBuilder sb = path(qPath, serviceName, namespaceId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Inspect namespace
	 *
	 * REST: GET /caas/registry/{serviceName}/namespaces/{namespaceId}
	 * @param namespaceId [required] Namespace id
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public OvhNamespace serviceName_namespaces_namespaceId_GET(String serviceName, String namespaceId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}";
		StringBuilder sb = path(qPath, serviceName, namespaceId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhNamespace.class);
	}

	/**
	 * Create namespace permissions
	 *
	 * REST: POST /caas/registry/{serviceName}/namespaces/{namespaceId}/permissions
	 * @param namespaceId [required] Namespace id
	 * @param body [required] Permissions of a user over a namespace
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public OvhPermissions serviceName_namespaces_namespaceId_permissions_POST(String serviceName, String namespaceId, OvhInputPermissions body) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/permissions";
		StringBuilder sb = path(qPath, serviceName, namespaceId);
		String resp = exec(qPath, "POST", sb.toString(), body);
		return convertTo(resp, OvhPermissions.class);
	}

	/**
	 * List namespace permissions
	 *
	 * REST: GET /caas/registry/{serviceName}/namespaces/{namespaceId}/permissions
	 * @param namespaceId [required] Namespace id
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_namespaces_namespaceId_permissions_GET(String serviceName, String namespaceId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/permissions";
		StringBuilder sb = path(qPath, serviceName, namespaceId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}

	/**
	 * Delete namespace permissions
	 *
	 * REST: DELETE /caas/registry/{serviceName}/namespaces/{namespaceId}/permissions/{permissionId}
	 * @param namespaceId [required] Namespace id
	 * @param permissionId [required] Permission id
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public void serviceName_namespaces_namespaceId_permissions_permissionId_DELETE(String serviceName, String namespaceId, String permissionId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/permissions/{permissionId}";
		StringBuilder sb = path(qPath, serviceName, namespaceId, permissionId);
		exec(qPath, "DELETE", sb.toString(), null);
	}

	/**
	 * Inspect permission
	 *
	 * REST: GET /caas/registry/{serviceName}/namespaces/{namespaceId}/permissions/{permissionId}
	 * @param namespaceId [required] Namespace id
	 * @param permissionId [required] Permission id
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public OvhPermissions serviceName_namespaces_namespaceId_permissions_permissionId_GET(String serviceName, String namespaceId, String permissionId) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces/{namespaceId}/permissions/{permissionId}";
		StringBuilder sb = path(qPath, serviceName, namespaceId, permissionId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhPermissions.class);
	}

	/**
	 * Create namespace
	 *
	 * REST: POST /caas/registry/{serviceName}/namespaces
	 * @param body [required] A namespace in which a user can either read, write or delete images
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public OvhNamespace serviceName_namespaces_POST(String serviceName, OvhInputNamespace body) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "POST", sb.toString(), body);
		return convertTo(resp, OvhNamespace.class);
	}

	/**
	 * List namespace
	 *
	 * REST: GET /caas/registry/{serviceName}/namespaces
	 * @param serviceName [required] Service name
	 *
	 * API beta
	 */
	public ArrayList<String> serviceName_namespaces_GET(String serviceName) throws IOException {
		String qPath = "/caas/registry/{serviceName}/namespaces";
		StringBuilder sb = path(qPath, serviceName);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
}
