
System.out.println("Printing pattern 14: ");
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int z = i;z>=1;z--){
                System.out.print(z);
            }
            System.out.println();
        }
