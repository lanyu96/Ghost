package mvp.com.zhou.mvp.wsutil;




import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import mvp.com.zhou.mvp.MyApp;
import mvp.com.zhou.mvp.R;
import mvp.com.zhou.mvp.constant.SPConstants;
import mvp.com.zhou.mvp.utils.util.Logger;
import mvp.com.zhou.mvp.utils.util.PreferencesService;


/**
 * Created by fei on 2017/11/2.
 */
public class WSBaseUtil {

//
//    /**
//     * 登陆参数设置
//     *
//     * @return
//     */
//    private static SoapSerializationEnvelope getLoginEnvelope(String user, String pass) {
//        SoapObject rpc = new SoapObject(new WSContants().getLoginUrl(), "login");
//        rpc.addProperty("userName", user);
//        rpc.addProperty("password", pass);
//        rpc.addProperty("slnName", "eas");
//        rpc.addProperty("dcName", WSContants.getDcName());//test
//        rpc.addProperty("language", "L2");
//        rpc.addProperty("dbType", 1);
//        // 生成调用WebService方法的SOAP请求信息,并指定SOAP的版本
//        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER10);
//        envelope.bodyOut = rpc;
//        // 设置是否调用的是dotNet开发的WebService
//        envelope.dotNet = false;
//        // 等价于envelope.bodyOut = rpc;
//        envelope.setOutputSoapObject(rpc);
//        return envelope;
//    }
//
//    /**
//     * 登陆EAS操作
//     *
//     * @return
//     */
//    public static void login(final String userName, final String password, final WsListener listener) {
//        getExecutorService().execute(new Runnable() {
//            @Override
//            public void run() {
//                SoapSerializationEnvelope envelope = getLoginEnvelope(userName, password);
//
//                HttpTransportSE transport = new HttpTransportSE(new WSContants().getLoginUrl() + "?wsdl");
//                try {
//                    transport.setTimeout(WSContants.TIME_OUT);
//                    // 调用WebService
//                    transport.call(null, envelope);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                    if (listener != null)
//                        MyApp.getMainThreadHandler().post(new Runnable() {
//                            @Override
//                            public void run() {
//                                listener.onError(MyApp.getRes().getString(R.string.fail_login_check_link));
//                            }
//                        });
//                    return;
//                }
//
//                // 获取返回的数据
//                SoapObject object = null;
//                try {
//                    object = (SoapObject) envelope.bodyIn;
//                } catch (Exception e) {
//                    if (listener != null)
//                        MyApp.getMainThreadHandler().post(new Runnable() {
//                            @Override
//                            public void run() {
//                                listener.onError("登陆失败类型转换异常");
//                            }
//                        });
//                    return;
//                }
//                if (object == null) {
//                    if (listener != null)
//                        MyApp.getMainThreadHandler().post(new Runnable() {
//                            @Override
//                            public void run() {
//                                listener.onError(MyApp.getRes().getString(R.string.user_or_password_error));
//                            }
//                        });
//                    return;
//                }
//                // 获取返回的结果
//                SoapObject WsContext = (SoapObject) object.getProperty(0);
//                if (WsContext.getProperty("sessionId") == null) {
//                    if (listener != null)
//                        MyApp.getMainThreadHandler().post(new Runnable() {
//                            @Override
//                            public void run() {
//                                listener.onError(MyApp.getRes().getString(R.string.user_or_password_error));
//                            }
//                        });
//                    return;
//                }
//                final String sessionID = WsContext.getProperty("sessionId").toString();
//                PreferencesService ps = MyApp.getPreferencesService();
//                Logger.i("session-----" + sessionID);
//                ps.save(SPConstants.SESSIONID, sessionID);
//                ps.save(SPConstants.LOGIN_USER, userName);
//                ps.save(SPConstants.LOGIN_PASSWORD, password);
//                if (listener != null)
//                    MyApp.getMainThreadHandler().post(new Runnable() {
//                        @Override
//                        public void run() {
//                            listener.onSuccess(sessionID);
//                        }
//                    });
//            }
//        });
//    }
//
//    public static ExecutorService executorService;
//
//    public static ExecutorService getExecutorService() {
//        if (executorService == null) {
//            int NUMBER_OF_CORES = Runtime.getRuntime().availableProcessors();//核心进程数
//            int KEEP_ALIVE_TIME = 500;//进程存活时间
//            TimeUnit KEEP_ALIVE_TIME_UNIT = TimeUnit.SECONDS;
//            BlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<Runnable>();
//            executorService = new ThreadPoolExecutor(NUMBER_OF_CORES,
//                    NUMBER_OF_CORES * 2, KEEP_ALIVE_TIME, KEEP_ALIVE_TIME_UNIT, taskQueue,
//                    new MyNetThreadFactory());
//        }
//        return executorService;
//    }
//
//    /**
//     * 请求操作
//     *
//     * @return
//     */
//    public static void webServiceStart(String url, String methodName, HashMap<String, String> param, WsListener listener) {
//        webServiceStart(url, methodName, param, WSContants.TIME_OUT, true, listener);
//
//    }
//
//    /**
//     * 请求操作
//     *
//     * @return
//     */
//    public static void webServiceStart(final String url, final String methodName, final HashMap<String, String> param, int timeOut, final Boolean tryAgain, final WsListener listener) {
//        Logger.i("requestbody-------------" + methodName + "---------------start");
//
//        final int finalTimeOut = timeOut;
//        getExecutorService().execute(new Runnable() {
//
//            @Override
//            public void run() {
//                SoapObject rpc = new SoapObject(url, methodName);
//
//                Set<String> setKey = param.keySet();
//                Iterator<String> iterator = setKey.iterator();
//                // 从while循环中读取key
//                while (iterator.hasNext()) {
//                    String key = iterator.next();
//                    // 此时的String类型的key就是我们需要的获取的值
//                    rpc.addProperty(key, param.get(key));
//                    Logger.i("request-------------" + key + "--------" + param.get(key));
//                }
//                Logger.i("requestbody-------------" + methodName + "---------------end");
//                // 生成调用WebService方法的SOAP请求信息,并指定SOAP的版本
//                SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER10);
//                envelope.bodyOut = rpc;
//                // 设置是否调用的是dotNet开发的WebService
//                envelope.dotNet = false;
//                // 等价于envelope.bodyOut = rpc;
//                envelope.setOutputSoapObject(rpc);
//
//                HttpTransportSE transport = new HttpTransportSE(url + "?wsdl");
//                //添加含有sessionid的头
//                Element[] header = new Element[1];
//                header[0] = new Element().createElement("http://login.webservice.bos.kingdee.com", "SessionId");
//                header[0].addChild(Element.TEXT, MyApp.getPreferencesService().getValue(SPConstants.SESSIONID, ""));
//
//                envelope.headerOut = header;
//                try {
//                    if (finalTimeOut != 0) {
//                        transport.setTimeout(finalTimeOut);
//                    }
//                    // 调用WebService
//                    transport.call(null, envelope);
//                } catch (Exception e) {
//                    e.printStackTrace();
//
//                    if (!tryAgain) {
//                        MyApp.getMainThreadHandler().post(new Runnable() {
//                            @Override
//                            public void run() {
//                                listener.onError("网络或系统异常");
//
//                            }
//                        });
//                        return;
//                    }
//                    login(MyApp.getPreferencesService().getValue(SPConstants.LOGIN_USER, ""), MyApp.getPreferencesService().getValue(SPConstants.LOGIN_PASSWORD, ""), null);
//                    webServiceStart(url, methodName, param, finalTimeOut, false, listener);
//
//                    return;
//                }
//
//                // 获取返回的数据
//                Object object = null;
//                try {
//                    if (envelope != null) {
//                        object = envelope.getResponse();
//                    }
//                } catch (SoapFault soapFault) {
//                    soapFault.printStackTrace();
//                    if (!tryAgain) {
//                        MyApp.getMainThreadHandler().post(new Runnable() {
//                            @Override
//                            public void run() {
//                                listener.onError("网络或系统异常");
//                            }
//                        });
//                        return;
//                    }
//                    login(MyApp.getPreferencesService().getValue(SPConstants.LOGIN_USER, ""), MyApp.getPreferencesService().getValue(SPConstants.LOGIN_PASSWORD, ""), null);
//                    webServiceStart(url, methodName, param, finalTimeOut, false, listener);
//                    return;
//                } catch (Exception e) {
//                    if (!tryAgain) {
//                        MyApp.getMainThreadHandler().post(new Runnable() {
//                            @Override
//                            public void run() {
//                                listener.onError("网络或系统异常");
//
//
//                            }
//                        });
//                        return;
//                    }
//                    login(MyApp.getPreferencesService().getValue(SPConstants.LOGIN_USER, ""), MyApp.getPreferencesService().getValue(SPConstants.LOGIN_PASSWORD, ""), null);
//                    webServiceStart(url, methodName, param, finalTimeOut, false, listener);
//
//                    return;
//                }
//                if (object == null) {
//                    if (!tryAgain) {
//                        MyApp.getMainThreadHandler().post(new Runnable() {
//                            @Override
//                            public void run() {
//                                listener.onError("网络或系统异常");
//                            }
//                        });
//                        return;
//                    }
//                    login(MyApp.getPreferencesService().getValue(SPConstants.LOGIN_USER, ""), MyApp.getPreferencesService().getValue(SPConstants.LOGIN_PASSWORD, ""), null);
//                    webServiceStart(url, methodName, param, finalTimeOut, false, listener);
//
//                    return;
//                }
//
//                final Object finalObject = object;
//                MyApp.getMainThreadHandler().post(new Runnable() {
//                    @Override
//                    public void run() {
//                        listener.onSuccess(finalObject.toString());
//                        Logger.i("result-------------" + methodName + "--------" + finalObject.toString());
//                    }
//                });
//            }
//        });
//
//    }
//
//    public interface WsListener {
//        void onSuccess(String result);
//
//        void onError(String error);
//
//    }
}
