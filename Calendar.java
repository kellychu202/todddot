import java.io.*;
import java.util.*;

public class Calendar {

   // scanner console for user inputs
   private Scanner console;
   
   // store the hours + activities for the final calendar
   private Map<String, Integer> finalCal;
   
   private List<String> activities;
   
   public Calendar(){
   
   }
   
   // for random
   public void create(List<String> list, int maxHours){
      finalCal = new HashMap<String, Integer>();
      Random rand = new Random();
      int remaining = maxHours;
      while (remaining != 0){
         int hours = rand.nextInt(3) + 1;
         int x = rand.nextInt(list.size());
         if (remaining - hours >= 0){
            remaining = remaining - hours;
            String act = list.get(x);
            finalCal.put(act, hours);
         }
      }
   }
   public void print(){
      for (String x : finalCal.keySet()){
         System.out.println(x + ": " + finalCal.get(x));
      }
   }
}
