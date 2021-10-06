package kyu8.century_from_year;

public class CenturyFromYear {
    public static int century(int number) {
        return (int)Math.ceil((double)number / 100);
    }
}
