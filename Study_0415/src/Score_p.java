
public class Score_p {
	String name;
	int kor;
	int eng;
	int math;
	int total;
	int rank;

	public String print() {
		return this.name +" 총점: " + this.total + " 국어 : "+ this.kor + " 영어 : "+ this.eng + " 수학: "+ this.math+" "+(this.rank+1)+"등";
	}
}
