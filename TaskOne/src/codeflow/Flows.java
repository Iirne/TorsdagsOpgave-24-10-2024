package codeflow;

public class Flows {

    public void methodA(String input) {
        System.out.println("j");
        if (!input.equals("start")) {
            System.out.println("b");
            methodB("start");
        } else {
            System.out.println("a");
          //  System.out.println(methodC(input));

        }
        System.out.println("v");
    }

    public void methodB(String start) {
        System.out.println("a");
    }

    public int methodC(String input) {
        System.out.println("e");
        methodD(input.length());
        return input.length() * 2;
    }

    public void methodD(int number) {

        if (number < 24) {
            System.out.println("r");
            System.out.println("s");
            System.out.println("j");
        }
        else {
            System.out.println("o");
            System.out.println("v");
            System.out.println("t");
        }


    }


}
