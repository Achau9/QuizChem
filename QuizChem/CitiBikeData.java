import java.util.*;
import java.io.*;
/**
 * Write a description of class CitiBikeData here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CitiBikeData
{
    // instance variables - replace the example below with your own
    private CitiBike allData[];

    /**
     * Constructor for objects of class CitiBikeData
     */
    public CitiBikeData()
    {
        // initialise instance variables
        initArrays();
    }
    
    public void initArrays(){
        try{

        ArrayList<CitiBike> tempData = new ArrayList<CitiBike>();
        Scanner scan = new Scanner(new File("citibikeDataFull.rtf")).useDelimiter("@");
        while(scan.hasNext()){
            tempData.add(new CitiBike(scan.next()));
        }
        allData = new CitiBike[tempData.size()];
        for(int i=0; i<allData.length; i++)
            allData[i] = tempData.get(i);
        }catch(Exception e){
            System.out.println("Problem with file: "+e);
        }
    }
    public void printID(){
        System.out.println(allData[0].getQS());
    }
    
    public void printAllAvailiableBike(){
        //int allBikes=allData[0].getID()+allData[1].getID()+allData[2].getID()+allData[3].getID()+allData[4].getID();
        /*int comma5=allData.indexOf(",");
        for(int i=0; i<allData.length; i++){
            if(indexOf("availableBikes")){
                String ABstr= allData.substring(startAB+15,comma5);
                availableBikes = Integer.parseInt(ABstr);
                availableBikes= availableBikes+availableBikes;
        }
        System.out.println(allBikes);
        return availableBikes;
        */
       int bikes=0;
        for(int i = 0; i < allData.length; i++){
            
          bikes = bikes + allData[i].getAvailableBikes();
            
           }
        
        System.out.println(bikes);
    }
}
