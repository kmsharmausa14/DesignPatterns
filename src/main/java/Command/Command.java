package Command;

interface Command {
  void execute();
}

class OpenFileCommand implements Command{
  FileSystemReceiver fileSystemReceiver;

  public OpenFileCommand(FileSystemReceiver fileSystemReceiver){
    this.fileSystemReceiver = fileSystemReceiver;
  }

  @Override
  public void execute() {
    fileSystemReceiver.openFile();
  }
}

class WriteFileCommand implements Command{
  FileSystemReceiver fileSystemReceiver;

  public WriteFileCommand(FileSystemReceiver fileSystemReceiver){
    this.fileSystemReceiver = fileSystemReceiver;
  }

  @Override
  public void execute() {
    this.fileSystemReceiver.writeFile();
  }
}

class CloseFileCommand implements Command{
  FileSystemReceiver fileSystemReceiver;

  public CloseFileCommand(FileSystemReceiver fileSystemReceiver){
    this.fileSystemReceiver = fileSystemReceiver;
  }

  @Override
  public void execute() {
    fileSystemReceiver.closeFile();
  }
}


