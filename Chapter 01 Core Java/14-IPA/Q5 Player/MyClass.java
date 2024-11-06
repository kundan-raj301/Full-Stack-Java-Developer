import java.util.*;

public class MyClass {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] arr = new Player[4];
        
        // Input for each player
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            String d = sc.nextLine();
            String e = sc.nextLine();
            
            arr[i] = new Player(a, b, c, d, e);
        }
        
        // Input player type and match type
        String playerType = sc.nextLine();
        String matchType = sc.nextLine();
        
        // Finding player with the lowest runs
        int lRuns = findPlayerWithLowestRuns(arr, playerType);
        if (lRuns > 0) {
            System.out.println(lRuns);
        } else {
            System.out.println("No such player");
        }
        
        // Finding players by match type
        Player[] arr2 = findPlayerByMatchType(arr, matchType);
        if (arr2 != null) {
            for (Player player : arr2) {
                System.out.println(player.getpId());
            }
        } else {
            System.out.println("No Player with given matchType");
        }
        
        sc.close();
    }
  
    public static int findPlayerWithLowestRuns(Player[] arr, String playerType) {
        int leastRuns = Integer.MAX_VALUE;
      
        for (Player player : arr) {
            if (player.getpType().equalsIgnoreCase(playerType)) {
                leastRuns = Math.min(leastRuns, player.getruns());
            }
        }
        return leastRuns == Integer.MAX_VALUE ? 0 : leastRuns;
    }
    
    public static Player[] findPlayerByMatchType(Player[] arr, String matchType) {
        List<Player> filtered = new ArrayList<>();
      
        for (Player p : arr) {
            if (p.getmType().equalsIgnoreCase(matchType)) {
                filtered.add(p);
            }
        }
        
        filtered.sort(Comparator.comparingInt(Player::getpId).reversed());
        return filtered.isEmpty() ? null : filtered.toArray(new Player[0]);
    }
  
    static class Player {
        private int pId;
        private String pName;
        private int runs;
        private String pType;
        private String mType;
        
        public Player(int pId, String pName, int runs, String pType, String mType) {
            this.pId = pId;
            this.pName = pName;
            this.runs = runs;
            this.pType = pType;
            this.mType = mType;
        }
        
        int getpId() { return pId; }
        String getpName() { return pName; }
        int getruns() { return runs; }
        String getpType() { return pType; }
        String getmType() { return mType; }
    }
}

