package chapter4.labs.lab1;

/**
 * Lab 1: 클래스와 객체 만들기
 * 
 * Person 클래스 정의하기
 */
public class Person {
    // TODO: 이름, 나이, 성별을 저장할 수 있는 필드를 정의하세요.
    String name;
    int age;
    String gender;

    Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    };
    Person(){};

    // TODO: 객체 정보를 출력하는 메소드를 작성하세요.
    public void getName(){
        System.out.println("name :" + name);
    }
    public void getAge(){
        System.out.println("age :" + age);
    }
    public void getGender(){
        System.out.println("gender :" + gender);
    }
    
    // TODO: 생일이 지났을 때 나이를 한 살 증가시키는 메소드를 작성하세요.
    
    public void addAge(){
        age++;
        System.out.println("age :" + age);
    }

    public void information(){
        System.out.println("저의 이름은 "+name+" ,나이는 "+age+"이고, "+gender+"입니다");
    }
} 