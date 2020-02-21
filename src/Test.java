import java.util.*;

public class Test {
    public static void main(String[] args) {

        Integer i = 54321;
        System.out.println(intReverse(i));


        generateLambda();

        /*generateMap();
        copyList();
        calenderTest();

                }
       */
    }

    private static void generateLambda() {
        List<Integer> satisfiedList = new ArrayList<>();
        List<Integer> l = Arrays.asList(3,-1,3,6,5);
        l.stream().sorted().filter(s->s>2).forEach(s->satisfiedList.add(s));
        System.out.println(satisfiedList);
    }

    private static Integer intReverse(Integer i) {
        System.out.println(i);
        String s = i.toString();
        String re = new StringBuilder(s).reverse().toString();

        return Integer.parseInt(re);
    }

    private static void calenderTest() {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        cal.add(Calendar.DAY_OF_MONTH,1);
        System.out.println(cal.getTime());
    }

    private static void copyList() {
        List<Integer> list = Arrays.asList(5,4,3,7,2,1);
        List<Integer> l = new ArrayList<>();
        Collections.copy(list,l);
        Collections.sort(l);
        l.forEach(s->System.out.println(s));
        String s = new String("News");

        System.out.println(s.equalsIgnoreCase("news"));
    }

    private static void generateMap() {
        HashMap<Integer,String> user = new HashMap<>();
        user.put(1,"kaka");
        user.put(2,"Ashely");
        user.put(3,"wuwu");
        user.forEach((k,u) -> System.out.println(k+" "+u));
        for(int i:user.keySet()){
            System.out.println(user.get(i));
        }
    }

}
