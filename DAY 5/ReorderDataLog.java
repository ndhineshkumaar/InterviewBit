import java.util.*;

public class ReorderDataLog {
    public static void main(String[] args) {
        String[] arr={"qv4-tbojcv-yd", "uh9-lmtdpiunu", "ta9-5-3-5-5-1", "hn2-yawf-jw-zkw", "nc7-hdly-hrht", "ja7-6-5-7-0-4", "ld1-le-cmt-t-z", "hu2-wfkpj-jv", "iy0-hujr-wmrg-ca", "ia7-y-l-bnaz", "nr1-7-1-7-0-4", "gx0-sm-by-wd-ea"};
        ArrayList<String> A=new ArrayList<>(Arrays.asList(arr));
        ArrayList<String> num_list=new ArrayList<>();
        ArrayList<String> output=new ArrayList<>();
        Map<String,List<String> >map=new HashMap<>();
        ArrayList<String> keys=new ArrayList<>();
        for(String s:A){

            int ele=s.charAt(s.length()-1);
            if(ele>=48&&ele<=57){
                num_list.add(num_list.size(),s);
            }else{
                int index=s.indexOf('-');
                String s2=s.substring(index+1);
                map.put(s2,map.getOrDefault(s2,new ArrayList<>()));
                map.get(s2).add(s);
                if(!keys.contains(s2)){
                    keys.add(s2);
                    System.out.println(keys);
                }
            }
        }
        Collections.sort(keys);
        for(String m:keys){
            output.addAll(map.get(m));
        }
        output.addAll(num_list);
}
}
