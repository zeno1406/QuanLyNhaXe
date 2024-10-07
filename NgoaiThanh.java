
public class NgoaiThanh extends ChuyenXe{
    private String noiDen;
    private int soNgayDiDuoc;

    public NgoaiThanh(){}

    public NgoaiThanh(String noiDen, int soNgayDiDuoc){
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen(){
        return noiDen;
    }

    public int getSoNgayDiDuoc(){
        return soNgayDiDuoc;
    }

    public void setNoiDen(String noiDen){
        this.noiDen = noiDen;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc){
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    public void nhap() {
        System.out.println("Nhap noi den: ");
        noiDen = sc.nextLine();
        System.out.println("Nhap so ngay di duoc: ");
        soNgayDiDuoc = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void xuat(){

    }
}

