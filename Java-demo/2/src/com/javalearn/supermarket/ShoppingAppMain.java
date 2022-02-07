package com.javalearn.supermarket;

import com.javalearn.supermarket.impl.SimpleShopman;
import com.javalearn.supermarket.interfaces.Customer;
import com.javalearn.supermarket.interfaces.Shopman;
import com.javalearn.supermarket.interfaces.SuperMarket;

import static com.javalearn.supermarket.util.ShoppingUtil.*;

public class ShoppingAppMain {
    public static void main(String[] args) {
        SuperMarket superMarket = createSuperMarket();

        Shopman shopman = new SimpleShopman(superMarket);

        boolean open = true;
        while (open) {
            new ShoppingTask(shopman).executeTask();
            output("是否继续营业？(Yes)");
            open = ! input().next().trim().equalsIgnoreCase("no");
        }

        superMarket.dailyReport();
    }

}

class ShoppingTask {

    private Shopman shopman;

    public ShoppingTask(Shopman shopman) {
        this.shopman = shopman;
    }

    public void executeTask() {
        Customer customer = createCustomer(true);

        shopman.serveCustomer(customer);

    }

}
