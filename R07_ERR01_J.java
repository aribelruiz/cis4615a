// Rule 07. Exceptional Behavior (ERR)
// ERR01-J. Do not allow exceptions to expose sensitive information.

// Non-compliant code:
class ExceptionExample {
    public static void main(String[] args) throws FileNotFoundException {
      // Linux stores a user's home directory path in
      // the environment variable $HOME, Windows in %APPDATA%
      FileInputStream fis =
          new FileInputStream(System.getenv("APPDATA") + args[0]); 
    }
  }