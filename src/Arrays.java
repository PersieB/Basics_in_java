ublic class Arrays {
    public static void main(String[] args){
        //int value = 7;
        //int[] values;
        // allocating the memory and specifying the values of a list
        /*
        values = new int[4];
        values[0] = 20;
        values[1] = 10;
        values[2] = 15;
        values[3] = 5;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        */
        //easier way of defining an array
        int[] values = {1,2,3,4,5,6,7,8,9};
        // iterating through the list
        for(int i = 0; i < values.length; i++){
            System.out.println(values[i]);
        }
    }



}
