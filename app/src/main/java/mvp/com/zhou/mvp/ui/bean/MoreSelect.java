package mvp.com.zhou.mvp.ui.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fei on 2018/3/12.
 */
public class MoreSelect {
    private List<String> mList;
    private Boolean isSelect;

    public List<String> getList() {
        return mList;
    }

    public void setList(List<String> list) {
        mList = list;
    }

    public Boolean getSelect() {
        return isSelect;
    }

    public void setSelect(Boolean select) {
        isSelect = select;
    }

    public static List<MoreSelect> getMoreSelectList(List<List<String>> list){
        List<MoreSelect> moreSelectList = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            MoreSelect bean = new MoreSelect();
            bean.setSelect(false);
            bean.setList(list.get(i));
            moreSelectList.add(bean);
        }
        return moreSelectList;
    }
}
