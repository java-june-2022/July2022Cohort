import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Collections {

    public static String greeting = "Why not what!";
    public String newGreet = "Hello Me!";

    public void greet() {
        System.out.println("Hello!");
    }

    public void casting() {

        // You can implicitly cast to another data type if the value range is valid
        // a byte contains numbers from -128 o 127
        // an int contains values from ~ -2 billion to ~2 billion

        // You can implicitly cast a byte to an int because the values in a byte fall inside the range of an int as well
        byte i = 100;
        int j = i; // See? No errors

        // You cannot go the other way around
        int k = 100;
        // byte l = k; // This results in a type mismatch error

        // try this!
        byte l = (byte) k; // This called explicit casting

        // Byte oi = 100;
        // Integer oj = ij; This will not work
        // Integer oj = (Integer) oi; This will also not work

        // Try this
        Integer oi = 100;
        Byte ob = oi.byteValue();




        // There is a converter method for each data type, give it a try!
        Integer num = 10;
        String numString = num.toString(10);

    }

    public void makeArray() {

        try {
            int[] nums = new int[5];
            int[] otherNums = { 1, 2, 3, 4, 5 };

            for (int num : otherNums) {
                // 1st loop: num = 1
                // 2nd loop: num = 2
                System.out.println(num);
                // If you try to access a collection while looping through it using an enhanced for loop, youll get an exception.
                // Try googling what that exception is. 
                
            }



            nums[1] = 22;
            nums[5] = 12;
            System.out.println(nums.length);
            System.out.println(Arrays.toString(nums));
        } catch (Exception e) {
            System.out.println("Something went wrong");
            System.out.println(e);
        }

    }

    public void makeArrayList() {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);

        System.out.println(nums.size());
        nums.remove(5);
        System.out.println(nums);
        System.out.println(nums.get(4));
    }

    public void makeHashMap() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Name", "Corey");
        map.put("Eye Color", "Green");
        map.put("Hair Color", "Brown");

        System.out.println(map);

        // This is another way to loop through with access to each key and value
        System.out.println(map.entrySet());
        
        // Looping through a hash map
        for (String key : map.keySet()) {
            System.out.printf("%s : %s%n", key, map.get(key));
        }

    }
}