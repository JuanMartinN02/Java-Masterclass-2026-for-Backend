public class CachedData {
    private int data;

    // Volatile tells the JVM and the CPU to read and write the variable directly from and to main memory (RAM)
    // rather than caching it in threads cache which could lead to errors.
    private volatile boolean flag;

    public CachedData(int data) {
        this.data = data;
        this.flag = false;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean flag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}