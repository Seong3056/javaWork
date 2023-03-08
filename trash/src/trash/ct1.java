package trash;

public class ct1 {
	public static void main(String[] args) {
					//j  0  1  2  3  4        i
		int[][] a = {	{1, 1, 1, 1, 1},	//0
						{1, 1, 1, 1, 1}, 	//1
						{1, 1, 1, 1, 1}, 	//2
						{1, 1, 1, 1, 1}, 	//3
						{1, 1, 1, 1, 1}};	//4
		// 23
		//12,22,32 ,31,33 ,14,24,34
		//123 234
		int count =0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i][j]==1) {
					System.out.printf("%d %d\n",i,j);
					for(int k=(i-1>0?i-1:0);k<(i+2<5?i+2:5);k++) {
						for(int h=(j-1>0?j-1:0);h<(j+2<5?j+2:5);h++) {
							if(a[k][h]!=1)	a[k][h] = 2;
						}
					}
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
			
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a.length;j++)
				if(a[i][j]==0) count++;
		System.out.println(count);
	}
}
