package janala.logger.inst;

public class ACONST_NULL extends Instruction {
  public ACONST_NULL(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitACONST_NULL(this);
  }
  public ACONST_NULL(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "ACONST_NULL iid=" + iid + " mid=" + mid + " tid=" + tid;
  }
}
