package com.solvd.lab.v2.automation.sshukalovich.domain.base;


import com.solvd.lab.v2.automation.sshukalovich.domain.coordinate.Point;
import com.solvd.lab.v2.automation.sshukalovich.domain.interfaces.UIComponent;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlRootElement(name = "baseUIComponent")
@XmlType(propOrder = { "id", "color", "coordinates", "text" })
public abstract class BaseUIComponent implements UIComponent, Serializable {
    private Long id;
    private int color;
    private Point coordinates;
    private String text;

    // define this if you don't wanna get hijacked
    public BaseUIComponent() {

    }

    public BaseUIComponent(Long id, int color, Point coordinates, String text) {
        this.id = id;
        this.color = color;
        this.coordinates = coordinates;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public Point getCoordinates() {
        return coordinates;
    }

    @Override
    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
