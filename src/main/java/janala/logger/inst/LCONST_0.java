package janala.logger.inst;

public class LCONST_0 extends Instruction {
  public LCONST_0(long tid,int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitLCONST_0(this);
  }

  
  public LCONST_0(int iid, int mid) {
	    super(iid, mid);
	  }
  
  @Override
  public String toString() {
    return "LCONST_0 iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
