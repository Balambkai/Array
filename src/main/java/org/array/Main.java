package org.array;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        OneDimentionalArray array = new OneDimentionalArray();
        array.classicAverage();

       TwoDimentionalArray twoDimentionalArray=new TwoDimentionalArray();
       twoDimentionalArray.custom2DArray();
       System.out.println();
       twoDimentionalArray.general2DArray();
       System.out.println();
       twoDimentionalArray.patternArray();
       System.out.println();
      // twoDimentionalArray.trianglePatternArray();

       ThreeDArray threeDArray=new ThreeDArray();
       threeDArray.general3DArray();

       int a=1;
       int b=2;
       int c;
       int d;
       c=++b;
       d=a++;
       c++;
        System.out.println("a ="+a);
        System.out.println("b ="+b);
        System.out.println("c ="+c);
        System.out.println("d ="+d);
    }


}