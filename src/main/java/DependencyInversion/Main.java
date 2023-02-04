package DependencyInversion;

interface DBConnection{
  public int connect();
}

class MySQLConnection implements DBConnection{

  @Override
  public int connect() {
    return 0;
  }
}

public class Main {
  DBConnection dbConnection;

  public Main(DBConnection dbConnection){
    this.dbConnection = dbConnection;
  }

}
