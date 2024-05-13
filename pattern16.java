 System.out.println("Printing pattern 18: ");
        int n = 5; 
        for(int i =0; i<n;i++){
            for(int j=0; j<n-i-1;j++){
                System.out.print(" ");
            }

            int number = 1; 
            for(int j = 0; j<=i; j++){
                if(j==0||j==i){
                    System.out.print("1 ");
                }else{
                number = number * (i-j+1)/j;
                System.out.print(number + " ");
            }
            }
            System.out.println();
        }
