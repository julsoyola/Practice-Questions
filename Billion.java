import java.io.*; 
import java.util.*;
// Add any extra import statements you may need here


class Main {

  // Add any helper functions you may need here
  

  int getBillionUsersDay(float[] growthRates) {
    // Write your code here
    
    int days = 0;
    double users = 0;
    
    // we could store each inv app and keep a counter// so each day increment
    // for each day sum all the user
    while (users < 1e9)
    {
      users = 0;
      // goes through iteration again 
      for (int i = 1; i <= growthRates.length; i++)
      {
        users += Math.pow(growthRates[i - 1], days);
      }
      days++;
    }
    
    
    
    
    
    
    return days - 1;
    
  }
