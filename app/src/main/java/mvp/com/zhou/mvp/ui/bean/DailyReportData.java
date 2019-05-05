package mvp.com.zhou.mvp.ui.bean;

import java.util.List;

public class DailyReportData {


    /**
     * tableName : 分娩
     * data : [{"col4":"999","col1":"窝数","col3":"0","col2":"0"},{"col4":"999","col1":"产仔总数","col3":"0","col2":"0"},{"col4":"999","col1":"活仔总数","col3":"0","col2":"0"},{"col4":"999","col1":"健仔总数","col3":"0","col2":"0"},{"col4":"999","col1":"弱仔总数","col3":"0","col2":"0"},{"col4":"999","col1":"黑死胎总数","col3":"0","col2":"0"},{"col4":"999","col1":"白死胎总数","col3":"0","col2":"0"},{"col4":"999","col1":"木乃伊总数","col3":"0","col2":"0"}]
     */

    private String tableName;
    private List<DataBean> data;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * col4 : 999
         * col1 : 窝数
         * col3 : 0
         * col2 : 0
         */

        private String col4;
        private String col1;
        private String col3;
        private String col2;

        public String getCol4() {
            return col4;
        }

        public void setCol4(String col4) {
            this.col4 = col4;
        }

        public String getCol1() {
            return col1;
        }

        public void setCol1(String col1) {
            this.col1 = col1;
        }

        public String getCol3() {
            return col3;
        }

        public void setCol3(String col3) {
            this.col3 = col3;
        }

        public String getCol2() {
            return col2;
        }

        public void setCol2(String col2) {
            this.col2 = col2;
        }
    }
}
