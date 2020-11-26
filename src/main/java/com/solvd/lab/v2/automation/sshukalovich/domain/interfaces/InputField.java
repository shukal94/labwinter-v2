package com.solvd.lab.v2.automation.sshukalovich.domain.interfaces;

public interface InputField extends Clickable{
    int getWidth();
    int getHeight();
    void setWidth(int width);
    void setHeight(int height);
    String clear();
    String clearAll();
}
