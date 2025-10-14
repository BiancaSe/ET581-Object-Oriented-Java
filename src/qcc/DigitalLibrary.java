package src.qcc;



// Subclass DigitalLibrary extending Library
//It demonstates covarriant return type, returning EBook ( subclass of Book) from overriden getBook()
public class DigitalLibrary extends Library {

    // Override getBook() with covariant return type 
    @Override
    public EBook getBook() {
        
        // This shows covariant return type ( a more specific return type is allowed)

        return new EBook("Java Basics", 15.0, 2.5);
    }
}
