package ru.bsuedu.cad.lab.Impl;

import ru.bsuedu.cad.lab.Parser;
import ru.bsuedu.cad.lab.Product;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVParser implements Parser {
    @Override
    public List<Product> parse(String content) {
        List<String> lines = Arrays.stream(content.replace("\r", "").split("\n")).skip(1).toList();
        List<Product> products = new ArrayList<>();

        for (String line : lines) {
            String[] parts = line.split(",");

            if (parts.length == 0)
                continue;

            products.add(parseProduct(parts));
        }

        return products;
    }

    private Product parseProduct(String[] parts) {
        Product product = new Product();

        product.productId = Integer.parseInt(parts[0]);
        product.name = parts[1];
        product.description = parts[2];
        product.categoryId = Integer.parseInt(parts[3]);
        product.price = BigDecimal.valueOf(Double.parseDouble(parts[4]));
        product.stockQuantity = Integer.parseInt(parts[5]);
        product.imageUrl = parts[6];
        product.createdAt = Date.valueOf(LocalDate.parse(parts[7]));
        product.updatedAt = Date.valueOf(LocalDate.parse(parts[8]));

        return product;
    }
}
