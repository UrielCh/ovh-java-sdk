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
	 * @beta
	 */
	public ArrayList<String> serviceType_GET(net.minidev.ovh.api.distribution.image.OvhService serviceType) throws IOException {
		String qPath = "/distribution/image/{serviceType}";
		StringBuilder sb = path(qPath, serviceType);
		String resp = execN("GET", sb.toString());
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<String>> t1 = new TypeReference<ArrayList<String>>() {};

	/**
	 * Show image details
	 *
	 * REST: GET /distribution/image/{serviceType}/{imageName}
	 * @param serviceType [required] service type name
	 * @param imageName [required] image name
	 * @beta
	 */
	public OvhImage serviceType_imageName_GET(net.minidev.ovh.api.distribution.image.OvhService serviceType, String imageName) throws IOException {
		String qPath = "/distribution/image/{serviceType}/{imageName}";
		StringBuilder sb = path(qPath, serviceType, imageName);
		String resp = execN("GET", sb.toString());
		return convertTo(resp, OvhImage.class);
	}
}
