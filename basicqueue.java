import java.util.LinkedList;
import java.util.Queue;

public class basicqueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        Queue<Integer> r = new LinkedList<>();
        while(q.size()>0){
            int x = q.remove();
            System.out.print(x+" ");
            r.add(x);
        }
        System.out.println(  );
        System.out.println(r);

    }
}
