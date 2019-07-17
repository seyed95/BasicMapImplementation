import java.util.*;


public class Controller {
    Map<Integer,String> hashmap=new HashMap<>();
    Map<Integer,String> linkedhashmap=new LinkedHashMap<>();
    Map<Integer,String> treemap=new TreeMap<>();
    Iterator<Map.Entry<Integer,String>> iterator;
    Scanner input=new Scanner(System.in);
    int key;
    String value;
   public static void main(String[] args){
       Controller c=new Controller();
       c.mainMenu();
   }
    private void mainMenu(){
       while(true){
        System.out.println("*****************Working of Different Types of Maps***************");
        System.out.println("Press : \n1. HashMap\n2. LinkedHashMap\n3. TreeMap\n4. Exit");
        short options=input.nextShort();
        switch(options){
            case 1: hashMap();
                    break;
            case 2: linkedHashMap();
                    break;
            case 3: treeMap();
                    break;
            case 4: System.exit(0);
                    break;
            default:
                System.out.println("Please select from the options");

        }
       }


    }

    public void hashMap(){
        System.out.println("Press : \n1. To Insert\n2. To Delete\n3. To Display\n4. TO MAIN MENU");
        short options=input.nextShort();
        switch(options){
            case 1: insertIntoMap(hashmap);
                    break;
            case 2: removeFromMap(hashmap);
                    break;
            case 3: printMap(hashmap);
                    break;
            case 4: mainMenu();
            default:
                    System.out.println("Please select from the available Options");
        }

    }
    public void linkedHashMap() {
        System.out.println("Press : \n1. To Insert\n2. To Delete\n3. To Display\n4. TO MAIN MENU");
        short options = input.nextShort();
        switch (options) {
            case 1:
                insertIntoMap(linkedhashmap);
                break;
            case 2:
                removeFromMap(linkedhashmap);
                break;
            case 3:
                printMap(linkedhashmap);
                break;
            case 4: mainMenu();
            default:
                System.out.println("Please select from the available Options");


        }
    }
        public void treeMap () {
            System.out.println("Press : \n1. To Insert\n2. To Delete\n3. To Display\n4. TO MAIN MENU");
            short options = input.nextShort();
            switch (options) {
                case 1:
                    insertIntoMap(treemap);
                    break;
                case 2:
                    removeFromMap(treemap);
                    break;
                case 3:
                    printMap(treemap);
                    break;
                case 4: mainMenu();
                default:
                    System.out.println("Please select from the available Options");
            }

        }

    private void printMap(Map<Integer,String> map) {
        Set<Map.Entry<Integer,String>> set=map.entrySet();
        for(Map.Entry entry:set){
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }

    }

    private void removeFromMap(Map<Integer, String> map) {
        System.out.println("Enter the Key to Remove");
        key=input.nextInt();
        map.remove(key);

    }

    private void insertIntoMap(Map<Integer, String> map) {
        System.out.println("Enter the Key(as Integer)");
        key=input.nextInt();
        System.out.println("Enter the Value(as String)");
        value=input.next();
        map.put(key,value);
    }


}
