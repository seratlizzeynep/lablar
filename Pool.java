package ınheritance;

public class Pool {
    int length, width, depth;

    public Pool(int length, int width, int depth) {
        this.length = length;
        this.width = width;
        this.depth = depth;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Pool equals method is invoked");
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pool pool = (Pool) obj;
        return length == pool.length && width == pool.width && depth == pool.depth;
    }
}
