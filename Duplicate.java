public class Duplicate{
    public static boolean[]map=new boolean[26];
    public static void removeDuplicates(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        char currchar=str.charAt(idx);
        if(map[currchar-'a']){
            removeDuplicates(str,idx+1,newString);

        }
        else{
            new String += currchar;
            map[currchar-'a']=true;
            removeDuplicates(str,idx+1,newString);
        }
    }
}