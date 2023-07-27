class Loops1 {
    public static void main(String[] args) {
        
        int j=0;
        int k=0;

        do {
            System.out.println(k++);   //doesn't matter condition for the 1st time this loop will execute
            j++;
        } while(j<5);

        System.out.println("newloop");

      /*  while(j<10) //can be read as (as long as)
        {

            System.out.println(k);
            k++;
        }   */ 
    }
    
}
