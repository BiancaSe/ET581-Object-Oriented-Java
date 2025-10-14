package src.qcc;



// Subclass DigitalLibrary extending Library
public class DigitalLibrary extends Library {

    // Override getBook() with covariant return type (EBook is a subclass of Book)
    @Override
    public EBook getBook() {
        return new EBook("Java Basics", 15.0, 2.5);
    }
}
