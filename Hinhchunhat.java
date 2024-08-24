package HongNhung;

import java.lang.classfile.attribute.ModuleMainClassAttribute;
import java.util.Scanner;

public class Hinhchunhat {
	// khoi tao bien
	public double ChieuDai;
	public double ChieuRong;
	
	//Dong goi va rang buoc
	public double getChieuDai() {
		return ChieuDai;
	}
	public void setChieuDai(double d) {
		if (d>0) {
			ChieuDai = d;
		} else {
			System.out.println("Loi");
		}
		
	}
	public double getChieuRong() {
		return ChieuRong;
	}
	public void setChieuRong(double r) {
		if (r<=0) {
			System.out.println("Loi");
			
		} else {
			ChieuRong = r;
		}
	}
	
	// XAY DUNG PHUONG THUC
	public double getChuVi() {
		return (getChieuDai()+getChieuRong())*2;
	}
	public double getDienTich() {
		return getChieuDai()*getChieuRong();
	}
	
	// ToString
	public String toString() {
		
		return super.toString();
	}
	public static void main(String[] args) {
		// Khoi tao ham doi tuong
		Hinhchunhat h1= new Hinhchunhat();
		
		// cap nhat cac canh
		h1.setChieuDai(8);
		h1.setChieuRong(5);
		System.out.println("Ket qua cac canh la: ");
		System.out.println("Chieu dai hinh chu nhat la: "+h1.getChieuDai());
		System.out.println("Chieu rong hinh chu nhat la: "+h1.getChieuRong());
		System.out.println("Chu vi hinh chu nhat la: "+h1.getChuVi());
		System.out.println("Dien tich hinh chu nhat la: "+h1.getDienTich());
		
		// Khoi tao hinh chu nhat H2 cap nhat canh
		Hinhchunhat h2= new Hinhchunhat();
		System.out.println("Ket qua cac canh la: ");
		System.out.println("Chieu dai hinh chu nhat la: "+h2.getChieuDai());
		System.out.println("Chieu rong hinh chu nhat la: "+h2.getChieuRong());
		System.out.println("Chu vi hinh chu nhat la: "+h2.getChuVi());
		System.out.println("Dien tich hinh chu nhat la: "+h2.getDienTich());
		
		//Nhap mem
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tu ban phim");
		System.out.println("Nhap vao chieu dai HCN: ");
		double d= sc.nextDouble();
		h1.setChieuDai(d);
		System.out.println("Nhap vao chieu rong HCN: ");
		double r = sc.nextDouble();
		h1.setChieuRong(r);
		System.out.println("Ket qua nhap mem la: ");
		System.out.println("Chieu dai hinh chu nhat la: "+h1.getChieuDai());
		System.out.println("Chieu rong hinh chu nhat la: "+h1.getChieuRong());
		System.out.println("Chu vi hinh chu nhat la: "+h1.getChuVi());
		System.out.println("Dien tich hinh chu nhat la: "+h1.getDienTich());
		
				
	}

}
