package practice002.addbinary;

public class AddBinary {
    static String add(String a, String b) {
        int tempMemory = 0;
        StringBuilder result = new StringBuilder();
        int i = 0;
        int aLength = a.length();
        int bLength = b.length();
        while (i < aLength || i < bLength) {
            char aTemp = (i < aLength) ? a.charAt(aLength - (i + 1)) : '0';
            char bTemp = (i < bLength) ? b.charAt(bLength - (i + 1)) : '0';

            int sum = (aTemp - 48) + (bTemp - 48) + tempMemory;

            if (sum == 0) {
                result.append('0');
            } else if (sum == 1) {
                 result.append('1');
            } else if (sum == 2) {
                result.append('0');
                tempMemory = 1;
            } else if (sum == 3) {
                result.append('1');
                tempMemory = 1;
            }
            i++;
        }
        if (tempMemory == 1){
            return result.append(tempMemory).reverse().toString();
        }
        return result.reverse().toString();
    }
    /*static String add(String a, String b) {
        System.out.println((int) a.charAt(0) + "  " + (int) b.charAt(0));
        if ((a.length() + b.length() > 2)) {
            if (((int) a.charAt(0) == 48) && ((int) b.charAt(0) == 48)) {
                return "0";
            }
        }
        BigInteger inta = new BigInteger(String.valueOf(a), 2);
        BigInteger intb = new BigInteger(String.valueOf(b), 2);
        BigInteger binary = inta.add(intb);
        BigInteger temp;
        String result = "0";
        while (binary.signum() != 0) {
            temp = binary.mod(BigInteger.valueOf(2));
            try {
                result = temp + result;
            } catch (Exception e) {
                return result;
            }
            binary = binary.divide(BigInteger.valueOf(2));
        }
        if (result.equals("0")) {
            return result;
        }
        return result.substring(0, result.length() - 1);

    }*/
    /*
    static String add(StringBuilder a, StringBuilder b) {
        BigInteger inta = new BigInteger(String.valueOf(a), 2);
        BigInteger intb = new BigInteger(String.valueOf(b), 2);
        BigInteger binary = inta.add(intb);
        BigInteger temp;
        String result = "";
        while (binary.signum() != 0) {
            temp = binary.mod(BigInteger.valueOf(2));
            try {
                result = temp + result;
            } catch (Exception e) {
                return result;
            }
            binary = binary.divide(BigInteger.valueOf(2));
        }
        if (result == "") {
            return "0";
        }
        return result;
    }
    */

    /*
    static String add(String a, String b) {
        String result = "";
        int upRegister = 0;
        char char1;
        char char2;
        while (a.length() != b.length()) {
            if (a.length() > b.length()) {
                b = '0' + b;
            } else {
                a = '0' + a;
            }
        }
        for (int i = 0; i < a.length(); i++) {
            char1 = a.charAt(a.length() - (i + 1));
            char2 = b.charAt(a.length() - (i + 1));
            if ((char1 == '1') && (char2 == '1')) {
                if (upRegister == 1) {
                    result = '1' + result;
                } else {
                    result = '0' + result;
                    upRegister = 1;
                }
            }
            if ((char1 == '0') && (char2 == '0')) {
                if (upRegister == 1) {
                    result = '1' + result;
                    upRegister = 0;
                } else {
                    result = '0' + result;
                }
            }
            if (((char1 == '0') && (char2 == '1')) || ((char1 == '1') && (char2 == '0'))) {
                if (upRegister == 1) {
                    result = '0' + result;
                } else {
                    result = '1' + result;
                }
            }
        }
        if (upRegister == 1) {
            result = '1' + result;
        }
        return result;
    }*/
}
