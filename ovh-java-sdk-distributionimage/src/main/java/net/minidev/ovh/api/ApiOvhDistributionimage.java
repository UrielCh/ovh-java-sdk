package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import net.minidev.ovh.api.distribution.OvhImage;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
 * ResourcePath:/distribution/image
 * version:1.0
 */
public class ApiOvhDistributionimage extends ApiOvhBase {
	public ApiOvhDistributionimage(ApiOvhCore core) {
		super(core);
	}

	/**
	 * List images for a service
	 * 
	 * REST: GET /distribution/image/{serviceType}
	 * @param serviceType [required] service type name
	 */
	public ArrayList<String> serviceType_GET(net.minidev.ovh.api.distribution.image.OvhService serviceType) throws IOException {
		String qPath = "/distribution/image/{serviceType}";
		qPath = qPath.replace("{serviceType}", serviceType.toString());
		String resp = execN("GET", qPath);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Show image details
	 * 
	 * REST: GET /distribution/image/{serviceType}/{imageName}
	 * @param serviceType [required] service type name
	 * @param imageName [required] image name
	 */
	public OvhImage serviceType_imageName_GET(net.minidev.ovh.api.distribution.image.OvhService serviceType, String imageName) throws IOException {
		String qPath = "/distribution/image/{serviceType}/{imageName}";
		qPath = qPath.replace("{serviceType}", serviceType.toString());
		qPath = qPath.replace("{imageName}", imageName);
		String resp = execN("GET", qPath);
		return convertTo(resp, OvhImage.class);
	}
}
