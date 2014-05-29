
/**
 * Write a description of class CitiBike here.
 * 
 * String s=___ substring(  ,  )
 * int x = Integer.parseInt(s);------This would convert a string into an integer.
 * Double.parseDouble(s);---
 * 
 * @author Alston Chau 
 * @version (a version number or a date)
 */
public class CitiBike
{
    // instance variables - replace the example below with your own
    public String QS;
    public int availableDocs;
    public double lat;
    public double longi;
    public int availableBikes;
    

    /**
     * Constructor for objects of class CitiBike
     */
    public CitiBike(String data)
    {
        // initialise instance variables
        // String idStr=data.substring(data.indexOf(":")+1,data.indexOf(","));
        //id =Integer.parseInt(idStr);
        int start = data.indexOf("QS");
        int comma=data.indexOf(",");
        String QSstr = data.substring(start+3,comma);
        QS =QSstr;
        data=data.substring(data.indexOf(",")+1,data.length());
        data=data.substring(data.indexOf(",")+1,data.length());
        
        /*
         int comma2=data.indexOf(",");
        int startAD= data.indexOf("availableDocks");
        String ADstr= data.substring(startAD+15,comma2);
        availableDocs = Integer.parseInt(ADstr);
        
        data=data.substring(data.indexOf(",")+1,data.length());
        data=data.substring(data.indexOf(",")+1,data.length());
        
        int comma3=data.indexOf(",");
        int startLat= data.indexOf("latitude");
        String Latstr= data.substring(startLat+9,comma3);
        lat = Double.parseDouble(Latstr);
        
        data=data.substring(data.indexOf(",")+1,data.length());
        
        int comma4=data.indexOf(",");
        int startLong= data.indexOf("longitude");
        String Longstr= data.substring(startLong+10,comma4);
        longi = Double.parseDouble(Longstr);
        
        data=data.substring(data.indexOf(",")+1,data.length());
        data=data.substring(data.indexOf(",")+1,data.length());
        data=data.substring(data.indexOf(",")+1,data.length());
        
        int comma5=data.indexOf(",");
        int startAB= data.indexOf("availableBikes");
        String ABstr= data.substring(startAB+15,comma5);
        availableBikes = Integer.parseInt(ABstr);
        
        data=data.substring(data.indexOf(",")+1,data.length());
        
        */
        //
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getQS()
    {
        return QS;
    }
    
    public int getAvailableDocks()
    {
        return availableDocs ;
    }
    
    public double getLatitude()
    {
        return lat;
    }
    
    public double getLongitude()
    {
        return longi;
    }
    
    public int getAvailableBikes()
    {
        return availableBikes;
    }
    
    public int FindAllAvailableBikes()
    {
        return availableBikes;
    }
}

//
