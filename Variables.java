public class Variables {
    public static void main(String[] args) {
        System.out.println("Hello Android");
        System.out.println(5*2);

        //Variables
        int age = 20;
        System.out.println(10*age);
        System.out.println(age/5);

        //Integer - Long
        int x =5;
        int y=11;
        System.out.println(y/x);
        //output is 2 because they are integer

        long myLong = 10;
        System.out.println(myLong/5);

        //Double - Float
        double z = 5.0;
        double a = 11.0;
        System.out.println(a/z);

        float myFloat = 11.0f;
        System.out.println(myFloat/5);

        double pi = 3.14;
        int r = 5;
        System.out.println("Dairenin çevresi : " + 2 * pi * r);

        //String
        String name = "James";
        String surname = "Hide";
        System.out.println(name+ " "+ surname);

        //Boolean
        boolean isAlive = true;
        isAlive = false;
        System.out.println(isAlive);

        //Final
        final int myInteger = 5;
        System.out.println("myInteger:" + myInteger);
        /*
        myInteger = 4;
        System.out.println("myInteger:" + myInteger);
        */ 

    }
}

