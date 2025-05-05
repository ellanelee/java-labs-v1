package chapter4.labs.lab4;

/**
 * Lab 4: 접근 제한자와 객체 간 관계 구현하기
 * 
 * Engine 클래스 정의하기
 */
public class Engine {
    // TODO: 적절한 접근 제한자를 사용하여 필드를 정의하세요.
    // (엔진 타입, 마력, 작동 상태 등)
    public String engineType;
    public int enginePower;
    public Boolean workingStaus;
    
    
    // TODO: 생성자를 정의하세요.
    public Engine(String engineType, int enginePower, Boolean workingStaus){
        this.engineType = engineType;
        this.enginePower = enginePower;
        this.workingStaus = workingStaus;
    }

    public Engine(String engineType){
        this.engineType = engineType;
        this.enginePower = 0;
        this.workingStaus = false;
    }

    // TODO: 엔진을 시작하는 메소드를 정의하세요.
    public void startEngine(){
        System.out.println("엔진을 시동합니다");
    }

    
    
    // TODO: 엔진을 정지하는 메소드를 정의하세요.
    public void stopEngine(){
        System.out.println("엔진을 끕니다");
    }
    
    
    // TODO: 엔진의 상태를 확인하는 메소드를 정의하세요.
    public void checkEngineStatus(){
        System.out.println("운전자가 엔진상태를 확인합니다.");    }
    
    
    // TODO: 엔진의 정보를 출력하는 메소드를 정의하세요.
    public void getEngineInfo(){
        System.out.println("엔진 타입은 " +engineType+"마력은 "+enginePower+"현재 "+ ( workingStaus? "가동중입니다":"가동중이지 않습니다"));

    }
    
    
    // TODO: 필요한 getter/setter 메소드를 정의하세요.
    public void getEngineType(){
        System.out.println("EngineType은 " +engineType+"입니다");
    }

    
} 