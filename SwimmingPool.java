package ınheritance;

public class SwimmingPool extends Pool {
    boolean hasDivingBoard;

    public SwimmingPool(int length, int width, int depth, boolean hasDivingBoard) {
        super(length, width, depth);
        this.hasDivingBoard = hasDivingBoard;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("SwimmingPool equals method is invoked");
        if (this == obj) return true;
        if (!(obj instanceof SwimmingPool)) return false;
        if (!super.equals(obj)) return false;
        SwimmingPool that = (SwimmingPool) obj;
        return hasDivingBoard == that.hasDivingBoard;
    }
}
