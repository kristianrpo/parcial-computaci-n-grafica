package display;

public class Material {
    public double kA;
    public double kD;
    public double kS;
    public double kO;
    public double kR;
    public int n;

    public Material(double kA, double kD, double kS, double kO, double kR,int n) {
        this.kA = kA;
        this.kD = kD;
        this.kS = kS;
        this.kO = kO;
        this.kR = kR;
        this.n = n;
    }
}
