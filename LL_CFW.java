import java.util.*;
 class LL_CFW{

    public static void main(String [] args){
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("verma");
        list.addFirst("lucky");
        list.addLast("jiii");
        System.out.println("LinkedList :" + list);

        for(int i = 0; i<list.size(); i++){
         System.out.print(list.get(i)+"-->");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(0);
        System.out.print(list);
    }
 }