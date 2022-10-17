// Rule 14. Serialization (SER)
// SER01-J. Do not deviate from the proper signatures of serialization methods.

// Non-compliant code (readObject(), writeObject()): 
public class Ser implements Serializable {
    private final long serialVersionUID = 123456789;
    private Ser() {
      // Initialize
    }
    public static void writeObject(final ObjectOutputStream stream)
      throws IOException {
      stream.defaultWriteObject();
    }
    public static void readObject(final ObjectInputStream stream)
        throws IOException, ClassNotFoundException {
      stream.defaultReadObject();
    }
  }