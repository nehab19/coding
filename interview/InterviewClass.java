package guru.springframework.spring5webapp.interview;

import java.util.*;
import java.util.stream.Collectors;

public class InterviewClass {

    public static void main(String[] args) {
        int [] array=new int[]{1, 0, 2, 0, 1, 1, 2};
        List<Integer>result=new ArrayList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        for(int num : array) {
            if(map.containsKey(num)){
                map.put(num,map.get(num) + 1);
            }else{
                map.put(num,1);
            }
        }
        map.entrySet().forEach(element->{
           Integer key= element.getKey();
           Integer value=element.getValue();
           for(int i=0;i<value;i++){
               result.add(key);
           }
        });
        System.out.println(result);


        //Arrays.stream(array).sorted().collect(Collectors.toList());
    }
}
