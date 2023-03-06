package basic.array;



public class Array2dAns {

	public static void main(String[] args) {

		int[][] score = {
				{79,80,99}, //A학생
				{95,85,89}, //B학생
				{90,65,56}, //C학생
				{69,78,77},	//D학생
				//3과목
		};

		String[] stuName = {"A학생","B학생","C학생","D학생"};
		String[] subName = {"국어","영어","수학"};


		double totalAvg = 0.0;
		int idx = 0;
		for(int[] stu: score){
			int total = 0;
			for(int s:stu){
				total += s;

			}
			double avg = (double)total / subName.length ;
			totalAvg += avg;
			System.out.printf("%s의 평균점수: %.1f\n",stuName[idx],avg);
			idx++;
		}
		System.out.println();
		
		
		double classAvg = totalAvg / stuName.length;
		System.out.printf("우리반 평균: %.1f\n",classAvg);
		
		

	}//main

}
