package sy.util.base;

import java.util.ResourceBundle;

/**
 * 项目参数工具类
 */
public class ConfigUtil {

	private static final ResourceBundle bundle = java.util.ResourceBundle.getBundle("config");

	/**
	 * 获得sessionInfo名字
	 */
	public static final String getSessionInfoName() {
		return bundle.getString("sessionInfoName");
	}

	/**
	 * 通过键获取值
	 */
	public static final String get(String key) {
		return bundle.getString(key);
	}

}
