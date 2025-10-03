package edu.miu.cs.cs489appsd.lab1a.productmgmtapp;

import edu.miu.cs.cs489appsd.lab1.productmgmtapp.model.Product;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class ProductMgmtApp {
    public static void main(String[] args) {
        Product[] products = {
                new Product(new BigInteger("31288741190182539912"), "Banana", LocalDate.parse("2025-01-24"), 124, 0.55),
                new Product(new BigInteger("29274582650152771644"), "Apple", LocalDate.parse("2024-12-09"), 18, 1.09),
                new Product(new BigInteger("91899274600128155167"), "Carrot", LocalDate.parse("2025-03-31"), 89, 2.99),
                new Product(new BigInteger("31288741190182539913"), "Banana", LocalDate.parse("2025-02-13"), 240, 0.65)
        };

        printProducts(products);
    }

    // use a library instead of functions
    public static void printProducts(Product[] products) {
        Arrays.sort(products, Comparator.comparing(Product::getName)
                .thenComparing(Comparator.comparing(Product::getUnitPrice).reversed()));

        // the JSON Format
        System.out.println("JSON:");
        System.out.println("[");
        for (int i = 0; i < products.length; i++) {
            Product p = products[i];
            System.out.println("  {\"productId\": " + p.getProductId()
                    + ", \"name\": \"" + p.getName() + "\""
                    + ", \"dateSupplied\": \"" + p.getDateSupplied() + "\""
                    + ", \"quantityInStock\": " + p.getQuantityInStock()
                    + ", \"unitPrice\": " + p.getUnitPrice() + "}"
                    + (i < products.length - 1 ? "," : ""));
        }
        System.out.println("]");

        // the XML Format
        System.out.println("\nXML:");
        System.out.println("<products>");
        for (Product p : products) {
            System.out.println("  <product>");
            System.out.println("    <productId>" + p.getProductId() + "</productId>");
            System.out.println("    <name>" + p.getName() + "</name>");
            System.out.println("    <dateSupplied>" + p.getDateSupplied() + "</dateSupplied>");
            System.out.println("    <quantityInStock>" + p.getQuantityInStock() + "</quantityInStock>");
            System.out.println("    <unitPrice>" + p.getUnitPrice() + "</unitPrice>");
            System.out.println("  </product>");
        }
        System.out.println("</products>");

        // the CSV Format
        System.out.println("\nCSV:");
        System.out.println("productId,name,dateSupplied,quantityInStock,unitPrice");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
