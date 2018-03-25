


public class Main {

    public static void main(String[] args) {
        
        int[] A = {0,3,6,17,18,19,40,86};
        int val=17;
        int loc;
        
        printArray(A);        

        System.out.println("\n\n*** sequentialSearch ***");
        loc = sequentialSearch(A,val);
        System.out.println("Element " + val + " is at location: " + loc);
      
        
        System.out.println("\n\n*** binarySearch ***");
        loc = binarySearch(A,val);
        System.out.println("Element " + val + " is at location: " + loc);

    }
    
    
    // Things to ponder:
    // What is the worst case scenario here?
    // what is the best?
    public static int sequentialSearch(int[] a, int val) {
        for (int ii=0; ii < a.length; ++ii) 
            if (a[ii]==val)
                return ii;

         return -1;
    }
    
    public static int binarySearch(int[] a, int val) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (val < a[middle])
                right = middle - 1;
            else {
                if (val > a[middle])
                    left = middle + 1;
                else
                    return middle;
            }
        }
        return -1;
    }
    
    public static void printArray(int[] a) {
        for (int ii=0; ii<a.length ;++ii)
            System.out.print(a[ii] + " ,");
        System.out.println();
    }
    
    
    
}
