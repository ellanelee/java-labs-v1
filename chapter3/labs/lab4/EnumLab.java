package chapter3.labs.lab4;

import java.util.Optional;
import java.util.Scanner;

/**
 * Enum(열거형) 활용하기 실습
 */
public class EnumLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. 요일 Enum 활용하기
        System.out.println("===== 요일 Enum 활용하기 =====");
        System.out.println("요일을 입력하세요 (월, 화, 수, 목, 금, 토, 일): ");
        String input = scanner.nextLine();

        // TODO: 입력받은 요일에 해당하는 DayOfWeek Enum 상수를 찾아 switch 문에서 활용하세요.
        // 평일(월~금)인 경우 "평일입니다."를, 주말(토, 일)인 경우 "주말입니다."를 출력하세요.

        Weekdays aDay = Weekdays.getWeekdayByDescription(input);

        if( aDay == null ){
            System.out.println("정확한 요일을 입력해주세요. 모든 문자는 대문자입니다");
        }else {
            switch (aDay) {
                case MONDAY:
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                case FRIDAY:
                    System.out.println("평일입니다");
                    break;
                case SATURDAY:
                case SUNDAY:
                    System.out.println("주말입니다");
                    break;
                default:
                    throw new IllegalArgumentException("부정확한 값 "+aDay);
            }
        }
        // 2. 계절 Enum 활용하기
        System.out.println("\n===== 계절 Enum 활용하기 =====");
        System.out.println("월을 입력하세요 (1-12): ");
        int month = scanner.nextInt();
        
        // TODO: 입력받은 월에 해당하는 Season Enum 상수를 찾아 해당 계절의 특징을 출력하세요.
        // Season Enum에 평균 기온과 특징을 필드로 추가하고, 이를 활용하세요.
        Seasons aSeason = Seasons.getSeason(month);

        if( aSeason == null ){
            System.out.println("월을 숫자로 입력해주세요");
        }else {
           String description = aSeason.getDescription();
           int temperature = aSeason.getTemperature();
           System.out.println(month+" 월은 평균기온이 "+temperature+" 이고, "+description);
        }
        // 3. 상태 전이 Enum 활용하기
        System.out.println("\n===== 상태 전이 Enum 활용하기 =====");
        // TODO: TaskStatus Enum을 구현하고, 상태 전이 로직을 활용하여 작업 상태를 변경하세요.
        // TaskStatus는 PENDING, IN_PROGRESS, COMPLETED, ARCHIVED 상태를 가지며,
        // nextStatus() 메소드를 통해 다음 상태로 전이할 수 있어야 합니다.
        // 사용자가 "next"를 입력할 때마다 상태를 다음 단계로 변경하고, 현재 상태를 출력하세요.
        // 사용자가 "exit"를 입력하면 종료합니다.
        scanner.nextLine(); // 버퍼 비우기
        TaskStatus aStatus = TaskStatus.PENDING;

        while(true){
            String command = scanner.nextLine();
            if( command == null ){
                System.out.println("Undefined command");
                break;
            }else {
                aStatus = aStatus.nextStatus(command);
                if(aStatus == null) {break;}
                System.out.println(aStatus.name());
            }
        }


        // 4. 연산자 Enum 활용하기
        System.out.println("\n===== 연산자 Enum 활용하기 =====");
        scanner.nextLine(); // 버퍼 비우기

        // TODO: Operator Enum을 구현하고, 두 수에 대한 사칙연산을 수행하세요.
        // Operator는 ADD(+), SUBTRACT(-), MULTIPLY(*), DIVIDE(/) 연산을 가지며,
        // calculate() 메소드를 통해 두 수에 대한 연산을 수행할 수 있어야 합니다.
        // 사용자로부터 두 수와 연산자를 입력받아 계산 결과를 출력하세요.
        System.out.println("연산자를 입력하세요");
        String Operator = scanner.nextLine();
        System.out.println("연산할 숫자를 입력하세요");
        double operand1 = scanner.nextDouble();
        System.out.println("연산할 숫자를 입력하세요");
        double operand2 = scanner.nextDouble();

        Operations aOperation = Operations.getOperation(Operator);
        double result = aOperation.calculate(operand1, operand2);
        System.out.println("계산 결과는 "+result+"입니다");
        
        scanner.close();
    }
}

