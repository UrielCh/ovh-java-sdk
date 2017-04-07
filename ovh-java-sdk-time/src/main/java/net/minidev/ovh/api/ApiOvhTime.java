package net.minidev.ovh.api;

import java.io.IOException;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://api.runabove.com/1.0
 * ResourcePath:/time
 * version:1.0
 */
public class ApiOvhTime extends ApiOvhBase {
	public ApiOvhTime(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Say time
	 *
	 * REST: GET /time
	 * @deprecated
	 */
	public int GET() throws IOException {
		String qPath = "/time";
		StringBuilder sb = path(qPath);
		String resp = execN(qPath, "GET", sb.toString(), null);
		return convertTo(resp, int.class);
	}
}
