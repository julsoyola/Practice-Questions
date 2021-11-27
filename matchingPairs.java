class Main {

  // Add any helper functions you may need here
  

  int matchingPairs(String s, String t) {
    // Write your code here
    
    // store it into a set and compare them?
     Set<String> mismatchS = new HashSet<>();
    // break each character 
    char[] sToChar = s.toCharArray(); 
    char[] tToChar = t.toCharArray();
    int matching =0;
    for (int i =0;i<sToChar.length;i++) {
      if(sToChar[i]!=tToChar[i]) {
        mismatchS.add(sToChar[i]+""+tToChar[i]);
      } 
      else
        matching++;
    }
    for(String mism : mismatchS) {
      String reverse=mism.charAt(1)+""+mism.charAt(0);
        if(mismatchS.contains(reverse)) {
          return matching+2;
        }
    }
   if(mismatchS.size()<=1)
     matching--;
   if(mismatchS.size()==0)
        matching--;
   return matching; 
    
    
  }