enum Weekdays {
    MONDAY("월"),
    TUESDAY("화"),
    WEDNESDAY("수"),
    THURSDAY("목"),
    FRIDAY("금"),
    SATURDAY("토"),
    SUNDAY("일");

    private final String description;

    Weekdays(String description){
        this.description = description;
    }


    public static Weekdays getWeekdayByDescription(String description){
        for (Weekdays weekday : Weekdays.values()) {
            if( description.equals(weekday.description)) {
                return weekday;
            }
        }
        return null;
    }

}

enum Seasons {
    SPRING("새싹이 돋아나요",15),
    SUMMER("초록이 무성해요", 30),
    AUTUMN("낙엽이 물들어요",20),
    WINTER("잎이 떨어지고 가지만 남아요", 5);

    private final String description;
    private final int temperature;

    Seasons(String description, int temperature){
        this.description = description;
        this.temperature = temperature;
    }

    public static Seasons getSeason(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                return Seasons.WINTER;
            case 3:
            case 4:
            case 5:
                return Seasons.SPRING;
            case 6:
            case 7:
            case 8:
                return Seasons.SUMMER;
            case 9:
            case 10:
            case 11:
                return Seasons.AUTUMN;
        }
       return null;
    }

    public String getDescription(){
        return(description);
    }
    public int getTemperature(){
        return (temperature);
    }
}

enum TaskStatus{
    PENDING(){
        @Override
        public TaskStatus nextStatus(String command) {
            if (command.equals("next")) {
                return IN_PROCESS;
            } else if (command.equals("exit")) {
                System.out.println("현재 상태는 " + this.name() + "입니다. 프로세스를 종료합니다");
                return null;
            } else {
                throw new IllegalArgumentException("Invalid Command: " + command);
            }
        }
    },
    IN_PROCESS(){
        @Override
        public TaskStatus nextStatus(String command) {
            if (command.equals("next")) {
                return COMPLETED;
            } else if (command.equals("exit")) {
                System.out.println("현재 상태는 " + this.name() + "입니다. 프로세스를 종료합니다");
                return null;
            } else {
                throw new IllegalArgumentException("Invalid Command: " + command);
            }
        }
    },
    COMPLETED(){
        @Override
        public TaskStatus nextStatus(String command) {
            if (command.equals("next")) {
                return ARCHIVED;
            } else if (command.equals("exit")) {
                System.out.println("현재 상태는 " + this.name() + "입니다. 프로세스를 종료합니다");
                return null;
            } else {
                throw new IllegalArgumentException("Invalid Command: " + command);
            }
        }
    },
    ARCHIVED(){
        public TaskStatus nextStatus(String command) {
            if (command.equals("next")) {
                return PENDING;
            } else if (command.equals("exit")) {
                System.out.println("현재 상태는 " + this.name()+ "입니다. 프로세스를 종료합니다");
                return null;
            } else {
                throw new IllegalArgumentException("Invalid Command: " + command);
            }
        }
    },;

  public abstract TaskStatus nextStatus(String command);

}

enum Operations {
    ADD("+"){
        @Override
        public double calculate(double operand_1, double operand_2){
            return operand_1+operand_2;
        }
    },
    SUBTRACT("-") {
        @Override
        public double calculate(double operand_1, double operand_2) {
            return operand_1 - operand_2;
        }
    },
    MULTIPLY("*") {
        @Override
        public double calculate(double operand_1, double operand_2) {
            return operand_1 * operand_2;
        }
    },
    DIVIDE("/"){
        @Override
        public double calculate(double operand_1, double operand_2){
            return operand_1/operand_2;}
    };

    private final String symbol ;
    Operations (String symbol){
        this.symbol = symbol;
    }

    @Override
    public String toString(){
        return symbol;
    }

    public static Operations getOperation(String symbol) {
        for (Operations operator : Operations.values()) {
            if (operator.symbol.equals(symbol)) {
                return operator;
            }
        }
        throw new IllegalArgumentException("Invalid Symbol: " + symbol);
    }
    public abstract double calculate(double operand_1, double operand_2);
}