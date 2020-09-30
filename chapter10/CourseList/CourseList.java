package chapter10.CourseList;

import java.util.ArrayList;

public class CourseList {
	private String isim;
	private ArrayList ogrenciler;
	
	
	public CourseList(String isim){
		this.isim=isim;
		ogrenciler = new ArrayList();
	}
	public void ogrenciEkle(String ogrenciIsmi){
		ogrenciler.add(ogrenciIsmi);
		}
	public void ogrenciCikart(String ogrenciIsmi){
		
			if(ogrenciler.contains(ogrenciIsmi)==false){
				throw new RuntimeException("Ogrenci bulunamadi");
			}
		ogrenciler.remove(ogrenciIsmi);
		
	}
	public String getIsim() {
		return isim;
	}
	
	public int getOgrenciSayisi() {
		return ogrenciler.size();
	}
	
	
	
}
