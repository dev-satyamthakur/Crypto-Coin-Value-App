package com.wildpointers.coinvalue;

public class Model {
    String id, name;
    String image;
    float current_price;

    public Model(String id, String name, String image, float current_price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.current_price = current_price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getCurrent_price() {
        return current_price;
    }

    public void setCurrent_price(float current_price) {
        this.current_price = current_price;
    }
}
