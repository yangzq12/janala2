package janala.logger.inst;

public class FNEG extends Instruction {
  public FNEG(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitFNEG(this);
  }
  
  public FNEG(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "FNEG iid=" + iid + " mid=" + mid + " tid=" + tid;
  }
}
