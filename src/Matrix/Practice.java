package Matrix;

import java.io.IOException;
import java.util.*;

public class Practice {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("123");

        String s = "left";

        switch (s){
            case "le":
                System.out.println("name");
        }

//        Practice2 a = Practice2.getInstance();
//        List<String> list = new ArrayList<>();
//        list.add("naem");
//        list.add("2");
//        list.add("n3aem");

   //     list.add("na4em");
//      Iterator<String>  i =  list.iterator();
//        System.out.println(list.get(3));
//      while (i.hasNext()){
//          String o = i.next();
//          System.out.println(o);
//      }
//
//        System.out.println(list.get(3));


    try{

        try{
            System.out.println(5/0);
        }catch (NullPointerException exception){
            System.out.println(exception);
        }

    }catch (Exception exception){
        System.out.println(exception);
    }


    }

}
