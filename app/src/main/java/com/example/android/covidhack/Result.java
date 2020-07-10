package com.example.android.covidhack;

public class Result {
    private double lattitude,longitude;
    private String macaddress;
    private String timestamp;
    private String phnumber;

    public Result(double lattitude,double longitude,String macaddress,String timestamp,String phnumber){
        this.lattitude=lattitude;
        this.longitude=longitude;
        this.macaddress=macaddress;
        this.timestamp=timestamp;
        this.phnumber=phnumber;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLattitude(double lattitude) {
        this.lattitude = lattitude;
    }

    public void setMacaddress(String macaddress) {
        this.macaddress = macaddress;
    }

    public void setPhnumber(String phnumber) {
        this.phnumber = phnumber;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLattitude() {
        return lattitude;
    }

    public String getMacaddress() {
        return macaddress;
    }

    public String getPhnumber() {
        return phnumber;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
