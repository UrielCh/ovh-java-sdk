package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import net.minidev.ovh.api.image.OvhImage;
import net.minidev.ovh.api.image.OvhImageDetail;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.runabove.com/1.0
 * ResourcePath:/image
 * version:1.0
 */
public class ApiOvhImage extends ApiOvhBase {
	public ApiOvhImage(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Get all available image
	 *
	 * REST: GET /image
	 * @param region [required] Image region
	 * @param flavorId [required] Get compatible images for given flavor
	 * @deprecated
	 */
	public ArrayList<OvhImage> GET(String flavorId, String region) throws IOException {
		String qPath = "/image";
		StringBuilder sb = path(qPath);
		query(sb, "flavorId", flavorId);
		query(sb, "region", region);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhImage>> t1 = new TypeReference<ArrayList<OvhImage>>() {};

	/**
	 * Get details on an image
	 *
	 * REST: GET /image/{imageId}
	 * @param imageId [required] Image unique id
	 * @deprecated
	 */
	public OvhImageDetail imageId_GET(String imageId) throws IOException {
		String qPath = "/image/{imageId}";
		StringBuilder sb = path(qPath, imageId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhImageDetail.class);
	}
}
