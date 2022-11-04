
public class MainClass {

    public static void main(String[] args) {
        towerOfHanoi(3,"A","B","C");
         
    }
        static void towerOfHanoi (int n, String from, String to, String helper){
            if(n==0){
                return;
            }
        
        towerOfHanoi (n-1, from, helper, to);
        System.out.println("Move disk " + n + "from" + from + "to" + to);
        towerOfHanoi(n-1, helper, to, from);
    }
    static int factorial_recursive(int n) {
if(n==1){
return 1;
}
return n*factorial_recursive(n-1);
}

Static int factorial(int n){
int result = 1;

for(int i= 1; i<=n; i++){
result = result * i;
}
return result;
}
}


