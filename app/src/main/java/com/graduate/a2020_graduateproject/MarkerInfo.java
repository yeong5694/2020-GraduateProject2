package com.graduate.a2020_graduateproject;

import android.os.Parcel;
import android.os.Parcelable;

// Intent할 때 ArrayList<MarkerInfo> 전달하기 위해 Parcelable 상속
public class MarkerInfo implements Parcelable {
    double xpos; //위도
    double ypos; //경도
    String name; //장소이름



    public MarkerInfo(double xpos, double ypos, String name) {
        /*this.xpos = xpos;
        this.ypos = ypos;
        this.name = name;*/
    }

    protected MarkerInfo(Parcel in) {
        xpos = in.readDouble();
        ypos = in.readDouble();
        name = in.readString();
    }

    public static final Creator<MarkerInfo> CREATOR = new Creator<MarkerInfo>() {
        @Override
        public MarkerInfo createFromParcel(Parcel in) {
            return new MarkerInfo(in);
        }

        @Override
        public MarkerInfo[] newArray(int size) {
            return new MarkerInfo[size];
        }
    };
/*
    public double getXpos() {
        return xpos;
    }

    public double getYpos() {
        return ypos;
    }

    public String getName() {
        return name;
    }

    public void setXpos(double xpos) {
        this.xpos = xpos;
    }

    public void setYpos(double ypos) {
        this.ypos = ypos;
    }

    public void setName(String name) {
        this.name = name;
    }
*/
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(xpos);
        dest.writeDouble(ypos);
        dest.writeString(name);
    }
}
