package officeHours;

import java.util.ArrayList;
import java.util.*;
public class SeleniumOH1 {
    /*
    Iterator
    -List,Set,Map and other type of collections
    and use Iterator class to iterate over that collection
    -List has indexes(for i,for each,while,Iterator)
    -Map(for each,Iterator-to loop through keys)

    -Basic Selenium navigation
     */
    public static void main(String[] args) {
        //create arrayList of Strings-iterate over it
        ArrayList<String>keysSearch=new ArrayList<>();

        //iterator()-return type wich we can use with all iterator methods
        keysSearch.add("fruits");
        keysSearch.add("veggies");
        keysSearch.add("berries");
        Iterator <String>iterator=keysSearch.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            //print before modification
            //add* to each string in list and print again
        }
        Iterator <String>iterator1=keysSearch.iterator();
        while(iterator1.hasNext()){
            String item=iterator1.next();
            System.out.println(item);
            System.out.println("*"+item);
        }
        //create a map with <String,String>
        HashMap<String,String>personalInfo=new HashMap<>();
        personalInfo.put("name","Bryan");
        personalInfo.put("studentId","23154595659");
        personalInfo.put("major","computer sience");

        Iterator<String> mapIterator=personalInfo.keySet().iterator();
        while(mapIterator.hasNext()){
            String key=mapIterator.next();
            System.out.println(mapIterator.next()+
            ":"+personalInfo.get(key));
        }
        //===================================
        //SELENIUM
        /*
        id- it is unique(it is not always available)-we always want to use it when available
        class-classname
        name
        tag-every element will have it

        will only work with link
        linktext
        partial linktext

        locator wich has the special cyntax
        css
        xpath

         */

    }
}
