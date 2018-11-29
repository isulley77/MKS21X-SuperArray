class SuperArray{
    
    private String[] SA;
    private int size;
    
    
    //SuperArray Constructor
    public SuperArray(){
        
        
        SA = new String[10];  //initializes with length 10
        size = 0;
    }
    
    public SuperArray(int startingCapacity){
        
        if(startingCapacity < 0){
            throw new IndexOutOfBoundsException();
        }
        
        SA = new String[startingCapacity];
        
    }
    
    //sets all indexs to null
    public void clear(){
        
        SA = new String[10];
        size = 0;
    }
    
    //returns size variable 
    public int size(){
    
        return size;
    /*
        int counter = 0;
        
        for(int i = 0; i < size; i++){
            
            if(SA[i] != null){
                counter++;
            }
        return counter;
        }
    */
    }
    

    public boolean isEmpty(){
        
        return size == 0;
    }
   
    public boolean add(String str){
        
        if(size == SA.length){
            //resize();
        }
        
        SA[size] = str;
        size ++;
        return true;
    }
    
    
    
    public String get(int index){ 
   
        if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException();
        }
        
        return SA[index]; 
    }
    
/*    
    public String set(index, str){
        
    }
    
    
    public String toString(){

    }
    
    
    public boolean contains(str){
        
    }
    
    public void add(index, str){
        
    }
    
    public int indexOf(str){
        
    }
    
    public int lastIndexOf(str){
        
    }
    
    public String remove(index){
        
    }
    
    public boolean remove(str){
        
    }

*/    
    
}
