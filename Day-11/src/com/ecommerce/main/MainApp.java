package com.ecommerce.main;


public class MainApp {
    public static void main(String[] args) {
        CartService cart=new CartService();
        Product p1=new Product(1,"IPhone 17 Pro",175000);
        Product p2=new Product(2,"Redmi Note 15 Pro Max",60000);
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.showCart();
        int totala=cart.calTotal();
        System.out.println("Total price:"+totala);
    }
}
