package chapter4.labs.lab3;

/**
 * Lab 3: static과 final 키워드 사용하기
 * 
 * Calculator 클래스를 테스트하는 메인 클래스
 */
public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("Calculator 클래스 테스트를 시작합니다.");
        
        // TODO: 클래스 이름으로 static 상수에 접근하여 출력하세요.
        System.out.println("PI : "+ Calculator.PI);
        System.out.println("계산기 갯수 : "+ Calculator.numberOfCalculators);
        
        // TODO: 객체 생성 없이 static 메소드를 호출하여 원의 면적과 둘레를 계산하세요.
        System.out.println("원의 면적은 "+ Calculator.circularDimension(5));
        System.out.println("원의 둘레는 "+ Calculator.circumference(5));

        // TODO: 객체 생성 없이 static 메소드를 호출하여 사각형의 면적을 계산하세요.
        System.out.println("사각형의 면적은 "+Calculator.square(4,5));
        
        // TODO: Calculator 객체를 생성하고 인스턴스 메소드를 호출하세요.
        Calculator firstCalculator = new Calculator();
        
        // TODO: 생성된 Calculator 객체의 정보를 출력하세요.
        firstCalculator.calculatorInfo();
        
        // TODO: 추가로 Calculator 객체를 생성하고, 객체 생성 횟수를 확인하세요.
        Calculator secondCalculator = new Calculator();
        System.out.println("\n객체 생성횟수 : "+ Calculator.numberOfCalculators);

        // TODO: 각 객체의 인스턴스 변수 값과 static 변수 값을 비교하세요.
        firstCalculator.calculatorInfo();
        secondCalculator.calculatorInfo();
        
    }
} 