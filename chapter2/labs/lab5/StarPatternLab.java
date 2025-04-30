package chapter2.labs.lab5;

import java.util.Scanner;

/**
 * 별표(*) 패턴 출력 실습
 */
public class StarPatternLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("패턴 출력을 위한 높이를 입력하세요: ");
        int height = scanner.nextInt();
        
        // 1. 직각삼각형 패턴 (왼쪽 정렬)
        System.out.println("\n1. 직각삼각형 패턴 (왼쪽 정렬)");
        // 예시 (높이 5):
        // *
        // **
        // ***
        // ****
        // *****
        
        // TODO: 위와 같은 패턴을 출력하세요.
        for (int i=1; i <= height; i++){
            for(int j=0; j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. 직각삼각형 패턴 (오른쪽 정렬)
        System.out.println("\n2. 직각삼각형 패턴 (오른쪽 정렬)");
        // 예시 (높이 5):
        //     *
        //    **
        //   ***
        //  ****
        // *****
        
        // TODO: 위와 같은 패턴을 출력하세요.
        for (int i=1; i <= height; i++) {
            int emptySpace = height-i ;
            for (int j = 1; j <= height; j++) {
                if (j <= emptySpace) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        // 3. 피라미드 패턴
        System.out.println("\n3. 피라미드 패턴");
        // 예시 (높이 5):
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        
        // TODO: 위와 같은 패턴을 출력하세요.
        int fullLength = height*2-1 ;
        for (int i=0; i < height; i++) {
            for (int j = 0; j < fullLength; j++) {
                int startStarPositon = height-i-1;
                int endStarPosition = height+i-1;
                if (j < startStarPositon ) {
                    System.out.print(" ");
                } else if( j > endStarPosition ) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //1번째 : i=0, j=0, s=5-0, e=5-0
        // 4. 역삼각형 패턴
        System.out.println("\n4. 역삼각형 패턴");
        // 예시 (높이 5):
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        
        // TODO: 위와 같은 패턴을 출력하세요.
        for (int i=0; i < height; i++) {
            for (int j = 0; j < fullLength; j++) {
                int startStarPosition = i;
                int endStarPosition = fullLength-i-1;
                if (j < startStarPosition ) {
                    System.out.print(" ");
                } else if( j > endStarPosition ) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //

        // 5. 다이아몬드 패턴
        System.out.println("\n5. 다이아몬드 패턴");
        // 예시 (높이 5, 실제 높이는 9):
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        
        // TODO: 위와 같은 패턴을 출력하세요.

        //fullLength기준으로 증가, i=height-1일때, 기준을 가지고 감소;
        int fullHeight = height*2 -1 ;
        int halfHeight = fullHeight/2;
        for(int i=0; i<halfHeight; i++){
            int blankPosition = height-i-1;
            int starsEndPosition = fullHeight-blankPosition;
            for (int j = 0; j < fullHeight; j++) {
                if (j <= blankPosition-1) {
                    System.out.print(" ");
                }else if(j <= starsEndPosition-1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i=0; i < height; i++) {
            //6층부터는 4층과 같은 양상
            int blankPosition = i;
            int starsPosition = fullHeight-(i)*2 + blankPosition;
            for (int j = 0; j < fullHeight; j++) {
                if (j <= blankPosition-1) {
                    System.out.print(" ");
                }else if(j <= starsPosition-1 ) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        // 6. 모래시계 패턴
        System.out.println("\n6. 모래시계 패턴");
        // 예시 (높이 5, 실제 높이는 9):
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        
        // TODO: 위와 같은 패턴을 출력하세요.
        for(int i=0; i<halfHeight; i++){
            int blankPosition = height-i-1;
            int starsEndPosition = fullHeight-blankPosition;
            for (int j = 0; j < fullHeight; j++) {
                if (j <= blankPosition-1) {
                    System.out.print(" ");
                }else if(j <= starsEndPosition-1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=0; i<height; i++){
            int blankPosition = i;
            int starsPosition = fullHeight-blankPosition;
            for (int j = 0; j < fullHeight; j++) {
                if (j <= blankPosition-1) {
                    System.out.print(" ");
                }else if(j <= starsPosition-1 ) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }



        // 7. 숫자 피라미드 패턴
        System.out.println("\n7. 숫자 피라미드 패턴");
        // 예시 (높이 5):
        //     1
        //    121
        //   12321
        //  1234321
        // 123454321
        
        // TODO: 위와 같은 패턴을 출력하세요.
        for(int i=0; i<height; i++){
            int blankPosition = height-i-1;
            int starsEndPosition = fullHeight-blankPosition;
            for (int j = 0; j < fullHeight; j++) {
                if (j <= blankPosition-1) {
                    System.out.print(" ");
                }else if(j <= starsEndPosition-1) {
                    int position=Math.abs(5-j-1) ;
                    System.out.print(position);
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
} 