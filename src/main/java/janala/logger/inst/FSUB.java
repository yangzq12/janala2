package janala.logger.inst;

public class FSUB extends Instruction {
  public FSUB(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitFSUB(this);
  }
  
  public FSUB(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "FSUB iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
