package janala.logger.inst;

public class LREM extends Instruction {
  public LREM(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitLREM(this);
  }

  public LREM(int iid, int mid) {
	    super(iid, mid);
	  }

  
  @Override
  public String toString() {
    return "LREM iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
