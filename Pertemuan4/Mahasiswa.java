public class Mahasiswa{
	public static void main (String[]args){
	System.out.println("Ini adalah method utama");
	
	Mahasiswa rolaska = new Mahasiswa();
	rolaska.printNama();
	System.out.println(rolaska.calculateUmur());
}

public void printNama(){
	System.out.println("Rolaska");
}

public int calculateUmur(){
	int tahun_lahir = 1996;
	int tahun_sekarang = 2017;
	
	int umur;
	umur = tahun_sekarang-tahun_lahir;
	
	return umur;
}
}
