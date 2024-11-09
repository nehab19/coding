package guru.springframework.spring5webapp.questions;

public class ShortestDistance {

    static int findShortestDistance(String [] words,String word1, String word2){
        int distance1=-1;
        int distance2=-1;
        int answer=Integer.MAX_VALUE;
        for(int i=0;i< words.length;i++){
            if(words[i]==word1){
                distance1=i;
            }if(words[i]==word2){
                distance2=i;
            }
            if(distance1 !=-1 && distance2 !=-1){
               answer=Math.min(answer,Math.abs(distance2-distance1));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String [] word={"the","quick","brown","fox","quick"};
        String word1="quick",word2="fox";
        System.out.println("Shortest distance is : "+findShortestDistance(word,word1,word2));
    }
}
