package string;

import org.jetbrains.annotations.NotNull;

/*
A version number is a string that is used to identify the unique state of a software product.
A version number looks like a.b.c.d, where a, b, etc are numbers, so the version number is a string in
which numbers are separated by dots. These numbers generally represent the hierarchy from major
to minor (a is major and d is minor).
In this problem, we are given two version numbers. We need to compare them and conclude
which one is the latest version number (that is, which version number is greater).
 */
public class VersionAlgorithm {
    public String checkVersion(String version1, String version2) {
        if (version1 == null || version1.isEmpty()) return "version 2 is big";
        if (version2 == null || version2.isEmpty()) return "version 1 is big";

        int vNum1 = Integer.parseInt(version1.replaceAll("[.0]", ""));
        int vNum2 = Integer.parseInt(version2.replaceAll("[.0]", ""));

        if (vNum1 > vNum2)
            return "version 1 is big";

        if (vNum2 > vNum1)
            return "version 2 is big";

        return "Both version are equal";
    }

    // Method to compare two versions.
    // Returns 1 if v2 is smaller, -1 if v1 is smaller, 0 if equal
    public int versionCompare(@NotNull String v1, String v2) {
        // vNum stores each numeric part of version
        int vNum1 = 0, vNum2 = 0;

        // loop until both String are processed
        for (int i = 0, j = 0; (i < v1.length() || j < v2.length()); ) {
            // Storing numeric part of
            // version 1 in vNum1
            while (i < v1.length() && v1.charAt(i) != '.') {
                vNum1 = vNum1 * 10 + (v1.charAt(i) - '0');
                i++;
            }

            // storing numeric part
            // of version 2 in vNum2
            while (j < v2.length() && v2.charAt(j) != '.') {
                vNum2 = vNum2 * 10 + (v2.charAt(j) - '0');
                j++;
            }

            if (vNum1 > vNum2)
                return 1;

            if (vNum2 > vNum1)
                return -1;

            // if equal, reset variables and
            // go for next numeric part
            vNum1 = vNum2 = 0;
            i++;
            j++;
        }
        return 0;
    }
}
