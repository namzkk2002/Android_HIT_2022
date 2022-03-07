package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Acc implements Parcelable {
    String tk;
    String pw;

    public Acc() {

    }

    public Acc(String tk, String pw) {
        this.tk = tk;
        this.pw = pw;
    }

    protected Acc(Parcel in) {
        tk = in.readString();
        pw = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(tk);
        dest.writeString(pw);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Acc> CREATOR = new Creator<Acc>() {
        @Override
        public Acc createFromParcel(Parcel in) {
            return new Acc(in);
        }

        @Override
        public Acc[] newArray(int size) {
            return new Acc[size];
        }
    };

    public String getTk() {
        return tk;
    }

    public String getPw() {
        return pw;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

}
