package janala.logger.inst;

public class DCONST_0 extends Instruction {
  public DCONST_0(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitDCONST_0(this);
  }

  public DCONST_0(int iid, int mid) {
	    super(iid, mid);
	  }
  @Override
  public String toString() {
    return "DCONST_0 iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
