
        System.out.println("Printing Pattern 11: ");
        int n = 5;
        //for printing upperhalf
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                //first part of upper half
                System.out.print("*");
            }
            // for spaces
            int spaces = 2*(n-i);
            for(int z = 1; z<=spaces; z++){
                System.out.print(" ");
            }

            //for printing another upperhalf
            for(int x = 1; x<=i; x++){
                System.out.print("*");
            }
            System.out.println();
        }
            //for printing lower half
            for(int a = n; a>=1; a--){
                for(int b = 1; b<=a; b++){
                    //first part of upper half
                    System.out.print("*");
                }
                // for spaces
                int spaces1 = 2*(n-a);
                for(int c = 1; c<=spaces1; c++){
                    System.out.print(" ");
                }
    
                //for printing another upperhalf
                for(int d = 1; d<=a; d++){
                    System.out.print("*");
                }
                System.out.println();
        }
