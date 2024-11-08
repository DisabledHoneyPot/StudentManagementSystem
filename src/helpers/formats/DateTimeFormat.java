package helpers.formats;

public class DateTimeFormat {
    public static String format = "dd/MM/yyyy";

    public static String getDateFormat(){
        return format;
    }

    public static void setDateFormat(String format){
        DateTimeFormat.format = format;
    }
}
