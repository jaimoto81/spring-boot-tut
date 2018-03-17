package com.jaimoto.springbootexample.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

//TODO: Intenté usar lombok pero no me creó el constructor con argumentos
@Data
public class Widget {
    private String color;
    private int x   ;
    private int y;

    public Widget(String color, int x, int y){
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
