package net.minidev.ovh.core;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import com.fasterxml.jackson.core.type.TypeReference;

public abstract class ApiOvhBase {
	/**
	 * log
	 */
	// private final static Logger log = LoggerFactory.getLogger(ApiOvhBase.class);

	protected final ApiOvhCore core;

	public ApiOvhBase(ApiOvhCore core) {
		this.core = core;
	}

	protected String query(String url, String name, Object value) {
		if (value == null)
			return url;
		StringBuilder sb = new StringBuilder(url);
		sb.append(url.contains("?") ? "&" : "?");
		sb.append(name);
		sb.append("=");
		if (value instanceof Date) {
			// Expecting ISO 8601 data
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
			String s = sdf.format((Date) value);
			s = s.replaceAll("([+-])([0-9]{2})(00)$", "$1$2:$3");
			sb.append(s);
		} else {
			sb.append(value);
		}
		return sb.toString();
	}

	public String execN(String method, String query) throws IOException {
		return core.exec(method, query, "", false);
	}

	public String exec(String method, String query) throws IOException {
		return core.exec(method, query, "", true);
	}

	public String exec(String method, String query, Object payload) throws IOException {
		return core.exec(method, query, payload, true);
	}

	public String execN(String method, String query, Object payload) throws IOException {
		return core.exec(method, query, payload, false);
	}

	public <T> T convertTo(String in, TypeReference<T> mapTo) throws IOException {
		return ApiOvhUtils.convertTo(in, mapTo);
	}

	public <T> T convertTo(String in, Class<T> mapTo) throws IOException {
		return ApiOvhUtils.convertTo(in, mapTo);
	}

	protected void addBody(HashMap<String, Object> o, String key, Object value) {
		o.put(key, value);
	}

	public String getNic() {
		return core.getNic();
	}
}
