// Rule 02. Expressions (XP)
// XP00-J. Do not ignore values returned by methods.

// Non-compliant code:
public void deleteFile(){
 
    File someFile = new File("someFileName.txt");
    // Do something with someFile
    someFile.delete();
  }