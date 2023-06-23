package ch8_exception;

public class ChainedExceptionEx {
    public static void main(String args[]) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException se) {
            InstallException ie = new InstallException("");
            ie.initCause(se);
            throw ie;
        } catch (MemoryException me) {
            InstallException ie = new InstallException("");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) {
            throw new SpaceException("0.");
        }
        if (!enoughMemory()) {
            throw new MemoryException("227");
        }
    }

    static void copyFiles() {
        // Code for copying files
    }

    static void deleteTempFiles() {
        // Code for deleting temporary files
    }

    static boolean enoughSpace() {
        // Code for checking if enough space is available for installation
        return false;
    }

    static boolean enoughMemory() {
        // Code for checking if enough memory is available for installation
        return true;
    }
}

class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}
