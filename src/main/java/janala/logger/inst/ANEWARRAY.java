package janala.logger.inst;

public class ANEWARRAY extends Instruction {
  String type;

  public ANEWARRAY(long tid, int iid, int mid, String type) {
    super(tid, iid, mid);
    this.type = type;
  }
  
  public ANEWARRAY(int iid, int mid, String type) {
	    super(iid, mid);
	    this.type = type;
	  }


  public void visit(IVisitor visitor) {
    visitor.visitANEWARRAY(this);
  }

  @Override
  public String toString() {
    return "ANEWARRAY iid=" + iid + " mid=" + mid + " tid=" + tid + " type=" + type;
  }
}
