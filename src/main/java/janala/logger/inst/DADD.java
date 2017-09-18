package janala.logger.inst;

public class DADD extends Instruction {
  public DADD(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitDADD(this);
  }

  public DADD(int iid, int mid) {
	    super(iid, mid);
	  }
  @Override
  public String toString() {
    return "DADD iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
