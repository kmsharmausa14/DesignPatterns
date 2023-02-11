package Command;

public class Client {

  public static void main(String[] args) {
    FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

    OpenFileCommand openFileCommand = new OpenFileCommand(fs);

    FileInvoker fileInvoker = new FileInvoker(openFileCommand);

    fileInvoker.excute();
  }
}
