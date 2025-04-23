package ru.bsuedu.cad.lab.Impl;

import ru.bsuedu.cad.lab.Product;
import ru.bsuedu.cad.lab.ProductProvider;
import ru.bsuedu.cad.lab.Renderer;

import java.util.List;

public class ConsoleTableRenderer implements Renderer {
    private ProductProvider provider;

    @Override
    public void render() {
        List<Product> products = provider.getProducts();

        System.out.println("======================= PRODUCTS =======================");

        for (Product product : products) {
            System.out.println(productToString(product));
        }

        System.out.println("========================================================");
    }

    public void setProductProvider(ProductProvider provider) {
        this.provider = provider;
    }

    public ProductProvider getProductProvider() {
        return provider;
    }

    private String productToString(Product product) {
        return "Product[" +
                "productId=" + product.productId +
                ", name='" + product.name + '\'' +
                ", description='" + product.description + '\'' +
                ", categoryId=" + product.categoryId +
                ", price=" + product.price +
                ", stockQuantity=" + product.stockQuantity +
                ", imageUrl='" + product.imageUrl + '\'' +
                ", createdAt=" + product.createdAt +
                ", updatedAt=" + product.updatedAt +
                ']';
    }
}
