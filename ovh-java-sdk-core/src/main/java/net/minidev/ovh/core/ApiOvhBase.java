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
		if (core == null)
			throw new NullPointerException("core can not be null");
	}

//	protected String query(String url, String name, Object value) {
//		if (value == null)
//			return url;
//		StringBuilder sb = new StringBuilder(url);
//		sb.append(url.contains("?") ? "&" : "?");
//		sb.append(name);
//		sb.append("=");
//		if (value instanceof Date) {
//			// Expecting ISO 8601 data
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
//			String s = sdf.format((Date) value);
//			s = s.replaceAll("([+-])([0-9]{2})(00)$", "$1$2:$3");
//			sb.append(s);
//		} else {
//			sb.append(value);
//		}
//		return sb.toString();
//	}

	protected StringBuilder query(StringBuilder sb, String name, Object value) {
		if (value == null)
			return sb;
		if (sb.indexOf("?") == -1)
			sb.append("?");
		else
			sb.append("&");
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
		return sb;
	}

	public StringBuilder path(String url, Object... params) {
		StringBuilder sb = new StringBuilder();
		int p = 0;
		int len = url.length();
		for (int i = 0; i < len; i++) {
			char c = url.charAt(i);
			if (c == '{') {
				sb.append(params[p++]);
				while (url.charAt(i) != '}')
					i++;
			} else {
				sb.append(c);
			}
		}
		return sb;
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
