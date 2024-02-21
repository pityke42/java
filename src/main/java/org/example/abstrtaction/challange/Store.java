package org.example.abstrtaction.challange;

import java.util.ArrayList;
import java.util.Arrays;
record OrderItem(int quantity, ProductForSale product){

}
public class Store {
    private static ArrayList<ProductForSale> products = new ArrayList<>();
    public static void main(String[] args) {

        products.add(new Pendrive("sandisk", 120, "128gb"));
        products.add(new Pendrive("western", 200, "198gb"));
        products.add(new Telephone("motorola", 1200, "10gb"));
        products.add(new Telephone("nokia", 999, "gombos"));

        listProducts();

        System.out.println(" \norder1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1,2);
        addItemToOrder(order1, 0,1);;
        printOrder(order1);

        System.out.println(" \norder2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1,10);
        addItemToOrder(order1, 0,5);;
        printOrder(order1);
    }
    public static void listProducts(){
        for(var item : products){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity){
        order.add(new OrderItem(quantity, products.get(orderIndex)));
    }
    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for(var item : order){
            item.product().printPriced(item.quantity());
            salesTotal += item.product().getPrice(item.quantity());
        }
        System.out.printf("Sales total = $%6.2f %n",salesTotal);
    }
}
