package Main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String kullanıcıAdi,sifre;
	
	Scanner ınp=new Scanner(System.in);
	
	System.out.println("Kullanıcı Adı: ");
	kullanıcıAdi=ınp.nextLine();
	System.out.println("Şifrenizi Giriniz: ");
	sifre=ınp.nextLine();
	
	if(kullanıcıAdi.equals("java")&&sifre.equals("java123")) {
		System.out.println("Sisteme Giriş Yaptınız");
	}
	else {
		System.out.println("Sisteme Giriş Yapamadınız..");
		System.out.println("Şifreyi değiştirmek istiyor musunuz (evet veya hayır giriniz.)");
		String reply;
		reply=ınp.nextLine().toLowerCase();
		
		if(reply.equals("evet")) {
			System.out.println("Yeni şifrenizi giriniz: ");
			String yeniSifre;
			yeniSifre=ınp.nextLine();
			if(reply.equals("hyaır")) {
				System.out.println("Sisteme giriş yapamadınız");
			}
			
			if(yeniSifre.equals(sifre)) {
				System.out.println("Şifre oluşturulamadı");
				while (true) {
					System.out.println("Yeni şifreniz eski şifrenizle aynı olamaz..");
					System.out.println("Yeni Şifrenizi Giriniz: ");
					yeniSifre=ınp.nextLine();
				
				
					
					
				
				
						if(yeniSifre.equals(yeniSifre)) {
							System.out.println("Şifre oluşturuldu");
							break;
				        }
				}
			}
			else {
				System.out.println("Şifreniz oluşturuldu");
			}
					
			
					
				
				
		 	}else {
		 		System.out.println("giriş yapamadınız..");
		 		return;
		 		
		 	}
			
		}
	}
   }
