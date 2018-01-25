package sk.akademiasovy.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {

    public void today()
    {
        Date date = new Date();

    }


    public void today2()
    {
        Date date = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy, EEEE, hh:mm:ss");
        System.out.println(sdf.format(date));

    }
}
