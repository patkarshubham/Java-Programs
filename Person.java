public class Person {
private String name;
public String getName(){
if(name.length()>16)
return "Name is too large!";
else
return name;
}
public void setName(String name) {
if(name!=null && name.length()>2)
this.name = name;
}
}

