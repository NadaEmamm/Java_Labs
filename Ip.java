
import java.util.regex.*;

public class Ip {
    private static final String VALIDATION = 
            "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    public static boolean isValidIP(String ipAddress) {
        Pattern pattern = Pattern.compile(VALIDATION);
        Matcher matcher = pattern.matcher(ipAddress);
        return matcher.matches();
    }

    public static void main(String[] args) {
        if (args.length == 1 && isValidIP(args[0])) {
            String[] split = args[0].split("\\.");
            for (String part : split) {
                System.out.println(part);
            }
        } else {
            System.out.println("Invalid IP address or no IP provided.");
        }
    }
}
