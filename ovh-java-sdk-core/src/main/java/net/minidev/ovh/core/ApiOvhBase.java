package net.minidev.ovh.core;

import java.io.IOException;
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
		if (url.contains("?"))
			url = url + "&" + name + "=" + value;
		else
			url = url + "?" + name + "=" + value;
		return url;
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
