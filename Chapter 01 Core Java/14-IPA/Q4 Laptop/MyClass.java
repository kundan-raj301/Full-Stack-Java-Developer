import java.util.*;

public class MyClass {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptop[] arr = new Laptop[4];
        
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();
            int e = sc.nextInt(); sc.nextLine();
            
            arr[i] = new Laptop(a, b, c, d, e);
        }
        
        String gBrand = sc.nextLine();
        String gOSType = sc.nextLine();
        
        int count = countOfLaptopsByBrand(arr, gBrand);
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("The given brand is not available");
        }
        
        Laptop[] arr1 = searchLaptopByOsType(arr, gOSType);
        if (arr1 != null && arr1.length > 0) {
            for (Laptop laptop : arr1) {
                System.out.println(laptop.getId());
                System.out.println(laptop.getRating());
            }
        } else {
            System.out.println("The given os is not available");
        }
    }
  
    public static int countOfLaptopsByBrand(Laptop[] arr, String gBrand) {
        int cnt = 0;
        for (Laptop laptop : arr) {
            if (laptop.getBrand().equalsIgnoreCase(gBrand) && laptop.getRating() > 3) {
                cnt++;
            }
        }
        return cnt;
    }
  
    public static Laptop[] searchLaptopByOsType(Laptop[] arr, String gOSType) {
        List<Laptop> filterList = new ArrayList<>();
        for (Laptop laptop : arr) {
            if (laptop.getOsType().equalsIgnoreCase(gOSType)) {
                filterList.add(laptop);
            }
        }
        
        filterList.sort(Comparator.comparingInt(Laptop::getId).reversed());
        
        return filterList.isEmpty() ? null : filterList.toArray(new Laptop[0]);
    }
  
    static class Laptop {
        private int id;
        private String brand;
        private String osType;
        private double price;
        private int rating;
        
        public Laptop(int id, String brand, String osType, double price, int rating) {
            this.id = id;
            this.brand = brand;
            this.osType = osType;
            this.price = price;
            this.rating = rating;
        }
        
        int getId() { return id; }
        String getBrand() { return brand; }
        String getOsType() { return osType; }
        double getPrice() { return price; }
        int getRating() { return rating; }
    }
}
