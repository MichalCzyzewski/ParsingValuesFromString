package pl.mczyzewski;

public class Main {

    public static void main(String[] args) {


        String number = "2018";
        System.out.println("Numbber as String : " + number);
        int intNumber = Integer.parseInt(number);
        System.out.println("Number as Integer  : " + intNumber);
        number += 1;
        intNumber +=1;
        System.out.println("============================");
        System.out.println("Number as String " + number);
        System.out.println("Number as Integer " + intNumber);

    }
}
