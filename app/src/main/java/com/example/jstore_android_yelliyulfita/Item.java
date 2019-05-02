package com.example.jstore_android_yelliyulfita;

public class Item {
    private int id;
    private String name;
    private int price;
    private String category;
    private String status;
    private Supplier supplier;

    public Item(int id, String name, int price, String category, String status, Supplier supplier) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.status = status;
        this.supplier = supplier;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;

    }

    public int getPriceprice() {
        return price;
    }

    public String getCategory(){
        return category;
}

public String getStatus(){
        return status;
}
public Supplier getSupplier(){
        return supplier;
}
}

