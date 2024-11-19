import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listStrings = new ArrayList<>();
//        listStrings.add(0, "Pink");
        listStrings.add("Red");
        listStrings.add("Green");
        listStrings.add("Orange");
        listStrings.add("White");
        listStrings.add("Black");

        //Print the list
        for (String elment : listStrings)
            System.out.println(elment);
        //Retrieve an element

//        System.out.println("The first element of this list is: " + listStrings.get(0));
//        System.out.println("The third element of this list is: " + listStrings.get(2));
        listStrings.set(2, "Sliver");
        System.out.println("The 2nd version of array list is: " + listStrings);

        listStrings.remove(2);
        System.out.println(listStrings);

    //search element
    if (listStrings.contains("Red")) {
        System.out.println("Found the element");
    }
    else
        System.out.println("Not found the element");

    }
}

