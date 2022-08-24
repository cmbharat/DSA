package array;

public class ArraySineWave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if n==0
				return

			i=0 to m

			j=0 to n -> even j%2==0

			j=n-1 to 0 -> odd j%2 !=0

============================================================================

1 2 3 
4 5 6 
7 8 9

1 2 3 6 9 8 7 4 5
i-> row, j-columns
i=0 and j=0

n * m
a. First row(left to right) j to m-1 [i] => r => j to (m-1)-1 
b. Last column(top to bottom) i to n-1 [m-1] => c => i+1 to (n-1)-1 
c. Last row(right to left) m-1 to j [n-1] => r => (m-1)-1 to j+1
d. First column(bottom to top) n-1 to i+1 [j] => c =>(n-1)-1  to (i+1)+1

n== 0
 return

n*m = 9

c =0, t=n*m

rs=0, cs=0, re=n-1, ce=m-1

while(c<t){

	j= cs;
	while(j<=ce) // left to right
	{
		print(mat[rs][j])
		j++;
		c++;//4
	}
	rs++;//2
	i=rs;
	while (i<=re){// top to bottom
		print(mat[i][ce])
		i++;
		c++;
	}
	ce--;//m-3
	j=ce;
	while(j>=cs){//right to left
		print(mat[re][j])
		j--;
		c++;
	}
	re--;//n-3
	i=re;
	while(i>=rs){
		print(mat[i][cs])
		i--;
		c++
	}
	cs++;
}

	}

}
