package janala.logger.inst;

public class DCMPG extends Instruction {
  public DCMPG(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitDCMPG(this);
  }

  public DCMPG(int iid, int mid) {
	    super(iid, mid);
	  }
  @Override
  public String toString() {
    return "DCMPG iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
