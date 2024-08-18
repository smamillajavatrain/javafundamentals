package com.sssvt.general.javaprogram.loopcontrol;

public class MultiplicationTableDemo {

    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.print(j+ "* "+i+ " = "+ (i*j));
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}
