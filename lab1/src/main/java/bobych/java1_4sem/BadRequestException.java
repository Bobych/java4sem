package bobych.java1_4sem;

public class excepetion {
    static public int isValueA(String a) {
        double doubleA;
        try {
            doubleA = Double.parseDouble(a);
        } catch (NumberFormatException e) {
            return -1;
        }

        if (doubleA <= 0) {
            return -2;
        }
        return 0;
    }

    static public int isValueB(String b) {
        double doubleB;
        try {
            doubleB = Double.parseDouble(b);
        } catch (NumberFormatException e) {
            return -1;
        }

        if (doubleB <= 0) {
            return -2;
        }
        return 0;
    }
    static public int isValueC(String c) {
        double doubleC;
        try {
            doubleC = Double.parseDouble(c);
        } catch (NumberFormatException e) {
            return -1;
        }

        if (doubleC <= 0) {
            return -2;
        }
        return 0;
    }

    static public int isExist(String a, String b, String c){
        double doubleA = Double.parseDouble(a);
        double doubleB = Double.parseDouble(b);
        double doubleC = Double.parseDouble(c);

        if(doubleA + doubleB <= doubleC || doubleA + doubleC <= doubleB || doubleB + doubleC <= doubleA){
            return -1;
        }
        return 0;
    }
}