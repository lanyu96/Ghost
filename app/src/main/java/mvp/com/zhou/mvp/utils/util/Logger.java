package mvp.com.zhou.mvp.utils.util;

import android.content.ActivityNotFoundException;
import android.database.sqlite.SQLiteFullException;
import android.util.Log;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 * 日志输入类
 * 
 *
 */
public class Logger {
	/**
	 * 程序是否Debug版本
	 */
	public static  boolean IsDebug = true;

	private static final String TAG = "MyLog";

	public static void printStackTrace(String TAG, Exception e) {
		if (IsDebug) {
			e.printStackTrace();
		} else {
			logException(TAG, e);
		}
	}

	public static void printStackTrace(String TAG, IOException e) {
		if (IsDebug) {
			e.printStackTrace();
		} else {
			logException(TAG, e);
		}

	}

	// public static void printStackTrace(String TAG, ClientProtocolException e)
	// {
	// if (IsDebug) {
	// e.printStackTrace();
	// } else {
	// logException(TAG, e);
	// }
	// }

	public static void printStackTrace(String TAG, MalformedURLException e) {
		if (IsDebug) {
			e.printStackTrace();
		} else {
			logException(TAG, e);
		}
	}

	/**
	 * 非法参数
	 * 
	 * @param e
	 */
	public static void printStackTrace(String TAG, IllegalArgumentException e) {
		if (IsDebug) {
			e.printStackTrace();
		} else {
			logException(TAG, e);
		}
	}


	public static void printStackTrace(String TAG, ActivityNotFoundException e) {
		if (IsDebug) {
			e.printStackTrace();
		} else {
			logException(TAG, e);
		}
	}

	public static void printStackTrace(String TAG, IndexOutOfBoundsException e) {
		if (IsDebug) {
			e.printStackTrace();
		} else {
			logException(TAG, e);
		}
	}

	/**
	 * 
	 * @param e
	 */
	public static void printStackTrace(String TAG, FileNotFoundException e) {
		if (IsDebug) {
			e.printStackTrace();
		} else {
			logException(TAG, e);
		}
	}

	// ~~~ 数据库相关

	public static void printStackTrace(String TAG, android.database.sqlite.SQLiteException e) {
		if (IsDebug) {
			e.printStackTrace();
		} else {
			logException(TAG, e);
		}
	}

	/**
	 * 数据库文件已达到最大空间(数据库已满)
	 * 
	 * @param e
	 */
	public static void printStackTrace(String TAG, SQLiteFullException e) {
		if (IsDebug) {
			e.printStackTrace();
		} else {
			logException(TAG, e);
		}
	}

	/**
	 * 未捕获的异常
	 * 
	 * @param TAG
	 * @param e
	 */
	public static void printStackTrace(String TAG, Throwable e) {
		if (IsDebug) {
			e.printStackTrace();
		} else {
			logException(TAG, e);
		}
	}

	/**
	 * 记录错误日志
	 * 
	 * @param TAG
	 * @param ex
	 */
	private static void logException(String TAG, Throwable ex) {

	}

	public static void d(String tag, String msg) {
		if (IsDebug) {
			Log.d("" + tag, "" + msg);
		}
	}

	public static void d(String msg) {
		Log.d(TAG, msg);
	}

	/**
	 * Send a {@link #DEBUG} log message and log the exception.
	 * 
	 * @param tag
	 *            Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param msg
	 *            The message you would like logged.
	 * @param tr
	 *            An exception to log
	 */
	public static void d(String tag, String msg, Throwable tr) {
		if (IsDebug) {
			Log.d(tag, msg, tr);
		}
	}

	public static void e(Throwable tr) {
		if (IsDebug) {
			Log.e(TAG, "", tr);
		}
	}

	public static void i(String msg) {
		if (IsDebug) {
			Log.i(TAG, msg);
		}
	}

	public static void i(String tag, String msg) {
		if (IsDebug) {
			Log.i(tag, msg);
		}
	}

