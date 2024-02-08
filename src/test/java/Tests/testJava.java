package Tests;

import java.util.ArrayList;
import java.util.List;

public class testJava {

   int i = 1;
   double x = 2;

   double t = i + x;

   public boolean isArmstrongNumber(int numberToCheck) {
      List<Integer> intList = new ArrayList<>();
      int count = 0;
      while (numberToCheck > 0) {
         numberToCheck = numberToCheck / 10;
         intList.add(numberToCheck);
         count++;
      }
      int total = 0;
      for (int i = 0; i < intList.size(); i++) {
         intList.get(i);
         total += intList.get(i)^count;
      }
      if (total == numberToCheck)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}



