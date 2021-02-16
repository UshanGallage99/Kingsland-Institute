package entity;

public class Registration implements SuperEntity {
    private int regNo;
    private String regDate;
    private double regFee;
    private String sID;
    private String cCode;

    public Registration(int string, String resultSetString, String setString, double aDouble) {
    }

    public Registration(int regNo, String regDate, double regFee, String sID, String cCode) {
        this.regNo = regNo;
        this.regDate = regDate;
        this.regFee = regFee;
        this.setsID(sID);
        this.setcCode(cCode);
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public double getRegFee() {
        return regFee;
    }

    public void setRegFee(double regFee) {
        this.regFee = regFee;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "regNo=" + regNo +
                ", regDate='" + regDate + '\'' +
                ", regFee=" + regFee +
                '}';
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode;
    }
}
