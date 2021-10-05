package kyu7.convert_linked_list_to_string;

public class StringifyRecursion {
    public static String stringify(Node list) {
        return (list == null) ? "null" : list.getData() + " -> " + stringify(list.getNext());
    }
}