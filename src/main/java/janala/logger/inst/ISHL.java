package janala.logger.inst;

public class ISHL extends Instruction {
  public ISHL(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitISHL(this);
  }
  
  public ISHL(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "ISHL iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
