import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Matrices
{
	private int rows;
	private int columns;
	private int [][]matrix;//just declaring it
	Matrices()
	{
		rows=0;
		columns=0;
	}
	Matrices(int rows, int columns) //It just creates an matrix based on given inputs for rows and columns
	{
        	this.rows=rows;
        	this.columns=columns;
        	matrix=new int[this.rows][this.columns];
    	}
       // create matrix based on an already created 2d array
    	Matrices(int[][] matrix) 
	{
	        this.rows=matrix.length;
	        this.columns=matrix[0].length;
	        this.matrix=new int[this.rows][this.columns];
	        for (int i=0;i<this.rows;i++)
		{
	            	for (int j=0;j<this.columns;j++)
		    	{
                    		this.matrix[i][j]=matrix[i][j];
    		    	}
		}
	}
     	Matrices(Matrices A) //copy constructor
	{ 
		this(A.matrix); //using the constructor Matrices(int [][])
	}
	void initialization() throws IOException, Exception
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of rows:");
		rows=Integer.parseInt(z.readLine());
		System.out.print("Enter the number of columnss:");
		columns=Integer.parseInt(z.readLine());
		matrix=new int[rows][columns];
		System.out.println("Enter the elements in "+rows+"*"+columns+" matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				matrix[i][j]=Integer.parseInt(z.readLine());
			}
		}
	}
	void inputValue()throws IOException, Exception
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the elements in "+rows+"*"+columns+" matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				matrix[i][j]=Integer.parseInt(z.readLine());
			}
		}
	}
	void createIdentityMatrix()throws IOException, Exception
	{
		BufferedReader z=new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.print("Enter n:");
		n=Integer.parseInt(z.readLine());
		rows=columns=n;
		matrix=new int[rows][columns];
		System.out.println("Enter the elements in "+rows+"*"+columns+" identity matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				if(i!=j)
				{
					matrix[i][j]=0;
				}
				else
				{
					matrix[i][j]=1;
				}
			}
		}
	}	
	Matrices additionOfTwoMatrices(Matrices B)
	{
		Matrices A=this;
		if(A.rows!=B.rows||A.columns!=B.columns)
		{
			 throw new RuntimeException("Illegal matrix dimensions.");
		}
		Matrices C=new Matrices(rows,columns);
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				C.matrix[i][j]=A.matrix[i][j]+B.matrix[i][j];
			}
		}
		return C;
	}
	Matrices subtractionOfTwoMatrices(Matrices B)//performs A-B
	{
		Matrices A=this;
		if(A.rows!=B.rows||A.columns!=B.columns)
		{
			 throw new RuntimeException("Illegal matrix dimensions.");
		}
		Matrices C=new Matrices(rows,columns);
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				C.matrix[i][j]=A.matrix[i][j]-B.matrix[i][j];
			}
		}
		return C;
	}
	Matrices multiplicationOfTwoMatrices(Matrices B)//performs A*B
	{
		Matrices A=this;
		if(A.columns!=B.rows)		
		{
			throw new RuntimeException("Illegal matrix dimensions.");
		}
		Matrices C=new Matrices(A.rows,B.columns);
		for(int i=0;i<A.rows;i++)
		{
			for(int j=0;j<B.columns;j++)
			{
				for(int k=0;k<A.columns;k++)
				{
					C.matrix[i][j]=A.matrix[i][k]*B.matrix[k][j];
				}
			}
		}
		return C;
	}	
	Matrices transposeOfMatrix()
	{
		if(rows!=columns)
		{
			throw new RuntimeException("Transpose operation cannot be performed");
		}
		Matrices B=new Matrices(columns,rows);
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				B.matrix[j][i]=matrix[i][j];
			}
		}
		return B;
	}	
	//I will add the calculateion of x=A-1*B later	
	void showMatrix()
	{
		System.out.println("Display the matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}	
}
class MainsClass
{
	public static void main(String args[])throws IOException,Exception
	{
		Matrices A=new Matrices(2,3);
		A.inputValue();
		Matrices B=new Matrices();
		B.initialization();
		Matrices C=A.additionOfTwoMatrices(B);
		System.out.println("This is A");
		A.showMatrix();
		System.out.println("This is B");
		B.showMatrix();
		System.out.println("This is C");
		C.showMatrix();
		Matrices D=new Matrices(C);
		System.out.println("This is D");
		D.showMatrix();
	}
}
