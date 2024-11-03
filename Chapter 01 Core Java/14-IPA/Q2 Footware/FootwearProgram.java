
import java.util.*;
public class FootwearProgram {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Footwear arr[] = new Footwear[5];

        for(int i = 0; i< 5;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Footwear(a,b,c,d);
        }

        String type = sc.nextLine();
        String name = sc.nextLine();

        int cnt = getCountByType(arr,type);
        if(cnt > 0){
            System.out.println(cnt);
        }
        else{
            System.out.println("Footwear not available");
        }

        Footwear ft = getSecondHighestPriceByBrand(arr,name);

        if(ft != null){
            System.out.println(ft.getId());
            System.out.println(ft.getName());
            System.out.println(ft.getPrice());
        }
        else{
            System.out.println("Brand not available");  
        }

        sc.close();

    }

    public static int getCountByType(Footwear [] arr,String type){
        int cnt = 0;
        for(Footwear i : arr){
            if(i.getType().equalsIgnoreCase(type))
                cnt++;
        }

        return cnt > 0 ? cnt : 0;

    }
    public static Footwear getSecondHighestPriceByBrand(Footwear[] arr, String name) {
        Footwear highest = null;
        Footwear secondHighest = null;
    
        for(Footwear i : arr) {
            if (i.getName().equalsIgnoreCase(name)) {
                if (highest == null || i.getPrice() > highest.getPrice()) {
                    secondHighest = highest;
                    highest = i;
                } else if (secondHighest == null || i.getPrice() > secondHighest.getPrice()) {
                    secondHighest = i;
                }
            }
        }
        
        return secondHighest;
    }
    
    

    static class Footwear{
        private int id;
        private String name;
        private String type;
        private int price;

        public Footwear(int id,String name, String type, int price){
            this.id = id;
            this.name = name;
            this.type = type;
            this.price = price;
        }

        int getId(){
            return id;
        }

        String getName(){
            return  name;
        }

        String getType(){
            return type;
        }

        int getPrice(){
            return price;
        }




    }
}
