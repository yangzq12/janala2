package janala.logger.inst;

public class DCMPL extends Instruction {
  public DCMPL(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitDCMPL(this);
  }

  public DCMPL(int iid, int mid) {
	    super(iid, mid);
	  }
  @Override
  public String toString() {
    return "DCMPL iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
