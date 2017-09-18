package janala.logger.inst;

public class IADD extends Instruction {
  public IADD(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitIADD(this);
  }
  
  public IADD(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "IADD iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
