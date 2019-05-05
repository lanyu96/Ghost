package mvp.com.zhou.mvp.ui.bean;

public class ProductTable {


    private String program;
    private int dayNumber;
    private int monthNumber;
    private int standardNumber;

    //生产提醒
    private int productRemind;
    //生产异常
    private int productWarn;

    //存栏
    private int houBei;
    private int gongZhu;
    private int muZhu;
    private int rouZhu;
    private int num;

    //存栏
    public ProductTable(String program, int num) {
        this.program = program;
        this.num = num;
    }

    //存栏信息
    public ProductTable(int houBei, int gongZhu, int muZhu, int rouZhu) {
        this.houBei = houBei;
        this.gongZhu = gongZhu;
        this.muZhu = muZhu;
        this.rouZhu = rouZhu;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getHouBei() {
        return houBei;
    }

    public void setHouBei(int houBei) {
        this.houBei = houBei;
    }

    public int getGongZhu() {
        return gongZhu;
    }

    public void setGongZhu(int gongZhu) {
        this.gongZhu = gongZhu;
    }

    public int getMuZhu() {
        return muZhu;
    }

    public void setMuZhu(int muZhu) {
        this.muZhu = muZhu;
    }

    public int getRouZhu() {
        return rouZhu;
    }

    public void setRouZhu(int rouZhu) {
        this.rouZhu = rouZhu;
    }

    //生产预警和生产提醒
    public ProductTable(int productRemind,int productWarn) {
        this.productRemind = productRemind;
        this.productWarn = productWarn;
    }

    //存栏四个信息


    public ProductTable(String program, int dayNumber, int monthNumber, int standardNumber) {
        this.program = program;
        this.dayNumber = dayNumber;
        this.monthNumber = monthNumber;
        this.standardNumber = standardNumber;
    }


    public int getProductRemind() {
        return productRemind;
    }

    public void setProductRemind(int productRemind) {
        this.productRemind = productRemind;
    }

    public int getProductWarn() {
        return productWarn;
    }

    public void setProductWarn(int productWarn) {
        this.productWarn = productWarn;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }


    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public int getStandardNumber() {
        return standardNumber;
    }

    public void setStandardNumber(int standardNumber) {
        this.standardNumber = standardNumber;
    }
}
