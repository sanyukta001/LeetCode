class Solution {
    public String reverseWords(String s) {
      StringBuilder sb = new StringBuilder();
      String[] words= s.split(" ");
      for(int i = 0;i<words.length;i++){
          StringBuilder tmp= new StringBuilder(words[i]);
          tmp.reverse();
          sb.append(tmp);
          sb.append(" ");
      }
      return sb.toString().trim();
    }
}