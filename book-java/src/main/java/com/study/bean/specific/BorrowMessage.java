package com.study.bean.specific;

import java.util.Date;

public class BorrowMessage {

    public static String BORROW="借阅中";

    public static String RETURN="已归还";

    public static String ERR="逾期";

    private String id;

    private String bookid;

    private String bookname;

    private String type;

    private String userid;

    private String username;

    private Date borrowtime;

    private Date repaymenttime;

    private Date returntime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBorrowtime() {
        return borrowtime;
    }

    public void setBorrowtime(Date borrowtime) {
        this.borrowtime = borrowtime;
    }

    public Date getRepaymenttime() {
        return repaymenttime;
    }

    public void setRepaymenttime(Date repaymenttime) {
        this.repaymenttime = repaymenttime;
    }

    public Date getReturntime() {
        return returntime;
    }

    public void setReturntime(Date returntime) {
        this.returntime = returntime;
    }
}
