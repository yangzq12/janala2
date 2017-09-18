package janala.logger.inst;

public class ARETURN extends Instruction {
  public ARETURN(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }
  public ARETURN(int iid, int mid) {
	    super(iid, mid);
	  }
  
  public void visit(IVisitor visitor) {
    visitor.visitARETURN(this);
  }

  @Override
  public String toString() {
    return "ARETURN iid=" + iid + " mid=" + mid + " tid=" + tid;
  }
}
