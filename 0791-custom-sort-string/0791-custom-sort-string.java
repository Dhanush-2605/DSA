class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i=0;i<order.length();i++){
            map.put(order.charAt(i),i);
        }
        int n=s.length();
        char[] charArray = s.toCharArray();
        for (int i=0;i<n;i++){
            
            for (int j=i+1;j<n;j++){
                 char bChar=charArray[i];
                 int ind1=map.getOrDefault(bChar,-1);
                 char cChar=charArray[j];
                 int ind2=map.getOrDefault(cChar,-1);
                
                if (ind1!=-1 && ind2!=-1 && ind1>ind2 ){
                    // System.out.println(chaArray[ind1] +" "+charArray[ind2]);
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;

                }
                
            }
        }
    s=new String(charArray);

        
        return s;
        
    }
}