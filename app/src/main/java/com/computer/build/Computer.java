package com.computer.build;


/**
 * 这个是一个基础类
 * 定义基础属性参数
 * */
public abstract class Computer {

    protected String mBroard;
    protected String mDisplay;
    protected String mOS;

    protected Computer(){

    }

    public void setmBroard(String mBroard) {
        this.mBroard = mBroard;
    }

    public String getmBroard() {
        return mBroard;
    }

    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public String getmDisplay() {
        return mDisplay;
    }


    public void setmOS() {
    }

    public String getmOS() {
        return mOS;
    }

    @Override
    public String toString() {
        return "电脑：主板=" + getmBroard() + ",显示器=" + getmDisplay() + ",系统=" + getmOS();
    }
}
