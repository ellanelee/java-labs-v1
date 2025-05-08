package chapter5.labs.lab2;

/**
 * Lab 2: 추상 클래스 활용하기
 * 
 * Dog 클래스를 정의하세요.
 * 이 클래스는 Animal 추상 클래스를 상속받아야 합니다.
 */
public class Dog extends Animal {
    // TODO: 강아지의 추가 속성 정의 (예: 품종)
    public String dogName;
    
    // TODO: 생성자 정의
    Dog(String dogName){
        super();
        this.dogName = dogName;
    }
   Dog (String name,int age,String dogName ) {
        super(name, age);
       this.dogName = dogName;
    }


    // TODO: 추상 메소드 sound() 구현
    @Override
    public void sound() {
        System.out.println("멍멍 이라는 소리를 내요");
    }
    
    // TODO: 필요한 경우 부모 클래스의 메소드 오버라이딩
    public void displayAnimalInfo(){
        System.out.println("이 동물의 품종은"+dogName+" 입니다");
    }


    // TODO: 강아지만의 고유한 메소드 추가
    
} 