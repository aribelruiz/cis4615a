// Rule 13. Input Output (FIO)
// FIO03-J. Remove temporary files before termination.

// Non-compliant code (createTempFile(), deleteOnExit()):
class TempFile {
    public static void main(String[] args) throws IOException{
      File f = File.createTempFile("tempnam",".tmp");
      FileOutputStream fop = null;
      try {
        fop = new FileOutputStream(f);
        String str = "Data";
        fop.write(str.getBytes());
        fop.flush();
      } finally {
        // Stream/file still open; file will
        // not be deleted on Windows systems
        f.deleteOnExit(); // Delete the file when the JVM terminates
   
        if (fop != null) {
          try {
            fop.close();
          } catch (IOException x) {
            // Handle error
          }
        }
      }
    }
  }
