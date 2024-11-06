import java.util.*;
public class MyClass{
  
  	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	Hotel[] arr = new Hotel[4];
      	for(int i = 0;i<4;i++){
        	int a = sc.nextInt(); sc.nextLine();
          	String b = sc.nextLine();
          	String c = sc.nextLine();
          	int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();
          	double f = sc.nextDouble(); sc.nextLine();
          
         	arr[i] = new Hotel(a, b, c, d, e, f);
        }
      
      	String mon = sc.nextLine();
      	String w = sc.nextLine();
      	
      	int count = noOfRoomsBookedInGivenMonth(arr,mon);
      	if(count > 0) 
          System.out.println(count);
    	else
          System.out.println("No rooms booked in the given month");
      
         Hotel h = searchHotelByWifiOption(arr,w);
      	 if(h != null){
         	System.out.println(h.getId());	
         }
      		else{
            System.out.println("No such option available");
            }
      
    } 
    
  	public static int noOfRoomsBookedInGivenMonth(Hotel[] arr,String mon){
    	int cnt = 0;
      	for(int i = 0; i< arr.length;i++){
        	if(arr[i].getDOB().substring(3,6).equalsIgnoreCase(mon)){
            	cnt++;   	
            }
        }
      	return cnt;
    }
    public static Hotel searchHotelByWifiOption(Hotel[] arr,String w){
    	Hotel highest = null;
      	Hotel secondHighest = null;
      
      	for(int i = 0; i< arr.length;i++){
        	if(arr[i].getWIFI().equalsIgnoreCase(w)){
               if(arr[i].getBill() > highest.getBill() || highest == null){
            		highest = arr[i];
              		secondHighest = highest;
            	}
          		else if(arr[i].getBill() > secondHighest.getBill() || secondHighest == null){
                	secondHighest = arr[i];
                }
        	}
   		 }
      	return secondHighest;
    }    
	static class Hotel{
   		
      private int id;
      private String name;
      private String dob;
      private int roomBooked;
      private String wifi;
      private double bill;
      
      public Hotel(int id, String name, String dob, int roomBooked, String wifi, double bill){
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.roomBooked = roomBooked;
        this.wifi = wifi;
        this.bill = bill;
      }
      
      int getId() { return id; }
      String getName() { return name; }
      String getDOB() { return dob; }
      int getRoomBooked() { return roomBooked;}
      String getWIFI() { return wifi;}
      double getBill()  { return bill;}
}
}