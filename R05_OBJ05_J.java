// Rule 05. Object Orientation (OBJ)
// OBJ05-J. Do not return references to private mutable class members.

// Compliant code:
class MutableClass {
    private Date d;
   
    public MutableClass() {
      d = new Date();
    }
   
    public Date getDate() {
        return (Date)d.clone();
      }
  }
