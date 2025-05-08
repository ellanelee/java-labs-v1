package chapter4.labs.lab1;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

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

    public void displayInfo(){
        System.out.println("이름은 "+name+", 나이는 "+age+","+gender+"입니다.");
    }
    // TODO: 생일이 지났을 때 나이를 한 살 증가시키는 메소드를 작성하세요.
    
    public void checkAge(String birthDate){
        LocalDate inputDate = LocalDate.parse(birthDate);
        MonthDay birthday = MonthDay.from(inputDate);
        LocalDate currentDate = LocalDate.now();
        MonthDay today = MonthDay.from(currentDate);
        if( today.isAfter(birthday)) {
            age++;
            System.out.println("생일이 지나 나이가 1증가하였습니다. 현재 나이 :" + age);
        }else {
            System.out.println("생일이 지나지 않았습니다. 현재 나이는 "+age+" 입니다ㅏ.");
        }


    }
} 