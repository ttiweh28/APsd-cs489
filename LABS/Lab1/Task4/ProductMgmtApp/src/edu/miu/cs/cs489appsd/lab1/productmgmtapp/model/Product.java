package edu.miu.cs.cs489appsd.lab1.productmgmtapp.model;

import java.math.BigInteger;
import java.time.LocalDate;

public class Product {
    private BigInteger productId;
    private String name;
    private LocalDate dateSupplied;
    private int quantityInStock;
    private double unitPrice;


    public Product() {}


    public Product(BigInteger productId, String name, LocalDate dateSupplied, int quantityInStock, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.dateSupplied = dateSupplied;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
    }


    public Product(BigInteger productId, String name, int quantityInStock, double unitPrice) {
        this(productId, name, LocalDate.now(), quantityInStock, unitPrice);
    }


    public BigInteger getProductId() { return productId; }
    public void setProductId(BigInteger productId) { this.productId = productId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getDateSupplied() { return dateSupplied; }
    public void setDateSupplied(LocalDate dateSupplied) { this.dateSupplied = dateSupplied; }

    public int getQuantityInStock() { return quantityInStock; }
    public void setQuantityInStock(int quantityInStock) { this.quantityInStock = quantityInStock; }

    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }

    @Override
    public String toString() {
        return productId + "," + name + "," + dateSupplied + "," + quantityInStock + "," + unitPrice;
    }
}
