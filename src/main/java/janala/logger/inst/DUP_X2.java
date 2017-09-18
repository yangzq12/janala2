package janala.logger.inst;

public class DUP_X2 extends Instruction {
  public DUP_X2(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitDUP_X2(this);
  }

  
  public DUP_X2(int iid, int mid) {
	    super(iid, mid);
	  }
  @Override
  public String toString() {
    return "DUP_X2 iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
