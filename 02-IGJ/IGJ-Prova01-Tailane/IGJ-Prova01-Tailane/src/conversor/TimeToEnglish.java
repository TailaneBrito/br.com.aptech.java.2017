/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author tailaneb
 * Adaptado de FONTE: http://stackoverflow.com/questions/35417473/convert-time-to-english-word
 */
public class TimeToEnglish {
    
    private String msn;

   
    public String time(int hour, int min){

    Date d = new Date();
    SimpleDateFormat SDF = new SimpleDateFormat ("hh:mm");
    
    //String sTime = SDF.format(d).toString();
    
    String sHours = String.valueOf(hour);
    String sMinutes = String.valueOf(min);
    try{ 
      int hours = Integer.parseInt(sHours);
      int minutes = Integer.parseInt(sMinutes);
      getTimeName(hours, minutes);
      String msg = getTimeName(hours, minutes);
      return msg;
    }catch( NumberFormatException e){
        return "invalid input";//affiche une erreur ici
    }
    
    }
    public static String getTimeName(int hours, int minutes){
      String time_name = ""; 

      if((hours>=1 && hours<=12) && (minutes>=0 && minutes<=59)){

        String hour_mint []={"", "One", "Two", "Three", "Four", "Five", "Six","Seven", "Eight", "Nine","Ten",
          "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen",
          "Twenty","Twenty one", "Twenty two", "Twenty three", "Twenty four", "Twenty five",
          "Twenty six","Twenty seven","Twenty eight", "Twenty nine"};


        String a;
        if (hours==12)
          a = hour_mint [1];// put 'one' if hour is 12
        else 
          a = hour_mint[hours+1]; // if hour is not 12 then store an hour ahead of given hour 

        
        if (minutes==0)
          time_name = hour_mint[hours]+" o'clock";
        else if (minutes==15)
          time_name = "Quarter past "+hour_mint[hours];
        else if (minutes==30)
          time_name = "Quarter past "+hour_mint[hours];
        else if (minutes==45)
          time_name = "Quarter to "+a;
        else if (minutes<30) // for minutes between 1-29
          time_name = hour_mint[minutes]+" past "+hour_mint[hours];      
        else // between 31-59
          time_name = hour_mint[60-minutes]+" to "+a;

      }
      else 
        time_name = "invalid time format";

      return time_name;
    }  
    
}
  

