package net.minidev.ovh.api;

import java.io.IOException;
import java.util.HashMap;
import net.minidev.ovh.api.coretypes.OvhCountryEnum;
import net.minidev.ovh.api.supply.OvhMondialRelayReturn;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.ovh.com/1.0
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
	 * @param country [required] ISO country code
	 * @param city [required] City
	 * @param address [required] Address
	 * @param zipcode [required] Zip Code
	 */
	public OvhMondialRelayReturn POST(OvhCountryEnum country, String city, String address, String zipcode) throws IOException {
		String qPath = "/supply/mondialRelay";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "country", country);
		addBody(o, "city", city);
		addBody(o, "address", address);
		addBody(o, "zipcode", zipcode);
		String resp = exec("POST", sb.toString(), o);
		return convertTo(resp, OvhMondialRelayReturn.class);
	}
}
