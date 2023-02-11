package Command;

interface FileSystemReceiver {
  void openFile();
  void writeFile();
  void closeFile();
}

class WindowsFileSystemReceiver implements FileSystemReceiver{

  @Override
  public void openFile() {
    System.out.println("Opening file in windows");
  }

  @Override
  public void writeFile() {
    System.out.println("Writing file in windows");
  }

  @Override
  public void closeFile() {
    System.out.println("Closing file in windows");
  }
}

class UnixFileSystemReceiver implements FileSystemReceiver{

  @Override
  public void openFile() {
    System.out.println("Opening file in Unix");
  }

  @Override
  public void writeFile() {
    System.out.println("Writing file in Unix");
  }

  @Override
  public void closeFile() {
    System.out.println("Closing file in Unix");
  }
}
