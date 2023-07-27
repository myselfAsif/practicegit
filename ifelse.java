class ifelse {

    public static void main (String []args )

    {

        int num1=30;
        int num2=10;
        int num3=20;

        if( num1<num2 && num1<num3)
        {
            System.out.println(num1 +" "+ "number 1 is samller");
            
        }
        else if (num2<num1 && num2<num3)
        {
            System.out.println(num2 +" "+ "num2 is smaller");
        }
        else 
        {
            System.out.println(num3 +" "+ "number 3 is smaller");
        }

      //  int result = (num1<num2)? (num1<num3)?num1:num3:num2;
        //System.out.println(result);
    }    
}