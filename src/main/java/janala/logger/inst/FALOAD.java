package janala.logger.inst;

public class FALOAD extends Instruction {
  public FALOAD(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitFALOAD(this);
  }
  public FALOAD(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "FALOAD iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
