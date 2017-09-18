package janala.logger.inst;

public class ISUB extends Instruction {
  public ISUB(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitISUB(this);
  }
  
  public ISUB(int iid, int mid) {
	    super(iid, mid);
	  }


  @Override
  public String toString() {
    return "ISUB iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
