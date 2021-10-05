package kyu7.convert_linked_list_to_string;

public class StringifyLoop {
    public static String stringify(Node list) {
        String result = "";

        while (list != null) {
            result += list.getData() + " -> ";
            list = list.getNext();
        }
        result += "null";
        
        return result;
    }
}