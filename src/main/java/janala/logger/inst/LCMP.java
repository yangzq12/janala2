package janala.logger.inst;

public class LCMP extends Instruction {
  public LCMP(long tid,int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitLCMP(this);
  }
  
  public LCMP(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "LCMP iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