	/**
	 * Send a {@link #INFO} log message and log the exception.
	 * 
	 * @param tag
	 *            Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param msg
	 *            The message you would like logged.
	 * @param tr
	 *            An exception to log
	 */
	public static void i(String tag, String msg, Throwable tr) {
		if (IsDebug) {
			Log.i(tag, msg, tr);
		}

	}

	/**
	 * Send an {@link #ERROR} log message.
	 * 
	 * @param tag
	 *            Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param msg
	 *            The message you would like logged.
	 */
	public static void e(String tag, String msg) {
		if (IsDebug) {
			Log.e(tag, msg);
		}
	}

	public static void e(String msg) {
		if (IsDebug) {
			Log.e(TAG, msg);
		}
	}

	/**
	 * Send a {@link #ERROR} log message and log the exception.
	 * 
	 * @param tag
	 *            Used to identify the source of a log message. It usually identifies the class or activity where the log call occurs.
	 * @param msg
	 *            The message you would like logged.
	 * @param tr
	 *            An exception to log
	 */
	public static void e(String tag, String msg, Throwable tr) {
		if (IsDebug) {
			Log.e(tag, msg, tr);
		}
	}

	public static void e(String msg, Throwable tr) {
		if (IsDebug) {
			Log.e(TAG, msg, tr);
		}
	}

	// public static void d(String msg) {
	// d(TAG, msg);
	// }
	//
	// public static void d(String tag, String msg) {
	// if (DEBUG) {
	// Log.d(tag, msg);
	// }
	// }
	//
	// public static void d(String tag, Exception e) {
	// if (DEBUG) {
	// Log.d(tag, e.getMessage());
	// }
	// }
	//
	// public static void e(String msg) {
	// e(TAG, msg);
	// }
	//
	// public static void e(String tag, String msg) {
	// if (DEBUG) {
	// Log.e(tag, msg);
	// }
	// }
	//
	// public static void e(String tag, Exception e) {
	// if (DEBUG) {
	// Log.e(tag, e.getMessage());
	// }
	// }
	/**
	 * 分段打印出较长log文本
	 * 
	 * @param log
	 *            原log文本
	 * @param showCount
	 *            规定每段显示的长度（最好不要超过eclipse限制长度）
	 */
	public static void showLogCompletion(String log) {
		showLogCompletion(TAG, log);
		//		int showCount = 6000;
		//		if (log.length() > showCount) {
		//			String show = log.substring(0, showCount);
		//			//          System.out.println(show);  
		//			d(show + "");
		//			if ((log.length() - showCount) > showCount) {//剩下的文本还是大于规定长度  
		//				String partLog = log.substring(showCount, log.length());
		//				showLogCompletion(partLog);
		//			} else {
		//				String surplusLog = log.substring(showCount, log.length());
		//				//              System.out.println(surplusLog);  
		//				d(surplusLog + "");
		//			}
		//
		//		} else {
		//			//          System.out.println(log);  
		//			d(log + "");
		//		}
	}

	/**
	 * 分段打印出较长log文本
	 * 
	 * @param log
	 *            原log文本
	 * @param showCount
	 *            规定每段显示的长度（最好不要超过eclipse限制长度）
	 */
	public static void showLogCompletion(String TAG, String log) {
		int showCount = 2000;
		if (log.length() > showCount) {
			String show = log.substring(0, showCount);
			//          System.out.println(show);  
			d(TAG, show + "");
			if ((log.length() - showCount) > showCount) {//剩下的文本还是大于规定长度  
				String partLog = log.substring(showCount, log.length());
				showLogCompletion(TAG, partLog);
			} else {
				String surplusLog = log.substring(showCount, log.length());
				//              System.out.println(surplusLog);  
				d(TAG, surplusLog + "");
			}

		} else {
			//          System.out.println(log);  
			d(TAG, log + "");
		}
	}
}
