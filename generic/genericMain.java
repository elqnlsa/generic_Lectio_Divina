package generic;

public class genericMain {
    public static void main(String[] args, genericClass<String, CharSequence> idinsta) {
        genericClass<String, CharSequence> nama = new genericClass<>("Kim", "kim05");

        System.out.println(nama.getNama());
        System.out.println(idinsta.getIdInsta());
    }
}
