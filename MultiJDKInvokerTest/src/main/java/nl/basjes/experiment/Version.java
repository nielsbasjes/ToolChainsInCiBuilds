package nl.basjes.experiment;

public class Version {

    public static String getCodeVersion() {
        return DependsOnJDK.getCodeVersion();
    }

    public static String getJavaVersion() {
        return DependsOnJDK.getJavaVersion();
    }

    public static String getJavaMajorVersion() {
        String version = getJavaVersion();
        String[] versionElements = version.split("\\.");
        String majorVersion = versionElements[0];
        if ("1".equals(majorVersion)) {
            majorVersion = versionElements[1];
        }
        return majorVersion;
    }
}
