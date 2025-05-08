package chapter5.labs.lab3;

import java.util.ArrayList;

/**
 * Lab 3: 인터페이스 활용하기
 * 
 * ShoppingCart 클래스를 정의하세요.
 * 이 클래스는 Buyable 인터페이스를 구현한 다양한 상품을 담는 장바구니 역할을 합니다.
 */
public class ShoppingCart {
    // TODO: 상품 목록을 저장할 리스트 선언
    Buyable[] buyables;
    
    // TODO: 생성자 정의
    ShoppingCart(int size) {
        this.buyables = new Buyable[size];
    }
    
    // TODO: 장바구니에 상품 추가하는 메소드 구현
    void addBuyable(Buyable buyable){
        for (int i =0; i<buyables.length; i++) {
            if(buyables[i] == null){
                buyables[i] = buyable;
                return ;
            }
        }
        System.out.println("The shopping cart is full");
    }
    
    // TODO: 장바구니에서 상품 제거하는 메소드 구현
    void removeBuyable(Buyable item){
        for (int i =0; i<buyables.length; i++) {
            if(buyables[i] == item){
                buyables[i] = null;
                return ;
            }
        }
        System.out.println(item+"을 찾을수 없습니다.");
    }
    
    // TODO: 장바구니의 총 금액을 계산하는 메소드 구현
    void getTotalAmount() {
        double totalAmount = 0;
        for (int i = 0; i < buyables.length; i++) {
            if (buyables[i] != null) {
                if (buyables[i] instanceof Discountable) {
                    Discountable newdiscountable = (Discountable) buyables[i];
                    totalAmount += newdiscountable.calculateDiscountedPrice();
                } else {
                    double productPrice = buyables[i].getSalesPrice();
                    totalAmount += productPrice;
                }
            }
            System.out.println("장바구니의 총금액은 " + totalAmount + " 입니다");
        }
    }
    
    // TODO: 장바구니 상품 목록을 출력하는 메소드 구현
    void getTotalProduct(){
        for (int i =0; i<buyables.length; i++) {
            if(buyables[i] != null) {
                System.out.println(buyables[i].getProductName());
            }
        }
    }
} 