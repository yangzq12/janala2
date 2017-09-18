package janala.logger.inst;

public class SALOAD extends Instruction {
  public SALOAD(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitSALOAD(this);
  }
  
  public SALOAD(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "SALOAD iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
