package cinta;
import java.util.Scanner;
public class Cinta {
    Scanner input=new Scanner (System.in);
    int masukan;
    public static void main(String[]args){
    Cinta aku=new Cinta();
    aku.sayang();
    }
     public void sayang(){
     System.out.println("apakah kamu sayang dia:");
     System.out.println("1.sayang banget......"
             + "Alasannya?");
     System.out.println("2.Tidak");
     
     System.out.print("jawaban: ");
     masukan=input.nextInt();
     
     switch (masukan){
         case 1:
             System.out.println("menurut saya dia baik,");
             System.out.println("tentu juga cantik wkwkw,");
             System.out.println("imut,dan orangnya itu lucu suka bercanda,");
             System.out.println("dan dia suka renang,meski ga tinggi tinggi wkwk,");
             System.out.println("dan kita saling support agar cita cita yg kita impikan bisa tercapai,");
             System.out.println("I LOVE YOU.");
             
             System.out.println("selamat ghofur,anda telah membuat dia semakin sayang sama anda" );
             
             
             lagi();
             break;
             
            case 2:
                 System.out.println("kamu salah");
                 System.out.println("jawaban yang benar adalah No.1");
                  lagi();
                  break;
                  
            default:
                System.out.println("Pilihan yang dimasukkan salah.Silahkan pilih no.2 atau no.1");
                
                                  
             
         }
     }
     public void lagi(){
     sayang();
     }
}
