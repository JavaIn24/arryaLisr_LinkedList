package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> collors = new ArrayList<>();
        collors.add("Синий");
        collors.add("Желтый");
        collors.add("Зеленый");
        collors.add("Ораньжевый");
        collors.add("Черный");
        System.out.println(collorSearh(collors, "Желтый"));
          }



          public static boolean collorSearh (ArrayList<String> listExamp, String a) {
              listExamp.contains(a);
              if (listExamp.contains(a) == true){
                  return true;
              }else {
                  return false;
              }
         }
    }