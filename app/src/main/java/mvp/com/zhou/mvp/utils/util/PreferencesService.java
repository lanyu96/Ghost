package mvp.com.zhou.mvp.utils.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.HashMap;
import java.util.Map;

/**
 * 轻量级保存工具
 */
public class PreferencesService {

	private static SharedPreferences preferences;

	/** 构造器(无参数) */
	public PreferencesService() {

	}

	/** 构造器(有参数) */
	public PreferencesService(Context context) {
		if (null == preferences) {
			preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
		}
	}

	/** 保存字段 */
	public void save(String key, String value) {
		Editor edit = preferences.edit();
		/** 数据是放在内存中的 */
		edit.putString(key, value);
		/** 提交方法，把内存中的数据提交到文件中 */
		edit.commit();
	}

	/** 根据key值获取value值 */
	public String getValue(String key, String defaltValue) {
		String object = preferences.getString(key, defaltValue);
		return object;
	}

	/** 保存字段 */
	public void save(String key, Boolean value) {
		Editor edit = preferences.edit();
		/** 数据是放在内存中的 */
		edit.putBoolean(key, value);
		/** 提交方法，把内存中的数据提交到文件中 */
		edit.commit();
	}

	/** 根据key值获取value值 */
	public boolean getValue(String key) {
		boolean object = preferences.getBoolean(key, false);
		return object;
	}

	/** 获取保存的字段 */
	public Map<String, String> getPreferences(String... param) {
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < param.length; i++) {
			map.put(param[i], preferences.getString(param[i], ""));
		}
		return map;
	}

	/** 将要保存的hashmap集合转化成字符串 */
	private String SceneList2String(HashMap<Object, Object> hashmap) throws IOException {
		/** 实例化一个ByteArrayOutputStream对象，用来装载压缩后的字节文件。 */
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		/** 然后将得到的字符数据装载到ObjectOutputStream */
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
		/** writeObject 方法负责写入特定类的对象的状态，以便相应的 readObject 方法可以还原它 */
		objectOutputStream.writeObject(hashmap);
		/** 最后，用Base64.encode将字节文件转换成Base64编码保存在String中 */
		String SceneListString = new String(Base64.encode(byteArrayOutputStream.toByteArray(), Base64.DEFAULT));
		/** 关闭objectOutputStream */
		objectOutputStream.close();

		return SceneListString;
	}

	/** 将字符串转化成hashmap集合 */
	private HashMap<Object, Object> String2SceneList(String SceneListString) throws StreamCorruptedException, IOException, ClassNotFoundException {
		byte[] mobileBytes = Base64.decode(SceneListString.getBytes(), Base64.DEFAULT);
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(mobileBytes);
		ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
		@SuppressWarnings("unchecked")
        HashMap<Object, Object> SceneList = (HashMap<Object, Object>) objectInputStream.readObject();
		objectInputStream.close();

		return SceneList;
	}

	/** 存储集合对象 */
	public boolean putHashMap(String key, HashMap<Object, Object> hashmap) {
		Editor editor = preferences.edit();
		try {
			String liststr = SceneList2String(hashmap);
			editor.putString(key, liststr);
		} catch (IOException e) {
			return false;
		}
		return editor.commit();
	}

	/** 获取集合对象 */
	public HashMap<Object, Object> getHashMap(String key) {
		String liststr = preferences.getString(key, "");
		try {
			return String2SceneList(liststr);
		} catch (Exception e) {
			return null;
		}
	}

	/** 反序列化对象(获取序列化对象) */
	public Object deSerialization(String key) {

		String seria = preferences.getString(key, null);

		Object object;
		try {
			String redStr = java.net.URLDecoder.decode(seria, "UTF-8");
			ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(redStr.getBytes("ISO-8859-1"));
			ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
			object = objectInputStream.readObject();
			objectInputStream.close();
			byteArrayInputStream.close();
		} catch (Exception e) {
			return null;
		}

		return object;
	}

	/** 序列化对象 */
	private String serialize(Object object) {
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream;
		String serStr;
		try {
			objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
			objectOutputStream.writeObject(object);
			serStr = byteArrayOutputStream.toString("ISO-8859-1");
			serStr = java.net.URLEncoder.encode(serStr, "UTF-8");
			objectOutputStream.close();
			byteArrayOutputStream.close();
		} catch (IOException e) {
			return null;
		}
		return serStr;
	}

	/** 保存序列化对象 */
	public boolean saveObject(String key, Object object) {
		String strObject = serialize(object);
		Editor edit = preferences.edit();
		edit.putString(key, strObject);
		return edit.commit();
	}
}
