// Rule 07. Exceptional Behavior (ERR)
// ERR01-J. Do not allow exceptions to expose sensitive information.

// Non-compliant code:
class ExceptionExample {
    public static void main(String[] args) {
   
      File file = null;
      try {
        file = new File(System.getenv("APPDATA") +
               args[0]).getCanonicalFile();
        if (!file.getPath().startsWith("c:\\homepath")) {
          System.out.println("Invalid file");
          return;
        }
      } catch (IOException x) {
        System.out.println("Invalid file");
        return;
      }
   
      try {
        FileInputStream fis = new FileInputStream(file);
      } catch (FileNotFoundException x) {
        System.out.println("Invalid file");
        return;
      }
    }
  }