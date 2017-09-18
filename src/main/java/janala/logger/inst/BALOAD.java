package janala.logger.inst;

public class BALOAD extends Instruction {
  public BALOAD(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitBALOAD(this);
  }

  public BALOAD(int iid, int mid) {
	    super(iid, mid);
	  }
  
  @Override
  public String toString() {
    return "BALOAD iid=" + iid + " mid=" + mid + " tid="+tid;
  }
}
