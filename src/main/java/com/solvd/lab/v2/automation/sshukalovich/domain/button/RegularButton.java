package com.solvd.lab.v2.automation.sshukalovich.domain.button;


import com.solvd.lab.v2.automation.sshukalovich.domain.base.BaseUIComponent;
import com.solvd.lab.v2.automation.sshukalovich.domain.coordinate.Point;
import com.solvd.lab.v2.automation.sshukalovich.domain.interfaces.Button;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlRootElement(name = "regularButton")
@XmlType(propOrder = {"width", "height" })
public final class RegularButton extends BaseUIComponent implements Button, Serializable {
    private int width;
    private int height;

    public RegularButton() {
        super();
    }

    public RegularButton(Long id, int color, Point coordinates, String text, int width, int height) {
        super(id, color, coordinates, text);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void click() {

    }
}

/*
@XmlRootElement(name = "book")
@XmlType(propOrder = { "id", "name", "author", "date" })
public class Message {
    private Long id;
    private String content;
    private String author;
    private Date date;

    public Message() {

    }

    public Message(Long id, String content, String author, Date date) {
        this.id = id;
        this.content = content;
        this.author = author;
        this.date = date;
    }

    @XmlAttribute
    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement(name = "title")
    public void setContent(String content) {
        this.content = content;
    }

    @XmlElement
    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public Date getDate() {
        return date;
    }

    @XmlJavaTypeAdapter(DateAdapter.class)
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Message [" + id + " " + content + " " + date.toString() + "]";
    }
}
 */