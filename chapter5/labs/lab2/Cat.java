package chapter5.labs.lab2;

/**
 * Lab 2: 추상 클래스 활용하기
 * 
 * Cat 클래스를 정의하세요.
 * 이 클래스는 Animal 추상 클래스를 상속받아야 합니다.
 */
public class Cat extends Animal {
    // TODO: 고양이의 추가 속성 정의 (예: 털 색깔)
    public String skinColor;
    
    // TODO: 생성자 정의
    Cat(String skinColor){
        super();
        this.skinColor = skinColor;
    }

    Cat (String name,int age,String skinColor ) {
        super(name, age);
        this.skinColor = skinColor;
    }
    
    // TODO: 추상 메소드 sound() 구현
    @Override
    public void sound() {
        System.out.println("야옹 이라는 소리를 내요");
    }
    
    // TODO: 필요한 경우 부모 클래스의 메소드 오버라이딩
    public void displayAnimalInfo(){
        System.out.println("이 동물은 고양이이며 털색깔은"+skinColor+" 입니다");
    }
    
    // TODO: 고양이만의 고유한 메소드 추가
    
} 