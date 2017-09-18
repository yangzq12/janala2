package janala.logger.inst;

public class IALOAD extends Instruction {
  public IALOAD(long tid, int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitIALOAD(this);
  }
  
  public IALOAD(int iid, int mid) {
	    super(iid, mid);
	  }


  @Override
  public String toString() {
    return "IALOAD iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
