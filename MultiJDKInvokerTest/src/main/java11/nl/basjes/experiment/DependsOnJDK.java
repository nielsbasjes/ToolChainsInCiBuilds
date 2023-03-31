package nl.basjes.experiment;

import java.util.stream.Collectors;

public class DependsOnJDK {
    public static String getCodeVersion() {
        return "11";
    }

    public static String getJavaVersion() {
        return Runtime.version()
            .version()
            .stream()
            .limit(3)
            .map(Object::toString)
            .collect(Collectors.joining("."));
    }
}
