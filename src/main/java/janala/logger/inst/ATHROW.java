package janala.logger.inst;

public class ATHROW extends Instruction {
  public ATHROW(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitATHROW(this);
  }
  
  public ATHROW(int iid, int mid) {
	    super(iid, mid);
	  }


  @Override
  public String toString() {
    return "ATHROW iid=" + iid + " mid=" + mid + " tid=" + tid;
  }
}
