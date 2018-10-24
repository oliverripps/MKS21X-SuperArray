public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(String[] s, int si){
    data = s;
    si = size;
  }
  public void clear(){
    String[] n = new String[size];
    data = n;
  }
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    return (data==this.clear());
  }
  public boolean add(String element){
    if (data.length == size){
      data.resize();
      data[data.length]=element;
    }
    else {
      data[size]=element;
  }
  return True;}

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    i= data[index];
    data[index]=element;
    return i;
  }
  public String toString(){
    String str='"[';
    for(int i =0; i<data.length;i++){
      str+=data[i];
      if (i != data.length-1){
      str+=",";}
    }
    str+='"]';
    return str;
  }
  public boolean contains(String element){
    for(int i=0;i<data.length;i++){
      if (data[i]==element){
        return True;
      }
    }
    return False;
  }


}
