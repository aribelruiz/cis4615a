// Rule 14. Serialization (SER)
// SER01-J. Do not deviate from the proper signatures of serialization methods.

// Compliant code (readObject(), writeObject()): 
public class Ser implements Serializable {
    private final long serialVersionUID = 123456789;
    private Ser() {
      // Initialize
    }

    private void writeObject(final ObjectOutputStream stream)
    throws IOException {
        stream.defaultWriteObject();
    }
 
    private void readObject(final ObjectInputStream stream)
    throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
    }
  }