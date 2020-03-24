package officeHours;

import java.util.*;

public class CollectionsPractice {
    public static void main(String[] args) {
        LinkedList<String>names=new LinkedList<>();
        names.add("Olga");
        names.add("Alina");
        System.out.println(names.get(1));
        HashSet<String>hashSet=new HashSet<>();
        TreeSet<String>treeSet=new TreeSet<>();
        LinkedHashSet<String>linkedHashSet=new LinkedHashSet<>();

        for(String each: Arrays.asList("Value5","value1","value3")){
            hashSet.add(each);
            treeSet.add(each);
            linkedHashSet.add(each);
        }
        System.out.println("hashSet "+hashSet);
        System.out.println("TreeSet "+treeSet);
        System.out.println("LinkedHashSet "+linkedHashSet);

        Iterator<String> iteratorSet=hashSet.iterator();
        while(iteratorSet.hasNext()){
            System.out.println(iteratorSet.next());
        }
        PriorityQueue<String>priorityQueue=new PriorityQueue<>();
        priorityQueue.add("John");
        priorityQueue.add("Kete");
        priorityQueue.add("Tom");
        System.out.println("Queue: "+priorityQueue);
        //peeking (.peek())-it will check and return the first in a queue
        System.out.println( priorityQueue.poll());
        System.out.println(priorityQueue);
        //polling will return the first value in the queue and remove it

        ArrayDeque<String>deque=new ArrayDeque<>();
        /*
        we can add and retrieve elements from dequeue from both sides(head,end)
         */
        Deque<Integer>numbers=new ArrayDeque<>();
        numbers.addFirst(20);
        numbers.addFirst(30);
        numbers.addFirst(50);
        System.out.println(numbers);
        numbers.addLast(90);
        System.out.println(numbers);
        numbers.add(33);
        System.out.println(numbers);
        Integer num=numbers.pollFirst();//return and delete first element
        System.out.println(num);
        System.out.println(numbers);
        /*
        What collections you are using in your project?
        Describe all different collections(List,Queue,Set)
        explain the difference between them
        List->use most of the times because I usually need to store some values
        O would use LinkedList if I know I will need to manipulate my data
        (consistantlly add or remove etc.)
        Set->HasSet-for unique values
          TreeSet-for unique sorted values

        Queue->if I need to check FIFO logic in my project
        poll()->returns the value and remove it from the Queue
        peek()->returns the value(similar to get()
         */
        /*
        Map interface:does not accept any duplicate keys
        -HashMap->key/value, can accept null
        -HashTable-synchronized/no null values
        -LinkedHashMap extends the HashMap,slower than HashMap
              linked
        -TreeMap-sorted, no null values
         */
         HashMap<String,String>user1=new HashMap<>();
        user1.put("First Name",null);
        user1.put("Last Name","Smith");
        user1.put("Account number","A15476545498");
        user1.put("Date of birth","02.20.1980");

        System.out.println(user1);

        LinkedHashMap<String,String>user2=new LinkedHashMap<>();
        user2.put("First Name","John");
        user2.put("Last Name","White");
        user2.put("Last Name","Blaja");
        user2.put("Account number","A326164");
        user2.put("DOB","12.02.1981");
        System.out.println(user2);

        List<HashMap<String,String>>users=new ArrayList<>();
        //LinkedHashMap extends HashMap
        users.add(user1);
        users.add(user2);

        HashMap<String,String>user3=new HashMap<>(user1);
        user2.put("Account number","A326164");
        user2.put("DOB","12.02.1981");

        users.add(user3);

        //print account number along with last name
        for(HashMap<String,String>user:users){
            System.out.println("Account number: "+user.get("Account number") +" |Last Name: "+user.get("Last Name"));
        }
        int i=1;
        for(HashMap<String,String>user:
        users){
            System.out.println("User "+i);
            Iterator<String>keys=user.keySet().iterator();
            while ((keys.hasNext())){
                String key=keys.next();
                System.out.println(key+" : "+user.get(key));
            }
            i++;
        }

    }
}
