package src;

public class MyDuplicates {

    public static void main(String[] args) {

        String str = "Hellow California";
        if (checkDuplicates(str))
            System.out.println("Duplicates");
        else
            System.out.println("No duplicates");
    }

    public static boolean checkDuplicates(String str) {
        String check = "";

        for (int i=0; i <str.length(); i++ ) {
            String c = String.valueOf(str.charAt(i));
            if (check.indexOf(c) > 0) {
                return true;
            } else {
                check += c;
                System.out.println(check);
            }
        }
            return false;
    }
}
