package kim;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		
		
//		Dice 클래스 작성: Dice 클래스를 작성하여 주사위 객체를 생성합니다. 주사위는 1부터 6까지의 숫자를 랜덤하게 반환하는 roll() 메서드를 포함합니다.
//		게임 클래스 작성: Game 클래스를 작성하여 게임 객체를 생성합니다. 게임은 두 명의 플레이어가 번갈아가며 주사위를 굴리는 것으로 구성됩니다.
//		사용자 입력 처리: 게임에서 사용자 입력을 처리하기 위해 Scanner 클래스를 사용합니다. 각 턴에서 사용자에게 주사위를 굴리는 것을 입력받고, 결과를 출력합니다.
//		승자 결정: 게임은 두 플레이어 중 하나가 20 이상의 숫자를 얻을 때까지 진행됩니다. 승자는 먼저 20 이상의 숫자를 얻은 플레이어입니다.
        int[] score = new int[6];
        
		Scanner scan = new Scanner(System.in);
		System.out.println("플레이어 숫자를 입력하세요");
		
			 int player = scan.nextInt();
			
		for (int i=0; i<score.length; i++) {
			score[i] =i+1;
			
			int num = (int)(Math.random()*6+1);
			score[i] = num;
			int sum = i+i;
			 System.out.println(i+1+"번째 주사위 값은 : "+score);
			 if(sum > 20) {
				 System.out.println("승리");
				 
		} else {
			System.out.println("패배");
		}
		
		} 
		
		
	}
}
