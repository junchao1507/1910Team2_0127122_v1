package com.example.a1910team2_0127122_v1;

public class MenuItem {
    private int imgId;
    private String menuName;

    public MenuItem(){
        imgId = 0;
        menuName = "";
    }

    public MenuItem(int imgId, String menuName){
        this.imgId = imgId;
        this.menuName = menuName;
    }

    public int getImgId(){
        return imgId;
    }

    public void setImgId(int imgId){
        this.imgId = imgId;
    }

    public String getMenuName(){
        return menuName;
    }

    public void setMenuName(String menuName){
        this.menuName = menuName;
    }
}
