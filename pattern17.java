 System.out.println("Printing pattern 15: ");
        int n = 4; 
        for(int i = 1; i<=n; i++){
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            int odd = (2*i)-1;
            for(int z = 1;z<=odd;z++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1;i--){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            int odd1= (2*i)-1;
            for(int z =1;z<=odd1;z++){
                System.out.print("*");
            }
            System.out.println();
        }
