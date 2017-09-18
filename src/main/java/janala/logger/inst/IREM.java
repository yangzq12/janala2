package janala.logger.inst;

public class IREM extends Instruction {
  public IREM(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitIREM(this);
  }
  public IREM(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "IREM iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
