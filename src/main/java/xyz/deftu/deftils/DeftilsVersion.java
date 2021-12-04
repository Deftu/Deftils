package xyz.deftu.deftils;

public class DeftilsVersion {

    public static final DeftilsVersion CURRENT = new DeftilsVersion(1, 1, 0);

    public final int major;
    public final int minor;
    public final int patch;

    public final String version;

    public DeftilsVersion(int major, int minor, int patch) {
        this.major = major;
        this.minor = minor;
        this.patch = patch;

        this.version = major + "." + minor + "." + patch;
    }

    public boolean isAtLeast(int major, int minor) {
        return this.major > major || (this.major == major && this.minor >= minor);
    }

    public boolean isAtLeast(int major, int minor, int patch) {
        return this.major > major || (this.major == major && (this.minor > minor || this.minor == minor && this.patch >= patch));
    }

}