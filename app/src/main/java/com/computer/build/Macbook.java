package com.computer.build;

public class Macbook extends Computer {

    protected Macbook(){
        setmOS();
    }

    @Override
    public void setmOS() {
        mOS = "Mac OS";
    }
}
