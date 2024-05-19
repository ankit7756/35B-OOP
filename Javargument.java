public class Javargument {
    public static void main(String[] args) {
        if(args.length<2) {
            System.out.println("Not enough arguments");
            return;
        }
        System.out.println("The first args is " + args[0]);
        System.out.println("The second args is " + args[1]);

        int normalValue = 10;
        int parseInt = Integer.parseInt(args[1]);
        /* Note that the second argument must be number */
        int sum = normalValue + parseInt;
        System.out.println(sum);       
    }   
}
