package Command;

public class FileSystemReceiverUtil {
  public static FileSystemReceiver getUnderlyingFileSystem(){
    String osname = System.getProperty("os.name");
    System.out.println("Os name is " + osname);
    if(osname.contains("Windows"))
      return new WindowsFileSystemReceiver();
    else
      return new UnixFileSystemReceiver();
  }
}
