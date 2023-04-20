package string;

public class StringDemo2 {
    public static void main(String[] args) {
        String firstname="Salma";
        String lastname= " Akter";

        String fullname= firstname + lastname;
        System.out.println(fullname);

        //or
        String fullName= firstname.concat(lastname);
        System.out.println(fullName);

        String upperName=firstname.toUpperCase();
        System.out.println(upperName);

        String lowerName= firstname.toLowerCase();
        System.out.println(lowerName);

        boolean b= firstname.startsWith("S");
        System.out.println(b);

        boolean c= firstname.endsWith("e");
        System.out.println(c);

        String[]names={"Salma","Akter","Nazmul","Hossain"};
        for (String x:names) {
            System.out.println(x);
        }
    }
}
