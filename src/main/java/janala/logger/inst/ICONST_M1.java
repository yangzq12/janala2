package janala.logger.inst;

public class ICONST_M1 extends Instruction {
  public ICONST_M1(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitICONST_M1(this);
  }
  
  public ICONST_M1(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "ICONST_M1 iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
