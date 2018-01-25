package sk.akademiasovy.other;

public class MyClass {


    public String formatName (String name)
    {
        return name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
    }





    public boolean isEmailValid(String email)
    {
        if(!email.contains("@"))
            return false;
        if(email.length()<5)
        {
            return false;
        }
        int i;
        int wrongCharacters=0;
        int countOfAt=0;
        for (i=0;i<email.length();i++){
            Character z=email.charAt(i);
            if(Character.isAlphabetic(z) || Character.isDigit(z) || "- @_.".contains(z.toString()))
            {

                if(z.charValue()=='@')
                    countOfAt++;
                if (countOfAt==2)
                    return  false;
            }else
            {
                return false;
            }

        }
        return true;


    }


    }

