import java.io.*;
import java.util.*;

public class Calendar {

   // scanner console for user inputs
   private Scanner console;
   
   // store the hours + activities for the final calendar
   private Map<String, Double> finalCal;
   
   private Random rand; 
   
   public Calendar(){
      finalCal = new HashMap<String, Double>();
      rand = new Random();
   }
   
   // for random
   public void create(List<String> list, double maxHours){
       double remaining = maxHours;
       while (remaining > 0){
          double hours = (rand.nextInt(6) + 1) * 0.5;
          int x = rand.nextInt(list.size());
          if (remaining - hours >= 0){
             remaining = remaining - hours;
             String act = list.get(x);
             list.remove(x);
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
