package com.company.informationbook.modelclass;

public class modelclass
{
   private String imgname;
   private String catname;

    public String getImgname() {
        return imgname;
    }

    public String getCatname() {
        return catname;
    }

    public modelclass(String imgname, String catname) {
        this.imgname = imgname;
        this.catname = catname;
    }
}
