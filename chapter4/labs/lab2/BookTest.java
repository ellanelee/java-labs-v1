package chapter4.labs.lab2;

/**
 * Lab 2: 생성자 활용하기
 * 
 * Book 클래스를 테스트하는 메인 클래스
 */
public class BookTest {
    public static void main(String[] args) {
        System.out.println("Book 클래스 테스트를 시작합니다.");
        
        // TODO: 기본 생성자를 사용하여 Book 객체를 생성하고 정보를 출력하세요.
        Book book1 = new Book();
        book1.describeInformation();
        System.out.println();
        
        
        // TODO: 제목만 인자로 받는 생성자를 사용하여 Book 객체를 생성하고 정보를 출력하세요.
        Book book2 = new Book("1Q84");
        book2.describeInformation();
        System.out.println();
        
        
        // TODO: 제목과 저자를 인자로 받는 생성자를 사용하여 Book 객체를 생성하고 정보를 출력하세요.
        Book book3 = new Book("관동별곡", "정철");
        book3.describeInformation();
        System.out.println();
        
        // TODO: 제목, 저자, 가격을 인자로 받는 생성자를 사용하여 Book 객체를 생성하고 정보를 출력하세요.
        Book book4 = new Book("Hamlet", "Shakespeare", 20000);
        book4.describeInformation();
        System.out.println();
        
        // TODO: 모든 필드를 인자로 받는 생성자를 사용하여 Book 객체를 생성하고 정보를 출력하세요.
        Book book5= new Book("신곡", "단테", 10000, 1700);
        book5.describeInformation();
        System.out.println();
        
        // TODO: 객체를 생성한 후 필드 값을 변경하고 정보를 출력하세요.
        Book book6 = new Book();
        book6.title = "오즈의 마법사";
        book6.author = "바움";
        book6.publishYear = 1990;
        book6.describeInformation();
        System.out.println();
    }
} 