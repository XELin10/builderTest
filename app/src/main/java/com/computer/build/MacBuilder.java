package com.computer.build;

public class MacBuilder extends Builder {

    protected Computer computer = new Macbook();

    @Override
    public MacBuilder buildBoard(String board) {
        computer.setmBroard(board);
        return this;
    }

    @Override
    public MacBuilder buildDisplay(String display) {
        computer.setmDisplay(display);
        return this;
    }

    @Override
    public MacBuilder buildOS() {
        computer.setmOS();
        return this;
    }

    @Override
    public Computer create() {
        return computer;
    }
}
