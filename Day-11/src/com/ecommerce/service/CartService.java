package com.ecommerce.service;
import java.util.*;
import com.ecommerce.model.*;

import src.com.ecommerce.model.*;
public class CartService {
    private ArrayList<Product> cart=new ArrayList<>();
    public void addProduct(Product p){
        cart.add(p);
    }
    public int calTotal(){
        int total=0;
        for(Product p:cart){
            total+=p.getPrice(p.getId(),p.getName(),p.getPrice());
        }
        return total;
    }
    void showCart(){
        for(Product p:cart){
            p.display();
        }
    }
}
