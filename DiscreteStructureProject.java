package discretestructureproject;
import java.math.*;
import java.util.*;
//Bathan, Timothy Paul L. & Domiños, Jamyca L. 
public class DiscreteStructureProject {

    public static void main(String[] args) {
        solver sv = new solver();
        Scanner sc = new Scanner(System.in);
        
        int op = 0;
        int op1 = 0;
        int op2 = 0;
        
        while(op==0){
            try{
                System.out.println("1. Combination and Permutation With Repetition");
                System.out.println("2. Combination and Permutation Without Repetition");
                System.out.println("3. Stirling Number of Second Case");
                System.out.println("4. Pascal Row Generator");
                System.out.println("5. Exit");
                System.out.print("Your Choice: ");
                int a = sc.nextInt();
                
                if(a == 1){
                    while(op1 == 0){
                        try{
                        System.out.println("1. Combination");
                        System.out.println("2. Permutation");
                        System.out.println("3. Back");
                        System.out.print("Your Choice: ");
                        int wr = sc.nextInt();
                        if (wr == 1){
                            sv.combinationwr();
                            while(op2==0){
                                System.out.println("Do you want to continue? [0=NO , 1=YES  ]");
                                int ask = sc.nextInt();
                                if(ask == 0){
                                    System.exit(0);
                                }
                                else if (ask == 1){
                                    break;
                                }
                                else{
                                    System.out.println("Invalid Input");
                                }
                            }
                            
                        }
                        else if (wr == 2){
                            sv.permutationwr();
                            while(op2==0){
                                System.out.println("Do you want to continue? [0=NO , 1=YES  ]");
                                int ask = sc.nextInt();
                                if(ask == 0){
                                    System.exit(0);
                                }
                                else if (ask == 1){
                                    break;
                                }
                                else{
                                    System.out.println("Invalid Input");
                                }
                            }
                        }
                        else if(wr == 3){
                            break;
                        }
                        else{
                            System.out.println("Invalid Input");
                        }
                        
                        }catch(InputMismatchException e){
                            System.out.println("Incorrect Input!");
                        }
                    }
                }
                if(a == 2){
                    while(op1 == 0){
                        try{
                        System.out.println("1. Combination");
                        System.out.println("2. Permutation");
                        System.out.println("3. Back");
                        System.out.print("Your Choice: ");
                        int wr = sc.nextInt();
                        if (wr == 1){
                            sv.combinationwor();
                            while(op2==0){
                                System.out.println("Do you want to continue? [0=NO , 1=YES  ]");
                                int ask = sc.nextInt();
                                if(ask == 0){
                                    System.exit(0);
                                }
                                else if (ask == 1){
                                    break;
                                }
                                else{
                                    System.out.println("Invalid Input");
                                }
                            }
                            
                        }
                        else if (wr == 2){
                            sv.permutationwor();
                            while(op2==0){
                                System.out.println("Do you want to continue? [0=NO , 1=YES  ]");
                                int ask = sc.nextInt();
                                if(ask == 0){
                                    System.exit(0);
                                }
                                else if (ask == 1){
                                    break;
                                }
                                else{
                                    System.out.println("Invalid Input");
                                }
                            }
                        }
                        else if(wr == 3){
                            break;
                        }
                        else{
                            System.out.println("Invalid Input");
                        }
                        
                        }catch(InputMismatchException e){
                            System.out.println("Incorrect Input!");
                        }
                    }
                }
                else if (a == 3){
                    sv.stirling();
                            while(op2==0){
                                System.out.println("Do you want to continue? [0=NO , 1=YES  ]");
                                int ask = sc.nextInt();
                                if(ask == 0){
                                    System.exit(0);
                                }
                                else if (ask == 1){
                                    break;
                                }
                                else{
                                    System.out.println("Invalid Input");
                                }
                            }
                }
                else if (a == 4){
                    sv.pascal();
                            while(op2==0){
                                System.out.println("\n"+"Do you want to continue? [0=NO , 1=YES  ]");
                                int ask = sc.nextInt();
                                if(ask == 0){
                                    System.exit(0);
                                }
                                else if (ask == 1){
                                    break;
                                }
                                else{
                                    System.out.println("Invalid Input");
                                }
                            }
                }
                else if(a == 5){
                    System.out.println("Thank you!! (Timothy Bathan & Jamyca Dominos)");
                    System.exit(0);
                }
            }
            catch(InputMismatchException e){
                System.out.println("Incorrect input");
                System.exit(0);
            }
        }
    }
    
    interface choice{
        void combinationwr();
        void permutationwr();
        void combinationwor();
        void permutationwor();
    }
    
    interface choice1 extends choice{
        void stirling();
        void pascal();
    }
    
    abstract static class withrepetition implements choice1{
        Scanner sc = new Scanner(System.in);
        static BigInteger factorial(int N){ 
        BigInteger f = new BigInteger("1"); 
  
        for (int i = 2; i <= N; i++) 
            f = f.multiply(BigInteger.valueOf(i)); 
  
        return f; 
        } 
        
