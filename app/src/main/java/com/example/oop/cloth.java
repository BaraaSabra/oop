package com.example.oop;

import java.util.ArrayList;

public class cloth {
}

class Cloth {
    private String name;
    private double price;

    public Cloth(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Cart {
    private ArrayList<Cloth> items;

    public Cart() {
        this.items = new ArrayList<>();
    }
//وهو دالة يقوم بحساب جميع المحتويات التي في السلة
    public double totalPriceValue() {
        double total = 0.0;
        for (Cloth item : items) {
            total += item.getPrice();
        }
        return total;
    }
//وهي دالة تقوم بطباعة جميع محتويات السلة
    public void printAllInCart() {
        System.out.println("Items in the cart:");
        for (Cloth item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }
//لإضافة منتج جديد في السلة
    public void addToCart(Cloth item) {
        items.add(item);
    }
//لحذف المنتج حيث انه يقوم بإدخال قيمه رقم المنتج  ويقوم بإرجاع  true  في حال قام بحذفه وارجاع false في حال لم يعثر على المنتج في السلة
    public boolean removeFromCart(int itemIndex) {
        if (itemIndex >= 0 && itemIndex < items.size()) {
            items.remove(itemIndex);
            return true;
        }
        return false;
    }
//لعرض عدد المنتجات التي في السلة
    public int count() {
        return items.size();
    }
}

