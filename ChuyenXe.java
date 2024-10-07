import java.util.Scanner;
public class ChuyenXe{
    protected int masoChuyen;
    protected String hotenTX;
    protected int soXe;
    protected double doanhThu;

public ChuyenXe(){}

public ChuyenXe(int masoChuyen, String hotenTX, int soXe, double doanhThu){
    this.masoChuyen = masoChuyen;
    this.hotenTX = hotenTX;
    this.soXe = soXe;
    this.doanhThu = doanhThu;
}

public int getMasoChuyen(){
    return masoChuyen;
}
public String getHotenTX(){
return hotenTX;
}
public int getSoXe(){
    return soXe;
}
public double getDoanhThu(){
    return doanhThu;
}
public void setMasoChuyen(int masoChuyen){
    this.masoChuyen = masoChuyen;
}
public void setHotenTX(String hotenTX){
    this.hotenTX = hotenTX;
}
public void setSoXe(int soXe){
    this.soXe = soXe;
}
public void setDoanhThu(double doanhThu){
    this.doanhThu=doanhThu;
}


protected Scanner sc = new Scanner(System.in);

public void nhap(){
    System.out.println("Nhap ma so chuyen: ");
    setMasoChuyen(Integer.parseInt(sc.nextLine()));

    System.out.println("Nhap ho ten TX: ");
    setHotenTX(sc.nextLine());

    System.out.println("Nhap so xe: ");
    setSoXe(Integer.parseInt(sc.nextLine()));

    System.out.println("Nhap doanh thu: ");
    setDoanhThu(Double.parseDouble(sc.nextLine()));
}

public void xuat(){
    System.out.println("--------------------------------");
    System.out.println("Ma so chuyen: " + getMasoChuyen());
    System.out.println("Ho ten Tai Xe: " + getHotenTX());
    System.out.println("So xe: " + getSoXe());
    System.out.println("Doanh thu: " + getDoanhThu());
    System.out.println("--------------------------------");
}}
