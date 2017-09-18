package janala.logger.inst;

public class D2I extends Instruction {
  public D2I(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitD2I(this);
  }

  
  public D2I(int iid, int mid) {
	    super(iid, mid);
	  }
  
  @Override
  public String toString() {
    return "D2I iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
