import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list_Strings = new ArrayList<>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        //Print the list
        for (String elment : list_Strings)
            System.out.println(elment);

    }
}