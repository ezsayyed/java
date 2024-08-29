public class arayye {

    public static void main(String[] args) {
         int student[][] = new int[4][];
            student[0] = new int[]{44,55,67,77};
            student[1] = new int[]{38};
            student[2] = new int[]{87,97};
            student[3] = new int[]{68,78,88};

            for(int[] arr:student){
                for(int n:arr){

                    System.out.print(n+" ");
                }
                System.out.println();
            }
    }
    
}
