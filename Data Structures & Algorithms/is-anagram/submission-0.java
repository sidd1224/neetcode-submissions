class Solution {
    public boolean isAnagram(String s, String t) {
    Map<Character,Integer> map=new HashMap();
    for (int i=0;i<s.length();i++){
    if(!map.containsKey(s.charAt(i))){
     map.put(s.charAt(i),1);
    }else{
       int count= map.get(s.charAt(i));
       map.put(s.charAt(i),count+1);
    }
    }
    
    for(int i=0;i<t.length();i++){
    if(!map.containsKey(t.charAt(i))){
    return false;
    }else{
       int count= map.get(t.charAt(i));
       map.put(t.charAt(i),count-1);
    }
    }
for(int count:map.values()){
    if(count!=0){
        return false;
    }
}
return true;
}
}
