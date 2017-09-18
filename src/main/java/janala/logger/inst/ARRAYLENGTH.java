package janala.logger.inst;

public class ARRAYLENGTH extends Instruction {
  public ARRAYLENGTH(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitARRAYLENGTH(this);
  }
  public ARRAYLENGTH(int iid, int mid) {
	    super(iid, mid);
	  }
  @Override
  public String toString() {
    return "ARRAYLENGTH iid=" + iid + " mid=" + mid + " tid="+tid;
  }
}
