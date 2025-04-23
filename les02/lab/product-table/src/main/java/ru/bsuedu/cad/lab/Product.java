package ru.bsuedu.cad.lab;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    public long productId;
    public String name;
    public String description;
    public int categoryId;
    public BigDecimal price;
    public int stockQuantity;
    public String imageUrl;
    public Date createdAt;
    public Date updatedAt;
}
