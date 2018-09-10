//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    static int no_of_children=0;
    static HashMap<Integer,Integer> child_plateNo=new HashMap<Integer,Integer>();
    static int no_of_cases=0;
    public static void main(String args[] ) throws Exception {
        // Sample code to perform I/O:
        // * Use either of these methods for input

        //BufferedReader
        Scanner s = new Scanner(System.in);
        int no_of_testCases = s.nextInt();                // Reading input from STDIN
        //System.out.println("Hi, " + no_of_testCases + ".");    // Writing output to STDOUT
        for (int i=0;i < no_of_testCases;i++){
            no_of_children=s.nextInt();
            for(int j=0;j<no_of_children;j++){
                child_plateNo.put(j,s.nextInt());
            }
            displayMap(child_plateNo);
            no_of_cases = s.nextInt();
            for(int k=0 ; k<no_of_cases; k++){
                int a = s.nextInt();
                int b = s.nextInt();
                switch(a){
                    case 1: shiftAntiClockwise(b);break;
                    case 2: shiftClockwise(b);break;
                    case 3: displayPlateNo(b);break;
                    default : break;
                }
            }
        }

    }
    public static void shiftClockwise(int b){
        for(int j =0 ;j<b;j++){
            int lastIndex=child_plateNo.size()-1;
            int lastValue = child_plateNo.get(child_plateNo.size()-1);
            for(int i = child_plateNo.size()-1;i>0;i--){
                child_plateNo.put(i,child_plateNo.get(i-1));
            }
            child_plateNo.put(0,lastValue);
        }
    }
    public static void shiftAntiClockwise(int b){
        for(int j =0 ;j<b;j++){
            int firstValue = child_plateNo.get(0);
            for(int i = 0;i<child_plateNo.size();i++){
                child_plateNo.put(i,child_plateNo.get(i+1));
            }
            child_plateNo.put(child_plateNo.size()-1,firstValue);
        }
    }
    public static void displayPlateNo(int b){
        System.out.println(child_plateNo.get(b));
    }
    public static void displayMap(HashMap hmap){
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());
      }
    }
}
