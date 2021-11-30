import java.io.*; 
import java.util.*;
// Add any extra import statements you may need here
// You've devised a simple encryption method for alphabetic strings that shuffles 
//   the characters in such a way that the resulting string is hard to quickly read, but is easy to convert back into the original string.

class Main {

  // Add any helper functions you may need here
  

  String findEncryptedWord(String s) {
    // Write your code here
       // **** initialization ****
    String r    = "";
    int mid     = 0;
 
    // **** [0] compute the position of of middle character in S ****
    mid = s.length() / 2;
    if (s.length() % 2 == 0)
        mid -= 1;
 
    // **** [1] append the middle character of S ****
    r += s.substring(mid, mid + 1);
 
   
    // **** [2] append the encrypted version of the substring of S 
    //      that's to the LEFT of the middle character (if non-empty) ****
    if (mid > 0) {
 
        // **** generate left sub string ****
        String ls = s.substring(0, mid);
 
        // **** encrypt and append ***
        r += findEncryptedWord(ls);
    }
 
    // **** [3] append the encrypted version of the substring of S 
    //      that's to the RIGHT of the middle character (if non-empty) ****
    if (mid < s.length() - 1) {
 
        // **** generate right sub string ****
        String rs = s.substring(mid + 1, s.length());
 
        // **** encrypt and append ****
        r += findEncryptedWord(rs);;
    }
 
    // **** return encrypted string ****
    System.out.print(r + " ");
    return r;
  }
