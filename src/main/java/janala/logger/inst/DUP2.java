package janala.logger.inst;

public class DUP2 extends Instruction {
  public DUP2(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitDUP2(this);
  }
  public DUP2(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "DUP2 iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
