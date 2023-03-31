package nl.basjes.experiment;

public class DependsOnJDK {
    public static String getCodeVersion() {
        return "8";
    }

    public static String getJavaVersion() {
        return System.getProperty("java.version");
    }
}
