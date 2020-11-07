package Java8;

interface CompareString{

    public int compare(String a,String b);
        }

public class MethodReference2 {

    public static void main(String[] args){

        CompareString co=String::compareTo;
       int result= co.compare("hello","hello");
       System.out.println(result);
    }
}
