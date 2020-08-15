import java.util.*;
import java.io.*;

public class CalendarMain {
   // max hours they want to have planned
   public static final int MAX_HOURS = 13;
   
   // the list of activities 
   public static final String FILE = "activities.txt";
   public static void main(String[] args) throws FileNotFoundException {
      File text = new File(FILE);
      Scanner s = new Scanner(text);
      List<String> activities = new ArrayList<String>();
      while (s.hasNextLine()){
         String act = s.nextLine();
         activities.add(act);
      }
      
      Calendar cal = new Calendar();
      cal.create(activities, MAX_HOURS);
      cal.print();
   }
}