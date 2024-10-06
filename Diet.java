import java.util.ArrayList;

public class Diet {
    private ArrayList<Entry> database;
    private int weightDifferential;
    private int netWeightChange;

    //default constuctor
    public Diet() {
        database = new ArrayList<>();
        weightDifferential = 0;
        netWeightChange = 0;
    }
    
    //addEntry method
    public void addEntry(Entry entry) { 
        database.add(entry);
    }
    
    //getEntry method
    public Entry getEntry(String date){
        for (Entry entry : database) {
            if (entry.getDate().equals(date)) {
                return entry;
            }
        }
        return null;
    }
    
    //viewList method
    public void viewList() {
        
        System.out.println("DATE\tWEIGHT\tDIFFERENCE");
        System.out.println("-----------------------------------------");
        
        
        int prevWeight = 0;
        int netWeightChange = 0;


        for (Entry entry : database) {
        int currentWeight = entry.getWeight();
        int weightDiff = 0;
        
        // Calculate weight difference 
        if (prevWeight != 0) {
            weightDiff = currentWeight - prevWeight;
        }
        
    
        System.out.println(entry.getDate() + "\t" + currentWeight + "\t" + weightDiff);
        
        prevWeight = currentWeight;
        
        }
        
        if (!database.isEmpty()) {
            int firstWeight = database.get(0).getWeight();
            int lastWeight = database.get(database.size() - 1).getWeight();
            netWeightChange = lastWeight - firstWeight;
        }
        
       
        System.out.println("-------------------------------");
        System.out.println("Net Weight Loss/Gain = " + netWeightChange);
        System.out.println("-------------------------------");
        
  
        
    
}

}