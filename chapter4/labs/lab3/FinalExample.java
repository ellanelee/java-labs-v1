package chapter4.labs.lab3;

/**
 * Lab 3: static과 final 키워드 사용하기
 * 
 * final 키워드 예제 클래스
 */
public class FinalExample {
    // TODO: final 변수를 선언하고 초기화하세요.
    public final int variable1 = 10;
    
    // TODO: final 변수를 선언만 하고, 생성자에서 초기화하세요.
    public final int variable2;
    
    // TODO: 생성자를 정의하세요.
    public FinalExample(int variable2) {
        // final 변수 초기화
        this.variable2 = variable2;
    }
    
    // TODO: final 메소드를 정의하세요.
    public final void finalMethodToGetVariable() {
        System.out.println("final이 아닌 field variable1 :" +variable1);
    }
    
    // TODO: final 매개변수를 받는 메소드를 정의하세요.
    public int addTwoOnFinalVariables(int variable2) {
        return variable2+2;
    }
    
    public static void main(String[] args) {
        System.out.println("Final 키워드 예제를 실행합니다.");
        
        // TODO: FinalExample 객체를 생성하세요.
        FinalExample finalExample = new FinalExample(20);
        
        // TODO: 객체의 메소드를 호출하세요.
        finalExample.finalMethodToGetVariable();
        
        // TODO: final 클래스의 객체를 생성하고 메소드를 호출하세요.
        FindExample2 findExample2 = new FindExample2(10);
        
        // TODO: final 지역 변수를 선언하고 사용하세요.
        findExample2.getOption();
        
    }
}

// TODO: final 클래스를 정의하세요.
final class FindExample2 {
    int option;
    FindExample2(int integerInput){
        this.option = integerInput;
    }

    public void getOption(){
        System.out.println(option);
    }

}

// TODO: 일반 클래스와 하위 클래스를 정의하고, final 메소드 오버라이딩을 시도해보세요.

class ANormalClass{
   int newOption;

   ANormalClass(int newOption){
       this.newOption = newOption;
   }

   final int getOption(){
       return newOption;
   }
}

class AnotherNormalClass extends ANormalClass{

    AnotherNormalClass(int newOption){
        super(newOption);
    }

//    int getOption() {
//        return(newOption+1);
//    }
}