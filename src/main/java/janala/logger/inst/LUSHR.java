package janala.logger.inst;

public class LUSHR extends Instruction {
  public LUSHR(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }
  
  public LUSHR(int iid, int mid) {
	    super(iid, mid);
	  }


  public void visit(IVisitor visitor) {
    visitor.visitLUSHR(this);
  }

  @Override
  public String toString() {
    return "LUSHR iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
