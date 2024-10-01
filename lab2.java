import java.util.*;

public class lab2 {
    //monte carlo simulation
    public double Simulation(int n){
    double p;
    double hitCount =0;
    for(int i = 0; i<n;i++) {
        Random random = new Random();
        double x = random.nextDouble(0, 1);
        double y = random.nextDouble(0, 1);
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if (distance <= 1) {
            hitCount++;
        };

    }
    p =  (4*hitCount)/n;
    return p;

    }
    public static String readinput(String msg){
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        System.out.println("Enter String:" + input);
        return input;

    }
    public static void findprime(int n){
        Boolean[] composite = new Boolean[n+1];
        for(int i = 0; i<=n;i++){
            composite[i]=false;
        }
        // true:composite, false:prime
        composite[0]=true;
        composite[1]=true;
        for(int p = 2; p<=n;p++){
            if(composite[p]==false){
                for(int mul = 2*p; mul<=n;mul+=p){
                    composite[mul]=true;
                }
            }
        }
        System.out.println("n:"+n);
        for(int i = 0; i<=n;i++){
            if(!(composite[i])){
                System.out.println(i+" ");
            }
        }

    }



    public static void main(String[] args){
        lab2 ex = new lab2();
        double pi = ex.Simulation(100);
        System.out.println(pi);
        String userinput= readinput("input a number:");
        findprime(20);
    }
}


