import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args){

        //Arrays
        String[] myStringArray = new String[3];

        myStringArray[0] = "Mustafa";
        myStringArray[1] = "Mehmet";
        myStringArray[2] = "Ahmet";

        System.out.println(myStringArray[0]);
        System.out.println(myStringArray[1]);
        System.out.println(myStringArray[2]);

        int[] myNumberArray = {1,2,3,4,5,6,8};
        System.out.println(myNumberArray[2]);

        //Lists
        ArrayList<String> myMusicians = new ArrayList<String>();

        myMusicians.add("Mustafa");
        myMusicians.add("Mehmet");
        myMusicians.add(1,"Ahmet");
        myMusicians.add("Seda");

        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));

        System.out.println(myMusicians.size());

        //Set
        HashSet<String> mySet = new HashSet<>();
        mySet.add("Mustafa");
        mySet.add("Mustafa");
        System.out.println(mySet.size());

        //Hashmap
        HashMap<String, String> myHashMap = new HashMap<>();
        myHashMap.put("name","Mustafa");
        myHashMap.put("instrument","Guitar");
        System.out.println(myHashMap.get("name"));

        HashMap<String,Integer> mySecondMap = new HashMap<>();
        mySecondMap.put("run",100);
        mySecondMap.put("basketball",200);
        System.out.println(mySecondMap.get("run"));

    }
}