        public void combinationwr(){
        try{    
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            System.out.print("Enter r: ");
            int r = sc.nextInt();
                if (n<r || n<=0 || n>=501 || r<=0 || r>=501){
                    System.out.println("No Answer!");
                }
                else{
                    int nr1 = n+r-1;
                    int n1 = n-1;

                    BigInteger rf = new BigInteger("1");
                    rf = rf.multiply(factorial(r));

                    BigInteger n1f = new BigInteger("1");
                    n1f = n1f.multiply(factorial(n1));

                    BigInteger nr1f = new BigInteger("1");
                    nr1f = nr1f.multiply(factorial(nr1));

                    BigInteger f = new BigInteger("1");
                    f = f.multiply(rf.multiply(n1f));

                    BigInteger ff = new BigInteger("1");
                    ff = ff.multiply(nr1f.divide(f));
                    System.out.println(ff);
                }
        }catch(InputMismatchException e){
            System.out.println("No Answer");
        }
        }
        public void permutationwr(){
            try{
                System.out.print("Enter n: ");
                int n = sc.nextInt();
                System.out.print("Enter r: ");
                int r = sc.nextInt();
                String num = String.valueOf(n);
                if (n<r || n<=0 || n>=501 || r<=0 || r>=501){
                        System.out.println("No Answer!");
                }
                else{
                    BigInteger ns = new BigInteger(num);
                    BigInteger f = new BigInteger("1");
                    f = ns.pow(r);
                    System.out.println(f);
                }
            }catch(InputMismatchException num){
            System.out.println("No Answer");
        }
        }
    }
    
    abstract static class withoutrepetition extends withrepetition implements choice1{
        
        public void combinationwor(){
            try{
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            System.out.print("Enter r: ");
            int r = sc.nextInt();
            int ab = n-r;
            if (n<r || n<=0 || n>=501 || r<=0 || r>=501){
                    System.out.println("No Answer!");
            }
            else{
                BigInteger nf = new BigInteger("1");
                nf = nf.multiply(factorial(n));

                BigInteger rf = new BigInteger("1");
                rf = rf.multiply(factorial(r));

                BigInteger abf = new BigInteger("1");
                abf = abf.multiply(factorial(ab));

                BigInteger f = new BigInteger("1");
                f = f.multiply(rf.multiply(abf));

                BigInteger ff = new BigInteger("1");
                ff = ff.multiply(nf.divide(f));
                System.out.println(ff);
            }
            }
            catch(InputMismatchException num){
            System.out.println("No Answer");
        }
            }        
        public void permutationwor(){
            
            try{
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            System.out.print("Enter r: ");
            int r = sc.nextInt();
            int nr = n-r;

            if  (n<r || n<=0 || n>=501 || r<=0 || r>=501){
                    System.out.println("No Answer!");
            }
            else{
            BigInteger nf = new BigInteger("1");
            nf = nf.multiply(factorial(n));

            BigInteger nrf = new BigInteger("1");
            nrf = nrf.multiply(factorial(nr));

            BigInteger ff = new BigInteger("1");
            ff = ff.multiply(nf.divide(nrf));
            System.out.println(ff);
            }
            
            }catch(InputMismatchException e){
                System.out.println("No Answer!");
            }   
      }
    }
 
    public static class solver extends withoutrepetition implements choice1{
        
        static BigInteger comb(int n,int r) {
		BigInteger comb = factorial(n).divide(factorial(r).multiply(factorial(n-r)));
		return comb;
	}
        public static BigInteger factorial(int n) {
		BigInteger fact = new BigInteger("1"); //initialize result
			for (int i = 2;i <= n;i++) {
				fact = fact.multiply(BigInteger.valueOf(i)); // this will initiate the use of factorial
			}
			return fact;
		}    
            
        public void stirling(){ 
            BigInteger s = BigInteger.valueOf(-1);
            BigInteger s2 = BigInteger.valueOf(-1); 	
            BigInteger tn = BigInteger.ZERO; 
            BigInteger tn1 = BigInteger.ZERO; 
            BigInteger fta = BigInteger.ZERO; 
            
            try{
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            System.out.print("Enter k: ");
            int r = sc.nextInt();
            
            if (n<r || n<=0 || n>=501 || r<=0 || r>=501){
                    System.out.println("No Answer!");
            } else{
		for (int x = 0;x < r;x++) {
                    s = (s).multiply(s2);
                    BigInteger comb1 = factorial(r).divide(factorial(x).multiply(factorial(r-x)));
                    tn = BigInteger.valueOf(r).subtract(BigInteger.valueOf(x));
                    tn1 = BigInteger.valueOf(r).subtract(BigInteger.valueOf(x));
                        for(int z = 1;z < n;z++) {
                            tn = tn.multiply(tn1);
                            }
				fta = fta.add((s).multiply(comb1).multiply(tn));
			}
			System.out.println(fta.divide(factorial(r)));
			}
            
            }catch(InputMismatchException e){
                System.out.println("No Answer"); 
           }
} 
        public void pascal(){
            try{
                System.out.print("Enter row number: ");
		int N = sc.nextInt();
		int n = N ;
		System.out.println("Pascal Triangle line "+ N +" is: ");
		if (n>=501){
                    System.out.println("No Answer!");
            } else{
		for(int r = 0;r <= n; r++) {
			System.out.print(" " + comb(n,r)); 
		}
                }
            }catch(InputMismatchException e){
                System.out.println("No Answer!");
            }
        }
    }

}
   


