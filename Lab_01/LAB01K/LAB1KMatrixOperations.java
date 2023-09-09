import java.util.*;
public class LAB1KMatrixOperations 
{
    public static void main(String[] args)
    {
        Scanner kb2 = new Scanner(System.in);
        int userChoice = 0;
        System.out.println("******************************");
        System.out.println(" The GRAND MATRIX MULTIPLIER");
        System.out.println("****************************** \n");

        System.out.println("1 = Add two matrices");
        System.out.println("2 = Multiply two matrices");
        System.out.println("3 = Add and Multiply two matrices\n");
        System.out.print("Please select the action you want to perform: ");
        userChoice = kb2.nextInt();
        kb2.close();
        if ( userChoice == 1 )
        {
            double[][] firstMatrix = getMatrix(1);
            double[][] secondMatrix = getMatrix(2);
            if(canAddMatrices(firstMatrix, secondMatrix))
            {
                showMatrix(addMatrices(firstMatrix, secondMatrix));
            }
            else
            {
                System.out.println("You can't add the entered Matrices.");
            }
        }
        else if ( userChoice == 2 )
        {
            double[][] firstMatrix = getMatrix(1);
            double[][] secondMatrix = getMatrix(2);
            if(canMultiplyMatrices(firstMatrix, secondMatrix))
            {
                showMatrix(multiplyMatrices(firstMatrix, secondMatrix));
            }
            else
            {
                System.out.println("You can't multiply the entered Matrices.");
            }
        }
        else if ( userChoice == 3 )
        {
            double[][] firstMatrix = getMatrix(1);
            double[][] secondMatrix = getMatrix(2);
            if(canAddMatrices(firstMatrix, secondMatrix) && canMultiplyMatrices(firstMatrix, secondMatrix))
            {
                System.out.println("The summation result of the two matrices is:");
                showMatrix(addMatrices(firstMatrix, secondMatrix));
                System.out.println("The multiplication result of the two matrices is:");
                showMatrix(multiplyMatrices(firstMatrix, secondMatrix));
            }
            else if(canMultiplyMatrices(firstMatrix, secondMatrix) )
            {
                if(!canAddMatrices(firstMatrix, secondMatrix))
                    {
                        System.out.println("The multiplication result of the two matrices is:");
                        showMatrix(multiplyMatrices(firstMatrix, secondMatrix));
                        System.out.println("The given matrices can't be Added.");
                    }
                
            }
            else 
            {
                System.out.println("The given matrices can't be multiplied or added.");  
            }
            
        }
        else 
        {
            System.out.println("User entered invalid choice exiting the program");
            System.exit(0);
        }
    }

    public static boolean canAddMatrices(double[][] Matrix1, double[][] Matrix2)
    {
        boolean canAdd = true;
        int rowOfMatrixOne = Matrix1.length;
        int rowOfMatrixTwo = Matrix2.length;
        int columnOfMatrixOne = 0;
        int columnOfMatrixTwo = 1;

        if(haveEqualColumns(Matrix1))
        columnOfMatrixOne = Matrix1[0].length;
        else
        return !canAdd;

        if(haveEqualColumns(Matrix2))
        columnOfMatrixTwo = Matrix2[0].length;
        else
        return !canAdd;

        if ((rowOfMatrixOne == rowOfMatrixTwo) && (columnOfMatrixOne == columnOfMatrixTwo))
        return canAdd;
        else
        return !canAdd;
        
    }


    public static boolean haveEqualColumns(double[][] Matrix)
    {
        boolean isequal = true;
        int rowOfMatrix = Matrix.length;
        int columnCounter = 0;
        int previousColumn = Matrix[0].length;
        for (int row = 0 ; row < rowOfMatrix;row++)
        {
            for (double val:Matrix[row])
            columnCounter++;
            if (columnCounter == previousColumn)
            previousColumn = columnCounter;
            else 
            return !isequal;
            columnCounter = 0;

        }return isequal;
    }
    public static double[][] addMatrices(double[][] matrix1, double[][] matrix2)
    {
        int rowNumber = matrix1.length;
        int columnNumber = matrix1[0].length;
        double[][] newMatrix =  new double[rowNumber][columnNumber];
        for(int row = 0 ; row < rowNumber ; row++)
        {
            for (int column = 0 ; column < columnNumber ; column++)
            {
                newMatrix[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        } return newMatrix;
    }

    public static boolean canMultiplyMatrices(double[][] matrix1, double[][] matrix2)
    {
        boolean canMultilpy = true;
        int rowOfMatrixTwo = 0;
        int columnOfMatrixOne = 1;
        if (haveEqualColumns(matrix2) && haveEqualColumns(matrix1))
        {
            rowOfMatrixTwo = matrix2.length;
            columnOfMatrixOne = matrix1[0].length;
        }
        else
        return !canMultilpy;

        if(rowOfMatrixTwo == columnOfMatrixOne)
        return canMultilpy;
        else
        return !canMultilpy;
    }

    public static double[][] multiplyMatrices(double[][] matrix1, double[][] matrix2)
    {
        int rowOfMatrixOne = matrix1.length;
        int rowOfMatrixTwo = matrix2.length;
        int columnOfMatrixTwo = matrix2[0].length;
        
        double eachValue = 0;
        double[][] newMatrix =  new double[rowOfMatrixOne][columnOfMatrixTwo];
        for (int row = 0 ; row < rowOfMatrixOne ;  row++)
        {
            for (int column = 0 ; column < columnOfMatrixTwo; column++)
            {
                for( int k = 0 ; k < rowOfMatrixTwo; k++)
                {
                    eachValue += matrix1[row][k]*matrix2[k][column];
                }
                newMatrix[row][column] = eachValue;
                eachValue = 0;
            }
        }return newMatrix;
    }

    public static void showMatrix(double[][] theMatrix)
    {
        int row = theMatrix.length;
        int column = theMatrix[0].length;
        for(int i = 0 ; i < row;i++)
        {
            System.out.print("[ ");
            for (int j = 0; j < column ; j++)
            {
                System.out.print(theMatrix[i][j]+"  ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
    public static double[][] getMatrix(int matrixNumber)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("\nPlease enter the number of rows of the matrix "+ matrixNumber+" : ");
        int rows = kb.nextInt();
        System.out.print("Please enter the number of columns of the matrix "+ matrixNumber+" : ");
        int columns = kb.nextInt();
        double[][] newMatrix  = new double[rows][columns];
        for (int i = 1 ; i < rows+1 ;i++)
        {
            for ( int j = 1 ; j < columns+1 ; j++)
            {
                System.out.println("\nPlease enter values of matrix " + matrixNumber);
                System.out.print("at row " + i + " and column " + j +" : ");
                newMatrix[i-1][j-1] = kb.nextDouble();
                System.out.println();
            }
        }
        kb.close();
        return newMatrix;
    }
}
