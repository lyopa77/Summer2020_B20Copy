package day48_Inheritance;

class A{
     static int a = 10;

}

class B extends A{
    static int b = 20;
    /*
    variables: a, b
     */

}

class C extends B{
  static int c = 30;
    /*
    variables: a, b, c
     */

}

public class Inheritance1 {

    public static void main(String[] args) {
        System.out.println(C.a +" "+ C.c+ " "+C.b);
    }

}
