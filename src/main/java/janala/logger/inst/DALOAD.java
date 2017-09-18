package janala.logger.inst;

public class DALOAD extends Instruction {
  public DALOAD(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitDALOAD(this);
  }

  public DALOAD(int iid, int mid) {
	    super(iid, mid);
	  }
  @Override
  public String toString() {
    return "DALOAD iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
