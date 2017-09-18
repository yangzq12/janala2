package janala.logger.inst;

public class FADD extends Instruction {
  public FADD(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitFADD(this);
  }
  
  public FADD(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "FADD iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
