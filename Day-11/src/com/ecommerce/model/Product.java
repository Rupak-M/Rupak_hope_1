package src.com.ecommerce.model;

public class Product {
    private int id;
    private String name;
    private int price;
    public Product(){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public int getPrice(int id,String name,int price){
        return this.price;
    }
    public void display(){
        System.out.println("Product id:"+this.id);
        System.out.println("Product name:"+this.name);
        System.out.println("Product price:"+this.price);
    }
}
