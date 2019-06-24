package com.example.jurgen.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Keajaiban  implements Parcelable {
    private String name, remarks, desc, photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.remarks);
        dest.writeString(this.photo);
        dest.writeString(this.desc);
    }

    public Keajaiban() {
    }

    protected Keajaiban(Parcel in) {
        this.name = in.readString();
        this.remarks = in.readString();
        this.photo = in.readString();
        this.desc = in.readString();
    }

    public static final Parcelable.Creator<Keajaiban> CREATOR = new
            Parcelable.Creator<Keajaiban>() {

                @Override
                public Keajaiban createFromParcel(Parcel source) {
                    return new Keajaiban(source);
                }
                @Override
                public Keajaiban[] newArray(int size) {
                    return new Keajaiban[size];
                }
    };
}
