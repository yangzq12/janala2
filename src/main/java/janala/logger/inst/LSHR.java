package janala.logger.inst;

public class LSHR extends Instruction {
  public LSHR(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }
  
  public LSHR(int iid, int mid) {
	    super(iid, mid);
	  }

  public void visit(IVisitor visitor) {
    visitor.visitLSHR(this);
  }

  @Override
  public String toString() {
    return "LSHR iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
