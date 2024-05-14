package day_02_DataCastingQuestions;

public class C06_StringManupilations {

    public static void main(String[] args) {


       // Bir metin içindeki kelimenin nasıl aranacağını
        // ve eger varsa hangi indexte bulunduğunu gösteren bir kod yazın.


        String metin ="Java candir, gerisi heyecandir.";

        int arananIndex = metin.indexOf("can");

        if (arananIndex == -1){

            System.out.println("\"Can\" kelimesi metinde gecmiyor.");

        } else {
            System.out.println("\"Can\" kelimesi metinde " + arananIndex + " .indexde bulunuyor");

        }







    }
}
