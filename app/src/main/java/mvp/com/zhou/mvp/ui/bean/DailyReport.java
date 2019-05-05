package mvp.com.zhou.mvp.ui.bean;


/**
 * 日报
 * */
public class DailyReport {

    //项目
    private String program;
    //日累计
    private int dayNumber;
    //月累计
    private int mouthNumber;
    //标准
    private String standard;




    public DailyReport(String program, int dayNumber, int mouthNumber, String standard) {
        this.program = program;
        this.dayNumber = dayNumber;
        this.mouthNumber = mouthNumber;
        this.standard = standard;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getMouthNumber() {
        return mouthNumber;
    }

    public void setMouthNumber(int mouthNumber) {
        this.mouthNumber = mouthNumber;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
}
