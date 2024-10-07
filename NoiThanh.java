public class NoiThanh extends ChuyenXe {
    private int soTuyen;
    private double soKilomet;

    public NoiThanh(){
        super();
    }

    public NoiThanh(int masoChuyen, String hotenTX, int soXe, double doanhThu, int soTuyen, double soKilomet){
        super(masoChuyen, hotenTX, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKilomet = soKilomet;
    }

    public int getSoTuyen(){
        return soTuyen;
    }

    public double getSoKilomet(){
        return soKilomet;
    }

    public void setSoTuyen(int soTuyen){
        this.soTuyen = soTuyen;
    }

    public void setSoKilomet(double soKilomet){
        this.soKilomet = soKilomet;
    }

    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Moi nhap so tuyen: ");
        setSoTuyen(Integer.parseInt(sc.nextLine()));
        System.out.println("Moi nhap so Kilomet: ");
        setSoKilomet(Double.parseDouble(sc.nextLine()));
    }

    @Override
    public void xuat(){
        super.xuat();
        System.out.println("--------------------------------");
        System.out.println("Ma so chuyen: " + getMasoChuyen());
        System.out.println("Ho ten Tai Xe: " + getHotenTX());
        System.out.println("So xe: " + getSoXe());
        System.out.println("So tuyen: " + getSoTuyen());
        System.out.println("So kilomet: " + getSoKilomet());
        System.out.println("Doanh thu: " + getDoanhThu());
        System.out.println("--------------------------------");
    }

}
