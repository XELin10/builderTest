package com.computer.build;

/**
 * 这是一个基础构建类
 *
 * */
public abstract class Builder {

    public abstract Builder buildBoard(String board);
    public abstract Builder buildDisplay(String display);
    public abstract Builder buildOS();
    public abstract Computer create();

}
