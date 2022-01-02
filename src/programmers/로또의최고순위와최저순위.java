package programmers;

public class 로또의최고순위와최저순위 {
	public int[] solution(int[] lottos, int[] win_nums) {
		int zero = 0;
		int matched = 0;

		for(int lotto : lottos) {
			if(lotto == 0) zero++;
			else {
				for(int win : win_nums) {
					if(lotto == win) {
						matched++;
						break;
					}
				}
			}
		}

		int min = matched;
		int max = matched + zero;

		int[] answer = {Math.min(7-max, 6), Math.min(7-min, 6)};
		return answer;
	}
}
