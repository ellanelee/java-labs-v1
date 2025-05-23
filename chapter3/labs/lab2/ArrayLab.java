package chapter3.labs.lab2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 배열 활용하기 실습
 */
public class ArrayLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 정수형 배열 활용
        System.out.println("===== 정수형 배열 활용 =====");

        // TODO: 5개의 정수를 입력받아 배열에 저장하고, 합계와 평균을 계산하여 출력하세요.
        // 힌트: Scanner를 이용하여 사용자로부터 입력을 받으세요.
        int[] arr1 = new int[5];
        for (int i =0; i<arr1.length ; i++) {
            arr1[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i : arr1) {
            sum += i;
        }
        System.out.println("sum: " + sum);
        System.out.println("average: " + sum / 5);


        // 2. 문자열 배열 활용
        System.out.println("\n===== 문자열 배열 활용 =====");

        // TODO: 5개의 이름을 입력받아 배열에 저장하고, 특정 문자(예: 'A')로 시작하는 이름을 검색하여 출력하세요.
        // 힌트: String 클래스의 startsWith() 또는 charAt() 메소드를 활용하세요.
        scanner.nextLine();
        String[] names = new String[5];
        for (int i=0; i<names.length; i++) {
            names[i] = scanner.nextLine();
        }
        for (String name : names) {
            if(name.startsWith("A")){
                System.out.println("A로 시작하는 이름 출력" + name);
            }
        }
        for (String name : names) {
            char firstChar = name.charAt(0);
            if (firstChar == 'A') {
                System.out.println("A로 시작하는 이름 출력" +name);
            }
        }
        // 3. 배열 정렬
        System.out.println("\n===== 배열 정렬 =====");

        // TODO: 사용자로부터 5개의 정수를 입력받아 배열에 저장한 후, 오름차순으로 정렬하여 출력하세요.
        // 힌트: 이중 반복문을 사용하여 버블 정렬 알고리즘을 구현하거나, Arrays.sort()를 활용하세요.
        int[] arr2 = new int[5];
        for (int i =0; i<arr2.length ; i++) {
            arr2[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 1; j < arr2.length; j++) {
                int previous = arr2[j - 1];
                int current = arr2[j];
                if (current < previous) {
                    arr2[j - 1] = current;
                    arr2[j] = previous;
                }

            }
        }
        for (int i : arr2) {
            System.out.println(i);
        }

        // 4. 2차원 배열을 이용한 행렬 덧셈
        System.out.println("\n===== 2차원 배열을 이용한 행렬 덧셈 =====");
        
        // TODO: 두 개의 2x3 행렬을 입력받아 행렬 덧셈을 수행하고 결과를 출력하세요.
        // 힌트: 중첩 반복문을 사용하세요.
        int[][] arr3= new int[2][3];
        for (int i =0; i<arr3.length; i++){
            for (int j =0; j<arr3[i].length; j++){
                arr3[i][j] = scanner.nextInt();
            }
        }

        int sumOfMatrix=0;
        for(int[] i : arr3){
            for (int j : i) {
               sumOfMatrix += j;
            }
        }

        System.out.println("SumOfMatrix: "+sumOfMatrix);



        // 5. 배열을 이용한 간단한 데이터 분석
        System.out.println("\n===== 배열을 이용한 데이터 분석 =====");
        
        // TODO: 10개의 정수를 입력받아 배열에 저장한 후, 최댓값, 최솟값, 중앙값(또는 평균)을 계산하여 출력하세요.
        // 힌트: 정렬을 활용하면 중앙값을 쉽게 찾을 수 있습니다.
        int[] arr4 = new int[10];

        for (int i=0; i<arr4.length; i++){
            arr4[i]=scanner.nextInt();
        }

        int sum3 = 0;
        for(int i: arr4 ) {
            sum += i;
        }


        int[] newArr4 = Arrays.copyOf(arr4, arr4.length);
        Arrays.sort(newArr4);
        double midIndex = arr4.length/2;
        System.out.println(Arrays.toString(newArr4));
        System.out.println("Sum: "+sum);
        System.out.println("Avg: "+sum/arr4.length);
        System.out.println("Median: "+(newArr4[(int) Math.floor(midIndex)]+newArr4[(int)Math.ceil(midIndex)])/2);

        scanner.close();
    }
} 