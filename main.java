// default imports

import java.util.Scanner;


// main class

public class mainClassDatas {
    
    public static void pools(String[] args) {
        
        int bitcoinPool = 0;
        int ethereumPool = 0;
        int litecoinPool = 0;
        int marscoinPool = 0;
        
    }
    
}

public class mainClassFunctions {
    
    public static void gui(String[] args) {
        
        
        
    }
    
    public static void pool(String[] args) {
        
        
        
    }
    
}

public class Main {
    
    public static void main(String[] args) {
        
        // default scanners
        
        Scanner consoleInput = new Scanner(System.in);
        
        System.out.println("Does we activate the bitcoin mining pool ?");
        mainClassDatas.pools.bitcoinPool = consoleInput.nextLine();
        System.out.println("Does we activate the ethereum mining pool ?");
        mainClassDatas.pools.ethereumPool = consoleInput.nextLine();
        System.out.println("Does we activate the litecoin mining pool ?");
        mainClassDatas.pools.litecoinPool = consoleInput.nextLine();
        System.out.println("Does we activate the marscoin mining pool ?");
        mainClassDatas.pools.marscoinPool = consoleInput.nextLine();
        
        // default ifs
        
        if (mainClassDatas.pools.bitcoinPool = 1) {
            
            System.out.println("The bitcoin pool is starting !");
            
        } else {
            
            if (mainClassDatas.pools.bitcoinPool = 0) {
                
                System.out.println("The bitcoin pool will not be started !");
                
            } else {
                
                System.out.println("Error in the bitcoin pool status mode !");
                System.out.println("Mode set as : " +mainClassDatas.pools.bitcoinPoolEnabled +" the mode can only be set as 1 for active and 0 for inactive !");
                
            };
            
        };
        if (mainClassDatas.pools.ethereumPool = 1) {
            
            System.out.println("The ethereum pool is starting !");
            
        } else {
            
            if (mainClassDatas.pools.ethereumPool = 0) {
                
                System.out.println("The ethereum pool will not be started !");
                
            } else {
                
                System.out.println("Error in the ethereum pool status mode :");
                System.out.println("Mode set as : " +mainClassDatas.pools.ethereumPool +" the mode can only be set as 1 for active and 0 for inactive !");
                
            };
            
        };
        if (mainClassDatas.pools.litecoinPool = 1) {
            
            System.out.println("The litecoin pool is starting !");
            
        } else {
            
            if (mainClassDatas.pools.litecoinPool = 0) {
                
                System.out.println("The litecoin pool will not be started !");
                
            } else {
                
                
                System.out.println("Error in the litecoin pool status mode !");
                System.out.println("Mode set as : " +mainClassDatas.pools.litecoinPool +" the mode can only be set as 1 for active and 0 for inactive !");
            };
            
        };
        if (mainClassDatas.pools.marscoinPool = 1) {
            
            System.out.println("The marscoin pool is starting !");
            
        } else {
            
            if (mainClassDatas.pools.marscoinPool = 0) {
                
                System.out.println("The marscoin pool will not be started !");
                
            } else {
                
                System.out.println("Error in the marscoin pool status mode !");
                System.out.println("Mode set as : " +mainClassDatas.pools.marscoinPool +" the mode can only be set as 1 for active and 0 for inactive !");
                
            };
            
        };
        
    }
    
}
