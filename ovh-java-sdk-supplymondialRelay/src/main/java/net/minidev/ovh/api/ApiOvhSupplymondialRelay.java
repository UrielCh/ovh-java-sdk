package net.minidev.ovh.api;

import java.io.IOException;
import java.util.HashMap;
import net.minidev.ovh.api.coretypes.OvhCountryEnum;
import net.minidev.ovh.api.supply.OvhMondialRelayReturn;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/supply/mondialRelay
 * version:1.0
 */
public class ApiOvhSupplymondialRelay extends ApiOvhBase {
	public ApiOvhSupplymondialRelay(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Find the 10 nearest MondialRelay points from address or city.
	 *
	 * REST: POST /supply/mondialRelay
	 * @param city [required] City
	 * @param address [required] Address
	 * @param country [required] ISO country code
	 * @param zipcode [required] Zip Code
	 */
	public OvhMondialRelayReturn POST(String address, String city, OvhCountryEnum country, String zipcode) throws IOException {
		String qPath = "/supply/mondialRelay";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "address", address);
		addBody(o, "city", city);
		addBody(o, "country", country);
		addBody(o, "zipcode", zipcode);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhMondialRelayReturn.class);
	}
}
