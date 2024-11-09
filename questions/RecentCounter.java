package guru.springframework.spring5webapp.questions;

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> requests;
    public RecentCounter() {
        this.requests=new LinkedList<>();
    }

    int ping(int t) {
        requests.add(t);
        while(requests.peek()<t-3000){
            requests.poll();
        }
        return requests.size();
    }

    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        recentCounter.ping(1);
        recentCounter.ping(100);
        recentCounter.ping(3001);
        recentCounter.ping(3002);
        System.out.println(recentCounter.requests);
    }
}