package helpers.validators;

import helpers.formats.DateTimeFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateValidate implements common{
    private final String df = DateTimeFormat.getDateFormat();

    @Override
    public boolean isValid(String validateString) {
        DateFormat format = new SimpleDateFormat(df);
        format.setLenient(false);
        try{
            format.parse(validateString);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
