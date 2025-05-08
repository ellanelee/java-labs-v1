package chapter5.labs.lab2;

/**
 * Lab 2: 추상 클래스 활용하기
 * 
 * Bird 클래스를 정의하세요.
 * 이 클래스는 Animal 추상 클래스를 상속받아야 합니다.
 */
public class Bird extends Animal {
    // TODO: 새의 추가 속성 정의 (예: 날개 길이, 종류)
    public int wingLength;
    public String birdName;
    
    // TODO: 생성자 정의
    Bird(int wingLength, String birdName){
        super();
        this.wingLength = wingLength;
        this.birdName = birdName;
    };
    Bird(String name,int age, int wingLength, String birdName) {
        super(name, age);
        this.wingLength = wingLength;
        this.birdName = birdName;
    }
    
    // TODO: 추상 메소드 sound() 구현
    @Override
    public void sound() {
        System.out.println("짹짹 이라는 소리를 내요");
    }
    
    // TODO: 필요한 경우 부모 클래스의 메소드 오버라이딩
    @Override
    public void displayAnimalInfo(){
        System.out.println("이 동물은 "+birdName+" 입니다"+"날개의 길이는"+wingLength+" 입니다");
    }
    
    // TODO: 새만의 고유한 메소드 추가 (예: fly)
    
} 