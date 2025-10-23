package org;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LecTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Scanner sc = new Scanner(System.in);

        System.out.print("Choose language: \n1. English\n2. Swedish\n3. Japanese\n4. Finnish\n");
        String choice = sc.nextLine();
        String language;
        String country;

        switch (choice) {
            case "1":
                language = "en";
                country = "US";
                break;
            case "2":
                language = "sv";
                country = "SE";
                break;
            case "3":
                language = "ja";
                country = "JP";
                break;
            case "4":
                language = "fi";
                country = "FI";
                break;
            default:
                language = "en";
                country = "US";
                break;
        }

        Locale locale = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("MessageBundle", locale);


        String nimessage = rb.getString("numberofitems");
        System.out.println(nimessage);

        int numberofitems = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numberofitems; i++) {
            String pimessage = rb.getString("priceofitem");
            System.out.println(pimessage);

            int price = Integer.parseInt(sc.nextLine());

            String qimessage = rb.getString("quantityofitem");
            System.out.println(qimessage);

            int quantity = Integer.parseInt(sc.nextLine());

            Item item = new Item(quantity, price);
            cart.addItem(item);
        }

        String tcmessage = rb.getString("totalcost");
        System.out.println(tcmessage + " " + cart.getTotalAmount());
    }
}
