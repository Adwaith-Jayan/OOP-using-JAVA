/* MAtrix multuplication */

class Matrix
{
	int[][] mat=new int[10][10];
	//int[][] result=new int[10][10];
	public Matrix(int matA[][])
	{
		this.mat=matA;
	}
	void multiply(int[][] A,int[][] B)
	{
		int i,j,k;
		for(i=0;i<3;i++)
		{
			for(j=0;j<2;j++)
			{
				this.mat[i][j]=0;
				for(k=0;k<2;k++)
					this.mat[i][j]+=A[i][k]*B[k][j];
			}
		}
	}
}
class Matmul
{
	public static  void main(String[] args)
	{
		int i,j;
		int[][] matA={{1,2},{3,4},{5,6}};
		int [][] matB={{1,0},{0,1}};
		int[][] matC=new int[10][10];
		matC[0][0]=0;
		Matrix mat1;
		mat1=new Matrix(matA);
		Matrix mat2;
		mat2=new Matrix(matB);
		Matrix mat3;
		mat3=new Matrix(matC);

		mat3.multiply(mat1.mat,mat2.mat);
		for(i=0;i<3;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(mat3.mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
