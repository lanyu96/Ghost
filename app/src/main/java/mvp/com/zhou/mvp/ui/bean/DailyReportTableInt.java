package mvp.com.zhou.mvp.ui.bean;


/**
 * 报表Table实体类
 *
 */
public class DailyReportTableInt {
    private String col1;
    private int col2Int;
    private int col3Int;
    private int col4Int;
    private String col2;
    private String col3;
    private String col4;


    public DailyReportTableInt(String col1, int col2Int, int col3Int, int col4Int) {
        this.col1 = col1;
        this.col2Int = col2Int;
        this.col3Int = col3Int;
        this.col4Int = col4Int;
    }

    public DailyReportTableInt(String col1, int col2Int, int col3Int, String col4) {
        this.col1 = col1;
        this.col2Int = col2Int;
        this.col3Int = col3Int;
        this.col4 = col4;
    }

    //    public DailyReportTableInt(String col1, String col2, String col3, String col4) {
//        this.col1 = col1;
//        this.col2 = col2;
//        this.col3 = col3;
//        this.col4 = col4;
//    }

    public String getCol1() {
        return col1;
    }

    public void setCol1(String col1) {
        this.col1 = col1;
    }

    public int getCol2Int() {
        return col2Int;
    }

    public void setCol2Int(int col2Int) {
        this.col2Int = col2Int;
    }

    public int getCol3Int() {
        return col3Int;
    }

    public void setCol3Int(int col3Int) {
        this.col3Int = col3Int;
    }

    public int getCol4Int() {
        return col4Int;
    }

    public void setCol4Int(int col4Int) {
        this.col4Int = col4Int;
    }

    public String getCol2() {
        return col2;
    }

    public void setCol2(String col2) {
        this.col2 = col2;
    }

    public String getCol3() {
        return col3;
    }

    public void setCol3(String col3) {
        this.col3 = col3;
    }

    public String getCol4() {
        return col4;
    }

    public void setCol4(String col4) {
        this.col4 = col4;
    }
}
