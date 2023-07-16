package FactoryMethodPattern.structure.creator;

import FactoryMethodPattern.structure.product.Product;

public abstract class Creator {
    /**
     * 서브 클래스에서 인스턴스를 생성하기 위해 구현하는 팩토리 메서드(추상 메서드)를 정의
     * */
    abstract Product createProduct();

    public void anotherMethod() {
        // 메서드 상세 내용
    }
}