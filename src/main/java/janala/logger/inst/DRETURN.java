package janala.logger.inst;

public class DRETURN extends Instruction {
  public DRETURN(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitDRETURN(this);
  }
  
  public DRETURN(int iid, int mid) {
	    super(iid, mid);
	  }
  @Override
  public String toString() {
    return "DRETURN iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
