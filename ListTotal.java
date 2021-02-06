//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListTotal
{
 public static int total( List<Integer> ray )
 {
   //declare int total variable
  int total = 0;
  //for loop from 0 to the size of the array list
  for(int i = 0; i < ray.size(); i++) {
    //add element of arraylist to total
    total += ray.get(i);
  }
  //print total
  return total;
 }
}