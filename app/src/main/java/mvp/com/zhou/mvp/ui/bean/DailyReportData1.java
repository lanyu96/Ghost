package mvp.com.zhou.mvp.ui.bean;

import java.util.List;

public class DailyReportData1 {


    /**
     * tableName : 流产
     * data : [{"col4":999,"col1":"流产数量","col3":0,"col2":0}]
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
         * col1 : 流产数量
         * col3 : 0
         * col2 : 0
         */

        private int col4;
        private String col1;
        private int col3;
        private int col2;

        public int getCol4() {
            return col4;
        }

        public void setCol4(int col4) {
            this.col4 = col4;
        }

        public String getCol1() {
            return col1;
        }

        public void setCol1(String col1) {
            this.col1 = col1;
        }

        public int getCol3() {
            return col3;
        }

        public void setCol3(int col3) {
            this.col3 = col3;
        }

        public int getCol2() {
            return col2;
        }

        public void setCol2(int col2) {
            this.col2 = col2;
        }
    }
}

