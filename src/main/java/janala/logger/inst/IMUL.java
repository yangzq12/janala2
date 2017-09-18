package janala.logger.inst;

public class IMUL extends Instruction {
  public IMUL(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitIMUL(this);
  }
  
  public IMUL(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "IMUL iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
