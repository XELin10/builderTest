package com.computer.build;

public class XiaomiBuilder extends Builder{

    Computer computer = new XiaomiBook();

    @Override
    public Builder buildBoard(String board) {
        computer.setmBroard(board);
        return this;
    }

    @Override
    public Builder buildDisplay(String display) {
        computer.setmDisplay(display);
        return this;
    }

    @Override
    public Builder buildOS() {
        computer.setmOS();
        return this;
    }

    @Override
    public Computer create() {
        return computer;
    }
}
