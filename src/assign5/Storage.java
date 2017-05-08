package assign5;
/*
public class Storage {
private int num;

public int getNum() {
	return num;
}

public void setNum(int num) {
	this.num = num;
}

@Override
public String toString() {
	return "Storage [num=" + num + "]";
}

}
*/
class Storage{
    int  i;
    boolean printed = true;
    public void setValue(int i){
          this.i = i;
    }
    public int getValue(){
          return this.i;
    }
    public boolean isPrinted() {
          return printed;
    }
    public void setPrinted(boolean p) {
          printed = p;
    }
}