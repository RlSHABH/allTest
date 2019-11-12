package com.demo.interview;

import java.util.HashMap;

public class HashMapExample {
  public static void main(String[] args) {
    User user = new User(1, "rishbah");
    HashMap m=new HashMap();
    m.put(user,1);
    System.out.println(m.containsKey(user));
    user.setName("bajpai");
    // equals method will not be called because o1==o2 is true .
    System.out.println(m.containsKey(user));// True
    // equals method will  be called because o1==o2 is not true .
    System.out.println(m.containsKey(new User(1, "bajpai")));// true
 }
}

  class User{
   private int id;
    private String name;

    public User(int id,String name)
    {
      this.id=id;
      this.name=name;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    @Override public boolean equals(Object o) {
      System.out.println("equals called");
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      User user = (User) o;
      return id == user.id &&
          name.equals(user.name);
    }


    @Override public int hashCode() {
      System.out.println("hashcode called");
      return 1;
    }

    @Override public String toString() {
      System.out.println("toString called");
      return "User{" +
          "id=" + id +
          ", name='" + name + '\'' +
          '}';
    }
  }

