package com.finearter.dbs.enums;

public enum PayStatus {

    //未支付
    NOTPAY(0,"未支付"),
    FINISH(1,"已完成");

    private int status;
    private String statusString;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusString() {
        return statusString;
    }

    public void setStatusString(String statusString) {
        this.statusString = statusString;
    }

    PayStatus(int status, String statusString) {

        this.status=status;
        this.statusString=statusString;
    }

    public static String getStatusString(int status){
        for(PayStatus payStatus:PayStatus.values()){
            if(payStatus.status==status){
                return payStatus.statusString;
            }
        }
        return null;
    }
}
