package Java8;

@FunctionalInterface
interface MyLambda2{
    public int add(int a,int b);
}
//use a new class which implements functional interface and call the method
 class Lambda2 implements MyLambda2{

    @Override
    public int add(int x,int y){
        return x+y;
    }

    public static void main(String[] args) {
        Lambda2 lambda = new Lambda2();
        int sum=lambda.add(5,6);
        System.out.println(sum);


//use of anonymous class to call method
        MyLambda2 lambda1=new MyLambda2() {
            @Override
            public int add(int q,int w) {
                return q+w;
            }
        };
        int sum1=lambda1.add(10 ,12);
        System.out.println(sum1);


        MyLambda2 lambda2=(e,r)->e+r;
        int sum2=lambda2.add(123,12);
        System.out.println(sum2);
    }
}

