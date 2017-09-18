package janala.logger.inst;

public class D2L extends Instruction {
  public D2L(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitD2L(this);
  }
  
  
  public D2L(int iid, int mid) {
	    super(iid, mid);
	  }


  @Override
  public String toString() {
    return "D2L iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
