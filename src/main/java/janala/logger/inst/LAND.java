package janala.logger.inst;

public class LAND extends Instruction {
  public LAND(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }
  
  public LAND(int iid, int mid) {
	    super(iid, mid);
	  }


  public void visit(IVisitor visitor) {
    visitor.visitLAND(this);
  }

  @Override
  public String toString() {
    return "LAND iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
