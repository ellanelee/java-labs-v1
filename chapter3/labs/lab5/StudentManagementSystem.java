package chapter3.labs.lab5;

import java.util.Scanner;

/**
 * 학생 성적 관리 프로그램 (종합 프로젝트)
 */
public class StudentManagementSystem {
    // TODO: 학생 성적 등급을 나타내는 Grade Enum을 정의하세요.
    // A(90-100), B(80-89), C(70-79), D(60-69), F(0-59) 등급이 있어야 합니다.
    
    // 최대 학생 수
    private static final int MAX_STUDENTS = 100;
    
    // 학생 정보 배열
    private static String[] names = new String[MAX_STUDENTS]; // 이름 배열
    private static int[] scores = new int[MAX_STUDENTS]; // 성적 배열
    private static int studentCount = 0; // 현재 저장된 학생 수
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        System.out.println("===== 학생 성적 관리 프로그램 =====");
        
        while (running) {
            printMenu();
            int choice = getMenuChoice(scanner);
            
            switch (choice) {
                case 1:
                    // TODO: 성적 입력 기능을 구현하세요.
                    // 학생 이름과 성적을 입력받아 배열에 저장합니다.
                     studentCount++;
                     System.out.println("학생의 이름을 입력하세요");
                     names[studentCount] = scanner.nextLine();
                    System.out.println("학생의 성적을 입력하세요");
                    scores[studentCount] = scanner.nextInt();
                    System.out.println(names[studentCount]+" 학생의 성적이 "+scores[studentCount]+" 로 입력되었습니다");

                    break;
                case 2:
                    // TODO: 성적 수정 기능을 구현하세요.
                    // 학생 이름을 입력받아 해당 학생의 성적을 수정합니다.
                    System.out.println("성적을 정정합니다. 해당 학생의 이름을 입력하세요");
                    String studentName = scanner.nextLine();
                    int studentIndex = findIndexOfStudent(studentName);
                    System.out.println(studentName+" 학생의 성적은 "+scores[studentIndex]+"로 기록되었습니다.수정하시겠습니까?");
                    boolean confirm = scanner.nextBoolean();
                    if(confirm) {
                        scores[studentIndex] = scanner.nextInt();
                        System.out.println(studentName+"학생의 성적을 "+ scores[studentIndex]+" 점으로 정정합니다");
                    }



                    break;
                case 3:
                    // TODO: 성적 조회 기능을 구현하세요.
                    // 모든 학생의 이름, 성적, 등급을 출력합니다.
                    // 전체 성적의 합계, 평균, 최고 성적, 최저 성적도 출력합니다.



                    break;
                case 4:
                    // TODO: 검색 기능을 구현하세요.
                    // 학생 이름을 입력받아 해당 학생의 성적과 등급을 조회합니다.
                    String studentNameforConfirmation = scanner.nextLine();



                    break;
                case 5:
                    // TODO: 통계 기능을 구현하세요.
                    // 등급별 학생 수와 비율을 출력합니다.
                    
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    running = false;
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다. 다시 선택해주세요.");
                    break;
            }
        }
        
        scanner.close();
    }
    
    // 메뉴 출력 메소드
    private static void printMenu() {
        System.out.println("\n===== 메뉴 =====");
        System.out.println("1. 성적 입력");
        System.out.println("2. 성적 수정");
        System.out.println("3. 성적 조회");
        System.out.println("4. 학생 검색");
        System.out.println("5. 통계 보기");
        System.out.println("6. 종료");
        System.out.print("메뉴를 선택하세요: ");
    }
    
    // 메뉴 선택 입력 메소드
    private static int getMenuChoice(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine(); // 버퍼 비우기
            return -1; // 잘못된 입력
        } finally {
            scanner.nextLine(); // 버퍼 비우기
        }
    }
    
    // TODO: 성적으로부터 등급을 계산하는 메소드를 구현하세요.
    // 입력받은 성적에 따라 Grade Enum 상수를 반환합니다.
    public static Grade getGrade(int score){
       Grade personalGrade = Grade.getGradeFromScore(score);
       return personalGrade;
    }
    
    // TODO: 전체 성적의 합계를 계산하는 메소드를 구현하세요.
    public int sumOfStudents(){
        int sum = 0;
        for(int score: scores){
            sum += score;
        }
        return sum;
    }
    
    // TODO: 전체 성적의 평균을 계산하는 메소드를 구현하세요.
    public double averageScore() {
        int sum = 0;
        double average = 0;
        for(int score: scores){
            sum += score;
        }
        average = sum /scores.length;
        return average;
    }
    
    // TODO: 최고 성적을 찾는 메소드를 구현하세요.
    public int maxScore(){
        int maxScore = Integer.MIN_VALUE;
        for(int score: scores) {
            if (score > maxScore) {
                maxScore = score;
            }
        }
        return maxScore;
    }
    
    // TODO: 최저 성적을 찾는 메소드를 구현하세요.
    public int minScore(){
        int minScore = Integer.MAX_VALUE;
        for(int score: scores) {
            if (score < minScore) {
                minScore = score;
            }
        }
        return minScore;
    }
    
    // TODO: 학생 이름으로 배열에서 위치(인덱스)를 찾는 메소드를 구현하세요.
    public static int findIndexOfStudent(String name) {
        for (int i = 0; i < MAX_STUDENTS; i++) {
            if (names[i].equals(name)) {
                return i;
            }
        }
        return 0;
    }
}
