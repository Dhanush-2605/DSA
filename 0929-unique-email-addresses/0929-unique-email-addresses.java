class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String>s = new HashSet<String>();

        
        int len=emails.length;
        for (String res:emails){
      
        
    String[] arr = res.split("@", 2);
      String s1=arr[0];
      String s2=arr[1];
            // String a2[]=s1.split("+",2);
            s1=s1.split("\\+",2)[0];
            s1=s1.replaceAll("\\.","");
        
            String r=s1+"@"+s2;
            
            
            s.add(r);
            


    }

        return s.size();
    }
}