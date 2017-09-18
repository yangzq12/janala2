package janala.logger.inst;

public class BASTORE extends Instruction {
  public BASTORE(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitBASTORE(this);
  }

  public BASTORE(int iid, int mid) {
	    super(iid, mid);
	  }
  
  @Override
  public String toString() {
    return "BASTORE iid=" + iid + " mid=" + mid + " tid=" + tid;
  }
}
