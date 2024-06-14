import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> food= new java.util.ArrayList<String>();
        food.add("Pizza");
        food.add("Pie");
        food.add("Burger");

        food.set(0,"Meee");
//        food.remove(2);
//        food.clear();
        System.out.println(food);
        Integer i;
        for( i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
        ArrayList<ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        mat.add(a);
        mat.add(b);
        System.out.println(mat);
        for(String g: food){
            System.out.println(g);
        }
    }
}
