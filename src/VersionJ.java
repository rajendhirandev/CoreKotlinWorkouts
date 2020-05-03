
import ObjectClass.DemoUtils;

public class VersionJ {
    public static void main(String[] args) {
        /*VersionJ versionJ = new VersionJ();
        int x = versionJ.compareVersion("1.23.7", "1.23.42.24");
        String status = "Both version are same";
        switch (x) {
            case 1:
                status = "Current Version is higher";
                break;
            case -1:
                status = "Current Version is lower";
                break;
        }
        System.out.println("StatusVal :" + x + "\nMsg: " + status);*/


      /*  String status = "Both version are same";
        try {
            Version currentVersion = new Version("1.23.42");
            Version configVersion = new Version("1.24.42-alpha");
            int x = currentVersion.compareTo(configVersion);
            switch (x) {
                case 1:
                    status = "Current Version is higher";
                    break;
                case -1:
                    status = "Current Version is lower";
                    break;
            }
            System.out.println("StatusVal :" + x + "\nMsg: " + status);
            System.out.println("" + currentVersion.equals(configVersion));
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        System.out.println(DemoUtils.ConCat("Tes","Tesss"));
    }

    private int compareVersion(String currVer, String configVer) {
        String[] currentVersion = currVer.split("\\.");
        String[] configVersion = configVer.split("\\.");

        int versionIndex = 0;
        int currVerLen = currentVersion.length;
        int conVerLen = configVersion.length;

        while (versionIndex < currVerLen || versionIndex < conVerLen) {
            if (versionIndex < currVerLen && versionIndex < conVerLen) {
                if (Integer.parseInt(currentVersion[versionIndex]) < Integer.parseInt(configVersion[versionIndex])) {
                    return -1;
                } else if (Integer.parseInt(currentVersion[versionIndex]) > Integer.parseInt(configVersion[versionIndex])) {
                    return 1;
                }
            } else if (versionIndex < currVerLen) {
                if (Integer.parseInt(currentVersion[versionIndex]) != 0) {
                    return 1;
                }
            } else {
                if (Integer.parseInt(configVersion[versionIndex]) != 0) {
                    return -1;
                }
            }
            versionIndex++;
        }
        return 0;
    }
}
