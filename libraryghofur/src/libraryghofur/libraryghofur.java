package libraryghofur;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class libraryghofur {
       public static void main(String[] args)  {
       System.out.println("\nAbsolut -25 = "+Math.abs(-25));
       System.out.println("sin 0 = "+ Math.sin(0)+", cos 0 ="+Math.cos(0)+", tan 0 = "+Math.tan(0));
       System.out.println("9 pangkat 3 ="+Math.pow(9, 2));
       System.out.println("Floor 3.14 ="+Math.floor(3.14));
       
       System.out.println("\nClass Libraries Date");
       Date tanggal = new Date();
       System.out.println("original = "+tanggal);
       SimpleDateFormat sdf1 = new SimpleDateFormat ("dd-MM-yyyy");
       SimpleDateFormat sdf2 = new SimpleDateFormat ("dd MM YYYY");
       System.out.println("Format 1 = "+sdf1.format(tanggal));
       System.out.println("Format 2 = "+sdf2.format(tanggal));
       
       System.out.println("\n Library Calender");
       Calendar cal = Calendar.getInstance();
       cal.add(Calendar.DATE, 3 );
       Date tigaHariLagi = cal.getTime();
       System.out.println("3 Hari Lagi" +sdf2.format(tigaHariLagi));
       System.out.println("");
       
       System.out.println("Nama  = MOH ABDUL GHOFUR 02");
       System.out.println("Tugas = PBO");
       System.out.println("Kelas = XII RPL 2");       
                 
         }   
    }
