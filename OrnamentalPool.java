package ınheritance;

class OrnamentalPool extends Pool {
    boolean hasFountain;

    public OrnamentalPool(int length, int width, int depth, boolean hasFountain) {
        
    	super(length, width, depth);
        this.hasFountain = hasFountain;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("OrnamentalPool equals method is invoked");
        if (this == obj) return true;
        if (!(obj instanceof OrnamentalPool)) return false;
        if (!super.equals(obj)) return false;
        OrnamentalPool that = (OrnamentalPool) obj;
        return hasFountain == that.hasFountain;
    }
}
