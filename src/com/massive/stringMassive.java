package com.massive;

import java.util.Arrays;

public class stringMassive {
    public static void main(String[] args) {
/*        String a = "bla'";
        String b = " lala";
        String c = " bebe";
        String d = ",";
        System.out.println(a + b + d + c);

        String m = "ARRIVA";
        System.out.println(m.charAt(3)); //get back symbol number '3'*/

        /*String name = "Tony, Gennya, Rayan, Antony, Brian";
        System.out.println(Arrays.toString(((String) name).split(",")));
        */

        /*String w = "Sometimes";
        System.out.println(w.charAt(2));

        String a = "10";
        String b = "20";
        System.out.println(a.equals(b));
        */

        String userName = "Иван Иванов";
        String userName2 = "Гиван иванов";
        String wrong = "Выберите другое имя пользователя";
        String ok = "Nice name -_-";

        if (userName.equalsIgnoreCase(userName2)) {
            System.out.println(wrong);
        } else {
            userName.equalsIgnoreCase(userName2);
            System.out.printf(ok);
        }
    }
}
