package janala.logger.inst;

public class IRETURN extends Instruction {
  public IRETURN(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitIRETURN(this);
  }
  
  public IRETURN(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "IRETURN iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
