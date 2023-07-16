package FactoryMethodPattern.structure.creator;

import FactoryMethodPattern.structure.product.ConcreteProduct;
import FactoryMethodPattern.structure.product.Product;

public class ConcreteCreator extends Creator {
    @Override
    Product createProduct() {
        Product product = new ConcreteProduct();
        // 인스턴스 생성

        return product;
    }
}