package ch11_컬렉션프레임워크.ex12;

import java.util.PriorityQueue;
import java.util.Queue;

/*
* 우선순위 큐(Priority Queue)
* - Queue 인터페이스 구현체 중 하나다.
* - 저장한 순서와 상관없이 우선순위(priority)가 높은 것부터 꺼내는 특징이 있다.
* - 저장공간으로 배열을 사용하며, 각 요소를 '힙(Heap)'이라는 자료구조의 형태로 저장한다.
* - 힙(Heap)은 이진 트리의 한 종류로 가장 큰 값이나 가장 작은 값을 빠르게 찾을 수 있다.
* - 참고, 자료구조 힙(Heap)은 JVM의 힙(Heap)과 이름만 같을 뿐 다른 것이다.
* */
public class PriorityQueueEx {

    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.offer(3);
        q.offer(1);
        q.offer(5);
        q.offer(2);
        q.offer(4);

        System.out.println("q = " + q);

        for (Integer i : q) {
            System.out.println(i);
        }
    }
}
