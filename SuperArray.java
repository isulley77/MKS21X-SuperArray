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
    
   
    public void set(int index, String str){
       if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException();
        }
        
        SA[index] = str;
    }
    
   
    public String toString(){

        String str = "";
        str += "{";
        
        for(int i = 0; i < size(); i++){
            str += SA[i] + ", ";
        }
        
        str += "}";
        return str;
    }
    
    public boolean contains(String str){
        
        for(int i = 0; i < size; i++){
            if(SA[i].equals(str)){
                return true;
            }
        }
        
        return false;
        
    }


    public void add(int index, String str){
        if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException();
        }
        if(data.length == size()){
            resize();
        }
        for(int i = size(); i > -1; i--){
            if(i == index){
                data[i] = str;
            }
            if(index < i){
                data[i] = data[i-1];
            }
        }
        size++;
    }
    
    public void resize(){
    
        String[] newAry = new String[data.length * 2 + 1];
        
        for(int i = 0; i < data.length; i++){
        
            newAry[i] = data[i];
        }
        
        data = newAry;
    }
        
        
    }
  public int indexOf(String str){
  
    for(int i = 0; i < size(); i++){
        if(data[i].equals(str)){
            return i;
        }
    }
    return -1;
  }
        

       
   
    public int lastIndexOf(String str){
            
        for(int i = size() - 1; i > -1; i--){
            if(data[i].equals(str)){
                return i;
            }
        }
        return -1;
    }
 
 }
 /*    
  
    public String remove(index){
        
    }
    
    public boolean remove(str){
        
    }

*/    
    
}
