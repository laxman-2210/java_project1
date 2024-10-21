class Binarytriangle{
    public static void main(String[] args){
        int n = 4;
        int rows, cols;

        for (rows = 0; rows < n; rows++)
        {
            for(cols = 0; cols <= rows; cols++)
            {
                if (((rows + cols) % 2) == 0)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("1");
                }
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}