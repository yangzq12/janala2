package janala.logger.inst;

public class FCONST_2 extends Instruction {
  public FCONST_2(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitFCONST_2(this);
  }
  
  public FCONST_2(int iid, int mid) {
	    super(iid, mid);
	  }


  @Override
  public String toString() {
    return "FCONST_2 iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
