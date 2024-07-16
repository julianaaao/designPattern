package com.headfirst.api.chapter6.simpleRemote;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl () {}

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
