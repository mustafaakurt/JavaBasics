public class Loops {
    public static void main(String[] args) {

        // for
        int myNumbers[] = {12,15,18,21,24};
        int x = myNumbers[0] / 3 * 5;
        System.out.println(x);

        for (int i = 0; i < myNumbers.length; i++){
            x = myNumbers[i] / 3 * 5;
            System.out.println("for : "+ i + " "+ x);
        }
        // foreach
        for (int numbers : myNumbers){
            System.out.println("foreach : "+ numbers / 3 * 5);
        }

        // while
         int j=0;
        while (j<10){
            int m = j*10;
            System.out.println(m);
            j++;
        }

    }

}
