package chapter4.labs.lab2;

/**
 * Lab 2: 생성자 활용하기
 * 
 * Book 클래스 정의하기
 */
public class Book {
    // TODO: 제목, 저자, 가격, 출판연도를 저장할 수 있는 필드를 정의하세요.
    String title;
    String author;
    int price;
    int publishYear;
    
    // TODO: 기본 생성자를 정의하세요.
    Book(){
        System.out.println("Book 객체 기본 생성자로 생성");
        this.title = "제목 미정";
        this.author = "작자 미상";
        this.price = 0;
        this.publishYear = 2025;
    }

    
    // TODO: 제목만 인자로 받는 생성자를 정의하세요. (this() 사용)
    Book(String title){this(title,"작자 미상",0,2025);}
    
    
    // TODO: 제목과 저자를 인자로 받는 생성자를 정의하세요. (this() 사용)
    Book(String title, String author){this(title, author,0,2025);}
    
    
    // TODO: 제목, 저자, 가격을 인자로 받는 생성자를 정의하세요. (this() 사용)
    Book(String title, String author,int price){this(title, author, price,2025);}


    // TODO: 모든 필드를 인자로 받는 생성자를 정의하세요.
    Book(String title, String author, int price,int publishYear ){
        System.out.println("Book 주어진 인자로 생성");
        this.title = title;
        this.author = author;
        this.price = price;
        this.publishYear = publishYear;
    }

    // TODO: 책의 정보를 출력하는 메소드를 정의하세요.
    void describeInformation() {
        System.out.println("제목: " + title);
        System.out.println("작가: " + author);
        System.out.println("가격: " + price);
        System.out.println("publish year: "+publishYear);
    }

}