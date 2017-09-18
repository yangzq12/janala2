package janala.logger.inst;

public class IUSHR extends Instruction {
  public IUSHR(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitIUSHR(this);
  }
  
  public IUSHR(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "IUSHR iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
