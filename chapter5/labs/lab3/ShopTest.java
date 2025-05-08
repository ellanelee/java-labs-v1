package chapter5.labs.lab3;

/**
 * Lab 3: 인터페이스 활용하기
 * 
 * 인터페이스 구현과 다형성을 테스트하는 클래스입니다.
 */
public class ShopTest {
    public static void main(String[] args) {
        System.out.println("Lab 3: 인터페이스 활용하기 실습");
        
        // TODO: Book 객체 생성
        Book aBook = new Book("신곡",20000, "단테");
        
        // TODO: Electronics 객체 생성
        Electronics aElectronics = new Electronics("냉장고", 100000,"삼성");
        
        // TODO: DiscountedBook 객체 생성
        DiscountedBook aDiscountedBook = new DiscountedBook("홍길동전", 1500, "허균", 0.2);
        
        // TODO: ShoppingCart 객체 생성
        ShoppingCart aShoppingCart = new ShoppingCart(3);
        
        // TODO: 장바구니에 상품 추가하기
        aShoppingCart.addBuyable(aBook);
        aShoppingCart.addBuyable(aDiscountedBook);
        aShoppingCart.addBuyable(aElectronics);
        
        // TODO: 장바구니 내용과 총액 출력하기
        aShoppingCart.getTotalProduct();
        aShoppingCart.getTotalAmount();

        // TODO: 인터페이스를 활용한 다형성 테스트
        //       - Buyable 타입 배열에 다양한 상품 담기
        //       - 모든 상품의 정보 출력하기
        Buyable[] newBuyables = { aBook,aDiscountedBook,aElectronics };
        for (Buyable newBuyable : newBuyables) {
            newBuyable.getProductInformation();
        }
        // TODO: Discountable 인터페이스를 구현한 객체만 별도로 처리하기
        for (Buyable newBuyable : newBuyables) {
            if(newBuyable instanceof Discountable){
                Discountable newdiscountable = (Discountable) newBuyable ;
                newdiscountable.getDiscountRate();
            }
        }
    }
} 