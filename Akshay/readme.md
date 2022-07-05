<h2>Selection sort</h2>

```java

class HelloWorld {
    public static void main(String[] args) {
        int[] a = {4,3,2,15,10};
        for(int i=0;i<a.length;i++){
            for(int j=i;j<=a.length-1;j++){
                if(a[j]<a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i = 0; i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}

```

# Recursion
### Factorial of a number

```java

class HelloWorld {
    static int fact(int n){
            if(n==0) {
                return 1;
            }else{
                int next = fact(n-1);
                return next*n;
            }
            
        }
    public static void main(String[] args) {
        int n = 5;
        System.out.print(fact(5));
    }
}

```
