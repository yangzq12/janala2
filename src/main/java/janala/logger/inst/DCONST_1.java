package janala.logger.inst;

public class DCONST_1 extends Instruction {
  public DCONST_1(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitDCONST_1(this);
  }
  
  public DCONST_1(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "DCONST_1 iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
