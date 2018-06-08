package io.github.tplxmx96.datatype;

/**
 * 商品实体类
 */

public class Product {
    private String name;  //商品的名称
    private double price; //商品的单价
    /** 商品的描述 */
    private String description;
    /** 商品的服务 */
    private String[] services;

    public Product(){}

    public Product(String name,String description){
        setName(name);
        setDescription(description);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getServices() {
        return services;
    }

    public void setServices(String[] services) {
        this.services = services;
    }
}
