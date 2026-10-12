package uk.ac.westminster.products_api;

public class Product {
    private Long id;
    private String name;
    private double price;

    public Product(){
    }
    //getters
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    //setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
