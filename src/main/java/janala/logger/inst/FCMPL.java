package janala.logger.inst;

public class FCMPL extends Instruction {
  public FCMPL(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitFCMPL(this);
  }
  public FCMPL(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "FCMPL iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
