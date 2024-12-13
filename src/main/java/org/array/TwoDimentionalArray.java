package org.array;

public class TwoDimentionalArray {

    public void general2DArray(){
        //Multi-dimentional 2d
        int twoD[][]=new int[4][5];
        int i,j;
        int k = 0;
        for(i=0;i < 4;i++)
            for(j=0;j < 5;j++){
                twoD[i][j]=k;
                k++;
            }

        for(i=0;i < 4;i++) {
            for (j = 0; j < 5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }

    public void custom2DArray(){
        //Multi dimentional 2d by allocating separately
        int customTwoD[][]=new int[4][];
        customTwoD[0] = new int[1];
        customTwoD[1] = new int[2];
        customTwoD[2] = new int[3];
        customTwoD[3] = new int[4];

        int a,b;
        int c = 0;
        //setting the value in the memory
        //looping row
        for(a=0;a < 4;a++) {
            //looping column
            for (b = 0; b < a + 1; b++) {
                //setting the value in specified array
                customTwoD[a][b] = c;
                c++;
            }
        }
        for(a=0;a < 4;a++){
            for(b=0;b <a+1 ;b++)
                System.out.print(customTwoD[a][b]+" ");
            System.out.println();
        }
    }

    public void patternArray(){
        char patternArray[][]=new char[5][];
        patternArray[0]=new char[1];
        patternArray[1]=new char[2];
        patternArray[2]=new char[3];
        patternArray[3]=new char[4];
        patternArray[4]=new char[5];

        char i,j;
        char k='*';

        for(i=0;i<5;i++)
            for(j=0;j<i+1;j++){
                patternArray[i][j]=k;
            }
        for(i=0;i<5;i++){
            for(j=0;j<i+1;j++)
                System.out.print(patternArray[i][j] +" ");
            System.out.println();
            }
    }

//    public void trianglePatternArray(){
//        char patternArray[][]=new char[3][];
//        patternArray[0]=new char[1];
//        patternArray[1]=new char[2];
//        patternArray[2]=new char[1];
////        patternArray[3]=new char[4];
////        patternArray[4]=new char[5];
//
//        char i,j;
//        char k='*';
//
//        for(i=0;i<3;i++)
//            for(j=0;j<i+1;j++){
//                if( patternArray[i]!=null){
//                    patternArray[i][j]=k;
//                }
//                else {
//                    patternArray[i][j]=' ';
//                }
//            }
//        for(i=0;i<3;i++){
//            for(j=0;j<i+1;j++)
//            //    if( patternArray[i]!=null) {
//                    System.out.print(patternArray[i][j] + " ");
//              // }
////                else
////                {
////                    System.out.print(" ");
////                }
//            System.out.println();
//        }
//    }
}
