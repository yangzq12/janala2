package janala.logger.inst;

public class F2L extends Instruction {
  public F2L(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitF2L(this);
  }
  
  public F2L(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "F2L iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
