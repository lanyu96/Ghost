package mvp.com.zhou.mvp.utils.util;

import java.math.BigDecimal;

/**
 * Created by fei on 2018/3/21.
 */
public class CheckDataUtil {
    /**
     * 检查是否是数字格式（int double等）
     * @return
     */
    public Boolean checkNumber(String s){
        try {
            new BigDecimal(s);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
