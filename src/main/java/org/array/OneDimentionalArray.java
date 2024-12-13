package org.array;

public class OneDimentionalArray {

    public void classicAverage(){

        //One dimentional array
        //Average of given numbers
        Double d[]={10.12,13.4,15.6,11.2,19.0};
        double result = 0;
        for(int i=0;i<5;i++){
            result=result+d[i];
        }
        System.out.println("Average of the given number is: " +result/5);

        //Average of given numbers using scanner


    }
}
