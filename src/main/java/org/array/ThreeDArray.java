package org.array;

public class ThreeDArray {
    public void general3DArray(){
        //Multi-dimentional 3d
        int threeD[][][]=new int[4][5][6];
        int i,j;
        int k;
        for(i=0;i < 4;i++)
            for(j=0;j < 5;j++)
                for(k=0;k<6;k++)
                threeD[i][j][k]=i*j*k;



        for(i=0;i < 4;i++) {
            for (j = 0; j < 5; j++) {
                for (k = 0; k < 6; k++)
                    System.out.print(threeD[i][j][k] + " ");
                System.out.println();
            }
                System.out.println();
            }
        }
    }

