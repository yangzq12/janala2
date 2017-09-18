package janala.logger.inst;

public class CASTORE extends Instruction {
  public CASTORE(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitCASTORE(this);
  }

  public CASTORE(int iid, int mid) {
	    super(iid, mid);
	  }
  @Override
  public String toString() {
    return "CASTORE iid=" + iid + " mid=" + mid + " tid=" + tid;
  }
}
