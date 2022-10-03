import java.util.HashMap;

public class duplicatessss {
    public static void main(String[] args){
        String str = "Here is the string";
        findDuplicates(str);
    }

    public static void findDuplicates(String str){
        HashMap<Character, Integer> hashmap = new HashMap<>();
        char[] chararray = str.toCharArray();

        for( char ch: chararray){
            if(hashmap.containsKey(ch)){
                hashmap.put(ch, hashmap.get(ch) + 1);
            }
            else{
                hashmap.put(ch, 1);
            }
        }

        for(HashMap.Entry<Character,Integer> entry : hashmap.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
