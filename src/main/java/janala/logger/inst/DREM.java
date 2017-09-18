package janala.logger.inst;

public class DREM extends Instruction {
  public DREM(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitDREM(this);
  }

  public DREM(int iid, int mid) {
	    super(iid, mid);
	  }
  @Override
  public String toString() {
    return "DREM iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
