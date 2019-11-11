package corejava.serializations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample {
  public static void main(String[] args)
  {
    User user=new User();
    user.setUserId(1);
    user.setUserName("rishabh");
    try{
      ObjectOutputStream ob=new ObjectOutputStream(new FileOutputStream("user.json"));
      ob.writeObject(user);
      System.out.println(user);
      ObjectInputStream oi=new ObjectInputStream(new FileInputStream("user.json"));
      User u=(User)oi.readObject();
      System.out.println(u);
      System.out.println("both objects are equal="+(user==u));
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
class User implements Serializable{

  private static  final Long serialVersionUID=4395039L;
  private int userId;

  private transient String userName="default";

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override public String toString() {
    return "User{" +
        "userId=" + userId +
        ", userName='" + userName + '\'' +
        '}';
  }



}