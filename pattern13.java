System.out.println("Printing pattern 13: ");
        int n = 5;
        for(int i = 1; i<=n;i++){
            //spaces
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int z = i;z>=1;z--){
                System.out.print(z);
            }
            for(int x=2;x<=i;x++){
                System.out.print(x);
            }
            System.out.println();
        }
