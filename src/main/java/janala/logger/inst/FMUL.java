package janala.logger.inst;

public class FMUL extends Instruction {
  public FMUL(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitFMUL(this);
  }

  
  public FMUL(int iid, int mid) {
	    super(iid, mid);
	  }
  @Override
  public String toString() {
    return "FMUL iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
