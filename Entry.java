public class Entry {
    
    private String date;
    private int weight;
    
    
    //constructors
    public Entry(String date, int weight){
        this.date = date;
        this.weight = weight;
        
    }
    
    //accessors
    public String getDate(){
        return date;
    }
    
    public int getWeight(){
        return weight;
    }

    //mutators
    public void setDate(String date) {
        this.date = date;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    //override 
    public String toString() {
        return "Date: " + date + ", Weight: " + weight + " kg";
    }
}

