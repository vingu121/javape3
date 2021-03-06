package com.stackroute;

import static org.junit.Assert.*;
import org.junit.Test;


public class MatrixTest
{
Matrix matrix=new Matrix();

@Test

    public void matrixAdd()
{
    int[][] result = matrix.addMatrix(new int[][]{{1,2},{3,4},{5,6}},new int[][]{{9,8},{7,6},{5,4}});
    assertArrayEquals(new int[][]{{10,10},{10,10},{10,10}},result);
    }

    @Test
   public void matrixAdd1()
   {
     int[][] result1=matrix.addMatrix(new int[][]{{1,2},{1,2},{3,4}},new int[][]{{1,1},{1,0},{2,3}});
   assertArrayEquals(new int[][]{{2,3},{2,2},{5,7}},result1);
   }

   @Test
    public void matrixAddFail()
   {
       int[][] result2=matrix.addMatrix(new int[][]{{3,4},{6,7},{2,3}},new int[][]{{1,2},{2,1},{5,3}});
    assertNotEquals(new int[][]{{4,6},{8,8},{7,6}},result2);
}
}
