
public class Name
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String middleName;
    private String lastName;

    /**
     * Constructor for objects of class Name
     */
    public Name(String first, String middle, String last)
    {
        this.firstName = first;
        this.middleName = middle;
        this.lastName = last;
    }
    
    public String getFirst(){
        return(this.firstName);
    }
    
    public String getMiddle(){
        return(this.middleName);
    }
    
    public String getLast(){
        return(this.lastName);
    }
    
    public String firstMiddleLast(){
        return( this.firstName + " " + this.middleName + " " + this.lastName);
    }

    public String lastFirstMiddle(){
        return( this.lastName + " " +this.firstName + " " + this.middleName);
    }
    
    public boolean equals(Name otherName){
        if(this.firstMiddleLast().equalsIgnoreCase(otherName.firstMiddleLast())){
            return true;
        }
        
        else{
            return false;
        }
        
    }
    
    public String initial(){
        String initialD = this.firstName.substring(0) + this.middleName.substring(0) + this.lastName.substring(0);
        
        return initialD.toUpperCase();
    }
    
    public int length(){
        return(this.firstMiddleLast().length() - 3);
    }
}
