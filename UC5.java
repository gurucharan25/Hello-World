public class UC5 {

    public static void main(String[] args) {

        String names;


        if (args.length == 0) {
            names = "World";
        } else {

            StringBuilder sb = new StringBuilder();


            for (String name : args) {
                sb.append(name).append(", ");
            }


            sb.setLength(sb.length() - 2);

            names = sb.toString();
        }


        System.out.println("Hello, " + names + "!");
    }
}