package janala.logger.inst;

public class ISHR extends Instruction {
  public ISHR(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitISHR(this);
  }
  
  public ISHR(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "ISHR iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
