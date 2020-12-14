package testscorearray;

import java.util.Random;

public class TestScoreArrayMethod {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = 5; //配列個数
		int[] scores = new int[num];
		int sum = 0;
		int max = 0;
		double average = 0;
		
		scores = randScores(num); //randScoresメソッドの戻り値をscores代入
		sum = sumScores(scores); //scores配列のデータをすべて足すメソッドの実行
		average = aveScores(sum,num);
		max = maxScores(scores);
		showResult(scores,sum,average,max);
	}

	public static int[] randScores(int num) { //乱数で配列に値をセットし返すメソッド（戻り値は配列型）
		int[] randScores = new int[num]; //引数で指定された個数の配列作成
		Random rand = new Random();
		for(int i=0;i<randScores.length;i++) {
			randScores[i] = rand.nextInt(101);
			//System.out.println(i + "番目の点数:" + randScores[i]);
		}
		return randScores;
	}
	
	public static int sumScores(int[] scores) { //配列を引数として中身のデータをすべて足すメソッド
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			sum += scores[i];
		}
		return sum;
	}
	
	public static double aveScores(int sum,int num) { //配列の個数と合計から平均値を求めるメソッド
		double average = 0;
		average = (double)sum/num;
		return average;
	}
	
	public static int maxScores(int[] scores) {
		int max = 0;
		for(int i=0;i<scores.length;i++) {
			if(max < scores[i]) {
				max = scores[i];
			}
		}
		return max;
	}
	
	public static void showResult(int[] scores,int sum,double average,int max) { //結果を表示するメソッド
		for(int i=0;i<scores.length;i++) {
			System.out.println((i+1) + "番目の点数:" + scores[i]);
		}
		System.out.println( "合計は：" + sum );
		System.out.println( "平均は：" + average );
		System.out.println("最高は" + max);
	}

}
